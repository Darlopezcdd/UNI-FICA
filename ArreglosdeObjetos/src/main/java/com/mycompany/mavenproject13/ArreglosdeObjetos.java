/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject13;

/**
 *
 * @author lopez
 */
import java.util.*;

public class ArreglosdeObjetos {

    public static void BurbujaObjetos(Object[] A) {
        Object temp;
        double Area1, Area2;
        Area1 = 0;
        Area2 = 0;
        for (int j = 0; j < A.length - 1; j++) {
            for (int i = 1; i < A.length - j; i++) {
                if (A[i] instanceof CIRCULO) {
                    Area1 = ((CIRCULO) A[i]).CalcularArea();
                } else if (A[i] instanceof CUADRADO) {
                    Area1 = ((CUADRADO) A[i]).CalcularArea();
                } else if (A[i] instanceof ELIPSE) {
                    Area1 = ((ELIPSE) A[i]).CalcularArea();
                } else if (A[i] instanceof RECTA) {
                    Area1 = ((RECTA) A[i]).CalcularLongitud();
                } else if (A[i] instanceof RECTANGULO) {
                    Area1 = ((RECTANGULO) A[i]).CalcularArea();
                } else if (A[i] instanceof TRIANGULO) {
                    Area1 = ((TRIANGULO) A[i]).CalcularArea();
                }

                if (A[i - 1] instanceof CIRCULO) {
                    Area2 = ((CIRCULO) A[i - 1]).CalcularArea();
                } else if (A[i - 1] instanceof CUADRADO) {
                    Area2 = ((CUADRADO) A[i - 1]).CalcularArea();
                } else if (A[i - 1] instanceof ELIPSE) {
                    Area2 = ((ELIPSE) A[i - 1]).CalcularArea();
                } else if (A[i - 1] instanceof RECTA) {
                    Area2 = ((RECTA) A[i - 1]).CalcularLongitud();
                } else if (A[i - 1] instanceof RECTANGULO) {
                    Area2 = ((RECTANGULO) A[i - 1]).CalcularArea();
                } else if (A[i - 1] instanceof TRIANGULO) {
                    Area2 = ((TRIANGULO) A[i - 1]).CalcularArea();
                }

                if (Area1 > Area2) {
                    temp = A[i];
                    A[i] = A[i - 1];
                    A[i - 1] = temp;

                }
            }
        }
    }

    public static void Imprimir(CIRCULO[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] != null) {
                System.out.println((i + 1) + ".-" + A[i].Imprimir());
            } else {
                i = A.length;
            }
        }
    }

    public static void Imprimir(TRIANGULO[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] != null) {
                System.out.println((i + 1) + ".-" + A[i].Imprimir());
            } else {
                i = A.length;
            }
        }
    }

    public static void Imprimir(Object[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] instanceof CIRCULO) {
                System.out.println((i + 1) + ".-"
                        + ((CIRCULO) A[i]).Imprimir());
            } else if (A[i] instanceof CUADRADO) {
                System.out.println((i + 1) + ".-"
                        + ((CUADRADO) A[i]).Imprimir());
            } else if (A[i] instanceof ELIPSE) {
                System.out.println((i + 1) + ".-"
                        + ((ELIPSE) A[i]).Imprimir());
            } else if (A[i] instanceof RECTA) {
                System.out.println((i + 1) + ".-"
                        + ((RECTA) A[i]).Imprimir());
            } else if (A[i] instanceof RECTANGULO) {

                System.out.println((i + 1) + ".-"
                        + ((RECTANGULO) A[i]).Imprimir());
            } else if (A[i] instanceof TRIANGULO) {
                System.out.println((i + 1) + ".-"
                        + ((TRIANGULO) A[i]).Imprimir());
            } else if (A[i] instanceof PUNTO) {
                System.out.println((i + 1) + ".-"
                        + ((PUNTO) A[i]).Imprimir());
            } else {
                i = A.length;
            }
        }
    }

    public static void ImprimirArea(Object[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] instanceof CIRCULO) {
                System.out.println((i + 1) + ".-" + "Area circulo:"
                        + ((CIRCULO) A[i]).CalcularArea());
            } else if (A[i] instanceof CUADRADO) {
                System.out.println((i + 1) + ".-" + "Area cuadrado:"
                        + ((CUADRADO) A[i]).CalcularArea());
            } else if (A[i] instanceof ELIPSE) {
                System.out.println((i + 1) + ".-" + "Area elipse:"
                        + ((ELIPSE) A[i]).CalcularArea());
            } else if (A[i] instanceof RECTA) {
                System.out.println((i + 1) + ".-" + "Longitud de la recta:"
                        + ((RECTA) A[i]).CalcularLongitud());
            } else if (A[i] instanceof RECTANGULO) {
                System.out.println((i + 1) + ".-" + "Area rectangulo:"
                        + ((RECTANGULO) A[i]).CalcularArea());
            } else if (A[i] instanceof TRIANGULO) {
                System.out.println((i + 1) + ".-" + "Area triangulo:"
                        + ((TRIANGULO) A[i]).CalcularArea());
            } else if (A[i] instanceof PUNTO) {
                System.out.println((i + 1) + ".-" + "Punto"
                        + ((PUNTO) A[i]).Imprimir());
            } else {
                i = A.length;
            }
        }

    }

    public static void BurbujaCirculo(CIRCULO[] A) {
        CIRCULO temp;
        for (int j = 0; j < A.length - 1; j++) {
            for (int i = 1; i < A.length - j; i++) {
                if ((A[i]).CalcularArea() > (A[i - 1]).CalcularArea()) {
                    temp = A[i];
                    A[i] = A[i - 1];
                    A[i - 1] = temp;

                }
            }
        }
    }

    public static void BurbujaTriangulos(TRIANGULO[] A) {
        TRIANGULO temp;
        for (int j = 0; j < A.length - 1; j++) {
            for (int i = 1; i < A.length - j; i++) {
                if ((A[i]).CalcularArea() > (A[i - 1]).CalcularArea()) {
                    temp = A[i];
                    A[i] = A[i - 1];
                    A[i - 1] = temp;

                }
            }
        }
    }

    public static void Tipode(Object A) {
        System.out.println(A instanceof Object);
        System.out.println(A instanceof CIRCULO);
        System.out.println(A instanceof TRIANGULO);
        System.out.println(A instanceof CUADRADO);
        System.out.println(A instanceof CIRCULO);
        System.out.println(A instanceof TRIANGULO);
    }

//    public static int Tipode(Object A) {
//        if (A instanceof Object) {
//            return (1);
//
//        } else if (A instanceof Object) {
//            return (2);
//        } else if (A instanceof Object) {
//            return (3);
//        } else if (A instanceof Object) {
//            return (4);
//        } else if (A instanceof Object) {
//            return (5);
//        } else if (A instanceof Object) {
//            return (6);
//        }else
//        {
//            return 7;
//        }
//
//    }

    public static void ImprimirFraccionarioymixto(Object[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] instanceof FRACCION) {
                System.out.println((i + 1) + ".-" + ((FRACCION) A[i]).Imprimir());
            } else {
                System.out.println((i + 1) + ".-" + ((Mixto) A[i]).Imprimir());
            }
        }

    }

    public static void SUMAFRACCONARIOSYMIXTO(Object[] A, int N) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] instanceof FRACCION) {
                A[i] = ((FRACCION) A[i]).Suma(N);
            } else {
                A[i] = ((Mixto) A[i]).SumaMixto(N);
            }
        }

    }

    public static void main(String[] args) {
        CIRCULO[] aC1;
        CIRCULO C1;
        TRIANGULO[] aT1;
        Object[] obj1;
        Random rnd;
        rnd = new Random();
        int n;
        n = 7;
        aC1 = new CIRCULO[n];
        aT1 = new TRIANGULO[n];
        obj1 = new Object[n];

        C1 = new CIRCULO();

        for (int i = 0; i < obj1.length; i++) {

            if (i % 7 == 0) {
                obj1[i] = new TRIANGULO(rnd.nextDouble(100), rnd.nextDouble(10),
                        rnd.nextDouble(10), rnd.nextDouble(5), rnd.nextDouble(10),
                        rnd.nextDouble(10));
            } else if (i % 6 == 0) {
                obj1[i] = new RECTANGULO(rnd.nextDouble(100), rnd.nextDouble(10),
                        rnd.nextDouble(10), rnd.nextDouble(5));
            } else if (i % 5 == 0) {
                obj1[i] = new RECTA(rnd.nextDouble(100), rnd.nextDouble(10),
                        rnd.nextDouble(10), rnd.nextDouble(5));
            } else if (i % 4 == 0) {
                obj1[i] = new RECTA(rnd.nextDouble(100), rnd.nextDouble(10),
                        rnd.nextDouble(10), rnd.nextDouble(5));
            } else if (i % 3 == 0) {

                obj1[i] = new ELIPSE(rnd.nextDouble(100), rnd.nextDouble(10),
                        rnd.nextDouble(10), rnd.nextDouble(5));
            } else if (i % 2 == 0) {

                obj1[i] = new CUADRADO(rnd.nextDouble(100), rnd.nextDouble(10),
                        rnd.nextDouble(10));
            } else {

                obj1[i] = new CIRCULO(rnd.nextInt(100), rnd.nextInt(10),
                        rnd.nextInt(500));

            }
        }
        BurbujaObjetos(obj1);
        ImprimirArea(obj1);

        Object[] obj2;
        obj2 = new Object[4];

        for (int i = 0; i < obj2.length; i++) {

            if (i % 2 == 0) {

                obj2[i] = new FRACCION(rnd.nextInt(12), rnd.nextInt(10));
            } else {

                obj2[i] = new Mixto(rnd.nextInt(10), rnd.nextInt(10), rnd.nextInt(50));

            }
        }
        ImprimirFraccionarioymixto(obj2);
        SUMAFRACCONARIOSYMIXTO(obj2, 20);
        ImprimirFraccionarioymixto(obj2);

//        for (int i = 0; i < aC1.length; i++) {
//
//            aC1[i] = new CIRCULO(rnd.nextInt(100), rnd.nextInt(10), rnd.nextInt(500));
//
//        }
//        Imprimir(aC1);
//        for (int i = 0; i < aT1.length; i++) {
//
//            aT1[i] = new TRIANGULO(rnd.nextDouble(100), rnd.nextDouble(10), rnd.nextDouble(10), rnd.nextDouble(5), rnd.nextDouble(10), rnd.nextDouble(10));
//
//        }
//        Imprimir(aT1);
    }
}
