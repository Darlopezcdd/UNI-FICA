/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

/**
 *
 * @author lopez
 */
public class RECTA {

    private PUNTO Punto1;
    private PUNTO Punto2;

    public RECTA(double X1, double Y1, double X2, double Y2) {
        if ((X1 == X2) && (Y1 == Y2)) {
            this.Punto2 = new PUNTO(X2 + 1, Y2 + 1);
        } else {
            this.Punto2 = new PUNTO(X2, Y2);
        }
        this.Punto1 = new PUNTO(X1, Y1);
    }

    public RECTA(double X1, double Y1) {
        this.Punto1 = new PUNTO(X1, Y1);
        this.Punto2 = new PUNTO(X1 + 1, Y1 + 1);
    }

    public RECTA(PUNTO p1, PUNTO p2) {
        if ((p1.getx() == p2.getx()) && (p1.gety() == p2.gety())) {
            this.Punto2 = new PUNTO(p1.getx() + 1, p1.gety() + 1);
        } else {
            this.Punto2 = p2;
        }
        this.Punto1 = p1;
    }

    public RECTA(PUNTO p1) {
        this.Punto2 = new PUNTO(p1.getx() + 1, p1.gety() + 1);
        this.Punto1 = p1;
    }

    public RECTA(double X) {
        this.Punto1 = new PUNTO(X, X);
        this.Punto2 = new PUNTO(X + 1, X + 1);
    }

    public RECTA() {
        this.Punto2 = new PUNTO();
        this.Punto1 = new PUNTO();
    }

    public String getPunto1() {
        return ("(" + Punto1.getx() + "," + Punto1.gety() + ")");
    }

    public String getPunto2() {
        return ("(" + Punto2.getx() + "," + Punto2.gety() + ")");
    }

    public double CalcularLongitud() {
        return Math.sqrt(Math.pow(this.Punto2.getx() - this.Punto1.getx(), 2)
                + Math.pow(this.Punto2.gety() - this.Punto1.gety(), 2));
    }

    public void CambiarPosicion(double x, double y) {
        this.Punto1.CambiarPosicion(x, y);
        this.Punto2.CambiarPosicion(x, y);
    }

    public String Imprimir() {
        return this.Punto1.Imprimir() 
                + "\n" + this.Punto2.Imprimir()
                + "\n" + "longitud: " + CalcularLongitud();
    }
    @Override
    public String toString() {
       
        return  CalcularLongitud()+"";

    }
}
