package comandos.string;

import java.util.Scanner;

public class ComandosString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu objMenu = new Menu();
        Metodos objMetodo = new Metodos();
        boolean boolRepetir = true;
        String strPalabra = null;
        System.out.println("Ingrese una palabra  ");
        strPalabra = sc.next();
        System.out.println("");

        while (boolRepetir) {
            try {
                switch (objMenu.mostraMenu()) {

                    case 1:
                        System.out.println("\nEste metodo encuentra el caracter deacuerdo a la posicon que se ingresa\n");
                        objMetodo.metChartAt(strPalabra);
                        break;
                    case 2:
                        System.out.println("\nEste metodo compara dos cadena si son iguales importa si tiene minusculas y mayusculas\n");
                        objMetodo.metCompareTo(strPalabra);

                        break;
                    case 3:
                        System.out.println("\nEste metodo compara dos cadena si son iguales sin importar las minusculas o mayusculas\n");
                        objMetodo.metCompareToIgnoreCase(strPalabra);

                        break;
                    case 4:
                        System.out.println("\nEste metodo une palabras");
                        objMetodo.metConcat(strPalabra);
                        break;
                    case 5:
                        System.out.println("\nEste metodo compara dos cadena si son iguales importa si tiene minusculas y mayusculas\n");
                        objMetodo.metEqualsIgnoreCase(strPalabra);
                        break;
                    case 6:
                        System.out.println("\nEste metodo compara la ultima dos letras de la palabra\n");
                        objMetodo.metEndsWith(strPalabra);
                        break;
                    case 7:
                        System.out.print("\nEste metodo buscar de izquierda a derecha y te de vuelve el indice de la posicion de la cadena: ");
                        objMetodo.metIndexOf(strPalabra);
                        break;
                    case 8:
                        System.out.print("\nEste metodo buscar de derecha a izquierda y te de vuelve el indice de la posicion de la cadena: ");
                        objMetodo.metLasIndexOf(strPalabra);
                        break;
                    case 9:
                        System.out.println("\nEste metodo determina el numero de caracteres \n");
                        objMetodo.metLength(strPalabra);
                        break;
                    case 10:
                        System.out.println("\nEste metodo cambia todo la palabra\n");
                        objMetodo.metReplace(strPalabra);
                        break;
                    case 11:
                        System.out.println("\nEste metodo solo cambia un caracter inicial\n");
                        objMetodo.metReplaceFirst(strPalabra);
                        break;
                    case 12:
                        System.out.println("\nEste metodo cambia todos los caracteres de la palabra\n");
                        objMetodo.metReplaceAll(strPalabra);
                        break;
                    case 13:
                        System.out.println("\nEste metodo compara las dos primeras letras\n");
                        objMetodo.metStartsWith(strPalabra);
                        break;
                    case 14:
                        System.out.println("\nEste metodo devuelve lo que hay dentro de un rango de una cadena \n");
                        objMetodo.metSubstring(strPalabra);
                        break;
                    case 15:
                        System.out.println("\nEste metodo guarda la palabra en un arreglo \n0");
                        objMetodo.metToCharArray(strPalabra);
                        break;
                    case 16:
                        System.out.println("\nEste metodo toda la palabra se cambia a minusculas\n");
                        objMetodo.metToLowerCase(strPalabra);
                        break;
                    case 17:
                        System.out.println("\nEste metodo toda la palabra se cambia a mayusculas\n");
                        objMetodo.metToUpperCase(strPalabra);
                        break;
                    case 18:
                        System.out.println("\nEste metodo quita los espacios en blanco\n");
                        objMetodo.metTrim(strPalabra);
                        break;
                    case 19:
                        System.out.println("\nEste metodo\n");
                        objMetodo.metValueOf(strPalabra);
                        break;
                    case 20:
                        System.out.println("\nEste metodo deternina si la cadena tiene espacios\n");
                        objMetodo.metIsEmpty(strPalabra);
                        break;
                    case 0:
                        System.out.println("Usted salio del programa.");
                        boolRepetir = false;
                        break;
                    default:
                        System.err.println("Opcion no valida");
                        throw new AssertionError();
                }
            } catch (Exception ex) {
                System.out.println("Caracter no valido");

            }

        }

    }
}
