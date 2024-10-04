package prueba.pkg1;

public class Main {

    public static String Dado(int numero) {
        if (numero < 1 || numero > 6) {
            return "numero no valido";
        } else {
            if (numero == 1) {
                return "seis";
            } else if (numero == 2) {
                return "cinco";
            } else if (numero == 3) {
                return "cuatro";
            } else if (numero == 4) {
                return "tres";
            } else if (numero == 5) {
                return "dos";
            } else if (numero == 6) {
                return "uno";
            } else {
                return "numero no valido";
            }

        }
    }

    public static void Imprimirpares(int inicio, int finale) {
        int mayor, menor;
        mayor = finale;
        menor = inicio;
        if (inicio >= finale) {

            mayor = inicio;
            menor = finale;
        }
        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " , ");
            }
        }
        System.out.println("");
    }

    public static void ImprimirparesWhile(int inicio, int finale) {
        int mayor, menor;
        mayor = finale;
        menor = inicio;
        if (inicio >= finale) {

            mayor = inicio;
            menor = finale;
        }

        int i = menor;
        while (i <= mayor) {

            if (i % 2 == 0) {
                System.out.print(i + " , ");
            }
            i++;

        }
        System.out.println("");
    }

    public static void ImprimirparesDoWhile(int inicio, int finale) {
        int mayor, menor;
        mayor = finale;
        menor = inicio;
        if (inicio >= finale) {

            mayor = inicio;
            menor = finale;
        }

        int i = menor;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " , ");
            }
            i++;
        } while (i <= mayor);

        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println(Dado(1));
        Imprimirpares(100, 2);
        ImprimirparesWhile(100, 2);
        ImprimirparesDoWhile(100, 2);
    }

}
