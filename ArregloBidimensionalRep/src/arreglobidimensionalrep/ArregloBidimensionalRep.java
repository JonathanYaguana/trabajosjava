package arreglobidimensionalrep;

import java.util.Scanner;

public class ArregloBidimensionalRep {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lct = new Scanner(System.in);
        int intValor = 0;
        int intOpcion = 0;
        boolean boolBand1 = true;
        int intFilaColumna = 0;

        int datos3[][] = {{1, 2, 3, 5, 4},
        {3, 5, 1, 4, 2},
        {4, 1, 5, 2, 3},
        {2, 3, 4, 1, 5},
        {5, 4, 2, 3, 1}};

        int datos1[] = new int[5];
        //int datos3[] = new int[5];
        Menu objMenu = new Menu();//Llamo a la Clase Menu
        Metodos objMetodos = new Metodos();

        while (boolBand1 == true) {
            intOpcion = objMenu.MostrarMenu();//Llamo al Método de la clase Menu
            intFilaColumna = objMenu.MenuSelecTipo();
            switch (intOpcion) {

                case 1:
                    if (intFilaColumna == 1) {
                        System.out.println("Ingrese la Fila a Ordenar. Filas desden el 0 al 4");
                        intValor = lct.nextInt();

                        for (int i = 0; i < 5; i++) {

                            datos1[i] = datos3[intValor][i];//saco solo una fila y lo almaceno en un arreglo

                            datos1 = objMetodos.MenoraMayor(datos1);// le devuelvo el arreglo ya ordenado
                           for (int k = 0; k < datos3.length; k++) {
                                for (int j = intValor; j < datos1.length;) {
                                    datos3[intValor][j] = datos1[j];//almaceno el valor ya ordenado
                                    System.out.print(datos3[intValor][j] + "\t");
                                }
                            }
                        }
                    } else if (intFilaColumna == 2) {
                        System.out.println("Ingrese la Columna a Ordenar. Columnas desde el 0 al 4");
                        intValor = lct.nextInt();
                    }
                    System.out.println("");
                    break;

                case 2:
                    break;

                case 3:
                    boolBand1 = false;
                    break;

            }
        }
        boolBand1 = true;
    }
}
