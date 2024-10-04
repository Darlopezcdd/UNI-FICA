/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author lopez
 */
public class hora {

    public int hora;
    public int minuto;
    public int segundo;

    public hora(int hora, int minuto, int segundo) {

        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    public void incrementar()
    {
        if (segundo==59)
        
        {
            segundo=0;
            if (minuto==59)

            {
                minuto=0;
                if (hora==23)
                {
                    hora=0;
                }
                else
                {
                    hora++;
                }
                       
            }
            else
            {
                minuto++;
            }
                
            
        }
        else
        {
            segundo++;
        }
    }
    public String imprimir()
    {
        return hora+":"+minuto+":"+segundo;
    }
    
}
