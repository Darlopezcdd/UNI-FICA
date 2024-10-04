/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correccion_programacion;

/**
 *
 * @author lopez
 */
import java.util.*;

public class Correccion_Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] Matriz;
        int tam;
        tam = 3;
        Matriz = new int[tam][tam];
        GenerarTriangularSuperior(Matriz);
         Matriz[2][0]=0;
        imprimir(Matriz);
       
        System.out.println("es truangular superior?"+EvaluarTriangularSuperior(Matriz));
        System.out.println("------------------");
        GenerarTriangularInferior(Matriz);
        Matriz[0][2]=0;
        imprimir(Matriz);
         System.out.println("es truangular superior?"+EvaluarTriangularInferior(Matriz));

    }

    static void GenerarTriangularSuperior(int[][] A) {
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

    static void GenerarTriangularInferior(int[][] A) {
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

    static void imprimir(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("");
        }
    }
     static boolean EvaluarTriangularInferior(int[][] A) {
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
