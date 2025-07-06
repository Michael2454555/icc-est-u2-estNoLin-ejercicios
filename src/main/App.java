package main;

import java.util.List;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;
import utils.StudentValidator;


public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

       
        // ------------------- EJERCICIO 1: INSERT BST -------------------
        System.out.println("ÁRBOL 1 - InsertBST:");
        InsertBST insertBST = new InsertBST();
        Node root1 = null;
        int[] valores1 = {5, 3, 7, 2, 4, 6, 8};
        for (int val : valores1) {
            root1 = insertBST.insert(root1, val);
        }
        insertBST.printTreeNode2(root1, "", true); // Mostrar árbol 1

        // ------------------- EJERCICIO 2: INVERTIR ÁRBOL -------------------
        System.out.println("\nÁRBOL 2 - InvertBinaryTree:");
        InvertBinaryTree invertidor = new InvertBinaryTree();

        Node root2 = new Node(4);
        root2.setLeft(new Node(2));
        root2.setRight(new Node(7));
        root2.getLeft().setLeft(new Node(1));
        root2.getLeft().setRight(new Node(3));
        root2.getRight().setLeft(new Node(6));
        root2.getRight().setRight(new Node(9));

        Node invertido = invertidor.invertTree(root2);
        invertidor.printTreeNode2(invertido, "", true); // Mostrar árbol 2

        // ------------------- EJERCICIO 3: LISTAR NIVELES -------------------
        System.out.println("\nÁRBOL 3 - ListLevels:");
        ListLevels niveles = new ListLevels();

        Node root3 = new Node(4);
        root3.setLeft(new Node(2));
        root3.setRight(new Node(7));
        root3.getLeft().setLeft(new Node(1));
        root3.getLeft().setRight(new Node(3));
        root3.getRight().setLeft(new Node(6));
        root3.getRight().setRight(new Node(9));

        niveles.printTreeNode2(root3, "", true); // Mostrar árbol 3

        List<List<Node>> listaNiveles = niveles.listLevels(root3);
        System.out.println("Niveles:");
        for (List<Node> nivel : listaNiveles) {
            System.out.print("[ ");
            for (Node n : nivel) {
                System.out.print(n.getValue() + " ");
            }
            System.out.println("]");
        }

        // ------------------- EJERCICIO 4: PROFUNDIDAD -------------------
        System.out.println("\nÁRBOL 4 - Depth:");
        Depth profundidad = new Depth();

        Node root4 = new Node(4);
        root4.setLeft(new Node(2));
        root4.setRight(new Node(7));
        root4.getLeft().setLeft(new Node(1));
        root4.getLeft().setRight(new Node(3));
        root4.getLeft().getLeft().setLeft(new Node(8)); // profundidad máxima = 4

        profundidad.printTreeNode2(root4, "", true); // Mostrar árbol 4

        int max = profundidad.maxDepth(root4);
        System.out.println("Profundidad máxima: " + max);
    }
}

    

