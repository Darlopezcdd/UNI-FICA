/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta_bancaria;

/**
 *
 * @author lopez
 */
import java.util.*;

public class FECHA {

    private Date fechaActual = new Date();
    private int dia, mes, año;

    public FECHA() {
        this.dia = fechaActual.getDate();
        this.mes = fechaActual.getMonth() + 1;
        this.año = fechaActual.getYear() + 1900;

    }

    public FECHA(int dia, int mes, int año) {
        if (año > 0) {
            this.año = año;
        } else {
            this.año = fechaActual.getYear() + 1900;;
        }
        if (mes >0 && mes < 13) {
            this.mes = mes;
        } else {
            this.mes = fechaActual.getMonth() + 1;;
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia > 0 && dia <= 31) {
                this.dia = dia;
            } else {
                this.dia = fechaActual.getDate();;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 0 && dia <= 30) {
                this.dia = dia;
            } else {
                this.dia = fechaActual.getDate();;
            }
        } else if (mes == 2) {
            if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                if (dia > 0 && dia <= 29) {
                    this.dia = dia;
                } else {
                    this.dia = fechaActual.getDate();;
                }
            } else {
                if (dia > 0 && dia <= 28) {
                    this.dia = dia;
                } else {
                    this.dia = fechaActual.getDate();;
                }
            }
        } else {
            this.dia = fechaActual.getDate();;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7
                || this.mes == 8 || this.mes == 10 || this.mes == 12) {
            if (dia > 0 && dia <= 31) {
                this.dia = dia;
            }
        } else if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {

            if (dia > 0 && dia <= 30) {
                this.dia = dia;
            }
        } else if (this.mes == 2) {
            if (this.año % 4 == 0 && (this.año % 100 != 0 || this.año % 400 == 0)) {
                if (dia > 0 && dia <= 29) {
                    this.dia = dia;
                }
            } else {
                if (dia > 0 && dia <= 28) {
                    this.dia = dia;
                }
            }
        }
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        }
    }

    public void setAño(int año) {
        if (año > 0) {
            this.año = año;
        }
    }

    private boolean Bisiesto() {
        //return !(); para negar
        return ((this.año % 4 == 0 && this.año % 100 != 0) || (this.año % 400 == 0));
    }

    private int DiasMes() {
        if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
            return 30;
        } else if (this.mes == 2) {
            if (this.Bisiesto()) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 31;
        }
    }

    public void IncrementaDia() {
//inge
        if (this.dia == this.DiasMes()) {
            this.dia = 1;
            if (this.mes == 12) {
                this.mes = 1;
                this.año++;
            } else {
                this.mes++;
            }
        } else {
            this.dia++;
        }
//mio
//        if ((this.dia < DiasMes())) {
//            this.dia++;
//        } else if ((this.dia == 31 && this.mes == 12)) {
//            this.año++;
//            this.dia = 1;
//            this.mes = 1;
//        } else if (this.dia == DiasMes()) {
//            this.mes++;
//            this.dia = 1;
//        }
    }

    public void IncrementaDia(int nDias) {
        for (int i = 1; i <= nDias; i++) {
            this.IncrementaDia();
        }
    }

    public void DecrementaDia() {
//inge
        if (this.dia == 1) {
            if (this.mes == 1) {
                this.mes = 12;
                this.año--;
            } else {
                this.mes--;
            }
            this.dia = this.DiasMes();
        } else {
            this.dia--;
        }
//mio
//        if ((this.dia > 1)) {
//            this.dia--;
//        } else if ((this.dia == 1 && this.mes == 1)) {
//            this.año--;
//            this.mes = 12;
//            this.dia = DiasMes();
//        } else if (this.dia == 1) {
//            this.mes--;
//            this.dia = DiasMes();
//        }
    }

    public void DecrementaDia(int nDias) {
        for (int i = 1; i <= nDias; i++) {
            this.DecrementaDia();
        }
    }

    /**
     *
     * @param f dirección de memoria de un objeto tipo fecha
     * @return <br> <b>0</b> si la fecha es igual a la del atributo recibido
     * <br> <b>1</b> si la fecha es mayor a la del atributo recibido
     * <br> <b>-1</b> si la fecha es menor a la del atributo recibido
     */
    public int Comparar(FECHA f) {
        return this.Comparar(f.dia, f.mes, f.año);
    }

    /**
     *
     * @param dia numero entero que representa el numero de dias
     * @param mes numero entero que representa el numero de meses
     * @param año numeor entero que representa el numero de años
     * @return <br> <b>0</b> si la fecha es igual a la del atributo recibido
     * <br> <b>1</b> si la fecha es mayor a la del atributo recibido
     * <br> <b>-1</b> si la fecha es menor a la del atributo recibido
     */
    public int Comparar(int dia, int mes, int año) {
        if (this.año < año) {
            return -1;
        } else {
            if (this.mes > mes) {
                return 1;
            }
            if (this.mes < mes) {
                return -1;
            } else {
                if (this.dia > dia) {
                    return 1;
                }
                if (this.dia < dia) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    /**
     * @return <br> <b>0</b> si la fecha es igual a la del atributo recibido
     * <br> <b>1</b> si la fecha es mayor a la del atributo recibido
     * <br> <b>-1</b> si la fecha es menor a la del atributo recibido
     */
    public int Comparar() {
        FECHA F;
        F = new FECHA();
        return this.Comparar(F.dia, F.mes, F.año);

    }

    public Edad CalcularEdad() {
        
        return this.CalcularEdad(fechaActual.getDate(), fechaActual.getMonth() + 1,fechaActual.getYear() + 1900);

//        FECHA FA = new FECHA();
//        FECHA F = new FECHA(0, 0, 0);
//        int contador;
//        contador = 0;
//        if (this.Comparar(FA) == 0 || this.Comparar(FA) == 1) {
//            return F;
//
//        } else {
//            for (int i = 0; this.año != FA.año; i++) {
//                this.IncrementaDia(1);
//                contador++;
//            }
//            for (int i = 0; this.mes != FA.mes; i++) {
//                this.IncrementaDia(1);
//                contador++;
//            }
//            for (int i = 0; this.dia != FA.dia; i++) {
//                this.IncrementaDia(1);
//                contador++;
//            }
//
//            F.IncrementaDia(contador);
//            if (F.mes == 12) {
//                F.mes = 0;
//                F.año++;
//            }
//            return F;
//        }
    }

    public Edad CalcularEdad(FECHA f) {

        return this.CalcularEdad(f.dia,f.mes ,f.año);
    }

    public Edad CalcularEdad(int diaA, int mesA, int añoA) {

        int d;
        int m;
        int a;
         if (this.dia > diaA) {
            mesA--;
            diaA += this.DiasMes();
        }
        if (this.mes > mesA) {
            añoA--;
            mesA += 12;
        }

        a = añoA - this.año;
        m = mesA - this.mes;
        d = diaA - this.dia;
        
        return new Edad(d, m, a);
    }

    public String Imprimir() {
        return this.dia + "/" + this.mes + "/" + this.año;
//        System.out.println("Es Bisisesto: " + Bisiesto());
//        System.out.println("--------------------------");

    }
}
