/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Vistas.*;
import java.io.File;
import java.util.Scanner;
import Modelo.m_usuarios;


import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PROGRAMACION 2do A
 */
public class d_usuarios
{

    m_usuarios objM_user = new m_usuarios();
    
    public boolean buscar(String strUss, String strPass)
    {
        boolean booExiste = false;
        String strLinea;
        String strNombre;
        String strApellido;
        String strCedula;
        String strUsuario;
        String strPassword;

        File f = new File("C:\\Archivos\\Usuarios.txt");

        Scanner s;
        Scanner s2;

        System.out.println("" + strUss + " " + strPass);

        try
        {
            s = new Scanner(f);

            while (s.hasNextLine())
            {
                strLinea = s.nextLine();
                s2 = new Scanner(strLinea);
                s2.useDelimiter("\\Q*\\E");
                strNombre = s2.next();
                strApellido = s2.next();
                strCedula = s2.next();
                strUsuario = s2.next();
                strPassword = s2.next();
                System.out.println(strUsuario);
                System.out.println(strPassword);

                if (strUsuario.equals(strUss) && strPassword.equals(strPass))
                {

                    booExiste = true;
                    frmInicio.strNombre = strNombre;
                    frmInicio.strApellido = strApellido;
                    frmInicio.strCedula = strCedula;
                    s.close();

                } else
                {
                    booExiste = false;

                }

            }

        } catch (Exception e)
        {
        }
        return booExiste;

    }

    /**
     *
     * @param modelo
     * @return
     */
    public DefaultTableModel cargarUsuario(DefaultTableModel modelo, File tipo)
    {
        try
        {
            String strLinea;

            

            Scanner s;
            Scanner s2;

            s = new Scanner(tipo);

            while (s.hasNextLine())
            {
                strLinea = s.nextLine();
                s2 = new Scanner(strLinea);
                s2.useDelimiter("\\Q*\\E");

                Object[] datos = new Object[4];
                datos[0] = s2.next();
                datos[1] = s2.next();
                datos[2] = s2.next();
                datos[3] = s2.next();

                modelo.addRow(datos);

            }

        } catch (Exception e)
        {
        }
        return modelo;
    }

    public boolean ingresarUsuario(m_usuarios objUser)
    {

        Boolean boolAccion = true;
        StringBuilder strCadena = new StringBuilder();

        strCadena.append(objUser.getStrNombre() + "*" + objUser.getStrApellido() + "*");
        strCadena.append(objUser.getStrCedula() + "*" + objUser.getStrUsuario() + "*" + objUser.getStrContraceña() + "*");
        try
        {
            File f = new File("C:\\Archivos\\Usuarios.txt");

            FileWriter fichero = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(fichero);
            pw.println(strCadena);
            fichero.close();
            pw.close();
            boolAccion = true;
            JOptionPane.showMessageDialog(null, "Usuario ingresado");

        } catch (Exception e)
        {
            System.out.println("Error al grabar el archivo");
            boolAccion = false;
        }

        return boolAccion;

    }

    public boolean comprobarCedula(m_usuarios objUser)
    {
        String strCadena;

        strCadena = objUser.getStrCedula();

        int suma = 0;
        if (!strCadena.isEmpty())
        {
            for (int i = 0; i < strCadena.length() - 1; i++)
            { // Leemos cada número con un for solo hasta el penúltimo
                int numero = Integer.valueOf(String.valueOf(strCadena.charAt(i)));
                if (i % 2 == 0)
                {
                    numero = numero * 2;
                }
                while (numero > 9)
                {
                    numero = numero - 9;
                }

                suma = suma + numero; // Por cada operación que hacemsos al número tomado, se lo agregamos al contador <suma>.
            }

            int ultimoNumero = Integer.valueOf(String.valueOf(strCadena.charAt(strCadena.length() - 1)));
            int superior = suma;
            while (superior % 10 != 0)
            {
                superior++;
            }
            if (superior - suma == ultimoNumero)
            {
                System.out.println("La cedula es correcta");
                return true;
            } else
            {
                System.out.println("La cedula es incorrecta");
                return false;
            }

        }
        return false;

    }

    public boolean sacarDato(String Cedula)
    {
        boolean booExiste = false;
        String strLinea;
        String strNombre;
        String strApellido;
        String strCedula;
        String strUsuario;
        String strPassword;

        File f = new File("C:\\Archivos\\Usuarios.txt");

        Scanner s;
        Scanner s2;

       try
        {
            s = new Scanner(f);

            while (s.hasNextLine())
            {
                strLinea = s.nextLine();
                s2 = new Scanner(strLinea);
                s2.useDelimiter("\\Q*\\E");
                strNombre = s2.next();
                strApellido = s2.next();
                strCedula = s2.next();
                strUsuario = s2.next();
                strPassword = s2.next();
                
                if (strCedula.equals(Cedula))
                {
                    objM_user.setStrNombre(strNombre);
                    objM_user.setStrApellido(strApellido);
                    objM_user.setStrCedula(strCedula);
                    objM_user.setStrUsuario(strUsuario);
                    objM_user.setStrContraceña(strNombre);
                    objM_user.setStrContraceña(strNombre);
                                                  

                } else
                {
                    booExiste = false;

                }

            }

        } catch (Exception e)
        {
        }
             
        return false;
    }
}
