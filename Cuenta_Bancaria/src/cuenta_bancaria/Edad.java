/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta_bancaria;

/**
 *
 * @author lopez
 */
public class Edad {

    private int dia, mes, año;

    public Edad() {
        this.dia = 0;
        this.mes = 0;
        this.año = 0;

    }


    public Edad(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }
        public String imprimir() {
        return this.año + ":" + this.mes + ":" + this.dia;
    }

}
