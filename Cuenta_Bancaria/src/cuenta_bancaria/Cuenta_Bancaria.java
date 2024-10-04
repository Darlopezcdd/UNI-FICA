/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta_bancaria;

/**
 *
 * @author lopez
 */
public class Cuenta_Bancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FECHA F1, F2, F3;
        Propietario p1, p2;
        Cuenta C1, C2, C3, C4, C5, C6;
        F1 = new FECHA(1, 2, 2002);

        C1 = new Cuenta(new Propietario("PEPITO", new FECHA(1, 1, 2000)), new FECHA(), 200.0);

        C2 = new Cuenta("JUAN", 20, 9, 2000, 20, 10, 2023, 10.50);

        C3 = new Cuenta(C1.getPorpietario(), F1, 204.60);

        C4 = new Cuenta(C2.getPorpietario(), C3.getFechaDeCreacion(), 1648.26);

        C5 = new Cuenta(C1.getPorpietario().getNombre(),
                C2.getPorpietario().getFechaDeNacimineto(), C2.getFechaDeCreacion(), 7);

        C6 = new Cuenta(new Propietario("Carlos",
                C2.getPorpietario().getFechaDeNacimineto()), C4.getFechaDeCreacion(), 1.5);

        System.gc();
        System.out.println(C1.Imprimir());
        System.out.println(C2.Imprimir());
        System.out.println(C3.Imprimir());
        System.out.println(C4.Imprimir());
        System.out.println(C5.Imprimir());
        System.out.println(C6.Imprimir());
        C1.Deposito(154.84);
        C2.Retiro(10.5);
        C3.Deposito(10000);
        C4.Retiro(4654);
        C5.Deposito(1);
        C6.Retiro(.5);
        System.out.println();
        System.out.println("--------------");
           System.gc();

    }

}
