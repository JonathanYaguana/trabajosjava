/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public class menu
{

    Scanner sc = new Scanner(System.in);

    public int mostrarMenu()
    {
        int intOpcion = 0;

        System.out.println("1. Administrar Usuarios");
        System.out.println("2. Administrar Estudiante");
        System.out.println("3. Administrar Docentes");
        System.out.println("4. SALIR");

        intOpcion = sc.nextInt();

        return intOpcion;

    }

    public int mostarUsuarios()
    {
        int intOpcion;
        System.out.println("1. Ingresar Usuarios");
        System.out.println("2. Modificar Usuarios");
        System.out.println("3. Eliminar Usuarios");
        System.out.println("4. Mostrar usuarios");
        System.out.println("5. Regresar al menu principal");

        intOpcion = sc.nextInt();
        return intOpcion;

    }
public int mostarEstudiantes()
    {
        int intOpcion;
        System.out.println("1. Ingresar Estudiantes");
        System.out.println("2. Modificar Estudiantes");
        System.out.println("3. Eliminar Estudiantes");
        System.out.println("4. Mostrar Estudiantes");
        System.out.println("5. Regresar al menu principal");

        intOpcion = sc.nextInt();
        return intOpcion;

    }
}
