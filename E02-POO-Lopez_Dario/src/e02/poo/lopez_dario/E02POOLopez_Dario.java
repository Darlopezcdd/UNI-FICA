/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e02.poo.lopez_dario;

/**
 *
 * @author lopez
 */
import java.util.*;

public class E02POOLopez_Dario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tam;
        int[][] matriz;
        tam = 4;
        matriz = new int[tam][tam];

        GenenrarTraingularSuperior(matriz);
        matriz[0][3] = 1;
        Imprimir(matriz);
        System.out.println("es triengular inferior?: " + EvaluarTriangularInferios(matriz));
        System.out.println("-----------------------------------");
        GenenrarTraingularInferior(matriz);
        Imprimir(matriz);
        System.out.println("es triengular superior?: " + EvaluarTriangularSuperior(matriz));
    }

    static void GenenrarTraingularSuperior(int[][] A) {
        Random num;
        num = new Random();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                A[i][j] = 0;
            }

        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <= i; j++) {
                A[i][j] = num.nextInt(1, 10);

            }

        }

    }

    static void GenenrarTraingularInferior(int[][] A) {
        Random num;
        num = new Random();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                A[i][j] = 0;
            }

        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <= i; j++) {
                A[j][i] = num.nextInt(1, 10);

            }

        }

    }

    static void Imprimir(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                System.out.print(M[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    static boolean EvaluarTriangularInferios(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j][i] != 0) {
                    return false;
                }

            }

        }
        return true;
    }

    static boolean EvaluarTriangularSuperior(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i][j] != 0) {
                    return false;
                }

            }

        }
        return true;
    }
}
