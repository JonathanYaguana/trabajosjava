/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo.bidimencional;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class ArregloBidimencional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("[" + i + "] [" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Tabla 1");
        for (int i = 0; i < a.length; i++) {
            System.out.println("");
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
        }
    }

}
