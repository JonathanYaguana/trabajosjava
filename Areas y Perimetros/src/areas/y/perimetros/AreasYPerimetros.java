/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas.y.perimetros;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class AreasYPerimetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c, d = 3.1416;
        int opcion;

        Scanner ap = new Scanner(System.in);

        System.out.println("Ingrese 1 Si desea calcular el area y perimetro de una circunferencia");

        System.out.println("Ingrese 2  Si desea calcular el area y perimetro de un Triangulo");

        opcion = ap.nextInt();
        if (opcion == 1) {
            System.out.println("Area y Perimetro de la circunferencia");
            System.out.println("Ingres el valor del radio");
            a = ap.nextInt();
            double area = d * a * a;
            double perimetro = 2 * d * a;
            System.out.println("El area de la circunferencia es : " + area);
            System.out.println("El perimetro de la circunferencia es : " + perimetro);
        }
        if (opcion == 2) {
            System.out.println("Area y perimetro de un Triangulo Rectangulo");
            System.out.println("Ingrese el valor de un lado a");
            a = ap.nextInt();
            System.out.println("ingresealor el valor de un lado b");
            b = ap.nextInt();
            System.out.println("ingresealor el valor de un lado c");
            c = ap.nextInt();
            double area = (a * b) / 2;
            double perimetro = a + b + c;
            System.out.println("El Area de un Triangulo es :  " + area);
            System.out.println("El Perimetro del triangulo es  : " + perimetro);
        }
    }
}
