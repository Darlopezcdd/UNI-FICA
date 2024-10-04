/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ascensor_poo;

/**
 *
 * @author lopez
 */
public class Acscensor {

    private Cabina Cabina;
    private TipoPersona Personas;
    private int Pisos;


    private int PisoActual;
    private int NroDePersonas;

    public void setCabina(Cabina Cabina) {
        this.Cabina = Cabina;
    }
    public int getPisoActual() {
        return PisoActual;
    }
    public void setPisos(int Pisos) {
        if (Pisos <= 0) {
            this.Pisos = 1;
        } else {
            this.Pisos = Pisos;
        }
    }

    public void setNroDePersonas(int NroDePersonas) {
        if (NroDePersonas < 0) {
            this.NroDePersonas = 1;
        } else {
            this.NroDePersonas = NroDePersonas;
        }
    }

    public Acscensor(double tamañoX, double tamañoY, double peso, double areaP, int Piso, int NroDePersonas) {
        this.Personas = new TipoPersona(peso, areaP);
        this.Cabina = new Cabina(tamañoX, tamañoX, this.Personas);
        if (Piso <= 0) {
            this.Pisos = 1;
        } else {
            this.Pisos = Piso;
        }
        if (NroDePersonas < 0) {
            this.NroDePersonas = 1;
        } else {
            this.NroDePersonas = NroDePersonas;
        }
        this.PisoActual = 0;
    }

    public Acscensor(Cabina Cabina, TipoPersona Personas, int Piso, int NroDePersonas) {
        this(Cabina.getTamañoX(), Cabina.getTamañoY(), Personas.getPeso(),
                Personas.getAreaPersonal(), Piso, NroDePersonas);
    }

    public Acscensor(Cabina Cabina, int Piso, int NroDePersonas) {
        this(Cabina.getTamañoX(), Cabina.getTamañoY(), 0,
                0, Piso, NroDePersonas);
    }

    public Acscensor(Cabina Cabina, TipoPersona Personas, int NroDePersonas) {
        this(Cabina.getTamañoX(), Cabina.getTamañoY(), Personas.getPeso(),
                Personas.getAreaPersonal(), 1, NroDePersonas);
    }

    public Acscensor(int NroDePersonas) {
        this(1, 1, 70, 0.5, 1, NroDePersonas);
    }

    public Acscensor(Cabina Cabina, TipoPersona Personas) {
        this(Cabina.getTamañoX(), Cabina.getTamañoY(), Personas.getPeso(),
                Personas.getAreaPersonal(), 1, 1);
    }

    public Acscensor(TipoPersona Personas) {
        this(1, 1, Personas.getPeso(), Personas.getAreaPersonal(), 1, 1);
    }

    public Acscensor(TipoPersona Personas, int NroDePersonas) {
        this(1, 1, Personas.getPeso(), Personas.getAreaPersonal(), 1, NroDePersonas);
    }

    public Acscensor(Cabina Cabina) {
        this(Cabina.getTamañoX(), Cabina.getTamañoY(), 70, 0.5, 1, 1);
    }

    public Acscensor(Cabina Cabina, int NroDePersonas) {
        this(Cabina.getTamañoX(), Cabina.getTamañoY(), 70, 0.5, 1, NroDePersonas);
    }

    public Acscensor(double tamañoX, double tamañoY, double peso, int Piso, int NroDePersonas) {
        this(tamañoX, tamañoY, peso, 0.5, Piso, NroDePersonas);
    }

    public Acscensor(double tamañoX, double tamañoY, int Piso, int NroDePersonas) {
        this(tamañoX, tamañoY, 70, 0.5, Piso, NroDePersonas);
    }

    public Acscensor(double tamañoX, int Piso, int NroDePersonas) {
        this(tamañoX, tamañoX, 70, 0.5, Piso, NroDePersonas);
    }

    public Acscensor(double tamañoX, double tamañoY, double peso, int NroDePersonas) {
        this(tamañoX, tamañoY, peso, 0.5, 1, NroDePersonas);
    }

    public Acscensor(double tamañoX, double tamañoY, int NroDePersonas) {
        this(tamañoX, tamañoY, 70, 0.5, 1, NroDePersonas);
    }

    public Acscensor(double tamañoX, int NroDePersonas) {
        this(tamañoX, tamañoX, 70, 0.5, 1, NroDePersonas);
    }

    public Acscensor(double tamañoX, double tamañoY, double peso, double areaP) {
        this(tamañoX, tamañoY, peso, areaP, 1, 1);
    }

    public Acscensor(double tamañoX, double tamañoY, double peso) {
        this(tamañoX, tamañoY, peso, 0.5, 1, 1);
    }

    public Acscensor(double tamañoX, double tamañoY) {
        this(tamañoX, tamañoY, 70, 0.5, 1, 1);
    }

    public Acscensor(double tamañoX) {
        this(tamañoX, tamañoX, 70, 0.5, 1, 1);
    }

    public Acscensor() {
        this(1, 1, 70, 0.5, 1, 1);
    }

    public String getCabina() {
        return Cabina.Imprimir();
    }

    public String getPersonas() {
        return Personas.Imprimir();
    }

    public int getPiso() {
        return Pisos;
    }

    public boolean ComprobacionDeCapacidad() {
        if (this.NroDePersonas > this.Cabina.CpacidadDePresonas()) {
            return false;
        } else {
            return true;
        }
    }

    public void SubirPersonas(int NumPersonas) {
        this.NroDePersonas += NumPersonas;
    }

    public void SubirPersonas() {

        SubirPersonas(1);
    }

    public void BajarPersonas(int NumPersonas) {
        if (this.NroDePersonas - NumPersonas >= 0) {
            this.NroDePersonas -= NumPersonas;

        } else {
            this.NroDePersonas = 0;
        }
    }

    public void BajarPersonas() {
        BajarPersonas(1);
    }

    public void Subir(int NumPisos) {
        if ((ComprobacionDeCapacidad() == true) && (this.PisoActual + NumPisos <= this.Pisos)) {
            this.PisoActual = this.PisoActual + NumPisos;
        }
    }

    public void Subir() {

        Subir(1);
    }

    public void Bajar(int NumPisos) {
        if ((ComprobacionDeCapacidad() == true) && (this.PisoActual - NumPisos >= 0)) {
            this.PisoActual -= NumPisos;
        }
    }

    public void Bajar() {
        Bajar(1);
    }

    public String Imprimir() {
        if (this.PisoActual == 0 && ComprobacionDeCapacidad() == true) {
            return "PB";

        } else {
            if (this.PisoActual == 0 && ComprobacionDeCapacidad() == false) {
                return "Se exedio la capacidad del ascensor";

            } else {
                if (ComprobacionDeCapacidad() == false) {
                    return "Se exedio la capacidad del ascensor";

                } else {
                    return this.PisoActual + "";
                }
            }

        }

    }
}
