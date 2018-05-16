package arreglobidimensionalrep;

import java.util.Scanner;

public class Menu {

    Scanner lct = new Scanner(System.in);

    public int MostrarMenu() {

        System.out.println("BIENVENIDOS AL SISTEMA\n");

        System.out.println("1. Ordenar de Menor a Mayor");
        System.out.println("2. Ordenar de Mayor a Menor");
        System.out.println("3. Salir");
        int op1 = lct.nextInt();
        return op1;
    }

    public int MenuSelecTipo() {
        System.out.println("SELECCIONE LA DIRECCION DEL ORDEN");

        System.out.println("1. Por Filas");
        System.out.println("2. Por Columnas");
        System.out.println("3. Regresar al Menu Principal");

        int op2 = lct.nextInt();
        return op2;
    }
}
