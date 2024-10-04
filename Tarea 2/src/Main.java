
public class Main {

    public static boolean ValidaciónTriángulo(double lado1, double lado2, double lado3) {

        double ladoMayor = 0;
        double ladoMenor1 = 0;
        double ladoMenor2 = 0;

        if ((lado1 > lado2) && (lado1 > lado3)) {
            ladoMayor = lado1;
            ladoMenor1 = lado2;
            ladoMenor2 = lado3;
        } else if ((lado2 > lado1) && (lado2 > lado3)) {
            ladoMayor = lado2;
            ladoMenor1 = lado1;
            ladoMenor2 = lado3;
        } else {
            ladoMayor = lado3;
            ladoMenor1 = lado2;
            ladoMenor2 = lado1;
        }

        if (ladoMenor1 + ladoMenor2 > ladoMayor) {
            return true;

        } else {
            return false;
        }
    }

    public static double SistemaImpuestosProgresivo(double valor) {
        if (valor <= 0) {
            return 0;
        } else if (valor < 10001) {
            return valor * 0.10;
        } else if (valor < 20001) {
            return valor * 0.15;
        } else {
            return valor * 0.20;
        }
    }

    public static boolean ValidaciónNumeroPalíndromo(int numero) {
        String numer = numero + "";
        boolean respusta = true;

        for (int i = 0; i < numer.length(); i++) {

            if (numer.charAt(i) != numer.charAt(numer.length() - i - 1)) {
                respusta = false;
            }
        }
        return respusta;
    }

    public static String ClasificaciónPuntuacionesExamenBonos(double nota, boolean bono) {
        if (bono && nota < 96) {
            nota += 5;
        }

        if (nota > 100) {
            return "numero no valio";
        } else if (nota >= 90) {
            return "A" + " nota: " + nota + " bono: " + bono;
        } else if (nota >= 80 && nota <= 89) {
            return "B" + " nota: " + nota + " bono: " + bono;
        } else if (nota >= 70 && nota <= 79) {
            return "C" + " nota: " + nota + " bono: " + bono;
        } else if (nota >= 60 && nota <= 69) {
            return "D" + " nota: " + nota + " bono: " + bono;
        } else if (nota >= 0 && nota <= 59) {
            return "E" + " nota: " + nota + " bono: " + bono;
        } else {
            return "numero no valio";
        }
    }

    public static void Simulaciónsemáforo(String color) {
        int timepo = 5;
        if (color == "verde" || color == "VERDE" || color == "Verde") {
            System.out.println(color);
            System.out.println(" tiempo: " + timepo + "s");
            Tiempoespera(timepo);
            System.out.println("Rojo");

        } else if (color == "Rojo" || color == "ROJO" || color == "rojo") {
            System.out.println(color);
            System.out.println(" tiempo: " + timepo + "s");
            Tiempoespera(timepo);
            System.out.println("Amarillo");
            System.out.println(" tiempo: " + 1 + "s");
            Tiempoespera(1);
            System.out.println("Verde");

        } else if (color == "Amarillo" || color == "Amarillo" || color == "Amarillo") {
            System.out.println(color);
            System.out.println(" tiempo: " + 1 + "s");
            Tiempoespera(1);
            System.out.println("Verde");

        }

    }

    public static void Tiempoespera(int Tiempo) {

        try {
            Thread.sleep(Tiempo * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static double SistemaConversiónMonedasValidación(double moneda, String moneda1, String moneda2) {
        if (moneda1 == "USD" && moneda2 == "EUR") {
            return moneda * 0.89;
        } else if (moneda1 == "USD" && moneda2 == "GBP") {
            return moneda * 0.75;
        } else if (moneda1 == "EUR" && moneda2 == "GBP") {
            return moneda * 0.84;
        } else if (moneda1 == "EUR" && moneda2 == "USD") {
            return moneda / 0.89;
        } else if (moneda1 == "GBP" && moneda2 == "USD") {
            return moneda / 0.75;
        } else if (moneda1 == "GBP" && moneda2 == "EUR") {
            return moneda / 0.84;
        } else {
            return moneda;
        }
    }

    public static boolean EvaluaciónExpresionesLogicasComplejas(boolean A, boolean B, boolean C, boolean D) {
        return (A && B) || (C && !D);
    }

    public static boolean Validacionfechaformatoentrada(int dia, int mes, int año) {
        if (año < 0) {
            return false;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7
                || mes == 8 || mes == 10 || mes == 12) {

            return dia <= 31 && dia > 0;

        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            return dia <= 30 && dia > 0;

        } else if (mes == 2) {

            if (ComprovacionAñoBisisestos(año)) {
                return dia <= 29 && dia > 0;
            } else {
                return dia <= 28 && dia > 0;
            }

        } else {
            return false;
        }
    }

    public static boolean ComprovacionAñoBisisestos(int año) {
        return ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0);
    }

    public static String SimuladorMaquinaVentasAutomaticas(double producto, double valor) {
        if (producto < 0 || valor < 0) {
            return "valores no validos";
        } else if (valor > producto) {
            return " vuelto disponible: " + (valor - producto);
        } else {
            return " debe canselar:" + (producto - valor);
        }
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println(ValidaciónTriángulo(4, 8, 5));
        System.out.println("----------------------------------------------------");
        System.out.println(SistemaImpuestosProgresivo(18000));
        System.out.println("----------------------------------------------------");
        System.out.println(ValidaciónNumeroPalíndromo(114));
        System.out.println("----------------------------------------------------");
        System.out.println(ClasificaciónPuntuacionesExamenBonos(96, true));
        System.out.println("----------------------------------------------------");
        Simulaciónsemáforo("rojo");
        System.out.println("----------------------------------------------------");
        System.out.println(SistemaConversiónMonedasValidación(1, "EUR", "USD"));
        System.out.println("----------------------------------------------------");
        System.out.println(EvaluaciónExpresionesLogicasComplejas(true, false, true, false));
        System.out.println("----------------------------------------------------");
        System.out.println(Validacionfechaformatoentrada(15, 12, 1));
        System.out.println("----------------------------------------------------");
        System.out.println(SimuladorMaquinaVentasAutomaticas(15.2,18.6));
    }

}
