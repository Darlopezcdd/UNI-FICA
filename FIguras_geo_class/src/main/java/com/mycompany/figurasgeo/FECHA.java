/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeo;

import java.util.Scanner;

/**
 *
 * @author lopez
 */
import java.util.*;

public class FECHA {

    private Date fechaActual = new Date();
    Scanner sc = new Scanner(System.in);

    private int dia, mes, año;
    private int diaActual, mesActual, añoActual;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia > 0 && dia <= 31) {
                this.dia = dia;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            if (dia > 0 && dia <= 30) {
                this.dia = dia;
            }

        } else if (mes == 2) {

            if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                if (dia > 0 && dia <= 29) {
                    this.dia = dia;
                }

            } else {
                if (dia > 0 && dia <= 28) {
                    this.dia = dia;
                }

            }
        }
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        }
    }

    public void setAño(int año) {
        if (año > 0) {
            this.año = año;
        }
    }

    public FECHA() {
        System.out.println("Ingresar fecha:");
        System.out.print("ingrese el dia ");
        this.dia = sc.nextInt();
        System.out.print("ingrese el mes ");
        this.mes = sc.nextInt();
        System.out.print("ingrese el año: ");
        this.año = sc.nextInt();

    }

    public FECHA(int dia, int mes, int año) {
        if (año > 0) {
            this.año = año;
        } else {
            this.año = 1;
        }

        if (mes > 0 && mes < 13) {
            this.mes = mes;
        } else {
            this.mes = 1;
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia > 0 && dia <= 31) {
                this.dia = dia;
            } else {
                this.dia = 1;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            if (dia > 0 && dia <= 30) {
                this.dia = dia;
            } else {
                this.dia = 1;
            }

        } else if (mes == 2) {

            if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                if (dia > 0 && dia <= 29) {
                    this.dia = dia;
                } else {
                    this.dia = 1;
                }

            } else {
                if (dia > 0 && dia <= 28) {
                    this.dia = dia;
                } else {
                    this.dia = 1;
                }

            }
        } else {
            this.dia = 1;
        }

        this.diaActual = fechaActual.getDate();
        this.mesActual = fechaActual.getMonth() + 1;
        this.añoActual = fechaActual.getYear() + 1900;

    }

    public boolean Bisiesto(int año) {
        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {

            return true;
        } else {

            return false;

        }
    }

    public void Imprimir() {

        System.out.println("Dia: " + this.dia);
        System.out.println("Mes: " + this.mes);
        System.out.println("Año: " + this.año);
        System.out.println("Es Bisisesto: " + Bisiesto(this.año));
        System.out.println("Dia Actual: " + this.diaActual);
        System.out.println("Mes Actual: " + this.mesActual);
        System.out.println("Año Actual: " + this.añoActual);
        System.out.println("Es Bisisesto: " + Bisiesto(this.añoActual));

    }

}
