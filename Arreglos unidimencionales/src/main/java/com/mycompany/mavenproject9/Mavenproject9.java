/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;

/**
 *
 * @author lopez
 */
import java.util.*;
public class Mavenproject9 {

    public static void main(String[] args) 
    
    {
        Scanner pn=new Scanner(System.in);
        System.out.println("ingrese el tamaño");
        int tamaño= pn.nextInt();
        int[]array= new int[tamaño];
        
         for(int i=0;i<tamaño;i++)
        {
            System.out.println("ingrese lis valores en la pocicicion" + i);
            array[i]=pn.nextInt();
        }
        
       
        for(int i=0;i<tamaño;i++)
        {
            
            System.out.print(array[i]+"  ");
        }
        System.out.println("");
         for(int i=tamaño -1;i>=0;i--)
        {
            
            System.out.print(array[i]+"  ");
        }
        System.out.println("");
        
    }
}
