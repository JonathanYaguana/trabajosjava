/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura2;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Factura2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        String unidades[];
        String decenas1[];
        String decenas[];
        String centenas[];

        unidades = new String[]{"uno", "dos", "tres", "cuatro", "cinco",
            "seis", "siete", "ocho", "nueve", "diez"};
        decenas1 = new String[]{"diez", "once", "doce", "trece", "catorce", "quince",
            "diezciseis", "diecisiete", "dieciocho", "diecinueve"};

        decenas = new String[]{"diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta",
            "setenta", "ochenta", "noventa"};

        centenas = new String[]{"ciento", "docientos", "trecientos", "cuatrocientos", "quinientos",
            "seisientos", "setecientos", "ochocientos", "novecientos"};

        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Ingrese el valor a pagar: ");
        a = sc.nextInt();
        System.out.print("Ingrese el valor con que va a pagar: ");
        b = sc.nextInt();
        int num = b - a;

        System.out.print("Su cambio es : " + num+"  (");

        if (num >= 0 && num < 11) {
            System.out.print('\n' + unidades[num]);
        } else if (num < 20) {
            System.out.print('\n' + decenas1[num - 10]);

        } else if (num < 100) {

            int unid = num % 10;
            int dec = num / 10;
            //System.out.println("" + dec);
            if (unid == 0) {
                //System.out.print('\n' + decenas[dec - 2]);
            }

            if (unid != 0) {
                System.out.print('\n' + decenas[dec - 1]
                        + " y " + unidades[unid - 1]);
            }
        } else if (num < 1000) {
            int unit = num % 100;
            unit = unit % 10;
            //System.out.println("" + unit);
            int dec = num / 10;
            dec = dec % 10;
            //System.out.println("" + dec);
            int cent = num / 100;
            //System.out.println("" + cent);

            if (cent != 0 && dec > 1 && unit > 0) {
                System.out.println(centenas[cent - 1] + " " + decenas[dec - 1] + " y " + unidades[unit - 1]);
            }
            if (cent != 0 && dec == 1 && unit != 0) {
                num = num % 10;
                num = num % 10;
                System.out.println("" + centenas[cent - 1] + " " + decenas1[num]);
            }
            if (cent != 0 && dec == 0 && unit != 0) {
                System.out.println("" + centenas[cent - 1] + " " + unidades[unit - 1]);

            }
            if (cent != 0 && dec == 0 && unit == 0) {

                System.out.println("" + centenas[cent - 1]);
            }
            if (cent != 0 && dec != 0 && unit == 0) {

                System.out.println("" + centenas[cent - 1] + decenas[dec - 1]);
            }
        }

        if (num > 999) {
            int unit = num % 1000;
            unit = unit % 10;
            //System.out.println("" + unit);
            int dec = num % 100;
            dec = dec / 10;
            //System.out.println("" + dec);
            int cent = num % 1000;
            cent = cent / 100;
            //System.out.println("" + cent);
            int mil = num / 1000;
            //System.out.println("" + mil);
            if (cent != 0 && dec > 1 && unit > 0) {
                System.out.println(unidades[mil - 1] + "mil " + centenas[cent - 1] + " " + decenas[dec - 1] + " y " + unidades[unit - 1]);
            }
            if (cent == 0 && dec > 1 && unit > 0) {
                System.out.println(unidades[mil - 1] + "mil " + decenas[dec - 1] + " y " + unidades[unit - 1]);
            }
            if (cent != 0 && dec == 1 && unit != 0) {
                num = num % 10;
                num = num % 10;
                System.out.println(unidades[mil - 1] + "mil " + centenas[cent - 1] + " " + decenas1[num]);
            }
            if (cent != 0 && dec == 0 && unit != 0) {
                System.out.println(unidades[mil - 1] + "mil " + centenas[cent - 1] + " " + unidades[unit - 1]);
            }
            if (cent == 0 && dec == 0 && unit == 0) {
                System.out.println("" + unidades[mil-1] + "mil");

            }
            if (cent != 0 && dec == 0 && unit == 0) {

                System.out.println(unidades[mil - 1] + "mil " + centenas[cent - 1]);
            }
            if (cent != 0 && dec != 0 && unit == 0) {

                System.out.println(unidades[mil - 1] + "mil " + centenas[cent - 1] + decenas[dec - 1]);
            }
            if (cent == 0 && dec != 0 && unit == 0) {

                System.out.println(unidades[mil - 1] + "mil " + decenas[dec-1]);
            }
            if (cent == 0 && dec == 1 && unit !=0) {

                System.out.println(unidades[mil - 1] + "mil " + decenas1[unit]);

            }
        }
            System.out.println("--------------------");
        System.out.println("Decea repetir si o no");
    }while(sc.next().toLowerCase().contentEquals("si"));
    }
    }
