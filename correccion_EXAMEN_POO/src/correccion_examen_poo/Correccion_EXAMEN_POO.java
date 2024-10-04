/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correccion_examen_poo;

/**
 *
 * @author lopez
 */
public class Correccion_EXAMEN_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HORA H1,H2;
        H1 = new HORA(23,59,59);
        H2=H1.Clonar();
         System.out.println(H1.Imprimir());
        System.out.println(H2.Imprimir());
        H1.Incrementar();
        H2.Decrementar();;
        System.out.println(H1.Imprimir());
        System.out.println(H2.Imprimir());
        
        System.out.println(H1.TotalSegundos());
        System.out.println(H1.Comparar(H2));
         System.out.println(H1.Imprimir());
        System.out.println(H2.Imprimir());
        System.out.println(H1.Imprimir12());
         System.out.println(H2.Imprimir12());

    }

}
