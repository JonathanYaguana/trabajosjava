/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorepaso;

import java.util.Scanner;

/**
 *
 * @author PROGRAMACION 2do A
 */
public class Menu
{

    Scanner sc = new Scanner(System.in);

    public int presentarMenu()
    {
        int intOpc = 0;
        System.out.println("1. Ingresar nuevo estudiante");

        System.out.println("2. Presentar datos");

        System.out.println("3. Modificar datos");

        System.out.println("4. Borrar datos");

        System.out.println("5. Mostrar edad de estudiante");

        intOpc = sc.nextInt();

        return intOpc;
    }

}
