/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

/**
 *
 * @author lopez
 */
public class Mixto {

    private int ent;
    private FRACCION Fr;
    public static int cont = 0;

    public int getEnt() {
        return ent;
    }

    public void setEnt(int ent) {
        this.ent = ent;
    }

    public String getFr() {
        return Fr.Imprimir();
    }

    public void setFr(FRACCION Fr) {
        this.Fr = Fr;
    }

    public int getNum() {
        return Fr.getNumerador();
    }

    public int getDen() {
        return Fr.getDenominador();
    }

    public void setNum(int ent) {
        Fr.setNumerador(ent);
    }

    public void setDen(int ent) {
          Fr.setDenominador(ent);
    }

    public Mixto(int ent, FRACCION fr) {
        this.ent = ent;
        this.Fr = fr;
        this.TransformarMixto();
        Mixto.cont++;
    }

    public Mixto(int ent, int num, int den) {
        this(ent, new FRACCION(num, den));
    }

    public Mixto(int ent) {
        this(ent, new FRACCION(0, 1));
    }

    public Mixto() {
        this(0, new FRACCION(0, 1));
    }

    public Mixto(FRACCION f) {
        this(0, f);
    }

    public Mixto(int num, int den) {
        this(0, new FRACCION(num, den));
    }

    public Mixto SumaMixto(Mixto M) {
        return new Mixto(M.ent + this.ent, M.Fr.Suma(this.Fr));

    }

    public Mixto SumaMixto(int ent, FRACCION fr) {
        return SumaMixto(new Mixto(ent, fr));

    }

    public Mixto SumaMixto(FRACCION fr) {
        return SumaMixto(new Mixto(fr));

    }

    public Mixto SumaMixto(int ent, int Numerador, int Denominador) {

        return SumaMixto(new Mixto(ent, Numerador, Denominador));
    }

    public Mixto SumaMixto(int Numerador, int Denominador) {

        return SumaMixto(new Mixto(Numerador, Denominador));
    }

    public Mixto SumaMixto(int ent) {

        return SumaMixto(new Mixto(ent));
    }

    public Mixto SumaMixto() {

        return SumaMixto(1);
    }

    public Mixto RestaMixto(Mixto M) {
        return new Mixto(M.ent - this.ent, M.Fr.Resta(this.Fr));

    }

    public Mixto RestaMixto(int ent, FRACCION fr) {
        return RestaMixto(new Mixto(ent, fr));

    }

    public Mixto RestaMixto(FRACCION fr) {
        return RestaMixto(new Mixto(fr));

    }

    public Mixto RestaMixto(int ent, int Numerador, int Denominador) {

        return RestaMixto(new Mixto(ent, Numerador, Denominador));
    }

    public Mixto RestaMixto(int Numerador, int Denominador) {

        return RestaMixto(new Mixto(Numerador, Denominador));
    }

    public Mixto RestaMixto(int ent) {

        return RestaMixto(new Mixto(ent));
    }

    public Mixto RestaMixto() {

        return RestaMixto(1);
    }

    public Mixto MultiplicacionMixto(Mixto M) {
        int num1, num2, den;
        num1 = ((this.ent * this.Fr.getDenominador()) + this.Fr.getNumerador());
        num2 = (M.ent * M.Fr.getDenominador()) + M.Fr.getNumerador();
        den = this.Fr.getDenominador() * M.Fr.getDenominador();
        return new Mixto(num1 * num2, den);
    }

    public Mixto MultiplicacionMixto(int ent, FRACCION fr) {
        return MultiplicacionMixto(new Mixto(ent, fr));

    }

    public Mixto MultiplicacionMixto(FRACCION fr) {
        return MultiplicacionMixto(new Mixto(fr));

    }

    public Mixto MultiplicacionMixto(int ent, int Numerador, int Denominador) {

        return MultiplicacionMixto(new Mixto(ent, Numerador, Denominador));
    }

    public Mixto MultiplicacionMixto(int Numerador, int Denominador) {

        return MultiplicacionMixto(new Mixto(Numerador, Denominador));
    }

    public Mixto MultiplicacionMixto(int ent) {

        return MultiplicacionMixto(new Mixto(ent));
    }

    public Mixto MultiplicacionMixto() {

        return MultiplicacionMixto(1);
    }

    public Mixto DivicionMixto(Mixto M) {
        int num1, num2, den;
        num1 = ((this.ent * this.Fr.getDenominador()) + this.Fr.getNumerador());
        num2 = (M.ent * M.Fr.getDenominador()) + M.Fr.getNumerador();
        den = this.Fr.getDenominador() * num2;
        return new Mixto(num1 * M.Fr.getDenominador(), den);
    }

    public Mixto DivicionMixto(int ent, FRACCION fr) {
        return DivicionMixto(new Mixto(ent, fr));

    }

    public Mixto DivicionMixto(FRACCION fr) {
        return DivicionMixto(new Mixto(fr));

    }

    public Mixto DivicionMixto(int ent, int Numerador, int Denominador) {

        return DivicionMixto(new Mixto(ent, Numerador, Denominador));
    }

    public Mixto DivicionMixto(int Numerador, int Denominador) {

        return DivicionMixto(new Mixto(Numerador, Denominador));
    }

    public Mixto DivicionMixto(int ent) {

        return DivicionMixto(new Mixto(ent));
    }

    public Mixto DivicionMixto() {

        return DivicionMixto(1);
    }

    public void Incrementar(int num) {
        this.ent += num;
    }

    public void Incrementar(FRACCION fr) {
        this.Fr.Suma(fr);
    }

    public void Incrementar(Mixto M) {
        this.ent += M.ent;
        this.Fr.Suma(M.Fr);
    }

    public void Incrementar(int ent, int Numerador, int Denominador) {
        Incrementar(new Mixto(ent, Numerador, Denominador));
    }

    public void Incrementar(int Numerador, int Denominador) {
        Incrementar(new Mixto(Numerador, Denominador));
    }

    public void Incrementar() {
        Incrementar(1);
    }

    public void Decrementar(int num) {
        this.ent -= num;
    }

    public void Decrementar(FRACCION fr) {
        this.Fr.Resta(fr);
    }

    public void Decrementar(Mixto M) {
        this.ent -= M.ent;
        this.Fr.Resta(M.Fr);
    }

    public void Decrementar(int ent, int Numerador, int Denominador) {
        Decrementar(new Mixto(ent, Numerador, Denominador));
    }

    public void Decrementar(int Numerador, int Denominador) {
        Decrementar(new Mixto(Numerador, Denominador));
    }

    public void Decrementar() {
        Decrementar(1);
    }

    public void Aumentar(int num) {

        this.Fr.setNumerador(((this.ent * this.Fr.getDenominador()) + this.Fr.getNumerador()));
        this.Fr.setNumerador(this.Fr.getNumerador() * num);
        this.ent = 0;
        TransformarMixto();
    }

    public void Aumentar(FRACCION fr) {

        this.Fr.setNumerador(((this.ent * this.Fr.getDenominador()) + this.Fr.getNumerador()));
        this.Fr.setNumerador(this.Fr.getNumerador() * fr.getNumerador());
        this.ent = 0;
        this.Fr.setDenominador(this.Fr.getDenominador() * fr.getDenominador());
        TransformarMixto();
    }

    public void Aumentar(Mixto M) {
        int num;
        this.Fr.setNumerador(((this.ent * this.Fr.getDenominador()) + this.Fr.getNumerador()));
        this.ent = 0;
        num = (M.ent * M.Fr.getDenominador()) + M.Fr.getNumerador();
        this.Fr.setNumerador(this.Fr.getNumerador() * num);
        this.Fr.setDenominador(this.Fr.getDenominador() * M.Fr.getDenominador());
        TransformarMixto();
    }

    public void Aumentar(int ent, int Numerador, int Denominador) {
        Aumentar(new Mixto(ent, Numerador, Denominador));
    }

    public void Aumentar(int Numerador, int Denominador) {
        Aumentar(new Mixto(Numerador, Denominador));
    }

    public void Aumentar() {
        Aumentar(1);
    }

    public void Fraccionar(int num) {
        this.Fr.setNumerador(((this.ent * this.Fr.getDenominador()) + this.Fr.getNumerador()));
        this.Fr.setNumerador(this.Fr.getNumerador() * 1);
        this.ent = 0;
        this.Fr.setDenominador(this.Fr.getDenominador() * num);
        TransformarMixto();
    }

    public void Fraccionar(FRACCION fr) {
        this.Fr.setNumerador(((this.ent * this.Fr.getDenominador()) + this.Fr.getNumerador()));
        this.Fr.setNumerador(this.Fr.getNumerador() * fr.getDenominador());
        this.ent = 0;
        this.Fr.setDenominador(this.Fr.getDenominador() * fr.getNumerador());
        TransformarMixto();
    }

    public void Fraccionar(Mixto M) {
        int num;
        this.Fr.setNumerador(((this.ent * this.Fr.getDenominador()) + this.Fr.getNumerador()));
        this.ent = 0;
        num = (M.ent * M.Fr.getDenominador()) + M.Fr.getNumerador();
        this.Fr.setNumerador(this.Fr.getNumerador() * M.Fr.getDenominador());
        this.Fr.setDenominador(this.Fr.getDenominador() * num);
        TransformarMixto();
    }

    public void Fraccionar(int ent, int Numerador, int Denominador) {
        Fraccionar(new Mixto(ent, Numerador, Denominador));
    }

    public void Fraccionar(int Numerador, int Denominador) {
        Fraccionar(new Mixto(Numerador, Denominador));
    }

    public void Fraccionar() {
        Fraccionar(1);
    }

    private void TransformarMixto() {
        this.ent += this.Fr.getNumerador() / this.Fr.getDenominador();
        this.Fr.setNumerador(this.Fr.getNumerador() % this.Fr.getDenominador());
    }
//private Mixto TransformarMixto(int num, int den)
//{
//    int ent;
//    ent = 0;
//    ent += num / den;
//    num = num % den;
//    return new Mixto(ent, num, den);
//}
//private Mixto TransformarMixto(FRACCION fr)
//{
//    int ent;
//    ent = 0;
//    ent += fr.Numerador / fr.Denominador;
//    fr.Numerador = fr.Numerador % fr.Denominador;
//    return new Mixto(ent, fr.Numerador, fr.Denominador);
//}

    public String Imprimir() {
        return this.ent + "  " + this.Fr.Imprimir();
    }
}
