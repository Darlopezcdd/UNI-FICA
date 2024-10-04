/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

/**
 *
 * @author lopez
 */
public class TRIANGULO {

    private PUNTO Punto1;
    private PUNTO Punto2;
    private PUNTO Punto3;

    public PUNTO getPunto1() {
        return Punto1;
    }

    public PUNTO getPunto2() {
        return Punto2;
    }

    public PUNTO getPunto3() {
        return Punto3;
    }

    public TRIANGULO(double X1, double Y1, double X2, double Y2, double X3, double Y3) {
        if ((X1 == X2) && (X2 == X3) && (Y1 == Y2) && (Y2 == Y3)) {
            this.Punto2 = new PUNTO(X2 + 1, Y2);
            this.Punto3 = new PUNTO(X3, Y3 + 1);

        } else if ((X2 == X3 && Y2 == Y3) || (X1 == X3) && (Y1 == Y3)) {
            this.Punto2 = new PUNTO(X2, Y2);
            this.Punto3 = new PUNTO(X3, Y3 + 1);

        } else if ((X1 == X2) && (Y1 == Y2)) {
            this.Punto2 = new PUNTO(X2 + 1, Y2);
            this.Punto3 = new PUNTO(X3, Y3);
        } else {
            this.Punto2 = new PUNTO(X2, Y2);
            this.Punto3 = new PUNTO(X3, Y3);
        }
        this.Punto1 = new PUNTO(X1, Y1);
    }

    public TRIANGULO(PUNTO P1, PUNTO P2, PUNTO P3) {
        if ((P1.getx() == P2.getx()) && (P2.getx() == P3.getx())
                && (P1.gety() == P2.gety()) && (P2.gety() == P3.gety())) {
            this.Punto2 = new PUNTO(P2.getx() + 1, P2.gety());
            this.Punto3 = new PUNTO(P3.getx(), P3.gety() + 1);

        } else if ((P2.getx() == P3.getx() && P2.gety() == P3.gety())
                || (P1.getx() == P3.getx()) && (P1.gety() == P3.gety())) {
            this.Punto2 = P2;
            this.Punto3 = new PUNTO(P3.getx(), P3.gety() + 1);

        } else if (P1.getx() == P2.getx() && P2.getx() == P3.getx()) {
            this.Punto2 = new PUNTO(P2.getx() + 1, P2.gety());
            this.Punto3 = P3;
        } else {
            this.Punto2 = P2;
            this.Punto3 = P3;
        }
        this.Punto1 = P1;
    }

    public TRIANGULO(double X1, double Y1, double X2, double Y2, PUNTO punto) {
        if ((X1 == X2) && (Y1 == Y2) && (X2 == punto.getx()) && (Y2 == punto.gety())) {
            this.Punto2 = new PUNTO(X1 + 1, Y1);
            this.Punto3 = new PUNTO(X2, Y2 + 1);
        } else {
            this.Punto2 = new PUNTO(X1, Y1);
            this.Punto3 = new PUNTO(X2, Y2);
        }
        this.Punto1 = punto;
    }

    public TRIANGULO() {
        this.Punto1 = new PUNTO();
        this.Punto2 = new PUNTO(1, 0);
        this.Punto3 = new PUNTO(0, 1);
    }

    private double CalcularLado(PUNTO P1, PUNTO P2) {
        return Math.sqrt(Math.pow(P2.getx() - P1.getx(), 2) + Math.pow(P2.gety() - P1.gety(), 2));
    }

    public double CalcularArea() {
        double semiperi = (CalcularPerimetro()) / 2;
        return Math.sqrt(semiperi * (semiperi - (CalcularLado(this.Punto1, this.Punto2)))
                * (semiperi - (CalcularLado(this.Punto2, this.Punto3)))
                * (semiperi - (CalcularLado(this.Punto3, this.Punto1))));
    }

    public double CalcularPerimetro() {

        return CalcularLado(this.Punto1, this.Punto2)
                + CalcularLado(this.Punto2, this.Punto3)
                + CalcularLado(this.Punto3, this.Punto1);
    }

    public void CambiarPosicion(double x, double y) {
        this.Punto1.CambiarPosicion(x, y);
        this.Punto2.CambiarPosicion(x, y);
        this.Punto3.CambiarPosicion(x, y);
    }
    @Override
    public String toString() {
       
        return  CalcularArea()+"";

    }
    public String Imprimir() {
        return this.Punto1.Imprimir()
                + "\n" + this.Punto2.Imprimir()
                + "\n" + this.Punto3.Imprimir()
                + "\n" + "perimetro= " + CalcularPerimetro()
                + "\n" + "area= " + CalcularArea();
    }

}
