/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

/**
 *
 * @author lopez
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long time =System.currentTimeMillis();
        Runtime r=Runtime.getRuntime(); 
        int[][] Matriz;
        int tam;
        tam = 5;
        int num = 1;
        int contr = 0;
        Matriz = new int[tam][tam];

        for (int k = Matriz.length - 1; k >= 0; k--) {

            for (int i = 0; i < Matriz.length - k; i++) {
                for (int j = Matriz.length - 1 - i - k; j < Matriz.length - i - k; j++) {
                    Matriz[j][i] = num++;
                }
            }
        }
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 1; j < Matriz.length - i; j++) {

                Matriz[Matriz.length - j][j + i] = num++;
            }
        }
        
        
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print(Matriz[i][j] + "\t");
            }
            System.out.println("");
            
            
        }
        long mem =r.totalMemory();
            long memlim=r.freeMemory();
            long time1=System.currentTimeMillis();
            System.out.println(time1-time);
            System.out.println(mem-memlim);
            
            int a=16/5;
            System.out.println(a);

    }
}
