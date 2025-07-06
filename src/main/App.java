package main;

import utils.StudentValidator;
import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.DepthTest;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        System.out.println("\n===== Ejercicio 01: Insertar en BST =====");
        InsertBSTTest.run();

        System.out.println("\n===== Ejercicio 02: Invertir Árbol Binario =====");
        InvertBinaryTree.run();

        System.out.println("\n===== Ejercicio 03: Listar Niveles del Árbol =====");
        ListLevels.run();

        System.out.println("\n===== Ejercicio 04: Calcular Profundidad Máxima =====");
        DepthTest.run();
    }
}
