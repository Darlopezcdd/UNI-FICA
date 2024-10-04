package clase3;

public class Clase3 {

    public static int factorial(int num) {

        int respuesta = num;
        if (num == 0) {
            return 1;
        } else {
            for (int i = 2; i < num; i++) {
                respuesta *= i;
            }

            return respuesta;
        }
    }

    public static int ceros(int num) {

        int contador = 0;
        for (int i = 0; i < num; i++) {
            if (num % 10 == 0) {
                num = num / 10;
                contador++;
            } else {
                break;
            }
        }
        return contador;
    }

    public static int Ceros(int num) {

        int contador = 0;
        String res = num + "";
        for (int i = 0; i < res.length(); i++) {
            String temporal = res.charAt(i) + "";

            if (Integer.parseInt(temporal) == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(Ceros(20020));

    }

}
