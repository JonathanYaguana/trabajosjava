/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r = 1;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("\nSelecciones la opcion que desea: \n1. Serie Fibonacci\n2. Factorial de un numero\n3. Torre de hanoi\n4. Salir");
            int a = s.nextInt();
            switch (a) {
                case 1:
                    System.out.print("\n----Serie Fibonacci----\n Ingrese cuantos numeros decea: ");
                    int n = s.nextInt();
                    System.out.println("Los " + n + " primeros numeros de la serie son:");
                    for (int i = 1; i <= n; i++) {
                        System.out.print(" " + fib(i));
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("\n-----Factorial-----\n Ingrese el numero: ");
                    int f = s.nextInt();
                    System.out.println("El factorial de " + f + " es: " + fac(f) + "\n");
                    break;
                case 3:
                    System.out.print("\n-----Torre de hanoi-----\n Ingres el numero de discos: ");
                    
                    n = s.nextInt();
                    Hanoi(n, 'A', 'B', 'C');
                    break;
                case 4:
                    r = 4;
            }
        } while (r != 4);

    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fac(int f) {
        if (f == 0) {
            return 1;
        } else {
            return f * (fac(f - 1));
        }

    }

    public static void Hanoi(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("mover el disco de " + origen + " a " + destino);
        } else {
            Hanoi(n - 1, origen, destino, auxiliar);
            System.out.println("mover el disco de " + origen + " a " + destino);
            Hanoi(n - 1, auxiliar, origen, destino);
        }
    }
}
