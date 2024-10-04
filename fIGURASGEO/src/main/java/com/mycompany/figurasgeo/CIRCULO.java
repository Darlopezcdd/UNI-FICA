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

public class CIRCULO {

    Scanner var = new Scanner(System.in);
    public int x;
    public int y;
    public double radio;

    public double calcularea() {

        double area;
        area = Math.PI * radio * radio;
        return area;

    }

    public double calculperi() {

        return 2 * Math.PI * radio;

    }

    public void cambipocicion(int dx, int dy) {
        System.out.println("antigua x=" + x + " antigua y=" + y);
        x += dx;
        y += dy;

        System.out.println("nueva x=" + x + " nueva y=" + y);
    }

}
