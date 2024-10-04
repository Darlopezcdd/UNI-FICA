/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeo;

/**
 *
 * @author lopez
 */
public class ELIPSE {

    private double SemiEjeMayor;
    private double SemiEjeMenor;
    private PUNTO centro;

    public ELIPSE(double SemiEjeMayor, double SemiEjeMenor, double x, double y) {
        if (SemiEjeMayor > 0 && SemiEjeMenor > 0 && SemiEjeMayor != SemiEjeMenor) {
            this.SemiEjeMayor = SemiEjeMayor;
            this.SemiEjeMenor = SemiEjeMenor;
        } else if (SemiEjeMayor > 0 && SemiEjeMenor > 0 && SemiEjeMayor == SemiEjeMenor) {
            this.SemiEjeMayor = SemiEjeMayor + 1;
            this.SemiEjeMenor = SemiEjeMenor;
        } else {
            this.SemiEjeMayor = 2;
            this.SemiEjeMenor = 1;
        }
        this.centro = new PUNTO(x, y);
    }

    public ELIPSE(double SemiEjeMayor, double SemiEjeMenor, PUNTO punto) {
        if (SemiEjeMayor > 0 && SemiEjeMenor > 0 && SemiEjeMayor != SemiEjeMenor) {
            this.SemiEjeMayor = SemiEjeMayor;
            this.SemiEjeMenor = SemiEjeMenor;
        } else if (SemiEjeMayor > 0 && SemiEjeMenor > 0 && SemiEjeMayor == SemiEjeMenor) {
            this.SemiEjeMayor = SemiEjeMayor + 1;
            this.SemiEjeMenor = SemiEjeMenor;
        } else {
            this.SemiEjeMayor = 2;
            this.SemiEjeMenor = 1;
        }
        this.centro = punto;
    }

    public ELIPSE(double SemiEjeMayor, double SemiEjeMenor) {
        if (SemiEjeMayor > 0 && SemiEjeMenor > 0 && SemiEjeMayor != SemiEjeMenor) {
            this.SemiEjeMayor = SemiEjeMayor;
            this.SemiEjeMenor = SemiEjeMenor;
        } else if (SemiEjeMayor > 0 && SemiEjeMenor > 0 && SemiEjeMayor == SemiEjeMenor) {
            this.SemiEjeMayor = SemiEjeMayor + 1;
            this.SemiEjeMenor = SemiEjeMenor;
        } else {
            this.SemiEjeMayor = 2;
            this.SemiEjeMenor = 1;
        }
        this.centro = new PUNTO();
    }

    public ELIPSE(PUNTO punto) {
        this.SemiEjeMayor = 2;
        this.SemiEjeMenor = 1;
        this.centro = punto;
    }

    public ELIPSE(double SemiEjeMayor) {
        if (SemiEjeMayor > 0) {
            this.SemiEjeMayor = SemiEjeMayor;
        } else {
            this.SemiEjeMayor = 2;
        }
        this.SemiEjeMenor = 1;
        this.centro = new PUNTO();
    }

    public ELIPSE() {
        this.centro = new PUNTO();
        this.SemiEjeMayor = 2;
        this.SemiEjeMenor = 1;
    }

    public String getCentro() {
        return ("(" + this.centro.getx() + "," + this.centro.gety() + ")");
    }

    public double getSemiEjeMayor() {
        return SemiEjeMayor;
    }

    public double getSemiEjeMenor() {
        return SemiEjeMenor;
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

    private double CalcularPerimetro() {
        //aproximado
        return Math.PI * (3 * (this.SemiEjeMayor + this.SemiEjeMenor)
                - Math.sqrt((3 * this.SemiEjeMayor + this.SemiEjeMenor)
                        * (this.SemiEjeMayor + 3 * this.SemiEjeMenor)));
    }

    private double CalcularArea() {
        return Math.PI * this.SemiEjeMayor * this.SemiEjeMenor;
    }

    public void CambiarPosicion(double x, double y) {
        this.centro.CambiarPosicion(x, y);
    }

    public String Imprimir() {
        return "SemiEjeMayor: " + this.SemiEjeMayor + "\n"
                + "\n" + "SemiEjeMenor: " + this.SemiEjeMenor
                + "\n" + this.centro.Imprimir()
                + "\n" + "perimetro :" + this.CalcularPerimetro()
                + "\n" + "area :" + this.CalcularArea();
    }
}
