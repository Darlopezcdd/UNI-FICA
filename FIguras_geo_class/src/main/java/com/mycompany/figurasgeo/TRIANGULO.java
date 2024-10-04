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

public class TRIANGULO {

    Scanner sc = new Scanner(System.in);
    private int X1, X2, X3, Y1, Y2, Y3;
    private double Lado1, Lado2, Lado3;

    public int getX1() {
        return X1;
    }

    public int getX2() {
        return X2;
    }

    public int getX3() {
        return X3;
    }

    public int getY1() {
        return Y1;
    }

    public int getY2() {
        return Y2;
    }

    public int getY3() {
        return Y3;
    }
    
    

    public TRIANGULO() {
        System.out.println("ingrrese la pocicion x del triangulo ");
        this.X1 = sc.nextInt();
        System.out.println("ingrrese la pocicion y del triangulo ");
        this.Y1 = sc.nextInt();
        System.out.println("-------------------------------------");
        System.out.println("ingrrese la pocicion x2 del triangulo ");
        this.X2 = sc.nextInt();
        System.out.println("ingrrese la pocicion y2 del triangulo ");
        this.Y2 = sc.nextInt();
        System.out.println("-------------------------------------");
        System.out.println("ingrrese la pocicion x3 del triangulo ");
        this.X3 = sc.nextInt();
        System.out.println("ingrrese la pocicion y3 del triangulo ");
        this.Y3 = sc.nextInt();

    }

    public TRIANGULO(int X1, int Y1, int X2, int Y2, int X3, int Y3) {
        if ((X1 == X2) && (X2 == X3) && (Y1 == Y2) && (Y2 == Y3)) {

            this.X2 = X2 + 1;
            this.Y2 = Y2;
            this.X3 = X3;
            this.Y3 = Y3 + 1;
            
            
            } else if ((X2 == X3 && Y2 == Y3)||(X1 == X3) && (Y1 == Y3)) {

            this.X2 = X2;
            this.Y2 = Y2;
            this.X3 = X3;
            this.Y3 = Y3 + 1;

        
        } else if ((X1 == X2) && (Y1 == Y2)) {

            this.X2 = X2 + 1;
            this.Y2 = Y2;
            this.X3 = X3;
            this.Y3 = Y3;
        }
        else {
            this.X2 = X2;
            this.Y2 = Y2;
            this.X3 = X3;
            this.Y3 = Y3;
        }
        this.X1 = X1;
        this.Y1 = Y1;
        this.Lado1 = CalcularLado(this.X1, this.Y1, this.X2, this.Y2);
        this.Lado2 = CalcularLado(this.X2, this.Y2, this.X3, this.Y3);
        this.Lado3 = CalcularLado(this.X3, this.Y3, this.X1, this.Y1);

    }

    public double CalcularLado(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double CalcularArea() {

        double semiperi = (this.Lado1 + this.Lado2 + this.Lado3) / 2;
        return Math.sqrt(semiperi * (semiperi - this.Lado1) * (semiperi - this.Lado2) * (semiperi - this.Lado3));
    }

    public double CalcularPerimetro() {

        return this.Lado1 + this.Lado2 + this.Lado3;
    }

    public void CambiarPosicion(double x, double y) {

        this.X1 += x;
        this.Y1 += y;
        this.X2 += x;
        this.Y2 += y;
        this.X3 += x;
        this.Y3 += y;

    }

    public void Imprimir() {
         System.out.println(" (x1,y1): (" + this.X1 + "," + this.Y1 + ")");
        System.out.println(" (x2,y2): (" + this.X2 + "," + this.Y2 + ")");
         System.out.println(" (x1,y1): (" + this.X3 + "," + this.Y3 + ")");
        
        System.out.println("perimetro= " + CalcularPerimetro());
        System.out.println("area= " + CalcularArea());
    }

}
