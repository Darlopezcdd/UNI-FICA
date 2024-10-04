/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject13;

/**
 *
 * @author lopez
 */
public class RECTANGULO {

    private double Altura;
    private double Base;
    private PUNTO PuntoVertice;

    public RECTANGULO() {
        this.PuntoVertice = new PUNTO();
        this.Altura = 1;
        this.Base = 2;
    }

    public RECTANGULO(double Base, double Altura, double X1, double Y1) {
        if (Base > 0 && Altura > 0 && Base != Altura) {
            this.Base = Base;
            this.Altura = Altura;
        } else if (Base > 0 && Altura > 0 && Base == Altura) {
            this.Base = Base + 1;
            this.Altura = Altura;

        } else {
            this.Base = 2;
            this.Altura = 1;
        }
        this.PuntoVertice = new PUNTO(X1, Y1);
    }

    public RECTANGULO(double Base, double X1, double Y1) {
        if (Base > 0) {
            this.Base = Base;
            this.Altura = Base + 1;
        } else {
            this.Base = 2;
            this.Altura = 1;
        }
        this.PuntoVertice = new PUNTO(X1, Y1);
    }

    public RECTANGULO(double Base, double Altura, PUNTO P1) {
        if (Base > 0 && Altura > 0 && Base != Altura) {
            this.Base = Base;
            this.Altura = Altura;
        } else if (Base > 0 && Altura > 0 && Base == Altura) {
            this.Base = Base + 1;
            this.Altura = Altura;
        } else {
            this.Base = 2;
            this.Altura = 1;
        }
        this.PuntoVertice = P1;
    }

    public RECTANGULO(double Base, double Altura) {
        if (Base > 0 && Altura > 0 && Base != Altura) {
            this.Base = Base;
            this.Altura = Altura;
        } else if (Base > 0 && Altura > 0 && Base == Altura) {
            this.Base = Base + 1;
            this.Altura = Altura;

        } else {
            this.Base = 2;
            this.Altura = 1;
        }
        this.PuntoVertice = new PUNTO();
    }

    public RECTANGULO(double numero, PUNTO P1) {
        if (numero > 0) {
            this.Base = numero;
            this.Altura = numero + 1;
        } else {
            this.Base = 2;
            this.Altura = 1;
        }
        this.PuntoVertice = P1;
    }

    public RECTANGULO(PUNTO P1) {
        this.Base = 2;
        this.Altura = 1;
        this.PuntoVertice = P1;
    }

    public RECTANGULO(double numero) {
        if (numero > 0) {
            this.Base = numero;
            this.Altura = numero + 1;
        } else {
            this.Base = 2;
            this.Altura = 1;
        }
        this.PuntoVertice = new PUNTO();
    }

    public String getPuntoVertice() {
        return ("(" + this.PuntoVertice.getx() + "," + this.PuntoVertice.gety() + ")");
    }

    public double getAltura() {
        return Altura;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        if (Base > 0 && Base != this.Base) {
            this.Base = Base;
        }
    }

    public void setAltura(double Altura) {
        if (Altura > 0 && Altura != this.Base) {
            this.Altura = Altura;
        }
    }

    public double CalcularArea() {
        return (this.Base * this.Altura);
    }

    public double CalcularPerimetro() {
        return ((2 * this.Base) + (2 * this.Altura));
    }

    public void CambiarPosicion(double x, double y) {
        this.PuntoVertice.CambiarPosicion(x, y);
    }

    public String Imprimir() {
        return "Base: " + this.Base 
                + "\n" + "Altura: " + this.Altura
                + "\n" + this.PuntoVertice.Imprimir()
                + "\n" + "perimetro= " + CalcularPerimetro()
                + "\n" + "area= " + CalcularArea();
    }
        @Override
    public String toString() {
       
        return  CalcularArea()+"";

    }
}
