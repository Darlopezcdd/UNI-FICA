/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeo;

import java.util.*;

/**
 *
 * @author lopez
 */
public class recta {

    Scanner var = new Scanner(System.in);
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public recta() {
        System.out.print("ingrese la pocicion en x del recta : ");
        x1 = var.nextInt();
        System.out.print("ingrese la pocicion en y del recta : ");
        y1 = var.nextInt();
        System.out.print("ingrese la pocicion en x2 del recta : ");
        x2 = var.nextInt();
        System.out.print("ingrese la pocicion en y2 del recta : ");
        y2 = var.nextInt();

    }

    public recta(int rx1, int ry1, int rx2, int ry2) {
        if (rx1 == rx2) {
            x1 = rx1;
            x2 = rx2 + 1;
        } else {
            x1 = rx1;
            x2 = rx2;
        }
        if (ry1 == ry2) {

            y1 = ry1;
            y2 = ry2 + 1;
        } else {
            y1 = ry1;
            y2 = ry2;
        }

    }

    public double calcullong() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void cambipocicion(double rx, double ry) {

        x1 += rx;
        y1 += ry;
        x2 += rx;
        y2 += ry;

    }

    public void imprimir() {
        System.out.println(" x1,y1=  " + x1 + "," + y1);
        System.out.println(" x2,y2=  " + x2 + "," + y2);
        System.out.println("longitud: " + calcullong());

    }
}
