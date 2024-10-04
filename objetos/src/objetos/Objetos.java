package objetos;

public class Objetos {

    public static int calcularSustosporaltura(Persona[] personas) {
        int aux = 0;
        for (int i = 0; i < personas.length; i++) {
            aux += personas[i].altura;
        }
        System.out.println(aux / 100 * 3);
        return 0;
    }

    public static void main(String[] args) {
        Persona niño = new Persona("Dario", 12, 180);
        Persona[] niños = new Persona[5];
        niños[0] = new Persona("Juan", 10, 180);
        niños[1] = new Persona("Kevin", 12, 180);
        niños[2] = new Persona("Alejandro", 14, 180);
        niños[3] = new Persona("Jonathan", 12, 180);
        niños[4] = new Persona("Alex", 13, 180);
        System.out.println(niños[0].calcularSustosporNombre());
        System.out.println(niños[0].calcularDulsesporedad());
        calcularSustosporaltura(niños);
    }

}

class Persona {

    String Nombre;
    int edad;
    double altura;

    public Persona(String Nombre, int edad, double altura) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public Persona() {
        this.Nombre = "Dario";
        this.edad = 12;
        this.altura = 180;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", edad=" + edad + ", altura=" + altura + '}';
    }

    public int calcularSustosporNombre() {

        return this.Nombre.length() / 2;
    }

    public int calcularsustosporedad() {
        return (this.edad % 2 == 0) ? 2 : 0;

    }

    public int calcularDulsesporedad() {
        if (edad > 10) {
            return 0;
        } else {
            return(int)edad/3;
        }

    }
    public int calcularDulsesporAltura() {
        if (altura > 150) {
            return 0;
        } else {
            return((int)altura/50)*2;
        }

    }
}
