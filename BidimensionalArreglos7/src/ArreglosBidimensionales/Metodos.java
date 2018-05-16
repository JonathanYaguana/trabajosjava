package ArreglosBidimensionales;

import java.util.Scanner;

public class Metodos {

    public static void MayorMenorF() {
        int fila, columna;
        int aux = 0;
        Scanner lct = new Scanner(System.in);

        fila = 5;
        columna = 5;
        int datos3[][] = {{1, 2, 3, 5, 4},
                          {3, 5, 1, 4, 2},
                          {4, 1, 5, 2, 3},
                          {2, 3, 4, 1, 5},
                          {5, 4, 2, 3, 1}};
       
        for (int i = 0; i < fila; i++) {
            for (int c = 0; c < columna; c++) {
                for (int j = 0; j < fila; j++) {
                    for (int k = 0; k < columna; k++) {
                        if (datos3[k][c] > datos3[k][k]) {
                            aux = datos3[k][c];
                            datos3[k][c] = datos3[k][k];
                            datos3[k][k] = aux;
                        }
                    }
                }
            }
        }
        System.out.print("-----" + "\n");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(datos3[i][j] + " ");
            }
            System.out.print(" " + "\n");
        }

    }

    public static void MenorMayorF() {
        Scanner lct = new Scanner(System.in);
        int fila, columna;
        int aux = 0;
fila = 5;
        columna = 5;
        int datos3[][] = {{1, 2, 3, 5, 4},
        {3, 5, 1, 4, 2},
        {4, 1, 5, 2, 3},
        {2, 3, 4, 1, 5},
        {5, 4, 2, 3, 1}};

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                for (int k = 0; k < fila; k++) {
                    for (int l = 0; l < columna; l++) {
                        if (datos3[k][l] < datos3[k][l]) {
                            aux = datos3[k][l];
                            datos3[k][l] = datos3[k][l];
                            datos3[k][l] = aux;
                        }
                    }
                }
            }
        }
        System.out.print("-----" + "\n");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(datos3[i][j] + " ");
            }
            System.out.print(" " + "\n");
        }
    }

    public static void MayorMenorC() {
        
        int fila, columna;
        int aux = 0;
         fila = 5;
        columna = 5;
        int datos3[][] = {{1, 2, 3, 5, 4},
        {3, 5, 1, 4, 2},
        {4, 1, 5, 2, 3},
        {2, 3, 4, 1, 5},
        {5, 4, 2, 3, 1}};


        for (int i = 0; i < columna; i++) {
            for (int j = 0; j < fila; j++) {
                for (int k = 0; k < columna; k++) {
                    for (int l = 0; l < fila; l++) {
                        if (datos3[k][l] > datos3[k][l]) {
                            aux = datos3[k][l];
                            datos3[k][l] = datos3[k][l];
                            datos3[k][l] = aux;
                        }
                    }
                }
            }
        }
        System.out.print("-----" + "\n");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(datos3[j][i] + " ");
            }
            System.out.print(" " + "\n");
        }

    }

    public static void MenorMayorC() {
        int fila, columna;
        int aux = 0;
 fila = 5;
        columna = 5;
        int datos3[][] = {{1, 2, 3, 5, 4},
        {3, 5, 1, 4, 2},
        {4, 1, 5, 2, 3},
        {2, 3, 4, 1, 5},
        {5, 4, 2, 3, 1}};

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                for (int k = 0; k < fila; k++) {
                    for (int l = 0; l < columna; l++) {
                        if (datos3[k][l] < datos3[k][l]) {
                            aux = datos3[k][l];
                            datos3[k][l] = datos3[k][l];
                            datos3[k][l] = aux;
                        }
                    }
                }
            }
        }
        System.out.print("-----" + "\n");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(datos3[j][i] + " ");
            }
            System.out.print(" " + "\n");
        }
    }

}
