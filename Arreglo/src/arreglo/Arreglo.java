/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j, aux;
        Scanner sc = new Scanner(System.in);
        int s = 0, a, mayor = 0, menor = 0;
        double p = 0;
        System.out.println("Ingrese la dimencion del arreglo");
        a = sc.nextInt();
        int arreglo[] = new int[a];
        int A[] = new int[a];

        for (int k = 0; k < A.length; k++) {
            
            System.out.println("Ingrese el elemento" + '[' + k + ']');
            A[k] = sc.nextInt();
        }

        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    
        for (int k = 0; k < A.length; k++) {
            System.out.println("" +A[k]);
            
        }
    }
}
