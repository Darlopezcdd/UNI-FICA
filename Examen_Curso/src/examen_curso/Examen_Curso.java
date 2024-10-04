package examen_curso;

import java.util.*;

public class Examen_Curso {

    public static void main(String[] args) {
        Matriz matriz = new Matriz(8, 4);
        matriz.LlenarAleatorio(10, 20);
        System.out.println(matriz.toString());

        System.out.println("Filas:" + "\n" + matriz.SumatoriaFilas());
        System.out.println("Columnas:" + "\n" + matriz.SumatoriaColumnas());

        System.out.println("Vector");
        Vector3D vector = new Vector3D(3, 4, 5);
        System.out.println(vector.toString());
        System.out.println(vector.Modulo());
        System.out.println(vector.Unitario());
    }

}

class Matriz {

    int[][] Arreglo;

    public Matriz(int[][] Arreglo) {
        this.Arreglo = Arreglo;
    }

    public Matriz(int fila, int columna) {
        this.Arreglo = new int[fila][columna];
    }

    public Matriz(int tamaño) {
        this.Arreglo = new int[tamaño][tamaño];
    }

    public void LlenarAleatorio(int inicio, int fin) {
        if (inicio > fin) {
            int temp = inicio;
            inicio = fin;
            fin = temp;
        }

        for (int i = 0; i < Arreglo.length; i++) {
            for (int j = 0; j < Arreglo[i].length; j++) {
                int numero = inicio + ((int) (Math.random() * (fin - inicio)));

                Arreglo[i][j] = numero;

            }
        }
    }

    @Override
    public String toString() {
        String respuesta = "";
        for (int i = 0; i < Arreglo.length; i++) {
            for (int j = 0; j < Arreglo[i].length; j++) {
                respuesta += Arreglo[i][j] + "\t";
            }
            respuesta += "\n";
        }

        return respuesta;
    }

    public Vector SumatoriaFilas() {
        double[] vector = new double[Arreglo.length];
        int suma = 0;

        for (int i = 0; i < Arreglo.length; i++) {
            suma = 0;
            for (int j = 0; j < Arreglo[i].length; j++) {
                suma += Arreglo[i][j];
            }
            vector[i] = suma;
        }
        return new Vector(vector);
    }

    public Vector SumatoriaColumnas() {
        double[] vector = new double[Arreglo[0].length];
        int suma = 0;

        for (int i = 0; i < Arreglo[0].length; i++) {
            suma = 0;
            for (int j = 0; j < Arreglo.length; j++) {
                suma += Arreglo[j][i];
            }
            vector[i] = suma;
        }
        return new Vector(vector);
    }

}

class Vector {

    double[] vector;

    public Vector(double[] vector) {
        this.vector = vector;
    }

    public Vector(int tamaño) {
        this.vector = new double[tamaño];
    }

    @Override
    public String toString() {
        String respuesta = "";
        for (int i = 0; i < vector.length; i++) {
            respuesta += vector[i] + "\t";
        }
        respuesta += "\n";
        return respuesta;
    }

}

class Vector3D {

    int x;
    int y;
    int z;

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public double Modulo() {
        return Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)) + (Math.pow(z, 2)));
    }

    public Vector Unitario() {
        double[] vector = {(x / Modulo()), (y / Modulo()), (z / Modulo())};
        return new Vector(vector);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }

}
