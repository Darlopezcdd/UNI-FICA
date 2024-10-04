/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeo;

/**
 *
 * @author lopez
 */
public class CIRCULO {

    private PUNTO centro;
    private double radio;

    public CIRCULO(double x, double y, double radio) {
        if (radio <= 0) {
            this.radio = 1;
        } else {
            this.radio = radio;
        }
        this.centro = new PUNTO(x, y);
    }

    public CIRCULO(double x, double y) {
        this.radio = 1;
        this.centro = new PUNTO(x, y);
    }

    public CIRCULO(PUNTO punto, double radio) {
        if (radio <= 0) {
            this.radio = 1;
        } else {
            this.radio = radio;
        }
        this.centro = punto;
    }

    public CIRCULO(PUNTO punto) {
        this.radio = 1;
        this.centro = punto;
    }

    public CIRCULO(double radio) {
        if (radio <= 0) {
            this.radio = 1;
        } else {
            this.radio = radio;
        }
        this.centro = new PUNTO();
    }

    public CIRCULO() {
        this.radio = 1;
        this.centro = new PUNTO();
    }

    public double getRadio() {
        return this.radio;
    }

    public String getCentro() {
        return ("(" + this.centro.getx() + "," + this.centro.gety() + ")");
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        }
    }

    private double CalcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    private double CalcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    public void CambiarPosicion(double x, double y) {
        this.centro.CambiarPosicion(x, y);
    }

    @Override
    public String toString() {
        Imprimir();
        return super.toString();
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String Imprimir() {
        return this.centro.Imprimir() + "\n" + "radio:" + this.radio + "\n"
                + "perimetro :" + this.CalcularPerimetro() + "\n"
                + " area :" + this.CalcularArea();

    }

}
