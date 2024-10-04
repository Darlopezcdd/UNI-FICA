/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ascensor_poo;

/**
 *
 * @author lopez
 */
public class Cabina {

    private double tamañoX;
    private double tamañoY;
    private TipoPersona Persona1;

    public double getTamañoX() {
        return tamañoX;
    }

    public double getTamañoY() {
        return tamañoY;
    }

    public void setTamañoX(double tamañoX) {
        if (tamañoX > 0) {
            this.tamañoX = tamañoX;
        }
    }

    public void setTamañoY(double tamañoY) {
        if (tamañoY > 0) {
            this.tamañoY = tamañoY;
        }
    }

    public Cabina(double tamañoX, double tamañoY, double peso, double areaP) {
        if (tamañoX > 0) {
            this.tamañoX = tamañoX;
        } else {
            this.tamañoX = 1;
        }

        if (tamañoY > 0) {
            this.tamañoY = tamañoY;
        } else {
            this.tamañoY = 1;
        }

        this.Persona1 = new TipoPersona(peso, areaP);

    }

    public Cabina(double tamañoX, double tamañoY, TipoPersona Persona1) {
        this(tamañoX, tamañoY, Persona1.getPeso(), Persona1.getAreaPersonal());
    }

    public Cabina(double tamañoX, double tamañoY) {
        this(tamañoX, tamañoY, 0, 0);
    }

    public Cabina(double tamañoX, double tamañoY, double num) {
        this(tamañoX, tamañoY, num, 0);
    }

    public Cabina(double tamañoX, TipoPersona Persona1) {
        this(tamañoX, tamañoX, Persona1.getPeso(), Persona1.getAreaPersonal());
    }

    public Cabina(double tamañoX) {
        this(tamañoX, tamañoX, 0, 0);
    }

    public Cabina(TipoPersona Persona1) {

        this(1, 1, Persona1.getPeso(), Persona1.getAreaPersonal());
    }

    public Cabina() {
        this(1, 1, 0, 0);
    }

    public double Tamaño() {
        return this.tamañoX * this.tamañoY;
    }

    public int CpacidadDePresonas() {
        int maxPeso, maxArea;
        maxPeso = (int) (CpacidadDePeso() / this.Persona1.getPeso());
        maxArea = (int) (Tamaño() / this.Persona1.getAreaPersonal());

        return (int) ((maxPeso + maxArea) / 2);
    }

    public int CpacidadDePeso() {

        return (int) (Tamaño() / this.Persona1.getAreaPersonal()) * 70;
    }

    public String Imprimir() {
        return "Capacidad Maxima:" + this.CpacidadDePresonas() + "\n" + "Peso Maximo :"
                + this.CpacidadDePeso() + "\n" + "Tamaño: " + this.Tamaño() + "m^2";
    }

}
