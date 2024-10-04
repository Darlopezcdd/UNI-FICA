/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fecha.pkg1;

/**
 *
 * @author lopez
 */
public class FECHA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FECHA f1, f2;
        Edad e1;
        f1 = new FECHA(28,2, 2004);
        f2 = new FECHA(1, 3, 2023);
        f1.Imprimir();

        e1 = f1.CalcularEdad(f2);
        f2.Imprimir();

        System.out.println(e1.imprimir());
//        e1 = f2.CalcularEdad();
        System.out.println(e1.imprimir());
//        f1.IncrementaDia(999999999);        
//        f1.DecrementaDia(2);
        System.out.println("------------------------------");
        int x;
        x = f1.Comparar();
        if (x == 1) {
            f1.Imprimir();
            System.out.println("es mayor  ");

        } else {
            if (x == -1) {
                f1.Imprimir();
                System.out.println("es menor  ");

            } else {
                f1.Imprimir();
                System.out.println("es igual  ");

            }
        }

    }

}
