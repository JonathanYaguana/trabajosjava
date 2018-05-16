/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Repaso
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String strFechaNacimiento = "";
        String strFechaActual = "";

        Usuario objUser = new Usuario();
//        System.out.println("INGRESAR EL NOMBRE DEL USUARIO: ");
//        objUser.setStrNombre(sc.nextLine());
//        System.out.println("INGRESAR EL APELLIDO DEL USUARUO: ");
//        objUser.setStrApellido(sc.nextLine());
//        System.out.println("INGRESE LA CEDULA DEL USUARIO: ");
//        objUser.setStrCedula(sc.nextLine());
        System.out.println("INGRESE LA FECHA DE NACIMIENTO: ");
        strFechaNacimiento = sc.nextLine();
        System.out.println("INGRESE LA FECHA ACTUAL: ");
        strFechaActual = sc.nextLine();
        CalcularEdad(strFechaNacimiento, strFechaActual);

    }

    public static int CalcularEdad(String strFechaNacimiento, String strFechaActual)
    {
        int intEdad = 0;
        int intIndice = 0;
        String strDiaActual = "";
        String strMesActual = "";
        String strAnioActual = "";
        String strDia = "";
        String strMes = "";
        String strAnio = "";

        intIndice = strFechaNacimiento.indexOf("/");
        strDia = strFechaNacimiento.substring(0, intIndice);

        strFechaNacimiento = strFechaNacimiento.substring(intIndice + 1);
        strMes = strFechaNacimiento.substring(0, intIndice);

        strFechaNacimiento = strFechaNacimiento.substring(intIndice + 1);
        strAnio = strFechaNacimiento.substring(0);

        intIndice = strFechaActual.indexOf("/");
        strDiaActual = strFechaActual.substring(0, intIndice);

        strFechaActual = strFechaActual.substring(intIndice + 1);
        strMesActual = strFechaActual.substring(0, intIndice);

        strFechaActual = strFechaActual.substring(intIndice + 1);
        strAnioActual = strFechaActual.substring(0);

        if (Integer.parseInt(strDiaActual) > Integer.parseInt(strDia))
        {
            intEdad = Integer.parseInt(strDiaActual) - Integer.parseInt(strDia);

        }
        if (Integer.parseInt(strAnioActual) > Integer.parseInt(strAnio))
        {
            intEdad = Integer.parseInt(strAnioActual) - Integer.parseInt(strAnio);
            System.out.println(intEdad);

        } else
        {
            System.err.println("Ingrese un anio de nacimento correcto ");
        }

        if (Integer.parseInt(strMesActual) > Integer.parseInt(strMes))
        {
            intEdad = Integer.parseInt(strMesActual) - Integer.parseInt(strMes);
            System.out.println(intEdad);
        } else
        {
            System.out.println("Ingrese un mes correcto");

        }

        intEdad = Integer.parseInt(strDiaActual) - Integer.parseInt(strDia);
        System.out.println(intEdad);

        return intEdad;

    }
}
