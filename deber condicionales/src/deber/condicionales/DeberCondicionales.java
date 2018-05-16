/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber.condicionales;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class DeberCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0, n1 = 0, aux = 0, vari;

        double grosor, diametro, precio = 0, x;
        String tiporueda = "", marca = "", opcion = "";
        Character cumplenorma;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Problema 0\n2. Problema 1\n3. Problema 2\n4. Problema 3\n5. Problema 4\n6. Problema 5\n7. Salir ");
            vari = sc.nextInt();
            switch (vari) {
                case 1:
                    System.out.println("\nProblema 0\n");
                    System.out.print("Ingrese el diametro de la rueda: ");
                    diametro = sc.nextDouble();
                    System.out.print("Ingrese el grosor de la rueda: ");
                    grosor = sc.nextDouble();
                    System.out.print("Ingrese el precio: ");
                    precio = sc.nextDouble();

                    if (diametro > 1.4) {
                        System.out.println("La rueda es para un vehiculo grande");
                        tiporueda = "grande";
                        marca = "micheline";
                    } else if (diametro <= 1.4 && diametro > 0.8) {
                        System.out.println("La rueda es para un vehiculo mediano");

                    } else {
                        System.out.println("La rueda es para un vehiculo pequeño");
                        tiporueda = "pequeña";
                        marca = "brigstone";
                    }
                    if ((diametro > 1.4) && (grosor < 0.4)|| (diametro <= 1.4 && diametro > 0.8 && grosor < 0.25)) {
                        System.out.println("El grosor para esta rueda es inferior al recomendado");
                        cumplenorma = 'n';
                   
            } else {
                        cumplenorma = 's';
                    }

                    if ((cumplenorma.equals("s") || tiporueda.equals("pequeña")) && (precio > 60 && precio < 100)) {
                        x = precio * 4;
                        System.out.println("Su cambio total de ruedas sera de: " + x);

                    }
                    if (tiporueda.equals("grande") && marca.equals("micheline") && precio > 100) {
                        x = precio * 8;
                        System.out.println("Su cambio total de ruedas sera de: " + x);

                    }
                    else if ((tiporueda.equals("grande") && cumplenorma.equals("n"))) {
                        System.out.println("Debe usar llantas que cumplan la norma por segurida");
                    }
                    System.out.println("");
                    break;

                case 2:
                    do {
                        System.out.print("\nIngrese un numero entre 0 y 999:  ");
                        n = sc.nextInt();
                        aux = n;
                        int c = 0;

                        if (n >= 0 && n < 999) {
                            while (n != 0) {
                                n = n / 10;
                                c++;

                            }
                            System.out.println("EL numero de cifras es de " + c);

                        } else {
                            System.err.println("Error Ingrese un numero entre 0 y 999\n");

                        }

                    } while (aux != 0);
                    System.out.println("");
                    break;
                case 3:
                    do {
                        int contador = 0;
                        aux=0;
                        System.out.println("\nIngrese los numeros que decea realizar el promedio:  ");
                        do {

                            n = sc.nextInt();
                            aux = aux + n;
                            contador++;

                        } while (n != 0);
                        System.out.println("El promedio es: " + aux / (contador - 1));
                        System.out.println("Desea repetir si o no ");
                        opcion = sc.next();
                    } while (opcion.contentEquals("si"));
                    break;
                case 4:
                    do {
                        Double p;
                        int contador = 0;
                        int contador1 = 0;
                        int contador2 = 0;
                        int contador3 = 0;
                        System.out.println("\nIngrese el peso de la piesas en kilo:  ");
                        do {

                            p = sc.nextDouble();
                            if (p > 9.8 && p < 10.2) {
                                contador1++;

                            } else if (p > 10.2) {
                                contador2++;

                            } else if (p < 9.8) {
                                contador3++;
                            }

                        } while (p != 0);
                        contador = (contador1 + contador2 + contador3) - 1;
                        System.out.println("Las piesas entre 9,8kg y 10.2kg son: " + contador1);
                        System.out.println("Las piesas con mas de 10.2kg son: " + contador2);
                        System.out.println("Las piesas menos de 9,8kg son: " + (contador3 - 1));
                        System.out.println("El numero total de pisas son : " + contador);
                        System.out.println("Desea repetir si o no ");
                        opcion = sc.next();
                    } while (opcion.contentEquals("si"));
                    break;
                case 5:
                    do{
                    int a = 0,j, in;
                    System.out.print("Ingrese numero: ");
                    in = sc.nextInt();
                    for (j = 1; j < (in + 1); j++) {
                        if (in % j == 0) {
                            a++;
                        }
                    }
                    if (a != 2) {
                        System.out.println("No es Primo");
                    } else {
                        System.out.println("Si es Primo");
                    } System.out.println("Desea repetir si o no ");
                        opcion = sc.next();
                    } while (opcion.contentEquals("si"));
                    
                    break;
                case 6:
                    System.out.println("Serie");
                    
                    
                    break;
                case 7:
                    n1 = 1;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
            }

        } while (n1 == 0);

    }
}
