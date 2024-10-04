/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author lopez
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matriz arr = new Matriz(6, 4);
        arr.Llenarzigzag();
        System.out.println(arr.toString());

    }

}

class Matriz {

    public int[][] matriz;

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public Matriz(int filas, int columnas) {
        this.matriz = new int[filas][columnas];
    }

    public Matriz(int tamaño) {
        this.matriz = new int[tamaño][tamaño];
    }

    public void Llenarzigzag() {
        int contador = 1;

        for (int i = matriz[0].length - 1; i >= 0; i--) {

            if (i % 2 != 0) {

                for (int j = matriz.length - 1; j >= 0; j--) {
                    matriz[j][i] = contador;
                    contador++;
                }
            } else {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[j][i] = contador;
                    contador++;
                }
            }

        }
    }

    public void Llenar() {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

            }
        }
    }

    @Override
    public String toString() {
        String respuesta = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                respuesta += matriz[i][j] + "\t";
            }
            respuesta += "\n";
        }

        return respuesta;
    }

}
