/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerodecedula;

import java.util.Scanner;

/**
 *
 * @author bp2do
 */
public class Numerodecedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int[][] D = new int[3][3];
        int[][] M = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int u, d, m, c, mm, suma;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese los numeros del array");

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese los numeros en la posicion " + (i + 1) + ": ");
            A[i] = s.nextInt();

        }
        System.out.println("Su array es: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(A[i] + "\t");
        }
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                B[i] = (int) Math.pow(A[i], 2);

            } else {
                B[i] = (int) Math.pow(A[i], 3);

            }

        }
        System.out.println("\nSu serie es: ");
        for (int j = 0; j < 10; j++) {
            System.out.print(B[j] + "\t");
        }
        for (int i = 0; i < A.length; i++) {
            suma = 0;
            while (B[i] > 0) {
                suma += B[i] % 10;
                B[i] = B[i] / 10;
            }
            while (suma > 9) {
                suma -= 9;
            }
            C[i] = suma;
        }

        System.out.println("\nSu nueva matriz es: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(C[i] + "\t");

        }
        for (int z = 0; z < 10; z++) {

            for (int x = 0; x < D.length; x++) {
                for (int y = 0; y < D.length; y++) {
                    D[x][y] = C[z] * (M[x][y]);
                }
            }

            System.out.println("\nMultiplicacion *  "+C[z]);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    System.out.print(D[i][j] + "\t");
                }
                System.out.println("");
            }
        }
    }

}
