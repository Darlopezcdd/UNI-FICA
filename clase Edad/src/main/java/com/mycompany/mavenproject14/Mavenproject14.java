/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject14;

/**
 *
 * @author lopez
 */
import java.util.*;

public class Mavenproject14 {

    public static void main(String[] args) {
        FECHA[] fechas = new FECHA[10];
        Random rnd = new Random();
        ArbolBinario arbol = new ArbolBinario();

        for (int i = 0; i < fechas.length; i++) {
            fechas[i] = new FECHA(rnd.nextInt(30), rnd.nextInt(12), rnd.nextInt(2000));
            arbol.Insertar(fechas[i]);
        }

        arbol.Imprimir();

    }

}

class ArbolBinario {

    public Nodo Raiz;

    public ArbolBinario() {
        Raiz = null;
    }

    public void Insertar(Object valor) {
        Raiz = InsertarRecursivo(Raiz, valor);
    }

    private Nodo InsertarRecursivo(Nodo raiz, Object valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        int comparar = ((FECHA) valor).Comparar(((FECHA) raiz.valores));
        System.out.println(((FECHA) valor).Comparar(((FECHA) raiz.valores)));
        if (comparar <= 0) {
            raiz.izquierodo = InsertarRecursivo(raiz.izquierodo, valor);
        } else {
            raiz.derecha = InsertarRecursivo(raiz.derecha, valor);
        }

        return raiz;
    }

    public Boolean Buscar(Object valor) {
        return BuscarRecursivo(Raiz, valor);
    }

    private Boolean BuscarRecursivo(Nodo raiz, Object valor) {
        if (raiz == null) {
            return false;
        }
        int comparar = ((FECHA) valor).Comparar(((FECHA) raiz.valores));
        if (comparar <= 0) {
            return true;
        }

        if (((FECHA) valor).Comparar(((FECHA) raiz.valores)) == -1) {
            return BuscarRecursivo(raiz.izquierodo, valor);
        } else {
            return BuscarRecursivo(raiz.derecha, valor);
        }
    }

    public void imprimirrecuscivo(Nodo valor) {
        if (valor != null) {
            imprimirrecuscivo(valor.izquierodo);
            System.out.println(((FECHA) valor.valores).Imprimir() + "");

            imprimirrecuscivo(valor.derecha);

        }
    }

    public void Imprimir() {

        imprimirrecuscivo(Raiz);

    }

}

class Nodo {

    public Object valores;
    public Nodo izquierodo;
    public Nodo derecha;

    public Nodo(Object valores) {
        this.valores = valores;
        izquierodo = null;
        derecha = null;

    }

}
