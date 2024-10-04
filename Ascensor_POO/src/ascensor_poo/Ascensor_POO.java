/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ascensor_poo;

/**
 *
 * @author lopez
 */
public class Ascensor_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cabina c1;
        TipoPersona P1;
        Acscensor A1;
        P1 = new TipoPersona();
        c1 = new Cabina(5, P1);
        A1 = new Acscensor(c1, P1, 20, 7);

        A1.SubirPersonas(8000);
        A1.BajarPersonas(8001);
        A1.Subir(6);
        System.out.println(A1.Imprimir());

    }

}
