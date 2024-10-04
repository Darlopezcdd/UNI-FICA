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
        Scanner sc = new Scanner(System.in);
        String num;
        do {
            System.out.println("seleccione cualquiera de los siguentes: ");
            System.out.println("Circulo:    1, Cuadrado:   2, Recta:      3");
            System.out.println("Rectangulo: 4, Elipse:     5, Triangulo:  6");
            num = sc.next();
            switch (num) {
                case "1":
                    LlamarCirculo();
                    break;
                case "2":
                    LlamarCuadrado();
                    break;

                case "3":
                    LlamarRecta();
                    break;

                case "4":
                    LlamarRectangulo();
                    break;
                case "5":
                    LlamarElipse();
                    break;
                case "6":
                    LlamarTriangulo();
                    break;
                default:
                    System.out.println("ingrese bien");
            }
        } while (true);
    }

    static void LlamarCirculo() {

        Scanner sc = new Scanner(System.in);
        CIRCULO c1, c2;
        PUNTO P1, P2;
        double x, y, radio;

        System.out.println("CIRCULO 1");
        P1 = new PUNTO(1, 2);
        c1 = new CIRCULO(P1, 1.5);
        System.out.println("--------------------------------");
        System.out.println(c1.Imprimir());
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        x = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        y = sc.nextInt();
        System.out.print("ingrese nuevo radio: ");
        radio = sc.nextInt();
        c1.setRadio(radio);
        c1.CambiarPosicion(x, y);
        System.out.println("--------------------------------");
        System.out.println(c1.Imprimir());
        System.out.println("--------------------------------");

        System.out.println("CIRCULO 2");
        P2 = new PUNTO(5, 2);
        c2 = new CIRCULO(P2, 8.5);
        System.out.println("--------------------------------");
        System.out.println( c2.Imprimir());
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        x = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        y = sc.nextInt();
        System.out.print("ingrese nuevo radio: ");
        radio = sc.nextInt();
        c2.setRadio(radio);
        c2.CambiarPosicion(x, y);
        System.out.println("--------------------------------");
        System.out.println( c2.Imprimir());
        System.out.println("--------------------------------");
    }

    static void LlamarCuadrado() {
        Scanner sc = new Scanner(System.in);
        CUADRADO cu1, cu2;
        PUNTO P1, P2;
        double lado, mx, my;

        System.out.println("CUADRADO 1");
        System.out.println("--------------------------------");
        P1 = new PUNTO(1, 2);
        cu1 = new CUADRADO(P1, 45);
        System.out.println(cu1.Imprimir());
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        mx = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        my = sc.nextInt();
        System.out.print("ingrese nuevo tamaño de los lados: ");
        lado = sc.nextInt();
        cu1.setLado(lado);
        System.out.println("--------------------------------");
        cu1.CambiarPosicion(mx, my);
       System.out.println( cu1.Imprimir());
        System.out.println("--------------------------------");

        System.out.println("CUADRADO 2");
        System.out.println("--------------------------------");
        P2 = new PUNTO(1, 2);
        cu2 = new CUADRADO(P2, 158.1);
        System.out.println(cu2.Imprimir());
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        mx = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        my = sc.nextInt();
        System.out.print("ingrese nuevo tamaño de los lados: ");
        lado = sc.nextInt();
        cu2.setLado(lado);
        System.out.println("--------------------------------");
        cu2.CambiarPosicion(mx, my);
        System.out.println(cu2.Imprimir());
        System.out.println("--------------------------------");
    }

    static void LlamarRecta() {
        Scanner sc = new Scanner(System.in);
        RECTA re1, re2;
        PUNTO P1, P2, P3, P4;
        double mx, my;

        System.out.println("Recta 1");
        P1 = new PUNTO(1, 2);
        P2 = new PUNTO(5, 2);
        System.out.println("--------------------------------");
        re1 = new RECTA(P1, P2);
        System.out.println(re1.Imprimir());
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        mx = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        my = sc.nextInt();
        System.out.println("--------------------------------");
        re1.CambiarPosicion(mx, my);
        System.out.println(re1.Imprimir());
        System.out.println("--------------------------------");

        System.out.println("Recta 2");
        P3 = new PUNTO(2, 2);
        P4 = new PUNTO(-1, 4);
        System.out.println("--------------------------------");
        re2 = new RECTA(P3, P4);
        System.out.println(re2.Imprimir());
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        mx = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        my = sc.nextInt();
        System.out.println("--------------------------------");
        re2.CambiarPosicion(mx, my);
        System.out.println(re2.Imprimir());
        System.out.println("--------------------------------");
    }

    static void LlamarRectangulo() {
        Scanner sc = new Scanner(System.in);
        double base, altura;
        PUNTO P1, P2;
        double mx, my;
        RECTANGULO rec1, rec2;

        System.out.println("RECTANGULO 1");
        System.out.println("----------------------------------------------");
        P1 = new PUNTO(3, 5);
        rec1 = new RECTANGULO(P1);
        System.out.println(rec1.Imprimir());
        System.out.println("------------------------------------------------------------");
        System.out.println("ingrese cuanto quiere que se mueva en x: ");
        mx = sc.nextInt();
        System.out.println("ingrese cuanto quiere que se mueva en y: ");
        my = sc.nextInt();
        System.out.print("ingrese nueva Base: ");
        base = sc.nextInt();
        rec1.setBase(base);
        System.out.print("ingrese nueva Base: ");
        altura = sc.nextInt();
        rec1.setAltura(altura);
        System.out.println("------------------------------------------------------------");
        rec1.CambiarPosicion(mx, my);
        System.out.println(rec1.Imprimir());
        System.out.println("------------------------------------------------------------");

        System.out.println("RECTANGULO 2");
        System.out.println("----------------------------------------------");
        P2 = new PUNTO(3, 5);
        rec2 = new RECTANGULO(4, 5, P2);
        System.out.println(rec2.Imprimir());
        System.out.println("------------------------------------------------------------");
        System.out.println("ingrese cuanto quiere que se mueva en x: ");
        mx = sc.nextInt();
        System.out.println("ingrese cuanto quiere que se mueva en y: ");
        my = sc.nextInt();
        System.out.print("ingrese nueva Base: ");
        base = sc.nextInt();
        rec2.setBase(base);
        System.out.print("ingrese nueva Altura: ");
        altura = sc.nextInt();
        rec2.setAltura(altura);
        System.out.println("------------------------------------------------------------");
        rec2.CambiarPosicion(mx, my);
        System.out.println(rec2.Imprimir());
        System.out.println("------------------------------------------------------------");
    }

    static void LlamarElipse() {
        Scanner sc = new Scanner(System.in);
        double SemiEjeMayor, SemiEjeMenor;
        double x, y;
        ELIPSE el1, el2;
        PUNTO P1, P2;

        System.out.println("ELIPSE 1");
        System.out.println("--------------------------------");
        P1 = new PUNTO(2.1, 5);
        el1 = new ELIPSE(2, 5.7, P1);
        System.out.println(el1.Imprimir());
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        x = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        y = sc.nextInt();
        System.out.print("ingrese nuevo SemiEjeMayor: ");
        SemiEjeMayor = sc.nextInt();
        System.out.print("ingrese nuevo SemiEjeMenor: ");
        SemiEjeMenor = sc.nextInt();
        el1.setSemiEjeMayor(SemiEjeMayor);
        el1.setSemiEjeMenor(SemiEjeMenor);
        el1.CambiarPosicion(x, y);
        System.out.println("--------------------------------");
        System.out.println(el1.Imprimir());
        System.out.println("--------------------------------");

        System.out.println("ELIPSE 2");
        P2 = new PUNTO();
        System.out.println("--------------------------------");
        el2 = new ELIPSE(1, 5.8, P2);
        System.out.println(el2.Imprimir());
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        x = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        y = sc.nextInt();
        System.out.print("ingrese nuevo SemiEjeMayor: ");
        SemiEjeMayor = sc.nextInt();
        System.out.print("ingrese nuevo SemiEjeMenor: ");
        SemiEjeMenor = sc.nextInt();
        el2.setSemiEjeMayor(SemiEjeMayor);
        el2.setSemiEjeMenor(SemiEjeMenor);
        el2.CambiarPosicion(x, y);
        System.out.println("--------------------------------");
        System.out.println(el2.Imprimir());
        System.out.println("--------------------------------");
    }

    static void LlamarTriangulo() {
        Scanner sc = new Scanner(System.in);
        TRIANGULO t1, t2;
        PUNTO P1, P2, P3;
        PUNTO P4, P5, P6;
        double mx, my;

        System.out.println("TRIANGULO 1");
        System.out.println("--------------------------------");
        P1 = new PUNTO(1, 2);
        P2 = new PUNTO(5, 2);
        P3 = new PUNTO(4, 3);
        t1 = new TRIANGULO(P1, P2, P3);
        System.out.println(t1.Imprimir());
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        mx = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        my = sc.nextInt();
        System.out.println("--------------------------------");
        t1.CambiarPosicion(mx, my);
        System.out.println(t1.Imprimir());
        System.out.println("--------------------------------");

        System.out.println("TRIANGULO 2");
        System.out.println("--------------------------------");
        P4 = new PUNTO(8, 2);
        P5 = new PUNTO(5, 8);
        P6 = new PUNTO(4, -200);
        t2 = new TRIANGULO(P4, P5, P6);
        System.out.println(t2.Imprimir());
        System.out.println("--------------------------------");
        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        mx = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        my = sc.nextInt();
        System.out.println("--------------------------------");
        t2.CambiarPosicion(mx, my);
        System.out.println(t2.Imprimir());
        System.out.println("--------------------------------");
    }

}
