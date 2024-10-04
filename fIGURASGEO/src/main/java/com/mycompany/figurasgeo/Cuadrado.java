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

    public double calcularea() {
        return lado * lado;
    }

    public double calculperi() {
        return 4 * lado;
    }

    public void cambipocicion(double dx, double dy) {
        System.out.println("antigua x1,y1=" + x1 + "," + y1);
        System.out.println("antigua x2,y2=" + x2 + "," + y2);
        x1 += dx;
        y1 += dy;
        x2 += dx;
        y2 += dy;

        System.out.println("nueva x1,y1=" + x1 + "," + y1);
        System.out.println("nueva x2,y2=" + x2 + "," + y2);
    }

}
