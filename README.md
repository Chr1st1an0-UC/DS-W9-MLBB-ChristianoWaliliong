Tugas Data Structure Week 9 Tentang Items MLBB (Tidak Konsul)

Questions

1. What is the root node in this program?
Root node dalam program ini adalah "Start Build", karena itu adalah titik awal dari semua cabang item yang ada di tree.

2. Which nodes are leaf nodes?
Leaf node adalah node yang tidak memiliki child (anak).
Contohnya:

"Vitality Crystal" (yang tidak punya turunan lagi)
"Magic Resist Cloak"
"Leather Jerkin"
Intinya: semua item paling bawah dalam tree.

3. Why is children stored as a List<ItemNode> instead of a single variable?
Karena satu item bisa memiliki lebih dari satu komponen/bahan.
Jika hanya satu variabel, node hanya bisa punya satu child.
Dengan List<Node>:

- bisa menyimpan banyak child
- fleksibel untuk berbagai item
- sesuai dengan konsep tree (multi-branch)

4. What is the difference between a linear structure and a tree structure in this example?

Linear structure (array/linked list):
Data tersusun berurutan (satu jalur saja)
Contoh: A → B → C

Tree structure:
Data bercabang (satu node bisa punya banyak anak)
Contoh di program:

Start Build
 ├── Athena Shield
 │    ├── Silence Robe
 │    └── Vitality Crystal
 └── Immortality
      ├── Ares Belt
      └── Vitality Crystal

Tree lebih cocok karena item punya banyak jalur build.

5. How does recursion help when working with trees?
Rekursi membantu menelusuri tree secara otomatis dari atas ke bawah.
Dengan rekursi:

fungsi memanggil dirinya sendiri untuk setiap child
tidak perlu loop manual yang kompleks
cocok untuk struktur bertingkat seperti tree

Contoh:

for (Node child : node.child) {
    printTree(child, level + 1);
}

6. What path is printed when searching for Immortality?
Path yang dicetak adalah jalur dari root ke node Immortality:

Start Build -> Immortality

Jika ada struktur lebih dalam, tetap akan mengikuti jalur dari root ke node tersebut.

Refleksi :

Struktur tree lebih cocok dibandingkan array untuk merepresentasikan kemungkinan pembelian item karena sifatnya yang bercabang dan hierarkis, bukan linear. Dalam game seperti Mobile Legends, satu item bisa dibangun dari beberapa komponen, dan setiap komponen tersebut bisa memiliki bahan lagi di bawahnya. Jika menggunakan array, struktur ini akan menjadi datar dan sulit menunjukkan hubungan antar item. Sedangkan tree secara alami dapat menggambarkan hubungan tersebut, di mana setiap node adalah item dan child-nya adalah bahan pembentuknya, sehingga lebih mudah untuk ditelusuri dan dipahami alur build-nya.

Bagian dari tugas yang paling membantu saya memahami rekursi adalah saat membuat method untuk mencetak tree dan mencari path ke item tertentu. Saya bisa melihat bagaimana fungsi memanggil dirinya sendiri untuk menelusuri setiap cabang hingga ke level terdalam. Tantangan yang saya hadapi adalah memahami alur eksekusi rekursi, terutama saat harus melacak perpindahan antar node dan kapan fungsi kembali ke node sebelumnya. Awalnya cukup membingungkan, tetapi dengan melihat output tree dan menelusuri langkah demi langkah, saya jadi lebih paham bagaimana rekursi bekerja dalam struktur tree.