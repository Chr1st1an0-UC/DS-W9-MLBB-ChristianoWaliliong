package mlbb;

import java.util.ArrayList;
import java.util.List;

public class Node {
    String node;
    String description;
    List<Node> child;

    public Node(String node, String description) {
        this.node = node;
        this.description = description;
        this.child = new ArrayList<>();
    }

    public void addChild(Node node) {
        child.add(node);
    }

    // PRINT TREE + DESKRIPSI
public static void printTree(Node node, int level) {
    if (node == null) return;

    String indent = " ".repeat(level * 2);
    System.out.println(indent + "- " + node.node + " -> " + node.description);

    for (Node child : node.child) {
        printTree(child, level + 1);
    }
}

    // COUNT
    public int countItemOccurrences(String target) {
        int count = 0;

        if (this.node.equalsIgnoreCase(target)) {
            count++;
        }

        for (Node comp : child) {
            count += comp.countItemOccurrences(target);
        }

        return count;
    }

    // PRINT PATH
    public void printPathsToTarget(String target, String path) {
        path += this.node;

        if (this.node.equalsIgnoreCase(target)) {
            System.out.println(path);
        }

        for (Node comp : child) {
            comp.printPathsToTarget(target, path + " -> ");
        }
    }

    // HEIGHT
    public int getHeight() {
        if (child.isEmpty()) {
            return 1;
        }

        int max = 0;
        for (Node comp : child) {
            max = Math.max(max, comp.getHeight());
        }

        return max + 1;
    }

        static Node findNode(Node node, String target) {
        if (node == null) return null;
    
        if (node.node.equalsIgnoreCase(target)) {
        return node;
        }

        for (Node child : node.child) {
        Node found = findNode(child, target);
        if (found != null) return found;
        }

        return null;
        }
}