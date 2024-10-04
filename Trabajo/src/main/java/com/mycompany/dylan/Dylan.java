/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.dylan;

/**
 *
 * @author lopez
 */
public class Dylan {

    public static void Imprimir(Object[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j] + "\t");

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 9;
        int contador = 1;
        Object [][] arreglo = new Object[n][n];
        for (int i = 0; i < arreglo.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arreglo[i].length; j++) {
                    arreglo[i][j] = contador++;
                }
            } else {
                for (int j = arreglo.length - 1; j >= 0; j--) {
                    arreglo[i][j] = contador++;
                }
            }
        }
        Imprimir(arreglo);
        contador = 1;
        System.out.println("-----------------");
        for (int i = arreglo.length - 1; i >= 0; i--) {

            if (i % 2 == 1) {
                for (int j = 0; j < arreglo[i].length; j++) {
                    arreglo[j][i] = contador++;
                }
            } else {
                for (int j = arreglo[i].length - 1; j >= 0; j--) {
                    arreglo[j][i] = contador++;
                }
            }
        }
        Imprimir(arreglo);
         for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] =" ";

            }
       
        }
         for (int i = 0; i <=arreglo.length/2; i++) {
             for (int j = (arreglo[i].length/2)-i; j <=arreglo[i].length/2; j++) {
                 arreglo[i][j] =0;
             }
             for (int j = (arreglo.length/2)+1; j <(arreglo[i].length/2)+1+i; j++) {
                 arreglo[i][j] =0;
             }
        }
         
          for (int i = (arreglo.length/2)+1; i <arreglo.length; i++) {
        
             for (int j =i-(arreglo.length/2) ; j <=arreglo.length/2; j++) {
                 arreglo[i][j] =0;
             }
             for (int j = (arreglo.length / 2) + 1; j < arreglo.length - (i - (arreglo.length / 2)); j++) {
                arreglo[i][j] = 0;
            }
         
//             
        }
         
         
         
         
         
         
          Imprimir(arreglo);
         
         
         
    }
        
        
        
        
        
    }

