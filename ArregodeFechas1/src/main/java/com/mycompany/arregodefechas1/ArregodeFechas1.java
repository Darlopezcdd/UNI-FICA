/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arregodefechas1;

/**
 *
 * @author lopez
 */
import java.util.*;

public class ArregodeFechas1 {

    public static void main(String[] args) {
        Random rnd;
        FECHA[] fechas;
        int n;
        n = 7;
        fechas = new FECHA[n];
        rnd = new Random();
        for (int i = 0; i < fechas.length; i++) {
            fechas[i] = new FECHA(rnd.nextInt(10), rnd.nextInt(10) + 1, 2000 + i);
        }
        for (int i = 0; i < fechas.length; i++) {
            System.out.println((fechas[i]).Imprimir());
        }
        System.out.println("------------------------------------");
        boolean mayor=true;

        for (int j = 0; j < fechas.length - 1; j++) {
            for (int i = j; i < fechas.length; i++) {
                
                if (fechas[i].Comparar(fechas[j])==1)
                       
                {
                    mayor=true;
                }
                else
                {
                    mayor=false;
                }
            }
        }

        Ordenar(mayor, fechas);

        for (int i = 0; i < fechas.length; i++) {
            System.out.println((fechas[i]).Imprimir());
        }

    }

    public static void Ordenar(boolean a, FECHA[] fechas) {
        FECHA temp;
        int x;
        x = 0;
        if (a == true) {

            for (int j = 0; j < fechas.length - 1; j++) {
                for (int i = j; i < fechas.length; i++) {

                    temp = fechas[i];
                    fechas[i] = fechas[j];
                    fechas[j] = temp;
                    x++;
                    System.out.println(x);

                }

            }
        }
        if (a == false) {

            for (int j = 0; j < fechas.length - 1; j++) {
                for (int i = j; i < fechas.length; i++) {

                    temp = fechas[j];
                    fechas[j] = fechas[i];
                    fechas[i] = temp;
                    x++;
                    System.out.println(x);

                }

            }
        }
    }
}
