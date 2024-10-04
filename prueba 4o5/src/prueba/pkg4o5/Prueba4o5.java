package prueba.pkg4o5;

public class Prueba4o5 {

    public static void main(String[] args) {
        Matriz[] arr = new Matriz[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Matriz(3, 3);
        }
        arr[0].LlenarCaja();
        arr[1].LlenarCruz();
        arr[2].LlenarX();
        arr[3].Llenarzigzag();
        arr[4].LlemarCuadradoMagico();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }

        Circulo[] cs = new Circulo[4];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new Circulo(Math.random()*10*cs.length);
            System.out.println(cs[i].toString());
        }

    }

}

class Matriz {

    int[][] matriz;

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public Matriz(int tamaño) {
        this.matriz = new int[tamaño][tamaño];
    }

    public Matriz(int fila, int columna) {
        this.matriz = new int[fila][columna];
    }

    public void Llenarzigzag() {
        int contador = 1;
        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = contador;
                    contador++;
                }
            } else {
                for (int j = matriz[i].length - 1; j >= 0; j--) {
                    matriz[i][j] = contador;
                    contador++;
                }
            }
        }
    }

    public void LlenarCruz() {
        int contador = 1;
        int j = matriz.length / 2;
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][j] = 1;
            matriz[j][i] = 1;
        }
    }

    public void LlenarX() {

        int aux = matriz.length - 1;
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][aux] = 1;
            matriz[i][i] = 1;
            aux--;

        }
    }

    public void LlenarCaja() {

        for (int i = 0; i < matriz.length; i++) {
            matriz[0][i] = 1;
            matriz[i][0] = 1;
            matriz[matriz.length - 1][i] = 1;
            matriz[i][matriz.length - 1] = 1;

        }
    }

    public void LlemarCuadradoMagico() {

        if (matriz.length % 2 == 0) {
            LlenarCaja();
        } else {

            int col, fil, filA, colA, contador;

            col = matriz.length / 2;
            fil = 0;
            contador = 1;

            while (contador <= matriz.length * matriz.length) {

                matriz[fil][col] = contador;

                contador++;

                filA = fil;
                colA = col;

                if (fil == 0) {
                    fil = matriz.length - 1;
                } else {
                    fil--;
                }

                if (col == matriz.length - 1) {
                    col = 0;
                } else {
                    col++;
                }

                if (matriz[fil][col] != 0) {
                    fil = filA + 1;
                    col = colA;
                }
            }
        }
    }

    @Override
    public String toString() {

        String resp = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resp += matriz[i][j] + "\t";
            }
            resp += "\n";
        }
        return resp;
    }

}

class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double Area() {
        return Math.PI * (radio * radio);
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + "\n" + "Area:" + Area();
    }

}
