package clases;

public class Clases {

    public static void llenar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
    }

    public static void Imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
    public static double Promedio(int[]arr)
    {
        double suma=0;
        for (int i = 0; i < arr.length; i++) {
            suma+=arr[i];
        }
        return suma/arr.length;
    }

    public static void main(String[] args) {
        int[]arr=new int[3];
        Imprimir(arr);
        llenar(arr);
        System.out.println(Promedio(arr));
        Imprimir(arr);
    }

}
