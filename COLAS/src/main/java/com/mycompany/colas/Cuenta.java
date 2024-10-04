/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

/**
 *
 * @author lopez
 */
public class Cuenta {

    private Propietario Porpietario;
    private FECHA FechaDeCreacion;
    private double saldo;
    private static double saldoMinimo = 1;

    public static double getSaldoMinimo() {
        return saldoMinimo;
    }

    public static void setSaldoMinimo(double saldoMinimo) {
        Cuenta.saldoMinimo = saldoMinimo;
    }

    @Override
    protected void finalize() throws Throwable {
          System.out.println("aaaaaaaaaaaaa me borroooo adios");
        super.finalize(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }



    public Cuenta(String Nombre, int diaN, int mesN, int añoN, int diaC, int mesC, int añoC, double saldo) {
        this.Porpietario = new Propietario(Nombre, diaN, mesN, añoN);
        this.FechaDeCreacion = new FECHA(diaC, mesC, añoC);
        this.saldo = saldo;
    }

    public Cuenta(String Nombre, int diaN, int mesN, int añoN, int diaC, int mesC, int añoC) {
        this(Nombre, diaN, mesN, añoN, diaC, mesC, añoC, 0);
    }

    public Cuenta(String Nombre, int diaN, int mesN, int añoN) {
        this(Nombre, diaN, mesN, añoN, 0, 0, 0, 0);
    }

    public Cuenta(String Nombre, int diaN, int mesN, int añoN, FECHA FechaC, double saldo) {
        this(Nombre, diaN, mesN, añoN, FechaC.getDia(), FechaC.getMes(), FechaC.getAño(), saldo);
    }

    public Cuenta(String Nombre, int diaN, int mesN, int añoN, FECHA FechaC) {
        this(Nombre, diaN, mesN, añoN, FechaC.getDia(), FechaC.getMes(), FechaC.getAño());
    }

    public Cuenta(String Nombre, FECHA FechaN, FECHA FechaC, double saldo) {
        this(Nombre, FechaN.getDia(), FechaN.getMes(), FechaN.getAño(), FechaC.getDia(),
                FechaC.getMes(), FechaC.getAño(), saldo);
    }

    public Cuenta(String Nombre, FECHA FechaN, FECHA FechaC) {
        this(Nombre, FechaN.getDia(), FechaN.getMes(), FechaN.getAño(), FechaC.getDia(),
                FechaC.getMes(), FechaC.getAño(), 0);
    }

    public Cuenta(String Nombre, FECHA FechaN) {
        this(Nombre, FechaN.getDia(), FechaN.getMes(), 0, 0, 0, 0);
    }

    public Cuenta(String Nombre, FECHA FechaN, double saldo) {
        this(Nombre, FechaN.getDia(), FechaN.getMes(), FechaN.getAño(), 0, 0, 0, saldo);
    }

    public Cuenta(Propietario Porp, FECHA Fecha, double saldo) {
        this(Porp.getNombre(), Porp.getDia(), Porp.getMes(), Porp.getAño(), Fecha.getDia(),
                Fecha.getMes(), Fecha.getAño(), saldo);
    }

    public Cuenta(Propietario Porp, double saldo) {
        this(Porp.getNombre(), Porp.getDia(), Porp.getMes(), Porp.getAño(), 0, 0, 0, saldo);
    }

    public Cuenta(Propietario Porp, FECHA Fecha) {
        this(Porp.getNombre(), Porp.getDia(), Porp.getMes(), Porp.getAño(), Fecha.getDia(),
                Fecha.getMes(), Fecha.getAño(), 0);
    }

    public Cuenta(Propietario Porp) {
        this(Porp.getNombre(), Porp.getDia(), Porp.getMes(), 0, 0, 0, 0);
    }

    public Cuenta() {
        this("Anonimo", 0, 0, 0, 0, 0, 0, 0);
    }

    public Propietario getPorpietario() {
        return Porpietario;
    }

    public FECHA getFechaDeCreacion() {
        return FechaDeCreacion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Retiro() {

        Retiro(0);
    }

    public void Retiro(double valor) {
        if (this.saldo - valor >= this.saldoMinimo) {
            this.saldo = this.saldo - valor;
        }
    }

    public void Deposito() {

        Deposito(0);
    }

    public void Deposito(double valor) {

        this.saldo += valor;
    }
//\n nueva linea
//+"////\n"+Cuenta.saldoMinimo
    public String Imprimir() {
        return "Propietario:" + this.Porpietario.Imprimir() + "\t" + "Fecha de cracion:"
                + this.FechaDeCreacion.Imprimir() + "\t" + "saldo:" + this.saldo;
    }
    
}
