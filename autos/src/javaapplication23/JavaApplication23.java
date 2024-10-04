/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author lopez
 */
public class JavaApplication23 {

    public static void main(String[] args) {
        autos auto= new autos();
    }
   
}
class autos{
    String color;
    int Precio;
    String marca;

    public autos(String color, int Precio, String marca) {
        this.color = color;
        this.Precio = Precio;
        this.marca = marca;
    }

    public autos() {
        this.color = "amarrillo";
        this.Precio = 200000;
        this.marca = "benz";
    }
    
    
}