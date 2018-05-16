/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Menu
{

    Scanner sc = new Scanner(System.in);
    int intOpc1 = 0;
    int intOpc2 = 0;

    public int MostrarMenu()
    {

        System.out.println("Bienvenidos al sistema");
        System.out.println("1. Ordenar de Menor a Mayor");
        System.out.println("2. Ordenar de Mayor a Menor");
        System.out.println("3. Salir");
        intOpc1 = sc.nextInt();
     
        return intOpc1;
    }

    public int OpcionOrden()
    {

        System.out.println("Como decea ordenar: ");
        System.out.println("1. Por Filas");
        System.out.println("2. Por Columnas");
        System.out.println("3. Regresar al Menu Principal");
        intOpc2 = sc.nextInt();
       

        return intOpc2;
    }

}
