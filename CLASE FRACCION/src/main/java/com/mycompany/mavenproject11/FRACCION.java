/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject11;

/**
 *
 * @author lopez
 */
public class FRACCION {

    private int numerador;
    private int denominador;
    public static int cont = 0;

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
          if (denominador == 0) {
            this.denominador = 1;
        } else {
            this.denominador = denominador;
        }
    }

    public FRACCION() {
        this(1, 1);
    }

    public FRACCION(int num) {
        this(num, 1);
    }

    public FRACCION(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador == 0) {
            this.denominador = 1;
        } else {
            this.denominador = denominador;
        }
        Simplificacion();
        FRACCION.cont++;
    }

    public FRACCION Suma(int numerador, int denominador, FRACCION FR) {
        int numR, denR;
        numR = (denominador * this.numerador) + (this.denominador * numerador);
        denR = this.denominador * denominador;
        if (FR == null) {
            FR = new FRACCION(numR, denR);
        } else {
            FR.numerador = numR;
            FR.denominador = denR;
        }
        return FR;
    }

    public FRACCION Suma(int numerador, int denominador) {
        return new FRACCION((denominador * this.numerador) + (this.denominador * numerador),
                this.denominador * denominador);
    }

    public FRACCION Suma(FRACCION F) {
        return Suma(F.numerador, F.denominador);
    }

    public FRACCION Suma(int num) {
        return Suma(num, 1);
    }

    public FRACCION Suma() {
        return Suma(1, 1);
    }

    public FRACCION Resta(int numerador, int denominador) {
        return new FRACCION((denominador * this.numerador) - (this.denominador * numerador),
                this.denominador * denominador);
    }

    public FRACCION Resta(FRACCION F) {
        return Resta(F.numerador, F.denominador);
    }

    public FRACCION Resta() {
        return Resta(1, 1);
    }

    public FRACCION Resta(int num) {
        return Resta(num, 1);
    }

    public FRACCION Multiplicacion() {
        return Multiplicacion(2, 2);
    }

    public FRACCION Multiplicacion(int num) {
        return Multiplicacion(num, 1);
    }

    public FRACCION Multiplicacion(int numerador, int denominador) {
        return new FRACCION(this.numerador * numerador, this.denominador * denominador);
    }

    public FRACCION Multiplicacion(FRACCION F) {
        return Multiplicacion(F.numerador, F.denominador);
    }

    public FRACCION Divicion() {
        return Divicion(2, 1);
    }

    public FRACCION Divicion(int num) {

        return Divicion(num, 1);
    }

    public FRACCION Divicion(int numerador, int denominador) {
        return new FRACCION(this.numerador * denominador, this.denominador * numerador);
    }

    public FRACCION Divicion(FRACCION F) {
        return Divicion(F.numerador, F.denominador);
    }

    private void Simplificacion() {
        int numeroMayor;
        numeroMayor = this.numerador;
        for (int i = numeroMayor; i >= 2; i--) {

            if (this.numerador % i == 0 && this.denominador % i == 0) {
                this.numerador = this.numerador / i;
                this.denominador = this.denominador / i;
            }
            if (this.denominador < this.numerador) {
                numeroMayor = this.denominador;
            } else {
                numeroMayor = this.numerador;
            }
        }
    }

    public void Incrementar(int num) {
        this.numerador = (this.denominador * num) + this.numerador;
    }

    public void Incrementar(FRACCION fr) {
        this.denominador *= fr.denominador;
        this.numerador = (fr.denominador * this.numerador) + (this.denominador * fr.numerador);

    }

    public void Incrementar(int Numerador, int Denominador) {
        Incrementar(new FRACCION(Numerador, Denominador));
    }

    public void Incrementar() {
        Incrementar(1);
    }

    public void Decrementar(int num) {
        this.numerador = (this.denominador * num) - this.numerador;
    }

    public void Decrementar(FRACCION fr) {
        this.denominador *= fr.denominador;
        this.numerador = (fr.denominador * this.numerador) - (this.denominador * fr.numerador);
    }

    public void Decrementar(int Numerador, int Denominador) {
        Decrementar(new FRACCION(Numerador, Denominador));
    }

    public void Decrementar() {
        Decrementar(1);
    }

    public void Aumentar(int num) {

        this.numerador = this.numerador * num;
    }

    public void Aumentar(FRACCION fr) {

        this.numerador = this.numerador * fr.numerador;
        this.denominador = this.denominador * fr.denominador;
    }

    public void Aumentar(int Numerador, int Denominador) {
        Aumentar(new FRACCION(Numerador, Denominador));
    }

    public void Aumentar() {
        Aumentar(1);
    }

    public void Fraccionar(int num) {

        this.denominador = this.denominador * num;
    }

    public void Fraccionar(FRACCION fr) {
        this.numerador = this.numerador * fr.denominador;
        this.denominador = this.denominador * fr.numerador;
    }

    public void Fraccionar(int Numerador, int Denominador) {
        Fraccionar(new FRACCION(Numerador, Denominador));
    }

    public void Fraccionar() {
        Fraccionar(1);
    }
    //    protected void finalize() throws Throwable
    //    {
    //        System.out.println("aaaaaaaaaaaaa me borroooo adios");
    //        FRACCION.cont--;~~~
    //        super.finalize(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    //}

    public String Imprimir() {

        if (this.numerador == 0) {
            return (this.numerador + "");
        } else {
            if (this.denominador == 1) {
                return (this.numerador + "");
            } else {
                return (this.numerador + "/" + this.denominador);
            }
        }

    }
}
