/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdfsdf;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Sdfsdf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[] = {5, 6, 7, 8, 9, 10, 11, 12};

        int pinicial = 0, pfinal = A.length - 1, pcentral = 0;
        boolean encontrado = false;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la psicion a buscar ");
        int num = s.nextInt();
        while (!encontrado && pinicial <= pfinal) {
            pcentral = (pinicial + pfinal) / 2;
            if (num == A[pcentral]) {
                encontrado = true;
            } else if (num < A[pcentral]) {
                pfinal = pcentral - 1;
            } else {
                pinicial = pcentral + 1;
            }
        }
        if (encontrado) {
            System.out.println("" + pcentral);
        } else {
            System.out.println("no se encotro");
        }

    }

}
