
import java.util.*;

public class Main {

    public static String mayor(int[] numeros) {
        int numeroMayor, numeroMenor;
        numeroMayor = numeros[0];
        numeroMenor = numeros[numeros.length - 1];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }

        }
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }

        }

        return "el numero Mayor es:" + numeroMayor
                + "el numero Menor es:" + numeroMenor;
    }

    public static void ordenar(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;

                }
            }
        }

    }

    public static void imprimir(int[] numeros) {

        for (int j = 0; j < numeros.length; j++) {
            System.out.println(numeros[j]);
        }

    }

    public static void rellenar(int[] numeros) {
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = rnd.nextInt(100);

        }

    }

    public static double promedio(double[] notas) {
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        suma = suma / notas.length;

        return suma;
    }

    public static boolean estaAprobado(double[] notas) {
        return promedio(notas) > 7;
    }

    public static String puntuacion(double[] notas) {
        if (promedio(notas) > 100) {
            return "numero no valio";
        } else if (promedio(notas) >= 90) {
            return "A";
        } else if (promedio(notas) >= 80 && promedio(notas) <= 89) {
            return "B";
        } else if (promedio(notas) >= 70 && promedio(notas) <= 79) {
            return "C";
        } else if (promedio(notas) >= 60 && promedio(notas) <= 69) {
            return "D";
        } else if (promedio(notas) >= 0 && promedio(notas) <= 59) {
            return "E";
        } else {
            return "numero no valio";
        }
    }

    public static double formula(double masa1, double masa2, double distancia) {
        double respuesta;
        double G;

        G = 6.673 * Math.pow(10, -8);
        respuesta = (G * masa1 * masa2) / (Math.pow(distancia, 2));

        return respuesta;
    }

    public static boolean divicionExacta(double num1, double num2) {
        return (num1 % num2 == 0);
    }

    public static String distancia(double centimetros) {
        return "distancia en mm:" + centimetros * 10 + "\n"
                + "distancia en cm:" + centimetros + "\n"
                + "distancia en dm:" + centimetros / 10 + "\n"
                + "distancia en m:" + centimetros / 100 + "\n"
                + "distancia en dam:" + centimetros / 1000 + "\n"
                + "distancia en hm:" + centimetros / 10000 + "\n"
                + "distancia en km:" + centimetros / 100000 + "\n";
    }

    public static void main(String[] args) {
        int[] numerosAleatorios = new int[3];

        rellenar(numerosAleatorios);
        imprimir(numerosAleatorios);
        ordenar(numerosAleatorios);
        imprimir(numerosAleatorios);
        System.out.println("---------------------------");
        int[] numeros = new int[3];
        numeros[0] = 11;
        numeros[1] = 12;
        numeros[2] = 13;

        System.out.println(mayor(numeros));

        System.out.println("---------------------");
        System.out.println(formula(10, 500, 1000));

        double[] notas;
        notas = new double[3];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = -10;
        }
        System.out.println(estaAprobado(notas));
        System.out.println(puntuacion(notas));
        System.out.println("--------------------------------------------");

        FECHA fecha = new FECHA(17, 9, 2024);

        System.out.println(fecha.imprimir());

        FECHA fechaNacimiento = fecha.calcularEdad(16, 9, 2024);

        System.out.println(fechaNacimiento.imprimir());

        System.out.println("--------------------------------");
        System.out.println(fecha.comprovacionAñoBisisestos(2000));
        System.out.println(fecha.calcularDias(18, 4));
        System.out.println("------------------------");
        int cimparacion = fecha.Comparar(17, 9, 2024);

        if (cimparacion == 0) {
            System.out.println("es igual");
        } else if (cimparacion == -1) {
            System.out.println("menor");
        } else {
            System.out.println("mayor");
        }
        System.out.println("---------------------------------------------");

        System.out.println(distancia(100000));
    }

}

class FECHA {

    public int dia;
    public int mes;
    public int año;

    public FECHA(int dia, int mes, int año) {

        this.mes = mes;

        this.dia = dia;

        this.año = año;

    }

    public boolean comprovacionAñoBisisestos(int año) {
        return ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0);

    }

    public int calcularDias(int mes, int año) {

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7
                || mes == 8 || mes == 10 || mes == 12) {

            return 31;

        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            return 30;

        } else if (mes == 2) {

            if (comprovacionAñoBisisestos(año)) {
                return 29;
            } else {
                return 28;
            }

        } else {
            return 0;
        }
    }

    public FECHA calcularEdad(int dia, int mes, int año) {
        int diaN = 0;
        int mesN = 0;
        int añoN = 0;

        if (this.dia - dia < 0) {

            diaN = (this.dia + calcularDias(this.mes, this.año)) - dia;
            this.mes--;
            if (this.mes - mes < 0) {
                this.año--;
                mesN = (this.mes + 12) - mes;

            } else {
                mesN = this.mes - mes;
            }
        } else {
            diaN = this.dia - dia;
        }
        añoN = this.año - año;
        return new FECHA(diaN, mesN, añoN);
    }

    public int Comparar(int dia, int mes, int año) {
        if ((this.año == año) && (this.mes == mes) && (this.dia == dia)) {
            return 0;
        } else if (this.año > año) {
            return 1;
        } else {
            if (this.mes > mes) {
                return 1;
            } else {
                if (this.dia > dia) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
    }

    public String imprimir() {
        return this.año + "/" + this.mes + "/" + this.dia;
    }

}
