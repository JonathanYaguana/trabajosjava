/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author ejreyesp
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double radio, l, a, b;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero correspondiente a la figura que desea sacar el area y perimetro:");
        System.out.println("Ingrese 1 CIRCUNFERENCIA");
        System.out.println("Ingrese 2 TRIANGULO");
        System.out.println("Ingrese 3 CUADRADO");
        System.out.println("Ingrese 4 RECYANGULO");
        System.out.println("\nIngrese el numero");
        int opcion;
        opcion = s.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("CIRCULO \nQue decea Calcular:");
                System.out.println("1.Area\n2.Perimetro\nIngrese la opcion deceada ");
                opcion = s.nextInt();
                if (opcion == 1) {
                    System.out.println("Area del Circulo \nIngre el valor del radio");
                    radio = s.nextDouble();
                    double respuesta = AREACIRCULO(radio);
                    System.out.println("El area de la circunferencia es : " + respuesta);

                }
                if (opcion == 2) {
                    System.out.println("Perimetro del Circulo \n Ingre el valor del radio");
                    radio = s.nextDouble();
                    double respuesta = PERIMETROCIRCULO(radio);
                    System.out.println("El perimetro de la circunferencia es : " + respuesta);
                }
                break;

            case 2:
                System.out.println("TRIANGULO");
                System.out.println("1.Area\n2.Perimetro\nIngrese Opcion:");
                opcion = s.nextInt();
                if (opcion == 1) {
                    System.out.println("Area del Triangulo escaleno \n Ingre el valor de un lado");
                    l = s.nextDouble();
                    double respuesta = AREATRIANGULOEQUILATERO(l);
                    System.out.println("El area del triangulo escaleno es : " + respuesta);

                }
                if (opcion == 2) {
                    System.out.println("Perimetro del Triangulo escaleno \n Ingre el valor de un lado");
                    l = s.nextDouble();
                    double respuesta = PERIMETROTRIANGULOEQUILATERO(l);
                    System.out.println("El perimetro del triangulo escaleno es : " + respuesta);
                }
                break;

            case 3:
                System.out.println("CUADRADO");
                System.out.println("1.Area\n2.Perimetro\nIngrese Opcion ");
                opcion = s.nextInt();
                if (opcion == 1) {
                    System.out.println("Area del Cuadrado \n Ingre el valor del lado");
                    l = s.nextDouble();
                    AREACUADRADO(l);
                }
                if (opcion == 2) {
                    System.out.println("Perimetro del Cuadrado");
                    System.out.println("Ingre el valor del lado");
                    l = s.nextDouble();
                    PERIMETROCUADRADO(l);
                }
                break;

            case 4:
                System.out.println("RECTANGULO");
                System.out.println("1.Area\n2.Perimetro\nIngrese Opcion ");
                opcion = s.nextInt();
                if (opcion == 1) {
                    System.out.println("Area del Rectangulo \n Ingres el valor la base:");
                    b = s.nextDouble();
                    System.out.println("Ingres el valor la altura:");
                    a = s.nextDouble();
                    AREARECTANGULO(a, b);
                }
                if (opcion == 2) {
                    System.out.println("Perimetro del Rectangulo \n Ingres el valor la base:");
                    b = s.nextDouble();
                    System.out.println("Ingres el valor la altura:");
                    a = s.nextDouble();
                    PERIMETRORECTANGULO(a, b);
                }
                break;
            default:
                System.err.println("ERROR!Ingrese la opcion correcta");

        }
    }

    public static double PERIMETROCIRCULO(double radio) {
        double pr = Math.PI * radio * 2;
        return pr;
    }

    public static double AREACIRCULO(double radio) {
        double ar = Math.PI * radio * radio;
        return ar;
    }

    public static double PERIMETROTRIANGULOEQUILATERO(double l) {
        double pr = l + l + l;
        return pr;
    }

    public static double AREATRIANGULOEQUILATERO(double l) {
        double ar = (Math.sqrt(3) / 2) * l * l;
        return ar;
    }

    public static void PERIMETROCUADRADO(double l) {
        double pr = 4 * l;
        System.out.println("El perimetro del Cuadrado es:" + pr);
    }

    public static void AREACUADRADO(double l) {
        double ar = l * l;
        System.out.println("El area del Cuadrado es:" + ar);
    }

    public static void PERIMETRORECTANGULO(double a, double b) {
        double pr = b * a;
        System.out.println("El perimetro del Rectangulo es:" + pr);
    }

    public static void AREARECTANGULO(double a, double b) {
        double ar = (b * 2) + (a * 2);
        System.out.println("El area del Rectangulo es:" + ar);
    }
}
