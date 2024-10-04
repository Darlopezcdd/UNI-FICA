package prueba8;

public class Prueba8 {

    public static void main(String[] args) {
        Matriz M1 = new Matriz(3, 3);
        M1.LlenarAleaotios();
        System.out.println(M1.toString());
        M1.Ordenar();
        System.out.println(M1.toString());
        System.out.println("");
        for (int i = 0; i < M1.NumerosFaltantes().length; i++) {
            System.out.println(M1.NumerosFaltantes()[i]);
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

    public void LlenarAleaotios() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * matriz.length * 3);
            }
        }
    }

    public void Ordenar() {

        for (int k = 0; k <= matriz.length * matriz[0].length; k++) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length - 1; j++) {
                    if (matriz[i][j] > matriz[i][j + 1]) {
                        int aux = matriz[i][j + 1];
                        matriz[i][j + 1] = matriz[i][j];
                        matriz[i][j] = aux;
                    }
                }

            }

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

    public int Numeros(int[] matriz) {
        int contador = 0;
        for (int i = matriz[0] + 1; i < matriz[matriz.length - 1]; i++) {
            boolean esta = false;
            for (int j = 1; j < matriz.length; j++) {
                if (matriz[j] == i) {
                    esta = true;
                }
            }
            if (!esta) {
                contador++;
            }

        }
        return contador;
    }
    public int[] NumerosFaltantes() {
       int []numeros=new int[matriz.length];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=Numeros(matriz[i]);
        }
        return numeros;
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
