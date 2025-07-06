package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {
    private Node root;
    private int value;

    // Método para ingresar un valor en el BST
    // [5, 3, 7, 2, 4, 6, 8]
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);               // Node( 3 )
        }
        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {

            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }
    public void insert2() {
       insert(root, value);
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