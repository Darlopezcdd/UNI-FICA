/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

/**
 *
 * @author lopez
 */
import java.util.*;

public class COLA {

    private Object[] datos;
    private int size;
    private int front;
    private int rear;
    private boolean error;

    public COLA(int tam) {
        datos = new Object[tam];
        size = tam;
        front = -1;
        rear = -1;
        error = false;
    }

    public void Enqueue(Object valor) {
        if (rear == size - 1) {
            error = true;
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            datos[rear] = valor;
        }
    }

    public String Dequeue() {
        if (front == -1 || front > rear) {
            return "La cola está vacía.";
        } else {
            String value = Tipode(datos[front]);
            front++;
            if (front > rear) {

                front = -1;
                rear = -1;

            }
            return value;
        }
    }

    public String Peek() {
        if (front == -1 || front > rear) {
            return "La cola está vacía.";
        } else {
            return Tipode(datos[front]);
        }
    }

    public int Size() {
        return this.datos.length;
    }

    public boolean Empty() {
        if (front == -1 || front > rear) {
            return true;
        } else {
            return false;
        }

    }

    public int Count() {
        if (Empty()) {
            return 0;
        } else {
            return rear - front + 1;
        }
    }

    public String Imprimir() {
        String a = "";
        if (front != -1) {
            for (int i = front; i <= rear; i++) {
                if (datos[i] != null) {
                    a += Tipode(datos[i]) + "\r\n";
                }
            }
        }
        return a;
    }

    public String Tipode(Object datos) {
        if (datos instanceof CIRCULO) {
            return datos + "\r\n" + ((CIRCULO) datos).Imprimir();
        } else if (datos instanceof CUADRADO) {
            return datos + "\r\n" + ((CUADRADO) datos).Imprimir();
        } else if (datos instanceof Cuenta) {
            return datos + "\r\n" + ((Cuenta) datos).Imprimir();
        } else if (datos instanceof Edad) {
            return datos + "\r\n" + ((Edad) datos).Imprimir();
        } else if (datos instanceof ELIPSE) {
            return datos + "\r\n" + ((ELIPSE) datos).Imprimir();
        } else if (datos instanceof FECHA) {
            return datos + "\r\n" + ((FECHA) datos).Imprimir();
        } else if (datos instanceof FRACCION) {
            return datos + "\r\n" + ((FRACCION) datos).Imprimir();
        } else if (datos instanceof Mixto) {
            return datos + "\r\n" + ((Mixto) datos).Imprimir();
        } else if (datos instanceof Propietario) {
            return datos + "\r\n" + ((Propietario) datos).Imprimir();
        } else if (datos instanceof PUNTO) {
            return datos + "\r\n" + ((PUNTO) datos).Imprimir();
        } else if (datos instanceof RECTA) {
            return datos + "\r\n" + ((RECTA) datos).Imprimir();
        } else if (datos instanceof RECTANGULO) {
            return datos + "\r\n" + ((RECTANGULO) datos).Imprimir();
        } else if (datos instanceof TRIANGULO) {
            return datos + "\r\n" + ((TRIANGULO) datos).Imprimir();
        } else if (datos instanceof COLA) {
            return datos + "\r\n" + ((COLA) datos).Imprimir();
        } else {
            return "" + datos;
        }
    }

}
