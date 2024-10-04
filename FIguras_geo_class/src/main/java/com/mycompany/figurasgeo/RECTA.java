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

public class RECTA {

    Scanner sc = new Scanner(System.in);
    private int X1, X2, Y1, Y2;

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

    public RECTA() {
        System.out.print("ingrese la pocicion en x  : ");
        this.X1 = sc.nextInt();
        System.out.print("ingrese la pocicion en y  : ");
        this.Y1 = sc.nextInt();
        System.out.print("ingrese la pocicion en x2 : ");
        this.X2 = sc.nextInt();
        System.out.print("ingrese la pocicion en y2 : ");
        this.Y2 = sc.nextInt();

    }

    public RECTA(int X1, int Y1, int X2, int Y2) {
        if ((X1 == X2) && (Y1 == Y2)) {

            this.X2 = X2 + 1;
            this.Y2 = Y2;
        } else {

            this.X2 = X2;
            this.Y2 = Y2;
        }
        this.X1 = X1;
        this.Y1 = Y1;

    }

    public double CalcularLongitud() {
        return Math.sqrt(Math.pow(this.X2 - this.X1, 2) + Math.pow(this.Y2 - this.Y1, 2));
    }

    public void CambiarPosicion(double x, double y) {

        this.X1 += x;
        this.Y1 += y;

        this.X2 += x;
        this.Y2 += y;

    }

    public void Imprimir() {
        System.out.println(" (x1,y1): (" + this.X1 + "," + this.Y1 + ")");
        System.out.println(" (x2,y2): (" + this.X2 + "," + this.Y2 + ")");
        System.out.println("longitud: " + CalcularLongitud());

    }

}
