/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author lopez
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      
        hora hora =new hora(23,59,59);
        
        System.out.println(hora.imprimir());
        
        for (int i = 0; i < 10; i++) {
                    hora.incrementar();

        }
        
                System.out.println(hora.imprimir());
       
        
        
        
    }
    
}
