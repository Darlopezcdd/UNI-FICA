/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeo;

/**
 *
 * @author lopez
 */
public class CUADRADO {

    private double Lado;
    private PUNTO PuntoVertice;

    public CUADRADO(double X1, double Y1, double Lado) {
        if (Lado > 0) {
            this.Lado = Lado;
        } else {
            this.Lado = 1;
        }
        this.PuntoVertice = new PUNTO(X1, Y1);
    }

    public CUADRADO(double X1, double Y1) {
        this.Lado = 1;
        this.PuntoVertice = new PUNTO(X1, Y1);
    }

    public CUADRADO(PUNTO punto, double Lado) {
        if (Lado > 0) {
            this.Lado = Lado;
        } else {
            this.Lado = 1;
        }
        this.PuntoVertice = punto;
    }

    public CUADRADO(double Lado) {
        if (Lado > 0) {
            this.Lado = Lado;
        } else {
            this.Lado = 1;
        }
        this.PuntoVertice = new PUNTO();
    }

    public CUADRADO(PUNTO punto) {
        this.Lado = 1;
        this.PuntoVertice = punto;
    }

    public CUADRADO() {
        this.Lado = 1;
        this.PuntoVertice = new PUNTO();
    }

    public double getLado() {
        return this.Lado;
    }

    public String getPuntoVertice() {
        return ("(" + this.PuntoVertice.getx() + "," + this.PuntoVertice.gety() + ")");
    }

    public void setLado(double Lado) {
        if (Lado > 0) {
            this.Lado = Lado;
        }
    }

    private double CalcularArea() {
        return this.Lado * this.Lado;
    }

    private double CalcularPerimetro() {
        return 4 * this.Lado;
    }

    public void CambiarPosicion(double x, double y) {
        this.PuntoVertice.CambiarPosicion(x, y);
    }

    public String Imprimir() {
        return this.PuntoVertice.Imprimir() + "\n"
                + "\n" + "lado:" + this.Lado
                + "\n" + "perimetro :" + this.CalcularPerimetro()
                + "\n" + "area :" + this.CalcularArea();
    }

}
