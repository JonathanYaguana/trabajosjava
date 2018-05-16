/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

import java.util.Scanner;

/**
 *
 * @author Edison
 */
public class Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int op;
        do {

            System.out.println("\n------------------------------------------------------------\n");
            System.out.println("Escoja la figura que decee para sacar el area y perimetro");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Triangulo Rectangulo");
            System.out.println("3.- Circulo");
            System.out.println("4.- Rectangulo");
            System.out.println("0.- Salir");
            System.out.print("Ingrese opcion: ");
            op = s.nextInt();
            switch (op) {
                case 1:
                    System.out.println("1.- Cuadrado");
                    System.out.println("Ingrese:");
                    System.out.print("Escribe el lado: ");
                    double l = s.nextInt();
                    Cuadrado c = new Cuadrado();
                    System.out.println("Su Area es: " + c.AreaC(l));
                    System.out.println("Su Perimetro es: " + c.PerimetroC(l));
                    break;
                case 2:
                    System.out.println("2.- Triangulo Rectangulo");
                    System.out.println("Ingrese:");
                    System.out.print("Escribe la base: ");
                    double b = s.nextInt();
                    System.out.print("Escribe la altura: ");
                    double a = s.nextInt();
                    TrianguloR t = new TrianguloR();
                    System.out.println("Su Area es: " + t.AreaT(a, b));
                    System.out.println("Su Perimetro es: " + t.PerimetroT(a, b));
                    break;
                case 3:
                    System.out.println("3.- Circulo");
                    System.out.println("Ingrese:");
                    System.out.print("Escribe el radio: ");
                    double r = s.nextInt();
                    Circulo ci= new Circulo();
                    System.out.println("Su Area es: " + ci.AreaCi(r));
                    System.out.println("Su Perimetro es: " + ci.PerimetroCi(r));
                    break;
                case 4:
                    System.out.println("4.- Rectangulo");
                    System.out.println("Ingrese:");
                    System.out.print("Escribe la base: ");
                    double br = s.nextInt();
                    System.out.print("Escribe la altura: ");
                    double ar = s.nextInt();
                    Rectangulo re = new Rectangulo();
                    System.out.println("Su Area es: " + re.AreaR(br, ar));
                    System.out.println("Su Perimetro es: " + re.PerimetroR(br, ar));
                    break;
                case 0:
                    System.out.println("Fin del programa ");
                    break;
                default:
                    System.err.println("Opcion no encontrada");
                    System.err.println("Ingrese de nuevo");
            }

        } while (op != 0);
    }
}
