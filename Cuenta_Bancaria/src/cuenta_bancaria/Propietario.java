/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta_bancaria;

/**
 *
 * @author lopez
 */
public class Propietario {

    private String Nombre;
    private FECHA fechaDeNacimineto;

    public String getNombre() {
        return this.Nombre;
    }

    public FECHA getFechaDeNacimineto() {
        return this.fechaDeNacimineto;
    }

    public int getDia() {
        return fechaDeNacimineto.getDia();
    }

    public int getMes() {
        return fechaDeNacimineto.getMes();
    }

    public int getAño() {
        return fechaDeNacimineto.getAño();
    }

    public void setDia(int dia) {
        fechaDeNacimineto.setDia(dia);
    }

    public void setMes(int mes) {
        fechaDeNacimineto.setMes(mes);
    }

    public void setAño(int año) {
        fechaDeNacimineto.setAño(año);
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Propietario(String Nombre, int dia, int mes, int año) {
        this.Nombre = Nombre;
        this.fechaDeNacimineto = new FECHA(dia, mes, año);
    }

    public Propietario(String Nombre, int dia, int mes) {
        this(Nombre, dia, mes, 0);
    }

    public Propietario(String Nombre, int dia) {
        this(Nombre, dia, 0, 0);
    }

    public Propietario(String Nombre) {
        this(Nombre, 0, 0, 0);
    }

    public Propietario(String Nombre, FECHA fecha) {
        this(Nombre, fecha.getDia(), fecha.getMes(), fecha.getAño());
    }

    public Propietario() {
        this("Anonimo", 0, 0, 0);
    }

    public Propietario(FECHA fecha) {
        this("Anonimo", fecha.getDia(), fecha.getMes(), fecha.getAño());
    }

    public Propietario(int dia, int mes, int año) {
        this("Anonimo", dia, mes, año);
    }

    public String Imprimir() {
        return this.Nombre + " --- " + this.fechaDeNacimineto.Imprimir();
    }

}
