/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject12;

/**
 *
 * @author lopez
 */
public class mainclass {
    public static void Imprimir(Object[][]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for (int j = 0; j < a[i].length; j++) {
                 System.out.print(a[i][j]+"\t");
            }
           
            System.out.println("");
        }
    }
    
       public static void main(String[] args) {
        int n1=3;
        int n2=5;
           String[][] arr = new String[n1][n2];
           
           System.out.println(arr[1].length);
           int cons =0;
           for (int i = 0; i < arr.length; i++) {
               for (int j = (arr[i].length/2)-i; j < (arr[i].length/2)+i+1; j++) {
                   cons++;
                   arr[i][j]=""+cons;
               }
               
           }
           Imprimir(arr);
       }
    
    
}
