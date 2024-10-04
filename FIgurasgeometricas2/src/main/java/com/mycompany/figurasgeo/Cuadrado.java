/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeo;

/**
 *
 * @author lopez
 */
import java.util.*;

public class Cuadrado {

    Scanner var = new Scanner(System.in);
    public double lado;
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Cuadrado() {
        System.out.print("ingrese el tamaño delos lados del cuadrado : ");
        lado = var.nextInt();
        System.out.print("ingrese la pocicion en x del cuadrado : ");
        x1 = var.nextInt();
        System.out.print("ingrese la pocicion en y del cuadrado : ");
        y1 = var.nextInt();
        System.out.print("ingrese la pocicion en x2 del cuadrado : ");
        x2 = var.nextInt();
        System.out.print("ingrese la pocicion en y2 del cuadrado : ");
        y2 = var.nextInt();
    }

    public Cuadrado(int xc, int yc, int xc1, int yc1, double ladoc) {
        if (ladoc > 0) {
            lado = ladoc;
        } else {
            lado = 1;
        }
        if ((xc == xc1) && (yc == yc1)) {
            x1 = xc;
            y1 = yc;
            x2 = xc1 + 1;
            y2 = yc1 + 1;
        } else {
            x1 = xc;
            y1 = yc;
            x2 = xc1;
            y2 = yc1;
        }

    }

    public double calcularea() {
        return lado * lado;
    }

    public double calculperi() {
        return 4 * lado;
    }

    public void cambipocicion(double dx, double dy) {

        x1 += dx;
        y1 += dy;
        x2 += dx;
        y2 += dy;

    }

    public void imprimir() {
        System.out.println(" x1,y1=" + x1 + "," + y1);
        System.out.println(" x2,y2=" + x2 + "," + y2);
        System.out.println("lado:" + lado);
        System.out.println("perimetro :" + calculperi());
        System.out.println("area :" + calcularea());
    }
}
