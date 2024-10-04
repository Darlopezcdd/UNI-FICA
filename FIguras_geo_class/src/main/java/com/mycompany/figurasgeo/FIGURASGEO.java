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
            System.out.println("Punto:      7, Fecha:      8");

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

                case "7":
                    LlamarPunto();
                    break;

                case "8":
                    LlamarFecha();
                    break;

                default:
                    System.out.println("ingrese bien");

            }

        } while (true);
    }

    static void LlamarCirculo() {
        Scanner sc = new Scanner(System.in);
        CIRCULO c1, c2;
        double radio;
        int x, y;

        System.out.println("CIRCULO 1");
        System.out.println("--------------------------------");
        c1 = new CIRCULO();
        System.out.println("--------------------------------");
        radio = c1.getRadio();
        x = c1.getX();
        y = c1.getY();
        c1 = new CIRCULO(x, y, radio);
        c1.Imprimir();
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

        c1.Imprimir();

        System.out.println("--------------------------------");

        System.out.println("CIRCULO 2");

        System.out.println("--------------------------------");
        c2 = new CIRCULO();
        System.out.println("--------------------------------");

        radio = c2.getRadio();
        x = c2.getX();
        y = c2.getY();
        c2 = new CIRCULO(x, y, radio);

        c2.Imprimir();

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

        c2.Imprimir();
        System.out.println("--------------------------------");
    }

    static void LlamarCuadrado() {
        Scanner sc = new Scanner(System.in);
        CUADRADO cu1, cu2;
        double lado, mx, my;
        int x1, y1, x2, y2;

        System.out.println("CUADRADO 1");

        System.out.println("--------------------------------");
        cu1 = new CUADRADO();
        System.out.println("--------------------------------");

        lado = cu1.getLado();
        x1 = cu1.getX1();
        y1 = cu1.getY1();
        x2 = cu1.getX2();
        y2 = cu1.getY2();
        cu1 = new CUADRADO(x1, y1, x2, y2, lado);
        cu1.Imprimir();

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
        cu1.Imprimir();
        System.out.println("--------------------------------");

        System.out.println("CUADRADO 2");

        System.out.println("--------------------------------");
        cu2 = new CUADRADO();
        System.out.println("--------------------------------");
        lado = cu2.getLado();
        x1 = cu2.getX1();
        y1 = cu2.getY1();
        x2 = cu2.getX2();
        y2 = cu2.getY2();
        cu2 = new CUADRADO(x1, y1, x2, y2, lado);
        cu2.Imprimir();
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
        cu2.Imprimir();
        System.out.println("--------------------------------");

    }

    static void LlamarRecta() {
        Scanner sc = new Scanner(System.in);
        RECTA re1, re2;
        double mx, my;
        int x1, y1, x2, y2;

        System.out.println("Recta 1");
        System.out.println("--------------------------------");
        re1 = new RECTA();
        System.out.println("--------------------------------");

        x1 = re1.getX1();
        y1 = re1.getY1();
        x2 = re1.getX2();
        y2 = re1.getY2();

        re1 = new RECTA(x1, y1, x2, y2);
        re1.Imprimir();
        System.out.println("--------------------------------");

        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        mx = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        my = sc.nextInt();

        System.out.println("--------------------------------");
        re1.CambiarPosicion(mx, my);
        re1.Imprimir();
        System.out.println("--------------------------------");

        System.out.println("Recta 2");
        System.out.println("--------------------------------");
        re2 = new RECTA();
        System.out.println("--------------------------------");

        x1 = re2.getX1();
        y1 = re2.getY1();
        x2 = re2.getX2();
        y2 = re2.getY2();

        re2 = new RECTA(x1, y1, x2, y2);
        re2.Imprimir();
        System.out.println("--------------------------------");

        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        mx = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        my = sc.nextInt();

        System.out.println("--------------------------------");
        re2.CambiarPosicion(mx, my);
        re2.Imprimir();
        System.out.println("--------------------------------");

    }

    static void LlamarRectangulo() {
        Scanner sc = new Scanner(System.in);
        double base, altura;
        int x1, y1, x2, y2, mx, my;
        RECTANGULO rec1, rec2;

        System.out.println("RECTANGULO 1");
        System.out.println("----------------------------------------------");
        rec1 = new RECTANGULO();
        System.out.println("----------------------------------------------");
        base = rec1.getBase();
        altura = rec1.getAltura();
        x1 = rec1.getX1();
        y1 = rec1.getY1();
        x2 = rec1.getX2();
        y2 = rec1.getY2();
        rec1 = new RECTANGULO(base, altura, x1, y1, x2, y2);
        rec1.Imprimir();
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
        rec1.Imprimir();
        System.out.println("------------------------------------------------------------");

        System.out.println("RECTANGULO 2");

        System.out.println("----------------------------------------------");
        rec2 = new RECTANGULO();
        System.out.println("----------------------------------------------");
        base = rec2.getBase();
        altura = rec2.getAltura();
        x1 = rec2.getX1();
        y1 = rec2.getY1();
        x2 = rec2.getX2();
        y2 = rec2.getY2();
        rec2 = new RECTANGULO(base, altura, x1, y1, x2, y2);
        rec2.Imprimir();
        System.out.println("------------------------------------------------------------");
        System.out.println("ingrese cuanto quiere que se mueva en x: ");
        mx = sc.nextInt();
        System.out.println("ingrese cuanto quiere que se mueva en y: ");
        my = sc.nextInt();
        System.out.print("ingrese nueva Base: ");
        base = sc.nextInt();
        rec2.setBase(base);
        System.out.print("ingrese nueva Base: ");
        altura = sc.nextInt();
        rec2.setAltura(altura);
        System.out.println("------------------------------------------------------------");
        rec2.CambiarPosicion(mx, my);
        rec2.Imprimir();
        System.out.println("---------------------------------------------");

    }

    static void LlamarElipse() {
        Scanner sc = new Scanner(System.in);
        double SemiEjeMayor, SemiEjeMenor;
        int x, y;
        ELIPSE el1, el2;

        System.out.println("ELIPSE 1");
        System.out.println("--------------------------------");
        el1 = new ELIPSE();
        System.out.println("--------------------------------");
        SemiEjeMayor = el1.getSemiEjeMayor();
        SemiEjeMenor = el1.getSemiEjeMenor();

        x = el1.getX();
        y = el1.getY();
        el1 = new ELIPSE(SemiEjeMayor, SemiEjeMenor, x, y);

        el1.Imprimir();

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

        el1.Imprimir();
        System.out.println("--------------------------------");

        System.out.println("ELIPSE 2");

        System.out.println("--------------------------------");
        el2 = new ELIPSE();
        System.out.println("--------------------------------");
        SemiEjeMayor = el2.getSemiEjeMayor();
        SemiEjeMenor = el2.getSemiEjeMenor();

        x = el2.getX();
        y = el2.getY();
        el2 = new ELIPSE(SemiEjeMayor, SemiEjeMenor, x, y);

        el2.Imprimir();

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

        el2.Imprimir();
        System.out.println("--------------------------------");

    }

    static void LlamarTriangulo() {
        Scanner sc = new Scanner(System.in);
        TRIANGULO t1, t2;
        double mx, my;
        int x1, y1, x2, y2, x3, y3;

        System.out.println("TRIANGULO 1");
        System.out.println("--------------------------------");
        t1 = new TRIANGULO();
        System.out.println("--------------------------------");

        x1 = t1.getX1();
        y1 = t1.getY1();
        x2 = t1.getX2();
        y2 = t1.getY2();
        x3 = t1.getX3();
        y3 = t1.getY3();

        t1 = new TRIANGULO(x1, y1, x2, y2, x3, y3);
        t1.Imprimir();
        System.out.println("--------------------------------");

        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        mx = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        my = sc.nextInt();

        System.out.println("--------------------------------");
        t1.CambiarPosicion(mx, my);
        t1.Imprimir();
        System.out.println("--------------------------------");

        System.out.println("TRIANGULO 2");
        System.out.println("--------------------------------");
        t2 = new TRIANGULO();
        System.out.println("--------------------------------");

        x1 = t2.getX1();
        y1 = t2.getY1();
        x2 = t2.getX2();
        y2 = t2.getY2();
        x3 = t2.getX3();
        y3 = t2.getY3();

        t2 = new TRIANGULO(x1, y1, x2, y2, x3, y3);
        t2.Imprimir();
        System.out.println("--------------------------------");

        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        mx = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        my = sc.nextInt();

        System.out.println("--------------------------------");
        t2.CambiarPosicion(mx, my);
        t2.Imprimir();
        System.out.println("--------------------------------");
    }

    static void LlamarPunto() {
        Scanner sc = new Scanner(System.in);
        PUNTO P1, P2;
        double mx, my, x, y;

        System.out.println("PUNTO 1");
        System.out.println("--------------------------------");
        P1 = new PUNTO();
        System.out.println("--------------------------------");

        x = P1.getx();
        y = P1.gety();

        P1.Imprimir();
        System.out.println("--------------------------------");

        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        mx = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        my = sc.nextInt();

        System.out.println("--------------------------------");
        P1.CambiarPosicion(mx, my);
        P1.Imprimir();
        System.out.println("--------------------------------");

        System.out.println("PUNTO 2");
        System.out.println("--------------------------------");
        P2 = new PUNTO();
        System.out.println("--------------------------------");

        x = P2.getx();
        y = P2.gety();

        P2.Imprimir();
        System.out.println("--------------------------------");

        System.out.print("ingrese cuanto quieres que se mueva en x: ");
        mx = sc.nextInt();
        System.out.print("ingrese cuanto quieres que se mueva en y: ");
        my = sc.nextInt();

        System.out.println("--------------------------------");
        P2.CambiarPosicion(mx, my);
        P2.Imprimir();
        System.out.println("--------------------------------");
    }

    static void LlamarFecha() {
        Scanner sc = new Scanner(System.in);
        FECHA F1, F2;
        int dia, mes, año;
        System.out.println("Fecha  1");
        System.out.println("--------------------------------");
        F1 = new FECHA();
        System.out.println("--------------------------------");
        dia = F1.getDia();
        mes = F1.getMes();
        año = F1.getAño();
        F1 = new FECHA(dia, mes, año);
        F1.Imprimir();
        System.out.println("--------------------------------");

        System.out.println("Ingrese una nueva fecha:");
        System.out.println("Ingrese una nueva Dia:");
        dia = sc.nextInt();
        System.out.println("Ingrese una nueva Mes:");
        mes = sc.nextInt();
        System.out.println("Ingrese una nueva Año:");
        año = sc.nextInt();

        F1.setDia(dia);
        F1.setMes(mes);
        F1.setAño(año);
        System.out.println("--------------------------------");
        F1.Imprimir();
        System.out.println("--------------------------------");

        System.out.println("Fecha  2");
        System.out.println("--------------------------------");
        F2 = new FECHA();
        System.out.println("--------------------------------");
        dia = F2.getDia();
        mes = F2.getMes();
        año = F2.getAño();
        F2 = new FECHA(dia, mes, año);
        F2.Imprimir();
        System.out.println("--------------------------------");

        System.out.println("Ingrese una nueva fecha:");
        System.out.println("Ingrese una nueva Dia:");
        dia = sc.nextInt();
        System.out.println("Ingrese una nueva Mes:");
        mes = sc.nextInt();
        System.out.println("Ingrese una nueva Año:");
        año = sc.nextInt();

        F2.setDia(dia);
        F2.setMes(mes);
        F2.setAño(año);
        System.out.println("--------------------------------");
        F2.Imprimir();
        System.out.println("--------------------------------");

    }

}
