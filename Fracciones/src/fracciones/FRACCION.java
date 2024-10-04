/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fracciones;

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

    public FRACCION Suma() {
        return Suma(1, 1);
    }

    public FRACCION Suma(int num) {
        return Suma(num, 1);
    }

    public FRACCION Suma(int numerador, int denominador) {
        return new FRACCION((denominador * this.numerador) + (this.denominador * numerador),
                this.denominador * denominador);
    }

    public FRACCION Suma(FRACCION F) {
        return Suma(F.numerador, F.denominador);
    }

    public FRACCION Resta() {
        return Resta(1, 1);
    }

    public FRACCION Resta(int num) {
        return Resta(num, 1);
    }

    public FRACCION Resta(int numerador, int denominador) {
        return new FRACCION((denominador * this.numerador) - (this.denominador * numerador),
                this.denominador * denominador);
    }

    public FRACCION Resta(FRACCION F) {
        return Resta(F.numerador, F.denominador);
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
        int numeroMenor;
        numeroMenor = 2;
        for (int i = numeroMenor; i >= 2; i--) {

            if (this.numerador % i == 0 && this.denominador % i == 0) {
                this.numerador = this.numerador / i;
                this.denominador = this.denominador / i;
            }
            if (this.denominador < this.numerador) {
                numeroMenor = this.denominador;
            } else {
                numeroMenor = this.numerador;
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("aaaaaaaaaaaaa me borroooo adios");
        FRACCION.cont--;
        super.finalize(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

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
