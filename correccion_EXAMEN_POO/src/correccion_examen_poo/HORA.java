/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correccion_examen_poo;

/**
 *
 * @author lopez
 */
public class HORA {

    private int hora;
    private int minuto;
    private int segundo;

    public HORA(int hh, int mm, int ss) {
        this.hora = hh;
        this.minuto = mm;
        this.segundo = ss;
    }

    public HORA(int hh) {
        this(hh, 0, 0);
    }

    public HORA() {
        this(0, 0, 0);
    }

    public int getHh() {
        return hora;
    }

    public void setHh(int hh) {
        this.hora = hh;
    }

    public int getMm() {
        return minuto;
    }

    public void setMm(int mm) {
        this.minuto = mm;
    }

    public int getSs() {
        return segundo;
    }

    public void setSs(int ss) {
        this.segundo = ss;
    }

    public HORA Clonar() {
        return new HORA(this.hora, this.minuto, this.segundo);
    }

    public void Incrementar() {
        if (this.segundo == 59) {
            this.segundo = 0;
            if (this.minuto == 59) {
                this.minuto = 0;
                if (this.hora == 23) {
                    this.hora = 0;
                } else {
                    this.hora++;
                }
            } else {
                this.minuto++;
            }
        } else {
            this.segundo++;
        }
    }

    public void Decrementar() {
        if (this.segundo == 0) {
            this.segundo = 59;
            if (this.minuto == 0) {
                this.minuto = 59;
                if (this.hora == 0) {
                    this.hora = 23;
                } else {
                    this.hora--;
                }
            } else {
                this.minuto--;
            }
        } else {
            this.segundo--;
        }
    }

    public int Comparar(int Hora, int minuto, int segundo) {
        if (this.hora > Hora) {
            return 1;
        } else {
            if (this.hora < Hora) {
                return -1;
            } else {
                if (this.minuto > minuto) {
                    return 1;
                } else {
                    if (this.minuto < minuto) {
                        return -1;
                    } else {

                        if (this.segundo > segundo) {
                            return 1;
                        } else {
                            if (this.segundo < segundo) {
                                return -1;
                            } else {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }

    public int Comparar() {
        return Comparar(0, 0, 0);
    }

    public int Comparar(HORA H) {
        return Comparar(H.hora, H.minuto, H.segundo);
    }

    public boolean IgualQue(int Hora, int minuto, int segundo) {
        return this.Comparar(Hora, minuto, segundo) == 0;

    }

    public boolean IgualQue() {
        return IgualQue(0, 0, 0);
    }

    public boolean IgualQue(HORA H) {
        return IgualQue(H.hora, H.minuto, H.segundo);
    }

    public boolean MayorQue(int Hora, int minuto, int segundo) {
        return this.Comparar(Hora, minuto, segundo) == 1;

    }

    public boolean MayorQue() {
        return MayorQue(0, 0, 0);
    }

    public boolean MayorQue(HORA H) {
        return MayorQue(H.hora, H.minuto, H.segundo);
    }

    public boolean MenorQue(int Hora, int minuto, int segundo) {
        return this.Comparar(Hora, minuto, segundo) == -1;

    }

    public boolean MenorQue() {
        return MenorQue(0, 0, 0);
    }

    public boolean MenorQue(HORA H) {
        return MenorQue(H.hora, H.minuto, H.segundo);
    }
public String Imprimir12() {
    if (this.hora>12)
        return (this.hora-12) + ":" + this.minuto + ":" + this.segundo+"/pm";
    else
    {
        return this.hora + ":" + this.minuto + ":" + this.segundo+"/am";
    }
    }
    public String Imprimir() {
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    public int TotalSegundos() {
        return this.hora * 60 * 60 + this.minuto * 60 + this.segundo;
    }
    //modifico la clase padre 
    //
//    @Override
//    public String toString()
//    {
//        return this.hh+":"+this.mm+":"+this.ss;
//    }

}
