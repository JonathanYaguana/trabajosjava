/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a,p=3.14;
        Scanner ap = new Scanner(System.in);
        System.out.println("Area y Perimetro de la circunferencia");
            System.out.println("Ingres el valor del radio");
            a = ap.nextInt();
            double area = p * a * a;
            double perimetro = 2 * p * a;
            System.out.println("El area de la circunferencia es : " + area);
            System.out.println("El perimetro de la circunferencia es : " + perimetro);
    }
    }
