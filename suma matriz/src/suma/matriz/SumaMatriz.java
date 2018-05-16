/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.matriz;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class SumaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int su = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la dimencion del la matriz cuadrada A : ");
        int a = s.nextInt();

        int[][] A = new int[a][a];
        int[][] B = new int[a][a];
        int[][] C = new int[a][a];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print("Ingrese el elemento de la posicion[" + i + "]" + " [" + j + "] = ");
                int b = s.nextInt();
                A[i][j] = b;
            }

        }
        System.out.println("Su matriz A " + a + " * " + a + " es : ");
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + "\t");

            }
            System.out.println("");
        }

        for (int i = 0; i < A.length; i++) {

            su = su + A[i][i];
        }
        System.out.println("la suma de su diagonal principal es " + su);

        su = 0;
        
        for (int i = 0; i < A.length; i++) {
            su=su +(A[i][A.length - (i + 1)]);
        }
        System.out.println("la suma de su diagonal secundaria es " + su);
        su=0;
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                //System.out.println(" " + A[i][j]);
                su = su + A[i][j];
            }
        }
        System.out.println("la suma de los elementos bajo la diagonal principal es : " + su);
        su = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                su = su + A[i][j];
                // System.out.print(" " + A[i][j]);
            }
        }

        System.out.println("la suma de los elementos sobre la diagonal principal es : " + su);

        System.out.println("\nIngrese los elementos de la matriz cuadrada B : ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print("Ingrese el elemento de la posicion[" + i + "]" + " [" + j + "] = ");
                int b = s.nextInt();
                B[i][j] = b;

            }

        }
        System.out.println("Su matriz B " + a + " * " + a + " es : ");
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                System.out.print(B[i][j] + "\t");

            }
            System.out.println("");
        }
        System.out.println("Multiplicacion de A*B es: ");

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {

                for (int z = 0; z < B[0].length; z++) {
                    C[i][j] = C[i][j] + A[i][z] * B[z][j];
                }

                System.out.print(C[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
