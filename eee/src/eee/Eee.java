/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eee;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Eee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 1;
        int cont = 0;

        System.out.println("Ingrese el limite");
        int lim = sc.nextInt();
        while (cont != lim) {

            if (esPar(num)) {
                System.out.println(num);
                cont++;
            }
            num++;
        }

    }

    static boolean esPar(int numero) {

        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
