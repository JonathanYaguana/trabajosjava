/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosstring;

import java.util.Scanner;

/**
 *
 * @author PROGRAMACION 2do A
 */
public class MetodosString
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int intOpcion;
        int intcomparar;
        char s = ' ';

        String strUnir = "";
        String strCadena = "";
        boolean booRes = true;
        boolean booband1 = true;

        Scanner in = new Scanner(System.in);
        Menu objMenu = new Menu();
        Metodos objmetodos = new Metodos();

        System.out.println("Ingrese una cadena de caracteres");
        strCadena = sc.nextLine();
        do
        {
            intOpcion = objMenu.mostrarMenu();

            switch (intOpcion)
            {
                case 1:
                    s = objmetodos.charAt(strCadena);
                    System.out.println("\nSu carcter en la posicion que eligio es: " + s);

                    break;

                case 2:
                    intcomparar = objmetodos.compareTo(strCadena);

                    if (intcomparar == 0)
                    {
                        System.out.println("Las palabras son iguales");
                    } else
                    {
                        System.out.println("Las palabras no son iguales");
                    }
                    break;

                case 3:
                    intcomparar = objmetodos.compareToIgnoreCase(strCadena);
                    if (intcomparar == 0)
                    {
                        System.out.println("Las palabras son iguales");
                    } else
                    {
                        System.out.println("Las palabras no son iguales");
                    }
                    break;

                case 4:
                    strUnir = objmetodos.Concat(strCadena);
                    System.out.println("" + strUnir);
                    break;

                case 5:
                    booRes = objmetodos.endswith(strCadena);
                    if (booRes)
                    {
                        System.out.println("Las palabras son iguales");
                    } else
                    {
                        System.out.println("Las palabras no son iguales");
                    }
                    break;

                case 6:
                    booRes = objmetodos.equalIgnoreCase(strCadena);
                    if (booRes)
                    {
                        System.out.println("Las palabras son iguales");
                    } else
                    {
                        System.out.println("Las palabras no son iguales");
                    }

                    break;
                case 7:
                    intcomparar = objmetodos.indexOf(strCadena);
                    System.out.println("La posicion del caracter es: " + intcomparar);

                    break;
                case 8:
                    intcomparar = objmetodos.lastIndexOf(strCadena);
                    System.out.println("La posicion del caracter por el final es: " + intcomparar);

                    break;
                case 9:
                    intcomparar = objmetodos.length(strCadena);
                    System.out.println("El tamaño de la cadena es:" + intcomparar);
                    break;
                case 10:
                    strUnir = objmetodos.remplace(strCadena);
                    System.out.println("La nueva palabra es:" + strUnir);

                    break;
                case 11:
                    strUnir = objmetodos.remplaceFirst(strCadena);
                    System.out.println("La nueva palabra es:" + strUnir);

                    break;
                case 12:
                    strUnir = objmetodos.remplaceAll(strCadena);
                    System.out.println("La nueva palabra es:" + strUnir);

                    break;
                case 13:
                    strUnir = objmetodos.remplaceAll(strCadena);
                    System.out.println("La nueva palabra es:" + strUnir);

                    break;
                case 14:
                    booRes = objmetodos.StartsWith(strCadena);
                    if (booRes)
                    {
                        System.out.println("Las primeras letras son iguales");
                    } else
                    {
                        System.out.println("Las primeras letras no son iguales");
                    }

                    break;
                case 15:
                    char arar[] = objmetodos.ToArray(strCadena);
                    System.out.println("La cadena en array es: ");
                    for (int i = 0; i < arar.length; i++)
                    {
                        System.out.println(arar[i]);

                    }
                    break;
                case 16:
                    strUnir = objmetodos.toLowerCase(strCadena);
                    System.out.println("La palabra en minuscula es: " + strUnir);

                    break;
                case 17:
                    strUnir = objmetodos.toUpperCase(strCadena);
                    System.out.println("La palabra en mayusculas es: " + strUnir);

                    break;
                case 18:
                    strUnir = objmetodos.trim(strCadena);
                    System.out.println("La cadena sin espacios es: " + strUnir);

                    break;
                case 19:
                    objmetodos.StringValueof();

                    break;
                case 20:
                    booRes = objmetodos.isEmpi(strCadena);
                    if (booRes)
                    {
                        System.out.println("La cadena esta llena");
                    } else
                    {
                        System.out.println("La cadena esta vacia");
                    }

                    break;
                case 21:
                    booband1 = false;
                    break;

                default:
                    System.err.println("Opcion Incorrecta");
            }
        } while (booband1);
    }

}
