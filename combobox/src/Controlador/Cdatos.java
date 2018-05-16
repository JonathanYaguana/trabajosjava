/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PROGRAMACION 2do A
 */
public class Cdatos
{
File f = new File("C:\\Archivos\\codigos.txt");
    public ArrayList cargarProvincias()
    {
        String strLinea;
        String strProvincia;
        String strAux = "";
        int intIndice;
        ArrayList Lista = new ArrayList();
         
        try {

            BufferedReader br = new BufferedReader(new FileReader(f));

            if (f.exists()) {
                while ((strLinea = br.readLine()) != null) {
                    intIndice = strLinea.indexOf(";");

                    strProvincia = strLinea.substring(0, intIndice);

                    if (!strAux.equals(strProvincia)) {
                        Lista.add(strProvincia);
                        strAux = strProvincia;
                    }
                }
            }
            br.close();
        } catch (Exception ex) {
            System.out.println("Se produjo un error");
        }
        return Lista;

    }

    public ArrayList cargarCanton(String strPro)
    {

        ArrayList Lista = new ArrayList();
        String strLinea;
        String strAux = "";
      
        String strCanton;
        String strProvincia;

        int intIndice;

        try {

            BufferedReader br = new BufferedReader(new FileReader(f));

            if (f.exists()) {
                while ((strLinea = br.readLine()) != null) {
                    intIndice = strLinea.indexOf(";");

                    strProvincia = strLinea.substring(0, intIndice);

                    strLinea = strLinea.substring(intIndice + 1);

                    intIndice = strLinea.indexOf(";");

                    strCanton = strLinea.substring(0, intIndice);

                    if (strProvincia.equals(strPro)) {
                        if (!strAux.equals(strCanton)) {
                            System.out.println(""+strCanton);
                            Lista.add(strCanton);
                            
                            strAux = strCanton;
                        }

                    }
                }
            }
            br.close();
        } catch (Exception ex) {
            System.out.println("Se produjo un error");
        }
        return Lista;
    }

    public ArrayList cargarParroquia(String strProvincia)
    {
        ArrayList Lista = new ArrayList();
        return Lista;

    }

}
