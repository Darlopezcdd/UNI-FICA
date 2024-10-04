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

public class ELIPSE {

    Scanner sc = new Scanner(System.in);
    private double SemiEjeMayor;
    private double SemiEjeMenor;
    private int x;
    private int y;

    public double getSemiEjeMayor() {
        return SemiEjeMayor;
    }

    public double getSemiEjeMenor() {
        return SemiEjeMenor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setSemiEjeMayor(double SemiEjeMayor) {
        if (SemiEjeMayor != this.SemiEjeMenor) {

            this.SemiEjeMayor = SemiEjeMayor;

        }
    }

    public void setSemiEjeMenor(double SemiEjeMenor) {
        if (SemiEjeMenor != this.SemiEjeMayor) {

            this.SemiEjeMenor = SemiEjeMenor;

        }

    }

    public ELIPSE() {
        System.out.println("ingrese el semieje mayor de la elipse  ");
        this.SemiEjeMayor = sc.nextInt();

        System.out.println("ingrese el semieje menor de la elipse  ");
        this.SemiEjeMenor = sc.nextInt();

        System.out.println("ingrese la pocicion en x de la elipse ");
        this.x = sc.nextInt();
        System.out.println("ingrese la pocicion en y de la elipse  ");
        this.y = sc.nextInt();

    }

    public ELIPSE(double SemiEjeMayor, double SemiEjeMenor, int x, int y) {

       
        if (SemiEjeMayor > 0&&SemiEjeMenor > 0&&SemiEjeMayor != SemiEjeMenor) {
            this.SemiEjeMayor = SemiEjeMayor;
            this.SemiEjeMenor = SemiEjeMenor;

        } else if (SemiEjeMayor > 0&&SemiEjeMenor > 0&&SemiEjeMayor == SemiEjeMenor) {
           this.SemiEjeMayor = SemiEjeMayor+1;
            this.SemiEjeMenor = SemiEjeMenor;

        }else
            
        {
            this.SemiEjeMayor = 2;
            this.SemiEjeMenor = 1;
        }

        this.x = x;
        this.y = y;
    }

    public double CalcularPerimetro() {
        //aproximado
        double num = (this.SemiEjeMayor + this.SemiEjeMenor);
        return Math.PI * (3 * (num) - Math.sqrt((3 * this.SemiEjeMayor + this.SemiEjeMenor) * (this.SemiEjeMayor + 3 * this.SemiEjeMenor)));
    }

    public double CalcularArea() {
        return Math.PI * this.SemiEjeMayor * this.SemiEjeMenor;
    }

    public void CambiarPosicion(int x, int y) {

        this.x += x;
        this.y += y;

    }

    public void Imprimir() {
        System.out.println("SemiEjeMayor: " + this.SemiEjeMayor);
        System.out.println("SemiEjeMenor: " + this.SemiEjeMenor);
        System.out.println(" (x,y): (" + this.x + "," + this.y + ")");
        System.out.println("perimetro :" + CalcularPerimetro());
        System.out.println("area :" + CalcularArea());
    }
}
