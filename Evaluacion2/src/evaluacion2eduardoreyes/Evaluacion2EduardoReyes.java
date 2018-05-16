/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion2eduardoreyes;

import java.util.Scanner;

/**
 *
 * @author b2do
 */
public class Evaluacion2EduardoReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[] = new int[4];
        int C[][] = new int[4][4];
        int cont = 0;
        String B[][] = {{"A", "2", "C", "F"}, {"2", "F", "G", "6"}, {"S", "a", "2", "x"}, {"1", "s", "j", "f"}};
        Scanner s = new Scanner(System.in);
        System.out.println("Ingres los elementos del array A");

        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]= ");

            A[i] = s.nextInt();
        }
        System.out.println("Su array A es : ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "\t");
        }

        System.out.println("\nLos elementos del array B son:");
        for (int i = 0;
                i < B.length;
                i++) {
            for (int j = 0; j < B.length; j++) {

                System.out.print(B[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("La multiplicacion de A * B");

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print("( ");
                for (int k = 0; k < B[0].length; k++) {

                    System.out.print("(" + A[i] + " * " + B[j][k] + ")" + " + ");
                }
                System.out.print(" )   ");

            }
            System.out.println("");
        }
        System.out.println("\n");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print("( ");
                for (int k = 0; k < B[0].length; k++) {

                    System.out.print("(");
                    if (B[i]) {

                        while (A[i] != cont) {

                            System.out.print(B[j][k]);
                            cont++;
                        }
                    }
                    System.out.print(")");
                    cont = 0;

                }
                System.out.print(" )   ");

            }
            System.out.println("");
        }

    }

}
