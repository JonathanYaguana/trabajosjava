/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repas;

import java.util.Scanner;

/**
 *
 * @author bp2do
 */
public class Repas {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String strFecha = "";

        Usuario objUser = new Usuario();
        System.out.println("INGRESAR EL NOMBRE DEL USUARIO: ");
        objUser.setStrNombre(sc.nextLine());
        System.out.println("INGRESAR EL APELLIDO DEL USUARUO: ");
        objUser.setStrApellido(sc.nextLine());
        System.out.println("INGRESE LA CEDULA DEL USUARIO: ");
        objUser.setStrCedula(sc.nextLine());
        System.out.println("INGRESE LA FECHA DE NACIMIENTO: ");
        System.out.println("");
        strFecha = sc.nextLine();
        CalcularEdad(strFecha);

    }

    public static int CalcularEdad(String strFecha) {
        int intAñoActual = 0;
        int intMesActual = 0;
        int intDiaActual = 0;
        int intEdad = 0;
        int intIndice = 0;
        String strDia;
        String strMes;
        String strAño;
        intIndice = strFecha.indexOf("/");

        strDia = strFecha.substring(0, intIndice);
        //04/11/1996
        System.out.println("El dia es: " + strDia);
        strFecha = strFecha.substring(intIndice + 1);

        intIndice = strFecha.indexOf("/");

        strMes = strFecha.substring(0, intIndice);

        System.out.println("El mes es: " + strMes);

        intIndice = strFecha.indexOf("/");

        strAño = strFecha.substring(intIndice + 1, 7);

        System.out.println("El año es: " + strAño);

        System.out.println("ngrese el dia actual: ");
        intDiaActual = sc.nextInt();
        if (intDiaActual > 0 || intDiaActual <= 31) {
            if(intDiaActual == Integer.parseInt(strDia)){
                intDiaActual = 0;
            }else
                if(intDiaActual > Integer.parseInt(strDia)){
                    intDiaActual -= Integer.parseInt(strDia);
            }else{
                    intDiaActual = 31 -(Integer.parseInt(strDia)-intDiaActual); 
                }
           
            

        } else {
            System.out.println("dia incrrecto");
        }
       
    
        System.out.println("ingrese el mes actual: ");
        intMesActual = sc.nextInt();
        if (intMesActual > 0 && intMesActual <= 13) {
            intMesActual -= Integer.parseInt(strMes);

      
       
            if (intMesActual < 0) {
                intMesActual = 12 + intMesActual;
            }
            
             } else {
            System.out.println("mes incorrecto");
    }
                System.out.println("Ingrese el año actual: ");
                intAñoActual = sc.nextInt();
            

                if (intMesActual > Integer.parseInt(strMes)) {
                     intAñoActual -= Integer.parseInt(strAño);

                } else {
                    
                    intAñoActual -= Integer.parseInt(strAño) +1;
                    
                }
                if(intMesActual == Integer.parseInt(strMes)){
                    
                }
                     
 
        System.out.println("edad:  " + intAñoActual + "Años " + intMesActual + "meses  " + intDiaActual + "dias ");
        return intEdad;

    }
}
