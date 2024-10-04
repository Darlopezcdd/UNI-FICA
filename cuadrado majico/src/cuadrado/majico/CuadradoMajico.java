/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadrado.majico;

/**
 *
 * @author lopez
 */
public class CuadradoMajico {

    /**
     * @param args the command line arguments
     */
    static void Imprimir(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] Cuadradomagico;

        int col, fil, filA, colA, contador, tam;

        tam = 3;
        Cuadradomagico = new int[tam][tam];
        col = Cuadradomagico.length / 2;

        fil = 0;
        contador = 1;

        while (contador <= Cuadradomagico.length * Cuadradomagico.length) {
            Cuadradomagico[fil][col] = contador;
            
            contador++;
            
            filA = fil;
            colA = col;
            
            if (fil == 0) {
                fil = Cuadradomagico.length - 1;
            } else {
                fil--;
            }
            
            if (col == Cuadradomagico.length - 1) {
                col = 0;
            } else {
                col++;
            }
            
            if (Cuadradomagico[fil][col] != 0) {
                fil = filA + 1;
                col = colA;
            }

        }
        Imprimir(Cuadradomagico);

    }

}
