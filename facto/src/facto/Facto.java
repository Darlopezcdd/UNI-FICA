/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facto;

/**
 *
 * @author lopez
 */
public class Facto {

    public static int Factorial1(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * Factorial1(num - 1);

    }

    public static int Factorial2(int num) {
        if (num <= 1) {
            return 1;
        }
        int nume = num;
        for (int i = 2; i < num; i++) {
            nume *= i;
        }
        return nume;
    }

    public static void llenarAlea(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
    }

    public static int[] Fctoriales(int[] arr) {
        int[] Fctoriales = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Fctoriales[i] = Factorial2(arr[i]);
        }
        return Fctoriales;
    }

    public static void Imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }

    public static boolean Pirmos(int nume) {
        if (nume <= 1) {
            return false;
        }
        for (int i = 2; i < nume; i++) {
            if (nume % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int SiguintePrimo(int numero) {
        do {
            numero++;
        } while (!Pirmos(numero));

        return numero;
    }

    public static void LlenarPriA(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int numeroA = (int) (Math.random() * 10) + 1;
            if (Pirmos(numeroA)) {
                arr[i] = numeroA;
            } else {
                i--;
            }

        }
    }

    public static void LlenarPri(int arr[]) {
        int index = 2;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = SiguintePrimo(index);

            index = SiguintePrimo(index);
        }
    }

    public static void main(String[] args) {
//        System.out.println(Factorial1(0));
//        System.out.println(Factorial2(0));
        int[] arr = new int[10];
//        llenarAlea(arr);
//        Imprimir(arr);
        LlenarPri(arr);
        Imprimir(arr);
        System.out.println(SiguintePrimo(13));

    }

}
