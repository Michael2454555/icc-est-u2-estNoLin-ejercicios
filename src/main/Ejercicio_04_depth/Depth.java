package main.Ejercicio_04_depth;

import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;

public class Depth {
    private Node root;
    /// 4 =4
    // 2=3 7=1
    // 1=2 3=1
    // 8 =1
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());

        return 1 + Math.max(leftDepth, rightDepth);
    }
    public void maxDepth2() {
        maxDepth(root);
        
    }
    public void printTree() {
        printTreeNode2(root, "", true);
    }

    public void printTreeNode2(Node root, String prefix, boolean isLeft) {

        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getValue());
            if (root.getLeft() != null || root.getRight() != null) {
                if (root.getLeft() != null) {
                    printTreeNode2(root.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "├── null");
                }
                if (root.getRight() != null) {
                    printTreeNode2(root.getRight(), prefix + (isLeft ? "│   " : "    "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
                }
            }
        }
    }

}