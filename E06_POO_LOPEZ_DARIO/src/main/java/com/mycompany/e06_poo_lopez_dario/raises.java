/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e06_poo_lopez_dario;

/**
 *
 * @author lopez
 */
public class raises {

    public double raiz1;
    public double raiz2;
    public boolean raizi;

    public raises(double raiz1, double raiz2, boolean raizi) {
        this.raiz1 = raiz1;
        this.raiz2 = raiz2;
        this.raizi = raizi;
    }

    public String Imprimir() {
        if (this.raizi == true) {
            return "x1=" + this.raiz1 + "i" + "|" + "x2=" + this.raiz2+"i";
        }
        else if(this.raiz2==this.raiz1)
        {
        return "x=" + this.raiz1 ;
        }
        else
        {
             return "x1=" + this.raiz1  + "|" + "x2=" + this.raiz2;
        }
    }

}
