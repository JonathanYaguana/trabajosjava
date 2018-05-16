/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosparalelos;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class ArreglosParalelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de paralelos");
        c = sc.nextInt();
        int s = 0;
        String a[] = new String[c];
        int b[] = new int[c];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese el nombre del paraleo ");
            a[i] = sc.next();
            System.out.println("Ingrese el numero de estudiantes");
            b[i] = sc.nextInt();
            s = s + b[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " " + b[i]);
        }
        System.out.println("El numero de estudiantes es "+ s);
    }  
    }
