/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dber;

import java.util.Scanner;

public class Dber {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            int opcion = 0;
            System.out.println("Elegir una opción: \n1. números primos \n2. comprobar cédula \n3. salir");
            opcion = sc.nextInt();
            if (opcion == 1) {
                Primo();
            }
            if (opcion == 2) {
                Cedula();
            }
            if (opcion == 3) {
                break;

            }

        }

    }

    public static void Primo() {
        int inicio = 0;
        int fin = 0;
        System.out.println("Ingrese el valor inicial del rango: ");
        inicio = sc.nextInt();
        System.out.println("Ingrese el valor final del rango: ");
        fin = sc.nextInt();
        int suma = 0;
        for (int i = inicio; i < fin; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }

                if (cont > 2) {
                    break;
                }

                if (cont == 2) {

                    suma += i;
                }

            }

            System.out.println("La suma total de los números primos es: " + suma);

        }
    }

    public static void Cedula() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su cédula: ");
        String cedula = scanner.next();

        if (cedula.length() != 10 || !isCedulaCorrecta(cedula)) {
            System.out.println("Su cédula es incorrecta.");
        }else{
            System.out.println("Su cedula es correcta.");
        }
    }

    private static boolean isCedulaCorrecta(String cedula) {
        int sumaTotal = 0;

        for (int i = 0; i < cedula.length() - 1; i++) {
            int numero = Integer.valueOf(String.valueOf(cedula.charAt(i)));

            int total = numero;
            if (i % 2 == 0) {
                total += numero;
            }

            if (total > 9) {
                total -= 9;
            }

            sumaTotal += total;
        }

        int tempSum = ((sumaTotal / 10) + 1) * 10;

        int ultimoNumero = Integer.valueOf(String.valueOf(cedula.charAt(cedula.length() - 1)));
        return tempSum - sumaTotal == ultimoNumero;
    }
    }
        /*System.out.println("Ingrese  su numero de cédula: ");
        String cedula = sc.next();
        if (cedula.length() == 10) {
            int a = 2;
            int b = 1;
            int posiciones = 0;
            int suma=0;
            
            int i=0;
                   
               
                i+= a * Integer.parseInt(cedula.substring(0, 1));
                i+= a * Integer.parseInt(cedula.substring(2, 3));
                i += a * Integer.parseInt(cedula.substring(4, 5));
                i += a * Integer.parseInt(cedula.substring(6, 7));
                i += a * Integer.parseInt(cedula.substring(8, 9));
                
               System.out.println(""+i);
                for (int j = 0; j < 10; j++) {

                    j += b * Integer.parseInt(cedula.substring(1, 2));
                    j += b * Integer.parseInt(cedula.substring(3, 4));
                    j += b * Integer.parseInt(cedula.substring(5, 6));
                    j += b * Integer.parseInt(cedula.substring(7, 8));
                    posiciones = i + j;
                    System.out.println("la suma es" + posiciones);
                }
            
            int aux = posiciones / 10;
            int dec = (aux + 1) * 10;
            if ((dec - posiciones) == Integer.parseInt(String.valueOf(cedula.charAt(cedula.length() - 1))));
            if (posiciones % 10 == 0 && cedula.charAt(cedula.length() - 1) == '0') {
                System.out.println(" es correct");
            } else {
                System.out.println("Incorrecta");
            }
        } else {
            System.out.println("Cedula incorrecta");
        }
    }
}


/* int aux = 0;
    while (cont < num){
        aux = num % cont;
        if(aux == 0){
            return true;
        }
        cont ++;
    }
    return false ;
    }*/
