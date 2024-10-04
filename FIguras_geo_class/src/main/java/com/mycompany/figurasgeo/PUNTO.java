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

public class PUNTO {

    Scanner sc = new Scanner(System.in);
    private double x, y;

    public double getx() {
        return this.x;
    }

    public double gety() {
        return this.y;
    }

    public PUNTO() {
        System.out.print("ingrese la pocicion en x  : ");
        this.x = sc.nextInt();
        System.out.print("ingrese la pocicion en y  : ");
        this.y = sc.nextInt();

    }

    public void CambiarPosicion(double x, double y) {
        this.x += x;
        this.y += y;

    }

    public void Imprimir() {
        System.out.println(" (x,y): (" + this.x + "," + this.y + ")");

    }

}
