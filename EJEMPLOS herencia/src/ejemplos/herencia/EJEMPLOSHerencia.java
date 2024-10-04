/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos.herencia;

/**
 *
 * @author lopez
 */
public class EJEMPLOSHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona a = new Profesor(75, "juan", "10045");
        System.out.println(a.Imprimir());
         a = new Alumno(75, "pedro", "15333");
        System.out.println(a.Imprimir());
    }

}

abstract class Persona implements rasgos{

    public int edad;

    public String Nombre;
    public String numCadula;

    public String Dormir() {

        return "zzz";

    }
     public String Ira() {

        return "baja";

    }


    public abstract String Imprimir();
}

class Alumno extends Persona implements rasgos{

     public Alumno(int edad, String nombre, String Cesdu) {
        this.Nombre = nombre;
        this.edad = edad;
        this.numCadula = Cesdu;
    }
    @Override
    public String Dormir() {
        return "ronca";
    }

    @Override
    public String Imprimir() {
        return this.Nombre + "-" + this.edad;
    }
}

class Profesor extends Persona {

    public Profesor(int edad, String nombre, String Cesdu) {
        this.Nombre = nombre;
        this.edad = edad;
        this.numCadula = Cesdu;
    }

    @Override
    public String Dormir() {
        return "de lado";
    }

    @Override
    public String Imprimir() {
        return this.Nombre + "-" + this.edad;
    }

}



interface rasgos
{
    String Ira();
}
