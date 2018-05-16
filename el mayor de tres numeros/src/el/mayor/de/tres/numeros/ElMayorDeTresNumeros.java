/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el.mayor.de.tres.numeros;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class ElMayorDeTresNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese el Primer numero: ");
        int n1=entrada.nextInt();
        System.out.print("Ingrese el Segundo numero: ");
        int n2=entrada.nextInt();
        System.out.print("Ingrese el Tercer numero: ");
        int n3=entrada.nextInt();
        if(n1>n2)
            if(n1>n3)
                if(n2>n3)
                    System.out.println(n1+" es el mayor, "+n3+" es el menor");
                else if(n2==n3)
                    System.out.println(n1+" es el mayor, "+n2+", "+n3+"  son iguales");
                else
                    System.out.println(n1+" es el mayor, "+n2+" es el menor");
            else if(n1==n3)
                System.out.println(n1+", "+n3+" son iguales, "+n2+" es el menor");
            else
                System.out.println(n3+" es el mayor, "+n2+" es el menor");
        else if(n2>n3)
            if(n1==n3)
                System.out.println(n2+" es el mayor, "+n1+", "+n3+"  son iguales");
            else if(n2==n1)
                System.out.println(n1+", "+n2+" son iguales, "+n3+" es el menor");
            else if(n1>n3)
                System.out.println(n2+" es el mayor, "+n3+" es el menor");
                else
                    System.out.println(n2+" es el mayor, "+n1+" es el menor");
        else if(n1==n2)
            if(n2==n3)
                System.out.println(n1+", "+n2+", "+n3+" son iguales");
            else
                System.out.println(n3+" es el mayor, "+n1+", "+n2+"  son iguales");
        else if(n2==n3)
            System.out.println(n2+", "+n3+" son iguales, "+n1+" es el menor");
        else
            System.out.println(n3+" es el mayor, "+n1+" es el menor");
    }
}