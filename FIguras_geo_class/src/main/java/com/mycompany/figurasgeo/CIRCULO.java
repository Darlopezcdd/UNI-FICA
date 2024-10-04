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

    Scanner sc = new Scanner(System.in);
    private int x;
    private int y;
    private double radio;

    public double getRadio() {
        return this.radio;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        }
    }

    public CIRCULO() {
        System.out.print("ingrese el radio del circulo  ");
        this.radio = sc.nextInt();

        System.out.print("ingrese la pocicion en x del circulo : ");
        this.x = sc.nextInt();

        System.out.print("ingrese la pocicion en y del circulo : ");
        this.y = sc.nextInt();

    }

    public CIRCULO(int x, int y, double radio) {
        if (radio <= 0) {
            this.radio = 1;
        } else {
            this.radio = radio;
        }

        this.x = x;
        this.y = y;
    }

    public double CalcularArea() {

        double area;
        area = Math.PI * this.radio * this.radio;
        return area;

    }

    public double CalcularPerimetro() {

        return 2 * Math.PI * this.radio;

    }

    public void CambiarPosicion(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void Imprimir() {
        System.out.println(" (x,y): (" + x + "," + y + ")");
        System.out.println("radio:" + this.radio);
        System.out.println("perimetro :" + CalcularPerimetro());
        System.out.println("area :" + CalcularArea());

    }

}
