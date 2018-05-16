/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechanacimiento;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.Format;
import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class FechaNacimiento
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String strFechaNacimiento = "";
        boolean booband1 = true;
        boolean booband2;
        boolean booband3;
        boolean booband4;

        int intMeses = 0;
        int intDia = 0;
        int intAños = 0;

        int ArrayNacimiento[] = new int[3];
        int ArrayActual[] = new int[3];

        String strFechaActual;

        do
        {
            System.out.println("Ingrese le fecha de nacimiento en el formato (dd/MM/YYYY)");
            strFechaNacimiento = sc.nextLine();

            ArrayNacimiento = ArrayFecha(strFechaNacimiento);

            strFechaActual = fechaActual();
            ArrayActual = ArrayFecha(strFechaActual);

            if (ArrayNacimiento[2] > ArrayActual[2]||ArrayNacimiento[1] > 12||ArrayNacimiento[0] > 30)
            {
                System.out.println("Fecha incorrecta");
                booband1 = false;
            } else
            {
                booband1 = true;
            }
        } while (!booband1);

        System.out.println("La fecha actual es: " + strFechaActual);

        intAños = ArrayActual[2] - ArrayNacimiento[2];

        if (ArrayNacimiento[1] - ArrayActual[1] == 0)
        {
            intAños = intAños - 1;
        }
        if (ArrayNacimiento[1] <= ArrayActual[1])
        {
            intMeses = ArrayActual[1] - ArrayNacimiento[1];
        } else
        {
            intMeses = 12 - (ArrayNacimiento[1] - ArrayActual[1]);
            intAños = intAños - 1;
        }
        if (ArrayNacimiento[0] <= ArrayActual[0])
        {
            intDia = ArrayActual[0] - ArrayNacimiento[0];
        } else
        {

            intDia = 30 - (ArrayNacimiento[0] - ArrayActual[0]);

        }

        System.out.print("Su edad es: ");
        System.out.println("" + intAños + " años con " + intMeses + " meses y " + intDia + " dias");

    }

    public static int[] ArrayFecha(String strFecha)
    {

        int intRef = 0;
        int[] Array = new int[3];
        intRef = strFecha.indexOf("/");
        Array[0] = Integer.parseInt(strFecha.substring(0, intRef));
        //System.out.println("" + Array[0]);

        
        strFecha = strFecha.substring(intRef + 1);

        //System.out.println("" + strFecha);
        intRef = strFecha.indexOf("/");
        Array[1] = Integer.parseInt(strFecha.substring(0, intRef));
        //System.out.println("" + Array[1]);

        intRef = strFecha.indexOf("/");
        Array[2] = Integer.parseInt(strFecha.substring(intRef + 1));
        //System.out.println("" + Array[2]);

        return Array;
    }

    public static String fechaActual()
    {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

}
