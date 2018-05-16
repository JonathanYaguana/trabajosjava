/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificar.cedula;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class VerificarCedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int salir = 0;
        do {
            int var, ini, fin;

            Scanner sc = new Scanner(System.in);
            System.out.println("\n1. Suma de numeros primos dado rango \n2. Verificar numero de cedula\n3. Salir");
            var = sc.nextInt();
            salir = 1;
            switch (var) {

                case 1:
                    String op = "";
                    do {

                        System.out.println("==== Suma de numeros primos ====");
                        int suma = 0;
                        System.out.println("Ingrese el inicio del rango");
                        ini = sc.nextInt();
                        System.out.println("Ingrese el final del rango");
                        fin = sc.nextInt();
                        for (int i = ini; i <= fin; i++) {
                            int cont = 0;
                            for (int j = 1; j <= i; j++) {
                                if ((i % j) == 0) {
                                    cont++;
                                }

                            }
                            if (cont == 2) {
                                System.out.print(i + " ");
                                suma = suma + i;
                            }
                        }
                        System.out.println("\nLa suma es: " + suma);
                        System.out.println("Desea repetir si o no:");
                        op = sc.next();

                    } while (op.equals("si") || op.equals("Si") || op.equals("SI"));

                    break;
                case 2:
                    do {
                        String num;
                        System.out.println("=== Verificar Numero de Cedula ===");
                        System.out.println("Ingrese el numero de cedula");
                        num = sc.next();
                        if (num.length() == 10) {

                            int suma = 0;

                            for (int i = 0; i < num.length() - 1; i++) { // Leemos cada número con un for solo hasta el penúltimo
                                int numero = Integer.valueOf(String.valueOf(num.charAt(i)));
                                if (i % 2 == 0) {
                                    numero = numero * 2;
                                }
                                while (numero > 9) {
                                    numero = numero - 9;
                                }

                                suma =suma+ numero; // Por cada operación que hacemsos al número tomado, se lo agregamos al contador <suma>.
                            }

                            int ultimoNumero = Integer.valueOf(String.valueOf(num.charAt(num.length() - 1)));
                            int superior = suma;
                            while (superior % 10 != 0) {
                                superior++;
                            }
                            if (superior - suma == ultimoNumero) {
                                System.out.println("La cedula es correcta");
                            } else {
                                System.out.println("La cedula es incorrecta");
                            }

                        } else {
                            System.out.println("Numero de cedula incompleto");

                        }
                        System.out.println("Desea repetir si o no:");
                        op = sc.next();

                    } while (op.equals("si") || op.equals("Si") || op.equals("SI"));

                    break;

                case 3:
                    salir = 0;
                    break;
                default:
                    System.err.println("Ingrese la opcion correcta ");
                    break;

            }
        } while (salir == 1);
    }
}
