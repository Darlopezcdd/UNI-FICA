package prueba;

import java.util.*;

public class Prueba {

    public static void Intercambio(String idioma, String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(idioma)) {
                String temp = arr[i];
                arr[i] = arr[0];
                arr[0] = idioma;
            }

        }
        if (error(arr, idioma)) {
            System.out.println("el idioma no esta");
        }

    }

    public static boolean error(String[] arr, String idioma) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(idioma)) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public static void Imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }

    public static void llenarAleatorios(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
    }

    public static double ObtenerMayor(int[] arr) {
        int mayor = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mayor) {
                mayor = arr[i];
            }
        }
        return mayor;
    }

    public static double ObtenerMenor(int[] arr) {
        int menor = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
            }
        }
        return menor;
    }

    public static int[] Inverso(int[] arr) {
        int[] inverso = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            inverso[i] = arr[arr.length - 1 - i];
        }
        return inverso;
    }

//    public static void cepeda() {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];
//        for (int i = 1; i < arr.length; i++) {
//            do {
//                System.out.println("a:");
//                int numer = sc.nextInt();
//                if (numer != arr[i-1]) {
//                    arr[i]=numer;
//                    break;
//                }
//            } while (true);
//        }
//        Imprimir(arr);
//    }

    public static void main(String[] args) {

//        String[] idiomas={"pt","en","fr","de","it","es"};
//        Imprimir(idiomas);
//        Intercambio("es", idiomas);
//        Imprimir(idiomas);
//------------recuperacion---------------
//        int n = 5;
//        int[] arr = new int[n];
//        Imprimir(arr);
//        llenarAleatorios(arr);
//        Imprimir(arr);
//        System.out.println(ObtenerMenor(arr));
//        System.out.println(ObtenerMayor(arr));
//        Imprimir(Inverso(arr));
//cepeda();

    }

}
