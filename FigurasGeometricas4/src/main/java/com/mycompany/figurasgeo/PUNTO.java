/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeo;

/**
 *
 * @author lopez
 */
public class PUNTO {

    private double x, y;

    public double getx() {
        return this.x;
    }

    public double gety() {
        return this.y;
    }

    public PUNTO() {
        this.x = 0;
        this.y = 0;
    }

    public PUNTO(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void CambiarPosicion(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public String Imprimir() {
        return("(x,y): (" + this.x + "," + this.y + ")");
    }
}
