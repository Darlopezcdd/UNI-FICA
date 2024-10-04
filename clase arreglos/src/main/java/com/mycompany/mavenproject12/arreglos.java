/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject12;

/**
 *
 * @author lopez
 */
import java.util.*;
public class arreglos {

    int[] datos;
Random Random;
    public arreglos(int tam) {
        this.datos = new int[tam];
    }

    public boolean setValor(int indice, int valor) {
        if ((indice >= 0) && (indice < datos.length)) {
            this.datos[indice] = valor;
            return true;
        }
        else
        {
            return false;
        }
    }
    public int Tamaño()
    {
        return this.datos.length;
    }
    public void RedimencionarArreglos(int tam)
    {
        int []datos;
        datos =new int[tam];
        for (int i=0;i<datos.length;i++)
        {
            if (i<this.datos.length)
            {
                datos[i]=this.datos[i];
                
            }else
            {
                i=datos.length;
            }
            
        }
            this.datos=datos;
    }

    public void Imprimir() {
        for (int i = 0; i < this.datos.length; i++) {
            System.out.println((i + 1) + ".-" + this.datos[i]);

        }
    }
}
