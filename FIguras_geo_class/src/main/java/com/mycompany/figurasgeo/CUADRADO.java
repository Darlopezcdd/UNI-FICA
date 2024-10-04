/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeo;

import java.util.Scanner;

/**
 *
 * @author lopez
 */
import java.util.*;

public class CUADRADO {

    Scanner sc = new Scanner(System.in);
    private double Lado;
    private int X1;
    private int Y1;
    private int X2;
    private int Y2;

    public double getLado() {
        return this.Lado;
    }

    public int getX1() {
        return this.X1;
    }

    public int getY1() {
        return this.Y1;
    }

    public int getX2() {
        return this.X2;
    }

    public int getY2() {
        return this.Y2;
    }

    public void setLado(double Lado) {
        if (Lado > 0) {
            this.Lado = Lado;
        }
    }

    public CUADRADO() {
        System.out.print("ingrese el tamaño delos lados del cuadrado : ");
        this.Lado = sc.nextInt();
        System.out.print("ingrese la pocicion en x del cuadrado : ");
        this.X1 = sc.nextInt();
        System.out.print("ingrese la pocicion en y del cuadrado : ");
        this.Y1 = sc.nextInt();
        System.out.print("ingrese la pocicion en x2 del cuadrado : ");
        this.X2 = sc.nextInt();
        System.out.print("ingrese la pocicion en y2 del cuadrado : ");
        this.Y2 = sc.nextInt();
    }

    public CUADRADO(int X1, int Y1, int X2, int Y2, double Lado) {
        if (Lado > 0) {
            this.Lado = Lado;
        } else {
            this.Lado = 1;
        }
        if ((X1 == X2) && (Y1 == Y2)) {

            this.X2 = X2 + 1;
            this.Y2 = Y2 + 1;
        } else {

            this.X2 = X2;
            this.Y2 = Y2;
        }
        this.X1 = X1;
        this.Y1 = Y1;
    }

    public double CalcularArea() {
        return this.Lado * this.Lado;
    }

    public double CalcularPerimetro() {
        return 4 * this.Lado;
    }

    public void CambiarPosicion(double x, double y) {

        this.X1 += x;
        this.Y1 += y;
        this.X2 += x;
        this.Y2 += y;

    }

    public void Imprimir() {
        System.out.println(" (x1,y1):(" + this.X1 + "," + this.Y1 + ")");
        System.out.println(" (x1,y2):(" + this.X2 + "," + this.Y2 + ")");
        System.out.println("lado:" + this.Lado);
        System.out.println("perimetro :" + CalcularPerimetro());
        System.out.println("area :" + CalcularArea());
    }

}
