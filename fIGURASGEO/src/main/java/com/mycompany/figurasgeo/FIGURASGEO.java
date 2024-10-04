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
        c1 = new CIRCULO();
        c2 = new CIRCULO();

        System.out.print("ingrese el radio del CIRCULO 1: ");
        c1.radio = var.nextInt();

        System.out.print("ingrese el radio del CIRCULO 2: ");
        c2.radio = var.nextInt();

        System.out.print("ingrese la pocicion en x del CIRCULO 1: ");
        c1.x = var.nextInt();
        System.out.print("ingrese la pocicion en y del CIRCULO 1: ");
        c1.y = var.nextInt();

        System.out.print("ingrese la pocicion en x del CIRCULO 2: ");
        c2.x = var.nextInt();
        System.out.print("ingrese la pocicion en y del CIRCULO 2: ");
        c2.y = var.nextInt();

        System.out.println("--------------------------------");

        System.out.print("ingrese cuanto quieres que se muevan en x: ");
        x = var.nextInt();
        System.out.print("ingrese cuanto quieres que se muevan en y: ");
        y = var.nextInt();
        System.out.println("--------------------------------");

        System.out.println(c1.radio);
        System.out.println(c2.radio);
        System.out.println("area 1: " + c1.calcularea());
        System.out.println("area 2: " + c2.calcularea());
        System.out.println("perimetro 1: " + c1.calculperi());
        System.out.println("perimetro 2: " + c2.calculperi());
        System.out.println("--------------------------------");
        c1.cambipocicion(x, y);
        c2.cambipocicion(x, y);

    }

    static void llamarcuadrado() {
        Scanner var = new Scanner(System.in);
        Cuadrado cu1, cu2;
        int x, y;
        cu1 = new Cuadrado();
        cu2 = new Cuadrado();

        System.out.print("ingrese el tamaño de los lados del caudrado 1: ");
        cu1.lado = var.nextInt();
        System.out.print("ingrese el tamaño de los lados del cuadrado 2: ");
        cu2.lado = var.nextInt();

        System.out.print("ingrese la pocicion en x del cuadrado 1: ");
        cu1.x1 = var.nextInt();
        System.out.print("ingrese la pocicion en y del cuadrado 1: ");
        cu1.y1 = var.nextInt();
        System.out.print("ingrese la pocicion en x2 del cuadrado 1: ");
        cu1.x2 = var.nextInt();
        System.out.print("ingrese la pocicion en y2 del cuadrado 1: ");
        cu1.y2 = var.nextInt();

        System.out.print("ingrese la pocicion en x del cuadrado 2: ");
        cu2.x1 = var.nextInt();
        System.out.print("ingrese la pocicion en y del cuadrado 2: ");
        cu2.y1 = var.nextInt();
        System.out.print("ingrese la pocicion en x2 del cuadrado 2: ");
        cu2.x2 = var.nextInt();
        System.out.print("ingrese la pocicion en y2 del cuadrado 2: ");
        cu2.y2 = var.nextInt();
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se muevan en x: ");
        x = var.nextInt();
        System.out.print("ingrese cuanto quieres que se muevan en y: ");
        y = var.nextInt();
        System.out.println("--------------------------------");
        System.out.println("lados cuadrado1: " + cu1.lado);
        System.out.println("lados cuadrado2: " + cu2.lado);
        System.out.println("perimetro 1: " + cu1.calculperi());
        System.out.println("perimetro 2: " + cu2.calculperi());
        System.out.println("area 1: " + cu1.calcularea());
        System.out.println("area 2: " + cu2.calcularea());
        cu1.cambipocicion(x, y);
        cu2.cambipocicion(x, y);
        System.out.println("--------------------------------");

    }

    static void llamarrecta() {
        Scanner var = new Scanner(System.in);
        recta re1, re2;
        int x, y;
        re1 = new recta();
        re2 = new recta();

        System.out.print("ingrese la pocicion en x del recta 1: ");
        re1.x1 = var.nextInt();
        System.out.print("ingrese la pocicion en y del recta 1: ");
        re1.y1 = var.nextInt();
        System.out.print("ingrese la pocicion en x2 del recta 1: ");
        re1.x2 = var.nextInt();
        System.out.print("ingrese la pocicion en y2 del recta 1: ");
        re1.y2 = var.nextInt();

        System.out.print("ingrese la pocicion en x del recta 2: ");
        re2.x1 = var.nextInt();
        System.out.print("ingrese la pocicion en y del recta 2: ");
        re2.y1 = var.nextInt();
        System.out.print("ingrese la pocicion en x2 del recta 2: ");
        re2.x2 = var.nextInt();
        System.out.print("ingrese la pocicion en y2 del recta 2: ");
        re2.y2 = var.nextInt();

        System.out.print("ingrese cuanto quieres que se muevan en x: ");
        x = var.nextInt();
        System.out.print("ingrese cuanto quieres que se muevan en y: ");
        y = var.nextInt();
        System.out.println("--------------------------------");
        System.out.println(re1.calcullong());
        System.out.println(re2.calcullong());

        re1.cambipocicion(x, y);
        re2.cambipocicion(x, y);

        System.out.println("--------------------------------");
    }

}
