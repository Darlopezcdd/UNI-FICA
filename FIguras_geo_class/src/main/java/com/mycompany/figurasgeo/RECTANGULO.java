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

public class RECTANGULO {

    Scanner sc = new Scanner(System.in);
    private double Altura;
    private double Base;
    private int X1;
    private int Y1;
    private int X2;
    private int Y2;

    public double getAltura() {
        return Altura;
    }

    public double getBase() {
        return Base;
    }

    public int getX1() {
        return X1;
    }

    public int getY1() {
        return Y1;
    }

    public int getX2() {
        return X2;
    }

    public int getY2() {
        return Y2;
    }

    public void setBase(double Base) {
        if (Base > 0 && Base != this.Base) {
            this.Base = Base;
        }

    }

    public void setAltura(double Altura) {
        if (Altura > 0 && Altura != this.Base) {
            this.Altura = Altura;
        }
    }

    public RECTANGULO() {
        System.out.print("ingrese la base le rectangulo ");
        this.Base = sc.nextInt();
        System.out.print("ingrese la altura le rectangulo ");
        this.Altura = sc.nextInt();

        System.out.print("ingrese la pocicion en x : ");
        this.X1 = sc.nextInt();
        System.out.print("ingrese la pocicion en y : ");
        this.Y1 = sc.nextInt();
        System.out.print("ingrese la pocicion en x2 : ");
        this.X2 = sc.nextInt();
        System.out.print("ingrese la pocicion en y2 : ");
        this.Y2 = sc.nextInt();
    }

    public RECTANGULO(double Base, double Altura, int X1, int Y1, int X2, int Y2) {
        if (Base > 0 && Altura > 0 && Base != Altura) {
            this.Base = Base;
            this.Altura = Altura;
        } else if (Base > 0 && Altura > 0 && Base == Altura) {
            this.Base = Base + 1;
            this.Altura = Altura;

        } else {
            this.Base = 2;
            this.Altura = 1;
        }

        if (X1 == X2 && Y1 == Y2) {

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
        return (this.Base * this.Altura);
    }

    public double CalcularPerimetro() {
        return ((2 * this.Base) + (2 * this.Altura));
    }

    public void CambiarPosicion(int x, int y) {

        this.X1 += x;
        this.Y1 += y;
        this.X2 += x;
        this.Y2 += y;

    }

    public void Imprimir() {
        System.out.println("Base: " + this.Base);
        System.out.println("Altura: " + this.Altura);
        System.out.println(" (x1,y1):(" + this.X1 + "," + this.Y1 + ")");
        System.out.println(" (x1,y2):(" + this.X2 + "," + this.Y2 + ")");
        System.out.println("perimetro= " + CalcularPerimetro());
        System.out.println("area= " + CalcularArea());
    }

}
