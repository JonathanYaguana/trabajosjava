/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosstring;

import java.util.Scanner;

/**
 *
 * @author PROGRAMACION 2do A
 */
public class Menu
{

    public int mostrarMenu()
    {
        Scanner sc = new Scanner(System.in);

        int intOpcion = 0;

        System.out.println("\n1. charAt");
        System.out.println("2. compareTo");
        System.out.println("3. compareToIgnoreCase");
        System.out.println("4. concat");
        System.out.println("5. endsWith");
        System.out.println("6. equalsIgnoreCase");
        System.out.println("7. indexOf");
        System.out.println("8. lasIndexOf");
        System.out.println("9. length");
        System.out.println("10. replace");
        System.out.println("11. replaceFirst");
        System.out.println("12. replaceAll");
        System.out.println("13. startsWitch");
        System.out.println("14. substring");
        System.out.println("15. toCharArray");
        System.out.println("16. toLowerCase");
        System.out.println("17. toUpperCase");
        System.out.println("18. trim");
        System.out.println("19. valueOf");
        System.out.println("20. isEmpty");
        System.out.println("21. Salir");

        System.out.println("\n¿Que método desea usar?");
        intOpcion = sc.nextInt();

        return intOpcion;

    }

}
