/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeberPOO;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class DeberPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        boolean f = false;

        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Elija la figura que desea sacar el area y perimetro:");
            System.out.println("Ingrese 1 CIRCULO");
            System.out.println("Ingrese 2 CUADRADO");
            System.out.println("Ingrese 3 TRIANGULO");
            System.out.println("Ingrese 4 RECTANGULO");
            System.out.println("Ingrese 5 SALIR");

            opcion = s.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("\tArea y Perimetro Circulo\nIngrese el radio: ");
                    double radio = s.nextDouble();
                    Circulo circulo = new Circulo();
                    System.out.println("Su Area es: " + circulo.AreaCirculo(radio) + " y su perimtro es: " + circulo.PerimetroCirculo(radio)+"\n");
                    break;
                case 2:
                    System.out.print("\tArea y Perimetro Cuadrado\nIngrese el lado: ");
                    double lado = s.nextInt();
                    Cuadrado cuadrado = new Cuadrado();
                    System.out.println("Su Area es: " + cuadrado.AreaCuadrado(lado) + " y su Perimetro es: " + cuadrado.PerimetroCuadrado(lado)+"\n");
                    break;
                case 3:
                    System.out.print("\tArea y Perimetro Triangulo\n");

                    System.out.print("Ingrese la base: ");
                    double b = s.nextInt();
                    System.out.print("Ingrese la altura: ");
                    double h = s.nextInt();
                    Triangulo triangulo = new Triangulo();
                    System.out.println("Su Area es: " + triangulo.AreaTriangulo(h, b) + " y su Perimetro es: " + triangulo.PerimetroTriangulo(h, b)+"\n");
                    break;
                case 4:
                    System.out.print("\tArea y Perimetro rectangulo\n");
                    System.out.print("Ingrese la base: ");
                    double base = s.nextInt();
                    System.out.print("Ingrese la altura: ");
                    double altura = s.nextInt();
                    Rectangulo rectangulo = new Rectangulo();
                    System.out.println("Su Area es: " + rectangulo.AreaRectangulo(base, altura) + " y su Perimetro es: " + rectangulo.PerimetroRectangulo(base, altura)+"\n");
                    break;
                case 5:
                    f = true;
                    break;

            }
        } while (f != true);
    }

    public static double CalcularAreaCirculo(double radio) {
        double area = (Math.PI) * (Math.pow(radio, 2));
        return area;
    }

    public static double CalcularPerimetroCirculo(double radio) {
        double perimetro = (Math.PI) * 2 * radio;
        return perimetro;
    }
}
