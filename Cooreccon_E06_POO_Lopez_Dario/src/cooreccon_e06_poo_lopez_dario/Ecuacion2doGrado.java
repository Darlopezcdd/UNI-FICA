/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cooreccon_e06_poo_lopez_dario;

/**
 *
 * @author lopez
 */

public class Ecuacion2doGrado {

    public double a;
    public double b;
    public double c;

    public Ecuacion2doGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Ecuacion2doGrado() {
        this.a = 1;
        this.b = 2;
        this.c = 1;
    }

    public Raisces Calcular() {
        Simplificar();
        double dis = (Math.pow(this.b, 2))-(4*this.a*this.c);
        double x1,x2;
        if (dis==0 ||dis>0)
        {
            x1=((-1*this.b)+Math.sqrt(dis))/(2*this.a);
            x2=((-1*this.b)-Math.sqrt(dis))/(2*this.a);
            return new Raisces(x1,x2,false);
        }
        else
        {
            dis=dis*(-1);
            x1=((-1*this.b)+Math.sqrt(dis))/(2*this.a);
            x2=((-1*this.b)-Math.sqrt(dis))/(2*this.a);
            return new Raisces(x1,x2,true);
        }
        
        

    }
    
    public void Simplificar()
    {
        
        double nummayor;
        nummayor=0;
        
        if(this.a>=this.b &&this.a>=this.c)
        {
            nummayor=this.a;
        }
        else if(this.b>=this.a &&this.b>=this.c)
        {
            nummayor=this.b;
        }
         else if(this.c>=this.a &&this.c>=this.b)
        {
            nummayor=this.c;
        }
        for (double i = 1; i <= nummayor; i+=0.1) {
            
            if(this.a%i ==0&&this.b%i ==0&&this.c % i == 0)
            {
                this.a=this.a/i;
                this.b=this.b/i;
                this.c=this.c/i;
            }
        }
    }
    public String Imprimir ()
    {
        return this.a+"x^2"+"+"+this.b+"x"+"+"+this.c+"= 0 "+"\r\n"+
                Calcular().Imprimir();
    }

}
