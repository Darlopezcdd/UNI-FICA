/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cooreccon_e06_poo_lopez_dario;

/**
 *
 * @author lopez
 */
public class Raisces {
    
    public double Raiz1;
    public double Raiz2;
    public boolean Raizi;

    public Raisces(double Raiz1, double Raiz2, boolean Raizi) {
        this.Raiz1 = Raiz1;
        this.Raiz2 = Raiz2;
        this.Raizi = Raizi;
    }
    
    public String Imprimir()
    {
        if(this.Raiz1==this.Raiz2)
        {
            return "X="+this.Raiz1; 
        }
        else if(this.Raizi==true)
        {
            return "X1="+this.Raiz1+"i"+"\r\n"+
                    "X2="+this.Raiz2+"i";
        }
        else
        {
            return "X1="+this.Raiz1+"\r\n"+
                    "X2="+this.Raiz2;
        }
    }

    
    
    
}
