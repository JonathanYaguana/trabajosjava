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
public class Menu
{
    public int mostraMenu(){
        Scanner sc= new Scanner(System.in);
        System.out.println("\nEscoja que metodo desea usar:");
        System.out.println("1.charAt");//chatAt(i); t devuelve la letra
        System.out.println("2.compareTo");//
        System.out.println("3.compareToIgnoreCase");//        
        System.out.println("4.concat");//
        System.out.println("5.equalsIgnoreCase");//
        System.out.println("6.endsWith");//compara la ultima dos letras "carlos".endsWith(os);
        System.out.println("7.indexOf");//comienza a buscar de izquierda a derecha y te de vuelve el indice de la posicion de la cadena "carlos" indexOf(L); = 3
        System.out.println("8.lasIndexOf");// comienza a buscar de derecha a izquierda
        System.out.println("9.length");//da la dimencion de los caracteres cuenta los espacios "Carlos = 6 carateres"
        System.out.println("10.replace");//cambia de mayuscula a minuscula "carlos.replace(A,a);"
        System.out.println("11.replaceFirst");//solo cambia el primer caracter
        System.out.println("12.replaceAll");//cambia todo
        System.out.println("13.startsWith");//si es q empiesa cn los primeros caracteres t devuelve true "Carla empieza cn Ca startsWith(ca);
        System.out.println("14.substring");//saca la cadena desde donde se desee "subString(i);" "substring(6,2);"
        System.out.println("15.toCharArray");//converti una cadena en un arreglo de caracteres "1235566 lo agrega a un array" Array=cedula.toCharArray();
        System.out.println("16.toLowerCase");//cambia todo la cadena a minusculas
        System.out.println("17.toUpperCase");//cambia todo la cadena a mayusculas
        System.out.println("18.trim");//borra los espacios en blanco de una cadena
        System.out.println("19.valueOf");//convertir a su tipo de variable si es entero a entero si es decimal a decimal
        System.out.println("20.isEmpty");//determinar si una cadena esta o no llena 
        System.out.println("0.Salir");
        System.out.println("Ingrese la opcion del metodo que desea usar:");
        int intOpcion = sc.nextInt(); 
        return intOpcion;
    }
}
