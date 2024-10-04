/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author lopez
 */
import java.util.*;

public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner pn = new Scanner(System.in);
        
        
        Random random = new Random();

        System.out.println("ingresa el tamaño de la matriz");
        int tamaño = pn.nextInt();

        Object[][] matriz = new Object[tamaño + 2][tamaño + 2];

        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                matriz[i][j] = 0;
            }
        }
        for (int i = 0; i < tamaño; i++) 
        {
            for (int j = 0; j < tamaño; j++) 
            {
                int randomn = random.nextInt(10);
                matriz[i][j] = randomn;
            }
        }
        
        
        int sumatotal = 0;
        int suma0 = 0;
        
        
        for (int i = 0; i < tamaño + 1; i++) {
            suma0 = 0;
            for (int j = 0; j < tamaño + 1; j++) {
                suma0 += (int) matriz[i][j];
            }
            matriz[i][tamaño] = suma0;
            
            sumatotal += suma0;
        }
        
        
        
        int suma1 = 0;
        for (int i = 0; i < tamaño; i++) {
            suma1 = 0;

            for (int j = 0; j < tamaño + 1; j++) {
                suma1 += (int) matriz[j][i];
            }
            matriz[tamaño][i] = suma1;
            sumatotal += suma1;
        }
        
        
        matriz[tamaño][tamaño] = sumatotal;
        

        
        for (int j = 0; j < tamaño + 1; j++)
        {
            int suma = (int) matriz[tamaño][j];
            boolean esPrimo = esPrimo(suma);
            matriz [tamaño+1][j]= esPrimo ? "si":"no";
            
        }
        for (int j = 0; j < tamaño + 1; j++) 
        {
            int suma = (int) matriz[j][tamaño];
            boolean esPrimo = esPrimo(suma);
   
            matriz [j][tamaño+1]= esPrimo ? "si":"no";
            
        }
        
         int sumto =(tamaño+1)*(tamaño+1);
        

        

       
        
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
          
        int maximo = (int)matriz[0][0];
        int minimo = (int)matriz[0][0];

        for (int i = 0; i < matriz.length-2; i++) 
        {
            for (int j = 0; j < matriz[i].length-2; j++) 
            {
                if ((int)matriz[i][j] > maximo) 
                {
                    maximo = (int)matriz[i][j];
                }
                if ((int)matriz[i][j] < minimo) 
                {
                    minimo = (int)matriz[i][j];
                }
            }
        }
        System.out.println("El valor maximo en la matriz es: " + maximo);
        System.out.println("El valor minimo en la matriz es: " + minimo);
          System.out.println("la cantidad de numeros es " + sumto);
      
    }

     static boolean esPrimo(int n) 
     {
        if (n <= 1) 
        {
    return false;
    }

        for (int i = 2; i * i <= n; i++) 
        {
    if (n % i == 0) 
    {
        return false;
    }
    
        
    }
return true;
     }
}