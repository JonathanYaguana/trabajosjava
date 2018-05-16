/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calcular el producto de un conjunto de numeros: ");
        Scanner s = new Scanner(System.in);
        int producto = 1;
        int arreglobi[][] = new int[3][3];
        arreglobi[0][0] = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("El elemento:  " + '[' + i + ']' + '[' + j + ']');
                arreglobi[i][j] = s.nextInt();
                producto = producto * arreglobi[i][j];
            }
            System.out.println("El producto es: " + producto);
        }
    }
}
