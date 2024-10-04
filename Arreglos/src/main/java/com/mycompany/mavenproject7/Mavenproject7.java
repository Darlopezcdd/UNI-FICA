/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

/**
 *
 * @author lopez
 */
import java.util.*;
public class Mavenproject7 {

    public static void main(String[] args) 
    {
        Scanner pn= new Scanner(System.in);
        
 
        System.out.println("Ingrese las filas:");
     int filas = pn.nextInt();

        System.out.println("Ingrese las columnas:");
     int columnas = pn.nextInt();

     int[][] array = new int[filas] [columnas];
     int inicioFila = 0, finFila = filas - 1;
     int inicioColumna = 0, finColumna = columnas - 1;
     int secuencia = 0;

     while (inicioFila <= finFila && inicioColumna <= finColumna)
     {
        // Imprimir desde la columna derecha hacia la izquierda
         for (int i = inicioColumna; i <= finColumna; i++)
         {
             array[inicioFila][i] = secuencia++;
         }
         inicioFila++;
  // Imprimir desde la fila superior hacia la inferior
        
         for (int i = inicioFila; i <= finFila; i++)
         {
             array[i][finColumna] = secuencia++;
         }
         finColumna--;

         // Imprimir desde la fila inferior hacia la superior
         if (inicioFila <= finFila)
         {
             for (int i = finColumna; i >= inicioColumna; i--)
             {
                 array[finFila][i] = secuencia++;
             }
             finFila--;
         }

         // Imprimir desde la columna izquierda hacia la derecha
         if (inicioColumna <= finColumna)
         {
             for (int i = finFila; i >= inicioFila; i--)
             {
                 array[i][inicioColumna] = secuencia++;
             }
             inicioColumna++;
         }
     }

     // Imprimir la matriz en forma de espiral
     for (int i = 0; i < filas; i++)
     {
         for (int j = 0; j < columnas; j++)
         {
             System.out.print(array[i][j] + "\t");
         }
         System.out.println("");
         
         
     }
        System.out.println("----------------------------------------------------");
     
        int total = filas * columnas;
            int prom = (filas + columnas) / 2
;            for(int i=0; i<total-1; i++) 
            {
                for(int j=0;j<total-1-i;j++)
                {
                    //priamra pocicion
                    int elemx1 = j / prom;
                    int elemy1 = j % prom;

                    //segun
                    int elemx2 = (j+1) / prom;
                    int elemy2 = (j+1) % prom;

                    if (array[elemx1][elemy1]> array[elemx2][elemy2])
                    {
                        int temp = array[elemx1][elemy1];
                        array[elemx1][elemy1] = array[elemx2][elemy2];
                        array[elemx2][elemy2] = temp;
                    }
                }
                
    }
 for (int i = 0; i < filas; i++)
     {
         for (int j = 0; j < columnas; j++)
         {
             System.out.print(array[i][j] + "\t");
         }
         System.out.println("");
         
         
     }
}
}