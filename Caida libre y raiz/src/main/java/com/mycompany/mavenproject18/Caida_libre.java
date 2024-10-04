/*; * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject18;

/**
 *
 * @author lopez
 */
public class Caida_libre {

    public static double gravedad = 9.8;

    public double tiempo;
    public double velocidad_f;
    public double velocidad_i;
    public double altura_i;

    public double altura_f;

    public Caida_libre() {
        this.tiempo = 0;
        this.velocidad_f = 0;
        this.velocidad_i = 0;
        this.altura_i = 0;
        this.altura_f = 0;
    }

    public Raisces Tiempo(double a,double b,double c) {
        
        
         double dis = (Math.pow(b, 2))-(4*a*c);
        double x1,x2;
        if (dis==0 ||dis>0)
        {
            x1=((-1*b)+Math.sqrt(dis))/(2*a);
            x2=((-1*b)-Math.sqrt(dis))/(2*a);
            return new Raisces(x1,x2,false);
        }
        else
        {
            dis=dis*(-1);
            x1=((-1*b)+Math.sqrt(dis))/(2*a);
            x2=((-1*b)-Math.sqrt(dis))/(2*a);
            return new Raisces(x1,x2,true);
        }

    }
}


        
    
    
    
   
   
    

