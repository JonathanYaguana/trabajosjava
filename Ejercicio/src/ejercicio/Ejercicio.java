/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int posicion, a, b, i;
        System.out.print("Introduce la posicion deceada: ");
        posicion = s.nextInt();

        System.out.println("Los " + posicion + " primeros términos de la serie de Fibonacci son:");
        a = 0;
        b = 1;

        System.out.print(" " + a);
        for (i = 2; i <= posicion; i++) {
            System.out.print(", " + b);
            b = a + b;
            a = b - a;
        }
        System.out.println();
    }
}
