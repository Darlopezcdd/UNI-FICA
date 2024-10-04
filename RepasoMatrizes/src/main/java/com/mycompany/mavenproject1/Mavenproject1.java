/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author lopez
 */

import java.util.*;
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner variable= new Scanner(System.in);
     
        System.out.println("Ingrese tamaño matriz");
         int n= variable.nextInt();
        
        
         Object [][] matriz = new Object [n][n];
         int contador=0;
         for (int i =0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                 contador ++;
                 matriz[i][j]=contador;
             }
         }
         int medio=n/2;
         
         if(n %2==1)
         {
               
            for (int i = 0; i < medio; i++) 
                {
                    for (int j = 0; j < medio - i; j++) 
                {
                 System.out.print("\t");
                 }
                    for (int j = 0; j <= i * 2; j++) 
                   {
                     System.out.print(matriz[i][j] + "\t");
                     }
                    System.out.println();
                }


            for (int i = medio; i < n; i++) 
                {
             for (int j = 0; j < i - medio; j++) 
            {
                 System.out.print("\t");
             }
            for (int j = 0; j < 2 * (n - i) - 1; j++) 
                 {
                      System.out.print(matriz[i][j] + "\t");
                     }
                     System.out.println();
                }
         }
         else
         {
               for (int i = 0; i < medio; i++) 
                {
                    for (int j = 0; j < medio - i; j++) 
                {
                 System.out.print("\t");
                 }
                    for (int j = 0; j <= i +i; j++) 
                   {
                     System.out.print(matriz[i][j] + "\t");
                     }
                    System.out.println();
                }


            for (int i = medio; i < n; i++) 
                {
             for (int j = 0; j < i - medio; j++) 
            {
                 System.out.print("\t");
             }
            for (int j = 0; j < 2 * (n - i) - 1; j++) 
                 {
                      System.out.print(matriz[i][j] + "\t");
                     }
                     System.out.println();
                }
         }
       
                 
          
        
        
    }
}
   