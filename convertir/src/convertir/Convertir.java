/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertir;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Convertir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int v = 1, var;
        do {
            System.out.println("Su numero es:\n1 decimal\n2 binario\n3 hexadecimal\n4 Salir ");
            var = s.nextInt();
            switch (var) {
                case 1:

                    System.out.println("Ingrese el numero");
                    int c = s.nextInt();
//String n = s.nextLine();
                    //int c = Integer.parseInt(n);
                    System.out.println("A que desea transformar\n1 A binario\n2 A octal\n3 A hexadecimal\n");
                    var = s.nextInt();
                    switch (var) {
                        case 1:
                            System.out.println("El numero " + c + " a binario es: " + binario(c));
                            break;
                        case 2:
                            System.out.println("El numero " + c + " a octal es: " + octal(c));
                            break;
                        case 3:
                            System.out.println("El numero " + c + " a octal es: " + hexa(c));
                            break;

                    }
                    break;
                case 2:
                    System.out.println("Ingrese el numero");
                    int x = s.nextInt();

                    System.out.println("A que desea transformar\n1 A decimal\n2 A octal\n3 A Hexadecimal");
                    var = s.nextInt();
                    switch (var) {
                        case 1:
                            System.out.println("El numero" + x + " a decimal es: " + binariodecimal(x));
                            break;
                        case 2:
                            System.out.println("El numero " + x + " a octal es: " + octal(binariodecimal(x)));
                            break;
                        case 3:
                            System.out.println("El numero " + x + " a decimal es: " + hexa(binariodecimal(x)));
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el numero");
                    String z = s.next();

                    System.out.println("A que desea transformar\n1 A decimal\n2 A octal\n3 A binario");
                    var = s.nextInt();
                    switch (var) {
                        case 1:
                            System.out.println("El numero" + z + " a decimal es: " + hexaadecimal(z));
                            break;
                        case 2:
                            System.out.println("El numero " + z + " a octal es: " + octal(hexaadecimal(z)));
                            break;
                        case 3:
                            System.out.println("El numero " + z + " a decimal es: " + binario(hexaadecimal(z)));
                            break;
                    }
                    break;

                case 4:
                    v = 0;
            }
            System.out.println("--------------------------");
        } while (v != 0);
    }

    public static String binario(int n) {
        if (n > 0) {
            return binario(n / 2) + n % 2;
        } else {
            return "";
        }

    }

    public static String octal(int n) {
        if (n > 0) {
            return (octal(n / 8) + n % 8);
        } else {
            return "";
        }
    }

    public static String hexa(int n) {
        String hex[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String hexa = "";
        while (n > 0) {

            int rem = n % 16;
            hexa = hex[rem] + hexa;
            n = n / 16;
        }
        return hexa;
    }

    public static int binariodecimal(int n) {
        int e = 0, f;
        int r = 0;
        do {
            f = n % 10;
            r = r + f * (int) Math.pow(2, e);
            e++;
            n = n / 10;

        } while (n > 0);
        return r;
    }

    public static int octaldecimal(int n) {
        int e = 0, f;
        int r = 0;
        do {
            f = n % 10;
            r = r + f * (int) Math.pow(8, e);
            e++;
            n = n / 10;

        } while (n > 0);
        return r;
    }

    public static int hexaadecimal(String n) {

        int r = Integer.parseInt(n, 16);

        return r;
    }

}
