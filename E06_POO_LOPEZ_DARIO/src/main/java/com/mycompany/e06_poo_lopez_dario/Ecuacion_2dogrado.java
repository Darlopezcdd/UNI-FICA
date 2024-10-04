/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e06_poo_lopez_dario;

/**
 *
 * @author lopez
 */
public class Ecuacion_2dogrado {

    public int primerelemto;
    public int segundoelemto;
    public int tercerlemto;

    public Ecuacion_2dogrado() {
        this.primerelemto = 1;

        this.tercerlemto = 1;

        this.segundoelemto = 2;

    }

    public Ecuacion_2dogrado(int primerelemto, int segundoelemto, int tercerlemto) {
        this.primerelemto = primerelemto;

        this.tercerlemto = tercerlemto;

        this.segundoelemto = segundoelemto;
    }

    public raises Resolver() {
        double dis;
        double x1 = 0;
        double x2 = 0;
        raises r;
        dis = Math.pow(this.segundoelemto, 2) - 4 * this.primerelemto * this.tercerlemto;
        if (dis == 0) {
            x1 = ((-1 * this.segundoelemto) + Math.sqrt(dis)) / (2 * this.primerelemto);
            x2 = ((-1 * this.segundoelemto) - Math.sqrt(dis)) / (2 * this.primerelemto);
            r = new raises(x1, x2, false);
            return r;
        } else if (dis > 0) {
           
            r = new raises(x1, x2, false);
            return r;
        } else if (dis < 0) {
            dis = -dis;
            x1 = ((-1 * this.segundoelemto) + Math.sqrt(dis)) / (2 * this.primerelemto);
            x2 = ((-1 * this.segundoelemto) - Math.sqrt(dis)) / (2 * this.primerelemto);
            r = new raises(x1, x2, true);
            return r;
        }
        return new raises(1,2,true);
    }

    public String Imprimir() {

        return Resolver().Imprimir();

    }

}
