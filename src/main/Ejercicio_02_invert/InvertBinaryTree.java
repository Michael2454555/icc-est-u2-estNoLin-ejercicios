package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    private Node root;
     public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }
        Node left = invertTree(root.getLeft());
        Node right = invertTree(root.getRight());
        root.setLeft(right);
        root.setRight(left);
        return root;
    }
     public void invertTree2() {
        invertTree(root);
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
