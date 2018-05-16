/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaescaner;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class PracticaEscaner
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String strLinea;
        String strNombre;
        String strApellido;
        String strEdad;
        String strcedula;
        String strContraceña;

        File f = new File("C:\\Archivos\\Usuarios.txt");

        Scanner s1;
        Scanner s2;

        try
        {
            s1 = new Scanner(f);
            while (s1.hasNextLine() == true)
            {
             strLinea=s1.nextLine();
             s2= new Scanner (strLinea);
             s2.useDelimiter("\\Q*\\E");
             strNombre=s2.next();
             System.out.println(""+strNombre);
             strcedula=s2.next();
             System.out.println(""+strcedula);
             strEdad=s2.next();
                System.out.println(""+strEdad);    
             
             
                
                

            }

        } catch (Exception e)
        {
        }

    }

}
