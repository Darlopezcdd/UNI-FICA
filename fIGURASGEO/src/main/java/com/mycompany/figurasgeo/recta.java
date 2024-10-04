/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeo;

/**
 *
 * @author lopez
 */
public class recta {

    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public double calcullong() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void cambipocicion(double rx, double ry) {
        System.out.println("antigua x1,y1=" + x1 + "," + y1);
        System.out.println("antigua x2,y2=" + x2 + "," + y2);

        x1 += rx;
        y1 += ry;
        x2 += rx;
        y2 += ry;

        System.out.println("nueva x1,y1=  " + x1 + "," + y1);
        System.out.println("nueva x2,y2=  " + x2 + "," + y2);
    }
}
