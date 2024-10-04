/*
52 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.figurasgeo;

/**
 *
 * @author lopez
 */
import java.util.*;

public class FIGURASGEO {

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        do {

            System.out.println("seleccione cualquiera de los siguentes: (1=Circulo,2=cuadrado,3=recta)");
            int num = var.nextInt();
            if (num == 1) {
                llamarcirculo();
                break;
            } else if (num == 2) {
                llamarcuadrado();
                break;
            } else if (num == 3) {
                llamarrecta();
                break;
            } else {

            }
        } while (true);
    }

    static void llamarcirculo() {
        Scanner var = new Scanner(System.in);
        CIRCULO c1, c2;
        int x, y;
        System.out.println("CIRCULO 1");

        c1 = new CIRCULO();
        System.out.println("--------------------------------");
        c1 = new CIRCULO(c1.x, c1.y, c1.radio);
        c1.imprimir();
        System.out.println("--------------------------------");

        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        x = var.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        y = var.nextInt();
        System.out.println("--------------------------------");
        c1.imprimir();
        c1.cambipocicion(x, y);
        System.out.println("--------------------------------");

        System.out.println("CIRCULO 2");

        c2 = new CIRCULO();
        System.out.println("--------------------------------");
        c2 = new CIRCULO(c2.x, c2.y, c2.radio);
        c2.imprimir();
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        x = var.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        y = var.nextInt();
        System.out.println("--------------------------------");
        c2.imprimir();

        c2.cambipocicion(x, y);
        System.out.println("--------------------------------");
    }

    static void llamarcuadrado() {
        Scanner var = new Scanner(System.in);
        Cuadrado cu1, cu2;
        int x, y;
        System.out.println("CUADRADO 1");

        cu1 = new Cuadrado();
        System.out.println("--------------------------------");
        cu1 = new Cuadrado(cu1.x1, cu1.y1, cu1.x2, cu1.y2, cu1.lado);
        cu1.imprimir();
        System.out.println("--------------------------------");

        System.out.print("ingrese cuanto quieres que se muevan en x: ");
        x = var.nextInt();
        System.out.print("ingrese cuanto quieres que se muevan en y: ");
        y = var.nextInt();
        System.out.println("--------------------------------");
        cu1.imprimir();
        cu1.cambipocicion(x, y);

        System.out.println("CUADRADO 2");

        cu2 = new Cuadrado();
        System.out.println("--------------------------------");
        cu2 = new Cuadrado(cu2.x1, cu2.y1, cu2.x2, cu2.y2, cu2.lado);
        cu2.imprimir();
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se muevan en x: ");
        x = var.nextInt();
        System.out.print("ingrese cuanto quieres que se muevan en y: ");
        y = var.nextInt();
        System.out.println("--------------------------------");
        cu2.imprimir();
        cu2.cambipocicion(x, y);
        System.out.println("--------------------------------");
    }

    static void llamarrecta() {
        Scanner var = new Scanner(System.in);
        recta re1, re2;

        System.out.println("Recta 1");

        re1 = new recta();
        System.out.println("--------------------------------");
        re1 = new recta(re1.x1, re1.y1, re1.x2, re1.y2);
        re1.imprimir();
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se muevan en x: ");
        int dx1 = var.nextInt();
        System.out.print("ingrese cuanto quieres que se muevan en y: ");
        int dy1 = var.nextInt();
        System.out.println("--------------------------------");
        re1.imprimir();
        re1.cambipocicion(dx1, dy1);

        System.out.println("--------------------------------");
        System.out.println("Recta 2");

        re2 = new recta();
        System.out.println("--------------------------------");
        re2 = new recta(re2.x1, re2.y1, re2.x2, re2.y2);
        re2.imprimir();
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se muevan en x: ");
        int dx = var.nextInt();
        System.out.print("ingrese cuanto quieres que se muevan en y: ");
        int dy = var.nextInt();
        System.out.println("--------------------------------");
        re2.imprimir();
        re2.cambipocicion(dx, dy);
    }

}
