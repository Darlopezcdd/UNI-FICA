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

    public CIRCULO() {
        System.out.print("ingrese el radio del circulo  ");
        radio = var.nextInt();
        System.out.print("ingrese la pocicion en x del circulo : ");
        x = var.nextInt();
        System.out.print("ingrese la pocicion en y del circulo : ");
        y = var.nextInt();

    }

    public CIRCULO(int x1, int y1, double radio1) {
        if (radio1 <= 0) {
            radio = 1;
        } else {
            radio = radio1;
        }

        x = x1;
        y = y1;
    }

    public double calcularea() {

        double area;
        area = Math.PI * radio * radio;
        return area;

    }

    public double calculperi() {

        return 2 * Math.PI * radio;

    }

    public void cambipocicion(int dx, int dy) {

        x += dx;
        y += dy;

    }

    public void imprimir() {
        System.out.println(" x=" + x + "  y=" + y);
        System.out.println("radio:" + radio);
        System.out.println("perimetro :" + calculperi());
        System.out.println("area :" + calcularea());

    }

}
