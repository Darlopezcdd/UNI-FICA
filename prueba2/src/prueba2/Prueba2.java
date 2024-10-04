package prueba2;

public class Prueba2 {

    public static int TamañoBuzz() {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 == 0) {
                contador++;
            }
        }

        return contador;
    }

    public static int TamañoFizz() {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int TamañoFizzbuzz() {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void LlenarFizz(int[] Fizz) {

        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                Fizz[contador] = i;
                contador++;
            }
        }

    }

    public static void LlenarBuzz(int[] Fizz) {

        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 == 0) {
                Fizz[contador] = i;
                contador++;
            }
        }

    }

    public static void LlenarFizzBuzz(int[] Fizz) {

        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                Fizz[contador] = i;
                contador++;
            }
        }

    }

    public static void Imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int[] FizzBuzz = new int[TamañoFizzbuzz()];
        int[] Buzz = new int[TamañoBuzz()];
        int[] Fizz = new int[TamañoFizz()];
        LlenarFizz(Fizz);
        LlenarBuzz(Buzz);
        LlenarFizzBuzz(FizzBuzz);
        Imprimir(Fizz);
        Imprimir(Buzz);
        Imprimir(FizzBuzz);

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                FizzBuzz[index] = i;
//            }
//
//        }
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 != 0 && i % 5 == 0) {
//                Buzz[index] = i;
//
//            }
//
//        }
    }

}
