/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author bp2do
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int var, a, b, c, may = 0, n, t = 0,s=1;
        do {
        System.out.println("Ingrese la opcion que desea realizar\n1. Verificar el mayor de tres numeros\n2. verificar si un numero es perfecto\n3. Salir ");
        var = sc.nextInt();
        
        switch (var) {
            case 1:
                System.out.println("El mayor de 3 numeros");
                System.out.println("Ingrese el primer numero");
                a = sc.nextInt();
                System.out.println("Ingrese el segundo numero");
                b = sc.nextInt();
                System.out.println("Ingrese el tercer numero");
                c = sc.nextInt();

                if (a >= b && a >= c) {
                    may = a;
                
                }
                if (b >= a && b >= c) {
                    may = b;
                   
                }
                if (c >= a && c >= b) {
                    may = c;
                   
                }
 System.out.println("El mayor es:" + may);
                if (a == b && b == c) {
                    System.out.println("Los numeros son iguales");
                }
System.out.println("");
                break;

            case 2:
                System.out.println("Numero perfecto");
                System.out.println("Ingrese el numero");
                n = sc.nextInt();
                for (int i = 1; i < n; i++) {
                    double d = n % i;
                    if (d == 0) {
                        t = t + i;
                    }
                }
                if (t == n) {

                    System.out.println("El numero es perfecto\n");
                } else {
                   
                    System.out.println("El numero no es perfecto\n");
                }
                t=0;
            break;
            case 3:
                s=0;
                
        }

    }while(s!=0);
                }
}
