/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class SUMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma = 0;
        int n;
        int Mayor = 0;
        int menor = 0;
        double promedio = 0;
        System.out.println("Calcular : a.- La sumatoria,   b.- El promedio,   c.- El mayor y menor, de un conjunto de  numeros");
        System.out.println("¿Cuantos numeros desea calcular?  ");
        n = s.nextInt();
        int numeros[] = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero " + '[' + i + ']' + "=");
            numeros[i] = s.nextInt();
            suma = suma + numero[i];
            contador++;
            promedio = suma / contador;
            if (numeros[i] < Mayor) {
                Mayor = numero[i];
            }
            if (numeros[i] > menor) {
                menor = numeros[i];
            }
        };
        System.out.println("a.- La sumatoria es:  " + suma);
        System.out.println("b.- El promedio es:  " + promedio);
        System.out.println("c.-El mayor es:  " + Mayor);
        System.out.println("    El menor es:  " + menor);
    }
}
