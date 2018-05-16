/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglobinario;

import java.util.Scanner;

/**
 *
 * @author Edison
 */
public class Arreglobinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] s = new int[10];
        int[] e = new int[10];
        int a = 0, b = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese numero[" + (i + 1) + "]: ");
            s[i] = sc.nextInt();
        }
        for (int i = 0; i < s.length; i++) {
            if (i % 2 == 0) {
                s[i] = (int) Math.pow(s[i], 2);
            } else {
                s[i] = (int) Math.pow(s[i], 3);
            }
        }
        System.out.println("Primer arreglo elevada a la potencia:");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + ", ");
        }
        System.out.println("\nSegundo arreglo numeros menores a 10:");
        for (int i = 0; i < s.length; i++) {
            a = 0;
            while (s[i] > 0) {
                a = a + s[i] % 10;
                s[i] = s[i] / 10;
            }
            while (a > 9) {
                a -= 9;
            }
            e[i] = a;
        }
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + ", ");
        }
        System.out.println("\n");
        while (b < 10) {
            System.out.println("El numero " + e[b] + " por la matriz identidad");
            int[][] d = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
            System.out.println("(" + e[b] + ") X ");
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d.length; j++) {
                    System.out.print("      " + d[i][j]);
                }
                System.out.println("");
            }
            System.out.println("     = ");
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d.length; j++) {
                    d[i][j] = d[i][j] * e[b];
                    System.out.print("      " + d[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
            b++;
        }
    }
}
