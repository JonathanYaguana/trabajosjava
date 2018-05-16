/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comandos.string;

import java.util.Scanner;

/**
 *
 * @author PROGRAMACION 2do A
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);
    String strPalabra = null;
    String strPalabra2 = null;
    int intPos1 = 0, intPos2 = 0;
    boolean boolB = true;

    public void metChartAt(String a) {

        try {
            System.out.print("Ingrese una posicion: ");
            intPos1 = sc.nextInt();
            if (intPos1 < a.length() && intPos1 >= 0) {
                System.out.println("La letra en esa posicion es: '" + a.charAt(intPos1) + "' \n ");
            } else {
                System.out.println("Esta posicion no exciste");
            }

        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }
    }

    public void metCompareTo(String a) {
        try {
            System.out.print("Ingrese palabra a comparar: ");
            strPalabra = sc.next();

            if (a.compareTo(strPalabra) == 0) {
                System.out.println("La palabra es igual\n");
            } else {
                System.out.println("La palabra no es igual\n");
            }
        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }
    }

    public void metCompareToIgnoreCase(String a) {
        try {
            System.out.print("Ingrese palabra a comparar: ");
            strPalabra = sc.next();

            if (a.compareToIgnoreCase(strPalabra) == 0) {
                System.out.println("La palabra es igual\n");
            } else {
                System.out.println("La palabra no es igual\n");
            }
        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }

    }

    public void metConcat(String a) {
        try {
            System.out.print("\nIngrese palabra a concatenar: ");
            strPalabra = sc.next();
            System.out.println("Palabra ingresada: " + a + "\nLa palabra concatenada: " + a.concat(" " + strPalabra) + " \n");;
        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }
    }

    public void metEqualsIgnoreCase(String a) {
        try {
            System.out.print("Ingrese palabra a comparar: ");
            strPalabra = sc.next();

            if (a.equalsIgnoreCase(strPalabra) == true) {
                System.out.println("La palabra es igual");
            } else {
                System.out.println("La palabra no es igual");
            }
        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }

    }

    public void metEndsWith(String a) {
        try {
            System.out.print("Ingrese las dos ultimas letras de la palabra a comparar: ");
            strPalabra = sc.next();
            if (a.endsWith(strPalabra) == true) {
                System.out.println("las dos ultimas letras coinsiden con la palabra \n");
            } else {
                System.out.println("Las letras no coinsiden\n");
            }
        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }

    }

    public void metIndexOf(String a) {
        try {
            System.out.print("\nIngrese un letra de la palabra y mostrar la primera posicion en que se encuentra: ");
            strPalabra = sc.next();
            if (a.indexOf(strPalabra) >= 0) {
                System.out.println("\nLa letra '" + strPalabra + "' esta en la posicion: " + a.indexOf(strPalabra));
            } else {
                System.out.println("La letra no existe");
            }
        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }

    }

    public void metLasIndexOf(String a) {
        try {
            System.out.print("\nIngrese un letra de la palabra que ingreso y mostrara la primera posicion de derecha a izquierda: ");
            strPalabra = sc.next();
            if (a.indexOf(strPalabra) >= 0) {
                System.out.println("\nLa letra '" + strPalabra + "' esta en la posicion: " + a.lastIndexOf(strPalabra) + "\n");
            } else {
                System.out.println("La letra no existe");
            }
        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }

    }

    public void metLength(String a) {
        try {
            System.out.println("El numero de caracteres de la palabra es: " + a.length() + "\n");

        } catch (Exception ex) {
            System.out.println("Caracter no valido ");

        }
    }

    public void metReplace(String a) {
        try {
            System.out.print("Ingrese la palabra que va cambiar de la original: ");
            strPalabra = sc.next();
            String cadena2 = null;
            cadena2 = a.replace(a, strPalabra);
            System.out.println("Palabra ingresada: " + a + " y la palabra cambiada: " + cadena2 + "\n");

        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }
    }

    public void metReplaceFirst(String a) {
        try {
            System.out.print("Ingrese una letra: ");
            strPalabra = sc.next();
            System.out.print("Ingrese una letra que se encuentre en la palabra original: ");
            strPalabra2 = sc.next();
            System.out.println("Palabra ingresada: " + a + " y la palabra cambiada: " + a.replaceFirst(strPalabra2, strPalabra) + "\n");

        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }
    }

    public void metReplaceAll(String a) {
        try {
            System.out.print("Ingrese una letra: ");
            strPalabra = sc.next();
            System.out.print("Ingrese una letra que se encuentre en la palabra original: ");
            strPalabra2 = sc.next();
            System.out.println("Palabra ingresada: " + a + " y la palabra cambiada: " + a.replaceAll(strPalabra2, strPalabra) + "\n");

        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }
    }

    public void metStartsWith(String a) {
        try {
            System.out.print("Ingrese las dos primeras letras de la palabra a comparar: ");
            strPalabra = sc.next();
            if (a.startsWith(strPalabra) == true) {
                System.out.println("Las dos primeras letras coinsiden con la palabra \n");
            } else {
                System.out.println("Las letras no coinsiden\n ");
            }
        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }

    }

    public void metSubstring(String a) {
        try {
            System.out.println("Ingrese de que posicion a que poscion desea obtener las  letras de la palabra ingresada: ");
            System.out.print("posicion de inicio: ");
            intPos1 = sc.nextInt();
            System.out.print("\nposicion de final: ");
            intPos2 = sc.nextInt();
            if (intPos1 >= 0 && intPos2 < a.length()) {
                System.out.println("\nLas letras en esa posicion son: " + a.substring(intPos1, intPos2) + "\n");
            } else {
                System.out.println("No existe esas posiciones");
            }

        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }

    }

    public void metToCharArray(String a) {
        try {
            char[] array = a.toCharArray();
            System.out.println("Mostrar el arreglo en forma vertical\n");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

            }
            System.out.println("");
        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }

    }

    public void metToLowerCase(String a) {
        try {
            System.out.println("Palabra original: " + a + " La palabra cambiada: " + a.toLowerCase() + "\n");

        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }

    }

    public void metToUpperCase(String a) {
        try {
            System.out.println("Palabra original: " + a + " La palabra cambiada: " + a.toUpperCase() + "\n");

        } catch (Exception ex) {
            System.out.println("Caracter no valido reinicie programa");

        }
    }

    public void metTrim(String a) {
        try {
            System.out.println("Palabra original: " + a + " La palabra sin espacios: " + a.trim() + "\n");

        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }
    }

    public void metValueOf(String a) {
        try {
            System.out.println("Cambia de String a entero: ");
            System.out.println("Ingrese un numero: ");
            intPos1 = sc.nextInt();
            System.out.println("El numero cuando esta entero: " + intPos1 + " + " + 100 + " = " + (intPos1 + 100));
            System.out.println("El numero transformado a String: " + intPos1 + " + " + 100 + " = " + (String.valueOf(intPos1) + 100));

        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }
    }

    public void metIsEmpty(String a) {
        try {
            if (a.isEmpty() == true) {
                System.out.println("Si tiene espacios\n");
            } else {
                System.out.println("No tiene espacios\n");
            }
        } catch (Exception ex) {
            System.out.println("Caracter no valido");

        }

    }

}
