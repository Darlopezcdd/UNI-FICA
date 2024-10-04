//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        vector3d v1, v2;
        v1 = new vector3d(1, 0, -1);
        v2= v1.Suma(1);
        System.out.println(v1.Pararlelo(v2));
        System.out.println(v2.Perpendicular(v1));
        System.out.println("modulo V1:"+v1.Modulo());
        System.out.println("modulo V2:"+v2.Modulo());
        System.out.println(v2.Imprimir());
        System.out.println(v1.Imprimir());
    }
}