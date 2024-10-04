/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.herenciapolimorfismo;

/**
 *
 * @author lopez
 */
class Animal {

    void Hacersonido() {
        System.out.println("Algún sonido");
    }
}

class Perro extends Animal {

    void Hacersonido() {
        System.out.println("Ladrido");
    }
}

class Gato extends Animal {

    void Hacersonido() {
        System.out.println("Miaw");
    }
}

public class HerenciaPolimorfismo {

    public static void main(String[] args) {
        Animal animal;

        animal = new Perro();
        animal.Hacersonido();

        animal = new Gato();
        animal.Hacersonido();

    }

}

class PrivateClass {

    private int privateField;

    private void privateMethod() {
        System.out.println("Private method");
    }
}

class PublicClass {

    public int publicField;

    public void publicMethod() {
        System.out.println("Public method");
    }
}
class ProtectedClass {
    protected int protectedField;

    protected void protectedMethod() {
        System.out.println("Protected method");
    }
}
class PackagePrivateClass {
    int defaultField;

    void defaultMethod() {
        System.out.println("Default method");
    }
}