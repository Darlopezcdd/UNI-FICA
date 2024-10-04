package clase.nose;

public class ClaseNose {

    public static void FiBonacci(int numero) {
        int numerA = 0;
        int numerB = 1;
        int numerS;

        System.out.println(numerA);
        System.out.println(numerB);

        for (int i = 2; i < numero; i++) {
            numerS = numerA + numerB;
            numerA = numerB;
            numerB = numerS;
            System.out.println(numerS);

        }
    }

    public static String Cuadrado(int a, int b) {
        String[][] as = new String[a][b];
        String respuesta = "";
        for (int i = 0; i < as.length; i++) {
            for (int j = 0; j < as[i].length; j++) {
                as[i][j] = "@";
                respuesta += as[i][j];
            }
            respuesta += "\n";
        }
        return respuesta;
    }

    public static String TrianguloInvertido(int a, int b) {
        String[][] as = new String[a][b];
        String respuesta = "";
        for (int i = 0; i < as.length; i++) {
            for (int j = 0; j < as[i].length - i; j++) {
                as[i][j] = "@";
                respuesta += as[i][j];
            }
            respuesta += "\n";
        }
        return respuesta;
    }

    public static String TrianguloInvertidoWhile(int a, int b) {
        String[][] as = new String[a][b];
        String respuesta = "";
        int i = 0;

        while (i < as.length) {
            int j = 0;
            while (j < as[i].length - i) {
                as[i][j] = "@";
                respuesta += as[i][j];
                j++;
            }
            respuesta += "\n";

            i++;
        }
        return respuesta;
    }

    public static String CuadradoConta(int a, int b) {
        int[][] as = new int[a][b];
        String respuesta = "";
        int contador = 0;
        for (int i = 0; i < as.length; i++) {
            for (int j = 0; j < as[i].length; j++) {
                as[i][j] = contador;
                respuesta += as[i][j] + "\t";
                contador++;
            }
            respuesta += "\n";
        }
        return respuesta;
    }

    public static String TrianguloInvertidoConta(int a, int b) {
        int[][] as = new int[a][b];
        String respuesta = "";
        int contador = 0;
        for (int i = 0; i < as.length; i++) {
            for (int j = 0; j < as[i].length - i; j++) {
                as[i][j] = contador;
                respuesta += as[i][j] + "\t";
                contador++;
            }
            respuesta += "\n";
        }
        return respuesta;
    }

    public static String CuadradoEjer(int a, int b) {
        int[][] as = new int[a][b];
        String respuesta = "";

        for (int i = 0; i < as.length; i++) {
            int contador = 1;
            for (int j = 0; j < as[i].length; j++) {
                as[i][j] = contador;
                respuesta += as[i][j] + "\t";
                contador++;
            }
            respuesta += "\n";

        }
        return respuesta;
    }

    public static String Caja(int filas, int columnas) {
        String[][] cuadrado = new String[filas][columnas];
        String respuesta = "";

        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                if (i == 0 || i == cuadrado.length - 1 || j == 0 || j == cuadrado.length - 1) {
                    cuadrado[i][j] = "@";
                    respuesta += cuadrado[i][j];
                } else {
                    respuesta += " ";
                }
            }
            respuesta += "\n";
        }

        return respuesta;
    }

    public static String CajaContador(int filas, int columnas) {
        int[][] cuadrado = new int[filas][columnas];
        String respuesta = "";

        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                if (i == 0 || i == cuadrado.length - 1 || j == 0 || j == cuadrado.length - 1) {
                    cuadrado[i][j] = i + j;
                    respuesta += cuadrado[i][j] + "\t";
                } else {
                    respuesta += "\t";
                }
            }
            respuesta += "\n";
        }

        return respuesta;
    }

    public static String TrianguloInvertidoWhileConta(int a, int b) {
        int[][] as = new int[a][b];
        String respuesta = "";
        int i = 0;
        int contador = 0;
        while (i < as.length) {
            int j = 0;
            while (j < as[i].length - i) {
                as[i][j] = contador;
                respuesta += as[i][j] + "\t";
                contador++;
                j++;
            }
            respuesta += "\n";

            i++;
        }
        return respuesta;
    }

    public static boolean Comprobar7(int numero) {

        if (numero % 7 == 0) {
            return true;
        } else {

            for (; numero > 0;) {
                if (numero % 10 == 7) {
                    return true;
                } else {
                    numero /= 10;

                }

            }
            return false;
        }

    }

    public static void ImprimirPum(int rango) {
        for (int i = 1; i <= rango; i++) {
            if (Comprobar7(i)) {
                System.out.println("Pun pun");
            } else {
                System.out.println(i);
            }

        }
    }

    public static boolean nroTarjetavalido(String numero) {
        String numfinal = "";
        for (int i = 0; i < numero.length(); i++) {
            if (i % 2 != 0) {
                
                numfinal += LogicadeLuhn(numero.charAt(i));            
            } else {
                numfinal += numero.charAt(i);
            }
        }
        return esmultiplo10(numfinal);
        
    }

    public static char LogicadeLuhn(char numero) {
        int num = numero - '0';
       
        num *= 2;
        String auxiliar = num +"";
        char value = auxiliar.charAt(0);
        if (num > 9) {
            value = Unirnumeros(num);
        }
        return value;
    }
    public static boolean esmultiplo10 (String numero){
        char aux;
        int valorF=0;
        for (int i = 0; i < numero.length(); i++) {
            valorF += Character.getNumericValue(numero.charAt(i));
        }
        return valorF % 10 ==0;
    }
    public static char Unirnumeros(int num) {
        int aux = 0;
        String numeroEnString = num + "";
        for (int i = 0; i < numeroEnString.length(); i++) {
            aux += Character.getNumericValue(numeroEnString.charAt(i));

        }
        numeroEnString = aux + "";
        return numeroEnString.charAt(0);
    }

    public static void main(String[] args) {
        FiBonacci(13);
        System.out.println("");
        System.out.println(Cuadrado(3, 5));
        System.out.println("");
        System.out.println(TrianguloInvertido(3, 3));
        System.out.println("");
        System.out.println(TrianguloInvertidoWhile(3, 3));
        System.out.println("");
        System.out.println(CuadradoConta(3, 5));
        System.out.println("");
        System.out.println(TrianguloInvertidoConta(3, 3));
        System.out.println("");
        System.out.println(TrianguloInvertidoWhileConta(3, 3));
        System.out.println("");
        System.out.println(CuadradoEjer(3, 3));
        System.out.println("");
        System.out.println(Caja(5, 5));
        System.out.println("");
        System.out.println("");
        System.out.println(CajaContador(5, 5));
        System.out.println("");
        System.out.println(Comprobar7(14));
        System.out.println("");
        ImprimirPum(10000);
        System.out.println(LogicadeLuhn('4'));
        System.out.println(nroTarjetavalido("4266841713454328"));
    }

}
