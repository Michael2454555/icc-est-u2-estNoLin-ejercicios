package main.Ejercicio_03_listLeves;

import java.util.List;

import main.Materia.Models.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ListLevels {
    private Node root;
    

    public List<List<Node>> listLevels(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Node>> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                currentLevel.add(current);
                // Cuando se supone que Node tiene métodos getLeft() y getRight()
                if (current.getLeft() != null) {
                    queue.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.add(current.getRight());
                }
            }
            result.add(currentLevel);
        }

        return result;
    }
    public void listLevels2() {
        listLevels(root);
        
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