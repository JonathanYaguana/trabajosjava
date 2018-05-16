/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorepaso;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author PROGRAMACION 2do A
 */
public class Estudiante
{

    public boolean comprobarCedula(String strCedula)
    {

        int[] arrayDigito = new int[10];
        int intsuma = 0;
        int intAux = 0;

        Boolean booComprobacion = false;

        for (int i = 0; i < 10; i++)
        {
            if (i % 2 == 0)
            {
                arrayDigito[i] = (Integer.valueOf(String.valueOf(strCedula.charAt(i)))) * 2;

            } else
            {

                arrayDigito[i] = Integer.valueOf(String.valueOf(strCedula.charAt(i)));

            }
            if (arrayDigito[i] > 9)
            {
                arrayDigito[i] = arrayDigito[i] - 9;

            }

        }

        for (int i = 0; i < 9; i++)
        {
            intsuma = intsuma + arrayDigito[i];
        }
        //System.out.println("Suma" + intsuma);
        if (intsuma > 10)
        {
            intAux = ((intsuma / 10) + 1) * 10;

            //System.out.println("aux" + intAux);
            if (intAux - intsuma == 10)
            {
                intAux = intAux - 10;

            }
            intsuma = intAux - intsuma;

        }

        if (intsuma == arrayDigito[9])
        {
            booComprobacion = true;
        }

        return booComprobacion;
    }

    public void grabarArchivo(String strNombre, String strApellido, String strFechaNacimiento, String strGenero, String strcedula)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try
        {
            fichero = new FileWriter("C:\\Archivos\\estudiantes.txt", true);

            pw = new PrintWriter(fichero);

            pw.println(strNombre + "*" + strApellido + "*" + strFechaNacimiento + "*" + strGenero + "*" + strcedula);

            pw.close();

        } catch (Exception ex)
        {
            ex.printStackTrace();

        } finally
        {
            try
            {
                if (null != fichero)
                {
                    fichero.close();
                }
            } catch (Exception ex2)
            {
                ex2.printStackTrace();
            }
        }

    }

    public void presentarArchivo()
    {
        String strLinea;
        File f = new File("C:\\Archivos\\estudiantes.txt");
        Scanner s;
        Scanner s1;
        try
        {
            s = new Scanner(f);
            while (s.hasNextLine() == true)
            {
                strLinea = s.nextLine();

                s1 = new Scanner(strLinea);
                s1.useDelimiter("\\Q*\\E");

                System.out.println(s1.next() + " " + s1.next() + " " + s1.next() + " " + s1.next() + " " + s1.next());

            }
        } catch (Exception ex)
        {

        }

    }

    public void ModificarArchivo(String strdato, String strNuevodato)
    {

    }

    public void CalcularEdad()
    {
        String strEdad="";
        int intEdad = 0;
        String strLinea;
        File f = new File("C:\\Archivos\\estudiantes.txt");
        Scanner s;
        Scanner s1;
        try
        {
            s = new Scanner(f);
            while (s.hasNextLine() == true)
            {
                strLinea = s.nextLine();

                s1 = new Scanner(strLinea);
                s1.useDelimiter("\\Q*\\E");

               strEdad=s1.next()+s1.next()+s1.next();
                System.out.println(""+strEdad);

            }
        } catch (Exception ex)
        {

        }

        //return intEdad;

    }

}
