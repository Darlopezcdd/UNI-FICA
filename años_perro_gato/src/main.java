
public class main {

    public static String añosAnimal(int años, int tipo) {
        if (años == 1) {
            return "15 anios";
        } else if (años == 2) {
            return "24 anios";
        } else {
            int contadorAños = años - 2;
            int añosTemp = 24;
            if (tipo == 1) {
                añosTemp += contadorAños * 4;
            } else {
                añosTemp += contadorAños * 5;
            }
            return añosTemp + " anios";
        }
    }

    public static void main(String[] args) {
        int añosPerro = 3;
        int añosGato = 3;
//tipo: 1=gato,,2=perro
        System.out.println("perro:"+añosAnimal(añosPerro, 2));
        System.out.println("gato:"+añosAnimal(añosGato, 1));

    }

}
