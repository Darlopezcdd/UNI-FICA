/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fracciones;

/**
 *
 * @author lopez
 */
public class Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        FRACCION F1, F2, F3;
        F1 = new FRACCION(4, 4);
        F2 = new FRACCION(1, 2);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        F3 = F2.Resta(F1);
        System.out.println(F1.Imprimir());
        System.out.println(F2.Imprimir());
        System.out.println("----------------");
        System.out.println(F3.Imprimir());
        
        System.out.println(FRACCION.cont);
        System.gc();
        Thread.sleep(1);
        System.out.println(FRACCION.cont);
        
    }
    
}
