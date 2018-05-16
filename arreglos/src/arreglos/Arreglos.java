/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author bp2do
 */
public class Arreglos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean booBand1 = true;
        boolean booBand2 = true;
        int intFila = 0;
        int intColumna = 0;

        int intOpcion1 = 0;
        int intOpcion2 = 0;

        Menu objMenu = new Menu();
        Metodos objMetodo = new Metodos();

        int datos1[] = new int[5];

        int datos3[][] =
        {
            {
                1, 2, 3, 5, 4
            },
            {
                3, 5, 1, 4, 2
            },
            {
                4, 1, 5, 2, 3
            },
            {
                2, 3, 4, 1, 5
            },
            {
                15, 14, 12, 13, 11
            }
        };

        while (booBand1)
        {
            intOpcion1 = objMenu.MostrarMenu();
            intOpcion2 = objMenu.OpcionOrden();

            switch (intOpcion1)
            {
                case 1:
                    System.out.println("Ordenar de mayor a menor");
                    while (booBand2)
                    {
                        switch (intOpcion2)
                        {
                            case 1:

                                System.out.println("Ingrese el numero de fila del 0 al 4");

                                intFila = sc.nextInt();

                                for (int i = 0; i < 5; i++)
                                {
                                    datos1[i] = datos3[intFila][i];

                                }
                                System.out.print("Los elementos de la fila " + intFila + " es: ");
                                for (int i = 0; i < datos1.length; i++)
                                {
                                    System.out.print(" " + datos1[i]);

                                }

                                datos1 = objMetodo.MenoraMayor(datos1);

                                System.out.print("\nSus numeros ordenados de menor a mayor son:");
                                for (int i = 0; i < datos1.length; i++)
                                {
                                    System.out.print(" " + datos1[i]);

                                }

                                for (int j = 0; j < datos1.length; j++)
                                {
                                    datos3[intFila][j] = datos1[j];

                                }

                                System.out.println("\nSu nuevo array es: ");
                                for (int i = 0; i < datos3.length; i++)
                                {
                                    for (int j = 0; j < datos3.length; j++)
                                    {
                                        System.out.print(" " + datos3[i][j]);

                                    }
                                    System.out.println(" ");

                                }

                                break;

                            case 2:
                                System.out.println("Ingrese el numero de columna del 0 al 4");
                                intColumna = sc.nextInt();

                                for (int i = 0; i < 5; i++)
                                {
                                    datos1[i] = datos3[i][intColumna];

                                }
                                System.out.print("Los elementos de la columna " + intColumna + " es: ");
                                for (int i = 0; i < datos1.length; i++)
                                {
                                    System.out.print(" " + datos1[i]);

                                }

                                datos1 = objMetodo.MenoraMayor(datos1);

                                System.out.print("\nSus numeros ordenados de menor a mayor son:");
                                for (int i = 0; i < datos1.length; i++)
                                {
                                    System.out.print(" " + datos1[i]);

                                }

                                for (int j = 0; j < datos1.length; j++)
                                {
                                    datos3[j][intColumna] = datos1[j];

                                }

                                System.out.println("\nSu nuevo array es: ");
                                for (int i = 0; i < datos3.length; i++)
                                {
                                    for (int j = 0; j < datos3.length; j++)
                                    {
                                        System.out.print(" " + datos3[i][j]);

                                    }
                                    System.out.println(" ");

                                }

                                break;
                            case 3:
                                booBand2 = false;
                                break;
                            default:
                                throw new AssertionError();
                        }

                    }

                    break;

                case 2:
                    System.out.println("Ordenar de mayor a menor");
                    switch (intOpcion2)
                    {
                        case 1:

                            System.out.println("Ingrese el numero de fila del 0 al 4");

                            intFila = sc.nextInt();

                            for (int i = 0; i < 5; i++)
                            {
                                datos1[i] = datos3[intFila][i];

                            }
                            System.out.print("Los elementos de la fila " + intFila + " es: ");
                            for (int i = 0; i < datos1.length; i++)
                            {
                                System.out.print(" " + datos1[i]);

                            }

                            datos1 = objMetodo.MayorMenor(datos1);

                            System.out.print("\nSus numeros ordenados de mayor a menor son:");
                            for (int i = 0; i < datos1.length; i++)
                            {
                                System.out.print(" " + datos1[i]);

                            }

                            for (int j = 0; j < datos1.length; j++)
                            {
                                datos3[intFila][j] = datos1[j];

                            }

                            System.out.println("\nSu nuevo array es: ");
                            for (int i = 0; i < datos3.length; i++)
                            {
                                for (int j = 0; j < datos3.length; j++)
                                {
                                    System.out.print(" " + datos3[i][j]);

                                }
                                System.out.println(" ");

                            }

                            break;

                        case 2:
                            System.out.println("Ingrese el numero de columna del 0 al 4");
                            intColumna = sc.nextInt();

                            for (int i = 0; i < 5; i++)
                            {
                                datos1[i] = datos3[i][intColumna];

                            }
                            System.out.print("Los elementos de la columna " + intColumna + " es: ");
                            for (int i = 0; i < datos1.length; i++)
                            {
                                System.out.print(" " + datos1[i]);

                            }

                            datos1 = objMetodo.MayorMenor(datos1);

                            System.out.print("\nSus numeros ordenados de mayor a menor son:");
                            for (int i = 0; i < datos1.length; i++)
                            {
                                System.out.print(" " + datos1[i]);

                            }

                            for (int j = 0; j < datos1.length; j++)
                            {
                                datos3[j][intColumna] = datos1[j];

                            }

                            System.out.println("\nSu nuevo array es: ");
                            for (int i = 0; i < datos3.length; i++)
                            {
                                for (int j = 0; j < datos3.length; j++)
                                {
                                    System.out.print(" " + datos3[i][j]);

                                }
                                System.out.println(" ");

                            }

                            break;
                        case 3:
                            booBand2 = false;
                            break;
                        default:
                            throw new AssertionError();
                    }

                    break;
                case 3:
                    booBand1 = false;
                    break;

            }

        }

    }
}
