/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject21;

/**
 *
 * @author lopez
 */
public class Mavenproject21 {

    public static String ejeciocio1(double denominador, double numerador) {
        double divicion = denominador / numerador;

        String resultado = (numerador == 0) ? "error no se puede dividir resultado =0" : "resultado = " + divicion;
        return resultado;
    }

    public static String ejeciocio2(char letra) {
        int Ascii = (int) letra;
        if (Ascii <= 90 && Ascii >= 65) {
            return "es una letra mayuscula";
        } else if (Ascii <= 122 && Ascii >= 97) {
            return "es una minuscula";

        } else if (Ascii == 164) {
            return " es minuscula";
        } else if (Ascii == 165) {
            return " es mayuscula";
        } else {
            return "no es una letra";
        }

    }
//
//    public static boolean ejeciocio3(int edad, double nota) {
//
//        return (edad >= 18) && (nota >= 5);
//    }

    public static String tipoTriangulo(double lado1, double lado2, double lado3) {
        if (isoseles(lado1, lado2, lado3)) {
            return "isoseles";
        } else if (equilatero(lado1, lado2, lado3)) {
            return "equilatero";
        } else {
            return "escaleno";
        }
    }

    public static boolean isoseles(double lado1, double lado2, double lado3) {
        return ((lado1 == lado2 && lado2 != lado3)
                || (lado1 == lado3 && lado1 != lado2)
                || (lado2 == lado3 && lado2 != lado1));

    }

    public static boolean equilatero(double lado1, double lado2, double lado3) {
        return ((lado1 == lado2 && lado2 == lado3));

    }

    public static boolean escaleno(double lado1, double lado2, double lado3) {
        return ((lado1 != lado2 && lado2 != lado3 && lado1 != lado3));

    }

    public static boolean rectangulo(double lado1, double lado2, double lado3) {

        double hipotenusa, cateto1, cateto2;
        if (lado1 > lado2 && lado1 > lado3) {
            hipotenusa = lado1;
            cateto1 = lado2;
            cateto2 = lado3;
        } else if (lado2 > lado1 && lado2 > lado3) {
            hipotenusa = lado2;
            cateto1 = lado1;
            cateto2 = lado3;
        } else if (lado3 > lado1 && lado3 > lado2) {
            hipotenusa = lado3;
            cateto1 = lado1;
            cateto2 = lado2;
        } else {
            hipotenusa = lado1;
            cateto1 = lado2;
            cateto2 = lado3;
        }

        return (potencia(cateto1, 2) + potencia(cateto2, 2) == potencia(hipotenusa, 2));

    }

    public static double potencia(double num, int esponente) {
        double respuesta = num;
        for (int i = 1; i < esponente; i++) {
            respuesta *= num;
        }
        return respuesta;
    }

    public static void main(String[] args) {

        System.out.println(ejeciocio1(2, 2));
        char letra = 'ñ';
        System.out.println(ejeciocio2(letra));
        System.out.println(potencia(5, 2));

    }
}
