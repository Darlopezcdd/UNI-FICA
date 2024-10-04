/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ascensor_poo;

/**
 *
 * @author lopez
 */
public class TipoPersona {

    private double peso;
    private double areaPersonal;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
         if (peso < 0.7) {
            this.peso = 70;
        } else {
            this.peso = peso;
        }
    }

    public double getAreaPersonal() {
        return areaPersonal;
    }

    public void setAreaPersonal(double areaPersonal) {
        if (areaPersonal < 0.15) {
            this.areaPersonal = 0.5;
        } else {
            this.areaPersonal = areaPersonal;
        }
    }

    public TipoPersona(double peso, double areaPersonal) {
        if (peso < 0.7) {
            this.peso = 70;
        } else {
            this.peso = peso;
        }

        if (areaPersonal < 0.15) {
            this.areaPersonal = 0.5;
        } else {
            this.areaPersonal = areaPersonal;
        }
    }

    public TipoPersona(double Num) {
        this(Num, 0.5);
    }

    public TipoPersona() {
        this(70, 0.5);
    }
    public String Imprimir()
    {
        return "Peso:"+this.peso+"\n"+"Ancho:"
                +this.areaPersonal;
    }

}
