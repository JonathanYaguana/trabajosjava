/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesyprocedimientos;

import java.util.Scanner;

/**
 *
 * @author ejreyesp
 */
public class Funcionesyprocedimientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio, l, a, b;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero correspondiente a la figura que desea sacar el area y perimetro:");
        System.out.println("1 CIRCUNFERENCIA");
        System.out.println("2 TRIANGULO");
        System.out.println("3 CUADRADO");
        System.out.println("4 RECTANGULO");
        System.out.println("Ingrese la opcion deceada");
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
                    double respuesta = ACIRCULO(radio);
                    System.out.println("El area de la circunferencia es : " + respuesta);

                }
                if (opcion == 2) {
                    System.out.println("Perimetro del Circulo \n Ingre el valor del radio");
                    radio = s.nextDouble();
                    double respuesta = PCIRCULO(radio);
                    System.out.println("El perimetro de la circunferencia es : " + respuesta);
                }
                break;

            case 2:
                System.out.println("TRIANGULO\nQue decea Calcular:");
                System.out.println("1.Area\n2.Perimetro\nIngrese Opcion:");
                opcion = s.nextInt();
                if (opcion == 1) {
                    System.out.println("Area del Triangulo escaleno \n Ingre el valor de un lado");
                    l = s.nextDouble();
                    double respuesta = ATRIANGULO(l);
                    System.out.println("El area del triangulo escaleno es : " + respuesta);

                }
                if (opcion == 2) {
                    System.out.println("Perimetro del Triangulo escaleno \n Ingre el valor de un lado");
                    l = s.nextDouble();
                    double respuesta = PTRIANGULO(l);
                    System.out.println("El perimetro del triangulo escaleno es : " + respuesta);
                }
                break;

            case 3:
                System.out.println("CUADRADO\nQue decea Calcular:");
                System.out.println("1.Area\n2.Perimetro\nIngrese Opcion ");
                opcion = s.nextInt();
                if (opcion == 1) {
                    System.out.println("Area del Cuadrado \n Ingre el valor del lado");
                    l = s.nextDouble();
                    ACUADRADO(l);
                }
                if (opcion == 2) {
                    System.out.println("Perimetro del Cuadrado");
                    System.out.println("Ingre el valor del lado");
                    l = s.nextDouble();
                    PCUADRADO(l);
                }
                break;

            case 4:
                System.out.println("RECTANGULO\nQue decea Calcular:");
                System.out.println("1.Area\n2.Perimetro\nIngrese Opcion ");
                opcion = s.nextInt();
                if (opcion == 1) {
                    System.out.println("Area del Rectangulo \n Ingres el valor la base:");
                    b = s.nextDouble();
                    System.out.println("Ingres el valor la altura:");
                    a = s.nextDouble();
                    ARECTANGULO(a, b);
                }
                if (opcion == 2) {
                    System.out.println("Perimetro del Rectangulo \n Ingres el valor la base:");
                    b = s.nextDouble();
                    System.out.println("Ingres el valor la altura:");
                    a = s.nextDouble();
                    PRECTANGULO(a, b);
                }
                break;
            default:
                System.out.println("Opcion Equivocada");

        }
    }

    public static double PCIRCULO(double radio) {       //funcion perimetro del circulo
        double pr = Math.PI * radio * 2;
        return pr;
    }

    public static double ACIRCULO(double radio) {       //funcion area del circulo
        double ar = Math.PI * radio * radio;
        return ar;
    }

    public static double PTRIANGULO(double l) {         //funcion perimetro triangulo
        double pr = l + l + l;
        return pr;
    }

    public static double ATRIANGULO(double l) {         //funcion area triangulo
        double ar = (Math.sqrt(3) / 2) * l * l;
        return ar;
    }

    public static void PCUADRADO(double l) {            //procedimiento perimetro cuadrado
        double pr = 4 * l;
        System.out.println("El perimetro del Cuadrado es:" + pr);
    }

    public static void ACUADRADO(double l) {            //procedimiento area cuadrado
        double ar = l * l;
        System.out.println("El area del Cuadrado es:" + ar);
    }

    public static void PRECTANGULO(double a, double b) {        //procedimeinto perimetro recatangulo
        double pr = b * a;
        System.out.println("El perimetro del Rectangulo es:" + pr);
    }

    public static void ARECTANGULO(double a, double b) {        //procedimiento area rectangulo
        double ar = (b * 2) + (a * 2);
        System.out.println("El area del Rectangulo es:" + ar);
    }
}
