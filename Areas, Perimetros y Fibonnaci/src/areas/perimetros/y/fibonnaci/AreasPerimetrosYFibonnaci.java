/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas.perimetros.y.fibonnaci;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class AreasPerimetrosYFibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c, d = 3.1416;
        int opcion, i, j, k, l;
do{
        Scanner s = new Scanner(System.in);
        System.out.println("Elija la figuara que desea sacar el area y perimetro:");
        System.out.println("Ingrese 1 CIRCUNFERENCIA");
        System.out.println("Ingrese 2 TRIANGULO");
        System.out.println("Ingrese 3 CUADRADO");
        System.out.println("Ingrese 4 RECYANGULO");
        System.out.println("Ingrese 5 PIRAMIDE REGULAR");
        System.out.println("Ingrese 6 CILINDRO");
        System.out.println("Ingrese 7 si desea obtner le serie de fibonnaci");
        opcion = s.nextInt();
        if (opcion == 1) {
            System.out.println("Area y Perimetro de la circunferencia");
            System.out.println("Ingres el valor del radio");
            a = s.nextDouble();
            double area = d * a * a;
            double perimetro = 2 * d * a;
            System.out.println("El area de la circunferencia es : " + area);
            System.out.println("El perimetro de la circunferencia es : " + perimetro);
        }

        if (opcion == 2) {
            System.out.println("El Triangulo es: 1 Equilátero 2 Isoceles 3 Escaleno ");
            opcion = s.nextInt();
            if (opcion == 1) {
                System.out.println("Triangulo Equilatero");
                System.out.println("Ingrese el valor de un lado a");
                a = s.nextDouble();
                double area = (Math.sqrt(3) / 2) * a * a;
                double perimetro = a + a + a;
                System.out.println("El Area de un TRIANGULO  es :  " + area);
                System.out.println("El Perimetro del TRIANGULO  es  : " + perimetro);
            }
            if (opcion == 2) {
                System.out.println("TRIANGULO  Isoceles");
                System.out.println("Ingrese el valor de uno de los lados igusles: ");
                a = s.nextDouble();
                System.out.println("Ingrese el valor de un lado desigual: ");
                b = s.nextDouble();
                double area = (b * Math.sqrt(a * a - b * b / 4)) / 2;
                double perimetro = 2 * a + b;
                System.out.println("El Area de un TRIANGULO  es :  " + area);
                System.out.println("El Perimetro del TRIANGULO  es  : " + perimetro);
            }
            if (opcion == 3) {
                System.out.println("Triangulo Escaleno");
                System.out.println("Ingrese el valor del lado a: ");
                a = s.nextDouble();
                System.out.println("Ingrese el valor del lado b: ");
                b = s.nextDouble();
                System.out.println("Ingrese el valor del lado c: ");
                c = s.nextDouble();
                double se = (a + b + c) / 2;
                double area = Math.sqrt(se * (se - a) * (se - b) * (se - c));
                double perimetro = a + b + c;
                System.out.println("El Area de un TRIANGULO es :  " + area);
                System.out.println("El Perimetro del TRIANGULO  es  : " + perimetro);
            }
        }

        if (opcion == 3) {
            System.out.println("Area y perimetro de un Cuadrado");
            System.out.println("Ingrese el valor de un lado a");
            a = s.nextDouble();
            double area = (a * a);
            double perimetro = a + a + a;
            System.out.println("El Area de un Triangulo es :  " + area);
            System.out.println("El Perimetro del triangulo es  : " + perimetro);
        }
        if (opcion == 4) {
            System.out.println("Area y perimetro de un Rectangulo");
            System.out.println("Ingrese el valor de un lado a");
            a = s.nextInt();
            System.out.println("Ingrese el valor de un lado b");
            b = s.nextDouble();
            double area = (a * b);
            double perimetro = 2 * a + 2 * b;
            System.out.println("El Area del rectangulo es :  " + area);
            System.out.println("El Perimetro del RECTANGULO es  : " + perimetro);
        }
        if (opcion == 5) {
            System.out.println("Area de una PIRAMIDE REGULAR");
            System.out.println("Ingrese el numero de lados");
            a = s.nextInt();
            System.out.println("Ingrese el valor de un lado ");
            b = s.nextDouble();
            System.out.println("Ingrese el apotema de la base");
            c = s.nextInt();
            System.out.println("Ingrese el apotema de la piramide ");
            d = s.nextDouble();
            double area = ((a * b) / 2) * (c + d);
            System.out.println("El Area de la PIRAMIDE es :  " + area);
        }
        if (opcion == 6) {
            System.out.println("Area de un CILINDRO");
            System.out.println("Ingrese el radio");
            a = s.nextInt();
            System.out.println("Ingrese la altura");
            b = s.nextDouble();
            double area = (2 * d) * a * (a + b);
            System.out.println("El Area de la PIRAMIDE es :  " + area);
        }
        if (opcion == 7) {
            System.out.print("Introduce la posicion deceada: ");
        
        l = s.nextInt();

        System.out.println("Los " + l + " primeros términos de la serie de Fibonacci son:");
        j = 0;
        k = 1;

        System.out.print(" " + j);
        for (i = 2; i <= l; i++) {
            System.out.print(", " + j);
            k = j + k;
            j = k - j;
        }
        }
        System.out.println();
} while (opcion==1);
    }
}
