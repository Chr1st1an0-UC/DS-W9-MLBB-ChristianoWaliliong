package mlbb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================
        // ROOT
        // =========================
        Node root = new Node("Start Build", "Semua item defense");

        // =========================
        // MASUKKAN SEMUA ITEM BESAR
        // =========================
        root.addChild(Items.athenaShield());
        root.addChild(Items.immortality());
        root.addChild(Items.dominanceIce());
        root.addChild(Items.antiqueCuirass());
        root.addChild(Items.radiantArmor());
        root.addChild(Items.bladeArmor());
        root.addChild(Items.bruteForceBreastplate());
        root.addChild(Items.thunderBelt());
        root.addChild(Items.guardianHelmet());
        root.addChild(Items.queensWings());
        root.addChild(Items.oracle());
        root.addChild(Items.cursedHelmet());

        // =========================
        // HEIGHT SEBELUM
        // =========================
        int heightBefore = root.getHeight();

        // =========================
        // TAMBAH LEVEL (TASK 5)
        // =========================
        Node extra = new Node("Super Crystal", "Tambahan level");
        extra.addChild(new Node("Mini Crystal", "Level lebih dalam"));

        // ambil salah satu item (contoh Athena)
        root.child.get(0).child.get(1).addChild(extra);

        // =========================
        // HEIGHT SESUDAH
        // =========================
        int heightAfter = root.getHeight();

        // =========================
        // OUTPUT TREE
        // =========================
        System.out.println("=== TREE STRUCTURE ===");
        Node.printTree(root, 0);

        // =========================
        // INPUT USER (TASK 4)
        // =========================
        System.out.print("\nEnter item to search: ");
        String target = sc.nextLine();

        // =========================
        // COUNT OCCURRENCE (SEMUA ITEM TERHITUNG)
        // =========================
        int count = root.countItemOccurrences(target);
        System.out.println("\nOccurrences of '" + target + "': " + count);

        // =========================
        // PATH KE IMMORTALITY
        // =========================
        
        System.out.println("\n=== PATH TO IMMORTALITY ===");
        root.printPathsToTarget("Immortality", "");

        // =========================
        // HEIGHT
        // =========================
        System.out.println("\nTree Height Before: " + heightBefore);
        System.out.println("Tree Height After : " + heightAfter);
    }
}