 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.pkgif;

import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public class AplicacionIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        double a = 0, b = 1, c = 0, d = 1, kg, dim, gro, p, j = 0;
        int op = 0, n, cont = 2, k = 0, de = 0, e = 1, i = 0;
        String tipo = "", marca = "";
        boolean primo;
        char norma;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("0.- Problema 0");
            System.out.println("1.- Problema 1");
            System.out.println("2.- Problema 2");
            System.out.println("3.- Problema 3");
            System.out.println("4.- Problema 4");
            System.out.println("5.- Problema 5");
            System.out.println("Ingrese opcion:");
            op = s.nextInt();
            switch (op) {
                case 0:

                    System.out.println("Ingrese dimencion de la rueda: ");
                    dim = s.nextDouble();
                    System.out.println("Ingrese gruesor de la rueda: ");
                    gro = s.nextDouble();
                    System.out.println("Ingrese precio de la rueda: ");
                    System.out.print("$");
                    p = s.nextDouble();
                    if (dim > 1.4) {
                        System.out.println("La rueda es para un vehiculo grande");
                        tipo = "grande";
                        marca = "Micheline";
                    } else if ((dim <= 1.4) && (dim > 0.8)) {
                        System.out.println("La rueda es para un vehiculo mediano");

                    } else {
                        System.out.println("La rueda es para un vehiculo pequeño");
                        tipo = "pequeño";
                        marca = "Bridgestone";
                    }
                    if ((dim > 1.4 && gro < 0.4) || (dim <= 1.4 && dim > 0.8 && gro < 0.25)) {
                        System.out.println("El grosor para esta rueda es inferior al recomendado");
                        norma = 'N';
                    } else {
                        norma = 'S';
                    }
                    if (norma == 'S' || "pequeño".equals(tipo) && "Bridgestone".equals(marca) && p > 60 && p < 100) {
                        a = 4 * p;
                        System.out.println("La renovacion total de sus llanats seria de: $" + a);
                    }
                    if ("grande".equals(tipo) && "Micheline".equals(marca) && p >= 100) {
                        a = 8 * p;
                        System.out.println("Su cambio total de llantas sera: $" + a);
                    } else if (norma == 'N' && "grande".equals(tipo)) {
                        System.out.println("Debe usar llantas que cumplan la norma por su seguridad");
                    }
                    break;

                case 1:
                    do {
                        System.out.println("Ingrese numero");
                        n = s.nextInt();
                        if (n >= 0 && n <= 999) {
                            if (n > 99 && n <= 999) {
                                System.out.println("Su numeo es de 3 digitos");
                            } else if (n >= 10 && n <= 99) {
                                System.out.println("Su numeo es de 2 digitos");
                            } else if (n > 0 && n <= 9) {
                                System.out.println("Su numeo es de 1 digitos");
                            } else if (n == 0) {
                                System.out.println("Fin del programa");
                            }
                        } else {
                            System.err.println("error ingrese solo numeros del 1 al 999");
                        }

                    } while (n != 0);
                    break;
                case 2:
                    do {
                        System.out.print("Peso de la pieza en kilogramos: ");
                        kg = s.nextDouble();
                        k++;
                        if (kg >= 9.8 && kg <= 10.2) {
                            a++;
                        } else if (kg > 10.2) {
                            j++;
                        } else if (kg < 9.8 && kg > 0) {
                            c++;
                        }
                    } while (kg != 0);
                    System.out.println("\na)Piezas que pesan entre 9,8kg y 10,2kg: " + a + " piezas");
                    System.out.println("  Piezas que pesan mas de 10,2kg: " + j + " piezas");
                    System.out.println("  Piezas que pesan menos de 9.8kg: " + c + " piezas");
                    System.out.println("\nb)Total de piezas: " + (k - 1) + " piezas");
                    break;
                case 3:
                    do {
                        System.out.print("numero [" + e + "]: ");
                        p = s.nextInt();
                        a = a + p;
                        j++;
                        e++;
                    } while (p != 0);
                    System.out.println("Su promedio es: " + a / (j - 1));
                    break;
                case 4:
                    do {
                        k = 0;
                        System.out.println("Ingrese numero");
                        n = s.nextInt();
                        for (i = 1; i < (n + 1); i++) {
                            if (n % i == 0) {
                                k++;
                            }
                        }
                        if (k != 2) {
                            System.out.println("No es Primo");
                        } else {
                            System.out.println("Si es Primo");
                        }
                    } while (n != 0);
                    break;
                case 5:
                    n = s.nextInt();
                    System.out.println("La suma es:");
                    System.out.print("√2/1");
                    for (i = 0; i < n; i++) {
                        if (i % 2 == 0) {
                            a = (float) Math.sqrt(i + 1);
                            k = i + 1;
                            System.out.print("+");
                        } else if (i % 2 != 0) {
                            a = -(float) Math.sqrt(i + 3);
                            k = (i + 3);
                            System.out.print("-");
                        }
                        j += a;
                        System.out.print("√" + k + "/"  );
                        Primo(i);
                    }
                    System.out.println(" = " + (j + (float) Math.sqrt(2)));
                    break;
            }
        } while (op != 6);

    }

public static void Primo(int n){
     int cont=2, cantidad=0, p;
        boolean primo;
        while(cantidad<(n)){
        primo=true;
            for (int i = 2; i <= cont/2; i++) {
                if(cont%i==0)
                primo=false;
            }
        if(primo==true){
                System.out.println(cont);
        cantidad++;
        }
       cont=cont+1;
        }
       
        
    }
}