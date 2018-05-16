/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Serie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j = 1, k = 2, suma = 0, n, a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos elementos decea que sea la serie: ");
        n = sc.nextInt();
        System.out.println("Su serie es: \n");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "   ");
        }
        System.out.println("\n___________________\n");

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) {
                //System.out.print(" "+i);
                //System.out.print(k + "  ");
                int s = (int) Math.pow(i, k);

                System.out.print(s + "  ");
                k = k + 2;
                
            } else {
                //System.out.println("" + i);
                //System.out.print(j + "  ");

                int s = (int) Math.pow(i, j);
                j = j + 2;
                System.out.print(s + "  ");
                
            }

        }
        

        System.out.println("\n\n---  Serie fibonaci --- ");
        System.out.print("Introduce la posicion deceada: ");

        int l = sc.nextInt();

        System.out.println("Los " + l + " primeros términos de la serie de Fibonacci son:");
        a = 0;
        b = 1;

        for (int i = 1; i <= l; i++) {
            System.out.print(a + "   ");

            b = a + b;
            a = b - a;
        }

        System.out.println("\n------------");
        a = 0;
        b = 1;
        int x = 3;
        int y = 2;
        System.out.print("" + a);
        for (int i = 1; i < l; i++) {
            b = a + b;

            a = b - a;
            if (i % 2 == 1) {
                int s = ((int) Math.pow(a, x)) * -1;
                System.out.print(" " + s);
                suma=suma+s;
            } else {
                int s = (int) Math.pow(a, y);
                System.out.print(" + " + s);
                suma=suma +s;
            }
        }
        System.out.println("\nLa suma de la serie es: "+suma);
    }
}
