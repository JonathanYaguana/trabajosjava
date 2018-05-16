/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranformacion.binario;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class TranformacionBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingres el numero");
        String n = s.nextLine();
        int c = Integer.parseInt(n);
        while (c != 0) {
            r = c % 2 + (r);
            c = c / 2;

            System.out.println(r);
        }
    }

}
