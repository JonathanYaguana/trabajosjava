/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author edu_r
 */
public class Matrices {

    private final static String[][] letras = {
        {"A", "B", "C", "D", "E"},
        {"F", "G", "H", "I", "J"},
        {"K", "L", "M", "N", "O"},
        {"P", "Q", "R", "S", "T"},
        {"U", "V", "W", "X", "Y"}
    };

    private final static int[][] numeros = {
        {17, 25, 45, 12, 23},
        {46, 67, 23, 34, 89},
        {68, 50, 34, 65, 78},
        {12, 10, 65, 89, 67},
        {38, 54, 98, 47, 22}
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Diagonales");
        for (int i = 0; i < letras.length; i++) { 
            System.out.print(letras[i][letras.length - (i + 1)] + " ");
        }

        System.out.println("");
        System.out.println("Informacion debajo de la diagonal");

        for (int i = 1; i < letras.length; i++) {
            for (int j = letras.length - i; j < letras.length; j++) {
                System.out.print(letras[i][j] + " ");
            }
        }

        System.out.println("");
        System.out.println("Informacion encima de la diagonal");

        for (int i = 0; i < letras.length - 1; i++) {
            for (int x = 0; x < letras.length - (i + 1); x++) {
                System.out.print(letras[i][x] + " ");
            }
        }

        System.out.println("");
        System.out.println("Promedios");
        for (int i = 0; i < numeros.length; i++) {
            int x = 0;
            for (int j = 0; j < numeros.length; j++) {
                x += numeros[i][j];
            }

            System.out.println("Promedio fila " + (i + 1) + ": " + ((double) x / numeros.length));
        }

        System.out.println("Cambiar orden");
        String[][] newLetras = new String[letras.length][letras.length];

        //Arriba
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras.length; j++) {
                newLetras[i][j] = letras[letras.length - (i + 1)][letras.length - (j + 1)];
            }
            newLetras[i][letras.length - (i + 1)] = letras[i][letras.length - (i + 1)];

            for (int j = 0; j < newLetras.length; j++) {
                System.out.print(newLetras[i][j] + " ");
            }

            System.out.println("");
        }
        for (int i = 0; i < letras.length; i++) {
            System.out.print("" + letras[i][i]);

        }
        int a = 0;
        int b = 1;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - (i + 1); j++) {
                b = a + b;
                a = b - a;
                numeros[i][j] = a;

                System.out.print(" " + numeros[i][j]);
            }
        }
        System.out.println("");
        for (int i = 0; i < newLetras.length; i++) {
            for (int j = 0; j < newLetras.length; j++) {

                System.out.print(" " + numeros[i][j]);
            }
        }

    }

}
