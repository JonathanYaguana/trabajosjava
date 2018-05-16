/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_moficacion_eliminacion;

import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public class Menu
{

    Scanner sc = new Scanner(System.in);

    public int presentarMenuDocente()
    {
        System.out.println("\n===== Menu Estudinate ====");
        int intOpc = 0;
        System.out.println("1. Ingresar Nuevo docente");

        System.out.println("2. Presentar datos");

        System.out.println("3. Modificar datos");

        System.out.println("4. Borrar datos");

        System.out.println("5. Mostrar edad de docente");

        System.out.println("6. Regresar Menu");

        intOpc = sc.nextInt();

        return intOpc;
    }

    public int presentarMenuEstudiante()
    {
        int intOpc = 0;

        System.out.println("\n===== Menu Estudinate ====");

        System.out.println("1. Ingresar nuevo estudiante");

        System.out.println("2. Presentar datos");

        System.out.println("3. Modificar datos");

        System.out.println("4. Borrar datos");

        System.out.println("5. Mostrar edad de estudiante");

        System.out.println("6. Regresar Menu");

        intOpc = sc.nextInt();

        return intOpc;
    }

    public int presentarMenu()
    {
        int intOpc = 0;

        System.out.println("\n===== Bienvenido al Sistema ====");

        System.out.println("1. Estudiante");

        System.out.println("2. Docente");

        System.out.println("3. Materia");
        System.out.println("4. Salir");

        intOpc = sc.nextInt();

        return intOpc;
    }

}
