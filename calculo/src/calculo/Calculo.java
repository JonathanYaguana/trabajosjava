/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Calculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingres el limite");
        double l = s.nextDouble();
        System.out.println("Ingres el intervalo");
        double k = s.nextDouble();
        
        double suma = 0;

        double i = l / k;
        double a = (i / 2.0) * -1;

// TODO code application logic here
        while (a > -l) {
            //System.out.println(""+a); 
            suma = suma + (Math.pow(Math.E, a));

            a = a - i;

        }
        System.out.println("" + suma * i);
        System.out.println("");

    }

}
