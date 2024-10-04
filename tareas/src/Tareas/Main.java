package Tareas;

import java.util.*;

public class Main {

    public static String Tarea01(int nume) {
        String Respuesta = "";
        for (int i = nume; i >= 1; i--) {
            Respuesta += i + "\n";
        }
        return Respuesta;
    }

    public static String Tarea02(int inicio, int fina) {
        String Respuesta = "";
        if (inicio > fina) {
            int temp = inicio;
            inicio = fina;
            fina = temp;
        }

        for (int i = inicio; i <= fina; i++) {
            Respuesta += i + ",";
        }
        Respuesta += "\n";
        for (int i = fina; i >= inicio; i--) {
            Respuesta += i + ",";
        }

        return Respuesta;
    }

    public static int Factorial(int numero) {
        if (numero < 0) {
            return 0;
        } else if (numero == 0) {
            return 1;
        }
        int res = 1;
        for (int i = 2; i <= numero; i++) {
            res *= i;
        }
        return res;
    }

    public static double Potencia(double numero, int exponente) {
        double res = 1;

        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            return 1 / Potencia(numero, exponente * -1);
        } else {

            for (int i = 1; i <= exponente; i++) {
                res *= numero;
            }
            return res;
        }

    }

    public static String Tarea05(int inicio, int fina) {
        String respuesta = "";
        if (inicio > fina) {
            for (int i = inicio; i >= fina; i--) {
                respuesta += Potencia(i, 2) + ",";
            }
        } else {
            for (int i = inicio; i <= fina; i++) {
                respuesta += Potencia(i, 2) + ",";
            }
        }
        return respuesta;

    }

    public static String Tarea06(int inicio, int fina) {
        String respuesta = "";
        if (inicio > fina) {
            for (int i = inicio; i >= fina; i--) {
                if (i % 2 == 0) {
                    respuesta += i + ",";
                }
            }
        } else {
            for (int i = inicio; i <= fina; i++) {
                if (i % 2 == 0) {
                    respuesta += i + ",";
                }
            }
        }
        return respuesta;
    }

    public static String Tarea07(int limite) {
        String respuesta = "";
        int numerA = 0;
        int numerB = 1;
        int numerS = 1;

        respuesta += numerA + ",";
        respuesta += numerB;

        for (int i = 2; i < limite; i++) {
            numerS = numerA + numerB;
            numerA = numerB;
            numerB = numerS;

            respuesta += "," + numerS;

        }
        return respuesta;
    }

    public static boolean Tarea08(int numero) {
        if (numero == 0 || numero == 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String Tarea09(int inicio, int fina) {
        String respuesta = "";
        if (inicio > fina) {
            for (int i = inicio; i >= fina; i--) {
                if (Tarea08(i)) {
                    respuesta += "," + i;
                }
            }
        } else {
            for (int i = inicio; i <= fina; i++) {
                if (Tarea08(i)) {
                    respuesta += "," + i;
                }
            }
        }
        return respuesta;
    }

    //97-122
    //65-90
    public static String Tarea10() {
        String respuesta = "";
        int ascii = 'a';
        for (int i = 97; i <= 122; i++) {
            respuesta += (char) i;
        }
        respuesta += "\n";
        for (int i = 65; i <= 90; i++) {
            respuesta += (char) i;
        }

        return respuesta;
    }

    public static double Tarea11(double num) {
        return Potencia(num, 2);
    }

    public static double Tarea12(int num) {
        return Factorial(num);
    }

    public static void Tarea13() {
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        double num1, num2;
        do {
            System.out.println("buenas");
            System.out.println("que operacion desea realizar?:");
            System.out.println("(+)(-)(*)(/)(potencia)(factorial)(salir)");
            opcion = sc.next();

            if (opcion.equals("+")) {
                System.out.print("ingrese el primer numero:");
                num1 = sc.nextDouble();
                System.out.print("ingrese el Segundo numero:");
                num2 = sc.nextDouble();
                System.out.println(num1 + num2);

            } else if (opcion.equals("-")) {
                System.out.print("ingrese el primer numero:");
                num1 = sc.nextDouble();
                System.out.print("ingrese el Segundo numero:");
                num2 = sc.nextDouble();
                System.out.println(num1 - num2);

            } else if (opcion.equals("*")) {
                System.out.print("ingrese el primer numero:");
                num1 = sc.nextDouble();
                System.out.print("ingrese el Segundo numero:");
                num2 = sc.nextDouble();
                System.out.println(num1 * num2);

            } else if (opcion.equals("/")) {
                System.out.print("ingrese el primer numero:");
                num1 = sc.nextDouble();
                System.out.print("ingrese el Segundo numero:");
                num2 = sc.nextDouble();
                System.out.println(num1 / num2);

            } else if (opcion.equalsIgnoreCase("potencia")) {
                System.out.print("ingrese numero:");
                num1 = sc.nextDouble();
                System.out.print("ingrese el exponente:");
                num2 = sc.nextDouble();
                System.out.println(Potencia(num1, (int) num2));

            } else if (opcion.equalsIgnoreCase("factorial")) {
                System.out.print("ingrese el numero:");
                num1 = sc.nextDouble();
                System.out.println(Factorial((int) num1));

            } else if (opcion.equalsIgnoreCase("salir")) {
                break;

            } else {
                System.out.println("ingresa bien porfa");
            }

        } while (true);
    }

    public static void Tarea14(int inicio, int fin) {
        if (inicio > fin) {
            int temp = inicio;
            inicio = fin;
            fin = temp;
        }
        for (int i = inicio; i <= fin; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println("");

        }
    }

    public static double Tarea15(int x) {
        double resp = 0;
        for (int i = 0; i < 20; i++) {
            resp += (Potencia(x, i)) / (Factorial(i));
        }
        return resp;
    }

    public static void Tarea16(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void Tarea17(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = i; j < tamaño; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void Tarea18(int tamaño) {
        int cont = 0;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(cont + "\t");
            }
            System.out.println("");
            cont++;
        }
    }

    public static void Tarea19(int tamaño) {
        int cont = 1;
        for (int i = 0; i < tamaño; i++) {
            cont = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(cont + "\t");
                cont++;
            }
            System.out.println("");

        }
    }

    public static void Tarea20(int tamaño) {
        String[][] arr = new String[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                arr[i][j] = " ";
            }

        }
        for (int i = 0; i < tamaño; i++) {
            for (int j = tamaño - 1; j >= i; j--) {
                arr[i][j] = "@";
            }

        }

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void Tarea21(int tamaño) {
        Object[][] arr = new Object[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                arr[i][j] = " ";
            }

        }
        for (int i = 0; i < tamaño; i++) {
            for (int j = i; j < tamaño - i; j++) {
                arr[i][j] = "@";
            }

        }

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static String Tarea22(int numero) {

        if (numero == 0 || numero > 999) {
            return "fin";
        } else {
            int contador = 0;
            while (numero > 0) {

                numero /= 10;

                contador++;

            }
            return contador + "";
        }

    }

    public static String Tarea23(int numero) {
        Scanner sc = new Scanner(System.in);
        int contadorMayores = 0;
        int contadorMenores = 0;
        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese la nota de alumno nro " + (i + 1) + ":");
            int nota = sc.nextInt();
            if (nota >= 7) {
                contadorMayores++;
            } else {
                contadorMenores++;
            }
        }
        return "Cuantos mayores a 7:    " + contadorMayores + "\n"
                + "Cuantos menores a 7:    " + contadorMenores;
    }

    public static String Tarea24(int numero) {

        Scanner sc = new Scanner(System.in);
        int Promedio = 0;
        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese las edadesde la persona nro " + (i + 1) + ":");
            Promedio += sc.nextInt();
            if (Promedio / numero > 25) {
                break;
            }
        }

        return "fin";
    }

    public static void Imprimir(int[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static int[][] LlenarCaracol(int fila, int columna) {
        boolean der, izq, bajo, arriba;
        int[][] caracol = new int[fila][columna];

        int i = 0, j = 0, cont = 1;
        der = true;
        izq = false;
        bajo = false;
        arriba = false;

        while (cont <= fila * columna) {

            caracol[i][j] = cont;
            if (der) {
                j++;
                if (j >= caracol.length || caracol[i][j] != 0) {
                    j--;
                    i++;
                    bajo = true;
                    der = false;
                }
            } else if (bajo) {
                i++;
                if (i >= caracol.length || caracol[i][j] != 0) {
                    j--;
                    i--;
                    bajo = false;
                    izq = true;
                }
            } else if (izq) {
                j--;
                if (j < 0 || caracol[i][j] != 0) {
                    j++;
                    i--;
                    arriba = true;
                    izq = false;
                }
            } else if (arriba) {
                i--;
                if (i < 0 || caracol[i][j] != 0) {
                    j++;
                    i++;
                    arriba = false;
                    der = true;
                }

            }
            cont++;
        }
        return caracol;

    }

    public static int[][] Diagonal(int fila, int columna) {
        int[][] matriz = new int[fila][columna];
        int limite = matriz.length;
        int cont = 1;

        for (int fil = 0; fil < limite; fil++) {
            int i = fil;
            if (fil % 2 == 0) {

                for (int j = 0; i >= 0; i--) {
                    matriz[i][j++] = cont++;
                }
            } else if (fil % 2 != 0) {

                for (int j = 0; i >= 0; i--) {
                    matriz[j++][i] = cont++;
                }
            }
        }

        for (int col = 1; col < limite; col++) {
            int i = limite - 1;
            if (col % 2 != 0) {

                for (int j = col; j < limite; j++) {
                    matriz[i--][j] = cont++;
                }
            } else if (col % 2 == 0) {

                for (int j = col; j < limite; j++) {
                    matriz[j][i--] = cont++;
                }
            }
        }

        return matriz;
    }

    public static double Radianes(double x) {
        return (x * Math.PI) / 180;
    }

    public static double Seno(double x) {
        double resp = 0;
        x = Radianes(x);
        for (int i = 0; i < 10; i++) {
            resp += (Potencia(-1, i) * (Potencia(x, (2 * i) + 1)) / (Factorial((2 * i) + 1)));
        }
        return resp;
    }

    public static double Coseno(double x) {
        double resp = 0;
        x = Radianes(x);
        for (int i = 0; i < 10; i++) {
            resp += (Potencia(-1, i) * (Potencia(x, (2 * i))) / (Factorial((2 * i))));
        }
        return resp;
    }

    public static void rombo(int tamaño) {
        Object[][] rombo = new Object[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                rombo[i][j] = ".";
            }

        }

        for (int i = 1; i < tamaño; i++) {
            for (int j = i; j < tamaño - i; j++) {
                rombo[i + tamaño / 2 - 1][j] = "1";
                rombo[(tamaño / 2 - i + 1)][j] = "1";
            }

        }

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(rombo[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

//        System.out.println(Tarea01(10));
//        System.out.println(Tarea02(1, 10));
//        System.out.println(Factorial(5));
//        System.out.println(Potencia(5, -2));
//        System.out.println(Tarea05(10, 5));
//        System.out.println(Tarea06(5, 10));
//        System.out.println(Tarea07(8));
//        System.out.println(Tarea08(0));
//        System.out.println(Tarea09(10, 0));
//        System.out.println(Tarea10());
//        Imprimir(LlenarCaracol(5, 5));
//        Imprimir(Diagonal(5, 5));
//        System.out.println(Tarea15(1));
//        System.out.println(Seno(90));
//        System.out.println(Coseno(0));
//        rombo(9);
//        Tarea13();
//        Tarea14(3, 7);
//        Tarea16(7);
//        Tarea17(7);
//        Tarea18(7);
//        Tarea19(7);
//        Tarea20(7);
//        Tarea21(9);
//        System.out.println(Tarea22(444));
//        System.out.println(Tarea23(5));
        System.out.println(Tarea24(5));
    }

}
