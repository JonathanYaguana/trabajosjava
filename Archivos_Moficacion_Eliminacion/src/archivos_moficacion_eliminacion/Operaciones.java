/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_moficacion_eliminacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;

/**
 *
 * @author mauricio
 */
public class Operaciones
{

    Scanner sc = new Scanner(System.in);

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

    public void grabarArchivo(String strNombre, String strApellido, String strFechaNacimiento, String strGenero, String strcedula, int intOpc)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try
        {

            if (intOpc == 1)
            {
                fichero = new FileWriter("C:\\Archivos\\estudiantes.txt", true);
            }
            if (intOpc == 2)
            {
                fichero = new FileWriter("C:\\Archivos\\docentes.txt", true);
            }
            if (intOpc == 3)
            {
                fichero = new FileWriter("C:\\Archivos\\materias.txt", true);
            }

            pw = new PrintWriter(fichero);

            pw.println(strNombre + "*" + strApellido + "*" + strFechaNacimiento + "*" + strGenero + "*" + strcedula+"\r\n");

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
                    pw.close();
                }
            } catch (Exception ex2)
            {
                ex2.printStackTrace();
            }
        }

    }

    public void presentarArchivo(int intOpc)
    {
        String strLinea;
        File f = null;
        if (intOpc == 1)
        {
            f = new File("C:\\Archivos\\estudiantes.txt");
        }
        if (intOpc == 2)
        {
            f = new File("C:\\Archivos\\docentes.txt");
        }
        if (intOpc == 3)
        {
            f = new File("C:\\Archivos\\materias.txt");
        }

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

    public void ModificarArchivo(String strNombre, String strApellido, String strNuevodato, int intOpc)
    {

        String strAux2;
        String strAux3;
        String strLinea;
        FileWriter fichero = null;
        PrintWriter pw = null;

        File f = null;
        File f2 = null;
        if (intOpc == 1)
        {
            f = new File("C:\\Archivos\\estudiantes.txt");
            f2 = new File("C:\\Archivos\\estudiantes2.txt");
        }
        if (intOpc == 2)
        {
            f = new File("C:\\Archivos\\docentes.txt");
            f2 = new File("C:\\Archivos\\docentes2.txt");
        }
        if (intOpc == 3)
        {
            f = new File("C:\\Archivos\\materias.txt");
            f2 = new File("C:\\Archivos\\materias2.txt");
        }
        Scanner s;
        Scanner s1;
        try
        {
            if (f.exists())
            {
                s = new Scanner(f);
                while (s.hasNextLine() == true)
                {
                    strLinea = s.nextLine();
                    s1 = new Scanner(strLinea);
                    s1.useDelimiter("\\Q*\\E");
                    strAux2 = s1.next();
                    strAux3 = s1.next();
                    if (strNombre.equalsIgnoreCase(strAux2) && strApellido.equalsIgnoreCase(strAux3))
                    {

                        try
                        {
                            fichero = new FileWriter(f2, true);
                            pw = new PrintWriter(fichero);

                            pw.println(strNuevodato);

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
                                    pw.close();
                                }
                            } catch (Exception ex2)
                            {
                                ex2.printStackTrace();
                            }
                        }

                    } else
                    {
                        try
                        {
                            fichero = new FileWriter(f2, true);
                            pw = new PrintWriter(fichero);
                            pw.println(strLinea);
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
                                    pw.close();
                                }
                            } catch (Exception ex2)
                            {
                                ex2.printStackTrace();
                            }
                        }

                    }

                }

            s.close();
            }

            pw.close();
            fichero.close();

            f.delete();
            f2.renameTo(f);
            System.out.println("Archivo borrado");

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
                    pw.close();

                }
            } catch (Exception ex2)
            {
                ex2.printStackTrace();
            }
        }

    }
    
    public void EliminarArchivo(String strNombre, String strApellido,int intOpc){
    

        String strAux2;
        String strAux3;
        String strLinea;
        FileWriter fichero = null;
        PrintWriter pw = null;

        File f = null;
        File f2 = null;
        if (intOpc == 1)
        {
            f = new File("C:\\Archivos\\estudiantes.txt");
            f2 = new File("C:\\Archivos\\estudiantes2.txt");
        }
        if (intOpc == 2)
        {
            f = new File("C:\\Archivos\\docentes.txt");
            f2 = new File("C:\\Archivos\\docentes2.txt");
        }
        if (intOpc == 3)
        {
            f = new File("C:\\Archivos\\materias.txt");
            f2 = new File("C:\\Archivos\\materias2.txt");
        }
        Scanner s;
        Scanner s1;
        try
        {
            if (f.exists())
            {
                s = new Scanner(f);
                while (s.hasNextLine() == true)
                {
                    strLinea = s.nextLine();
                    s1 = new Scanner(strLinea);
                    s1.useDelimiter("\\Q*\\E");
                    strAux2 = s1.next();
                    strAux3 = s1.next();
                    if (strNombre.equalsIgnoreCase(strAux2) && strApellido.equalsIgnoreCase(strAux3))
                    {

                        try
                        {
                            fichero = new FileWriter(f2, true);
                            pw = new PrintWriter(fichero);

                            pw.println();

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
                                    pw.close();
                                }
                            } catch (Exception ex2)
                            {
                                ex2.printStackTrace();
                            }
                        }

                    } 

                }

            s.close();
            }

            pw.close();
            fichero.close();

            f.delete();
            f2.renameTo(f);
            System.out.println("Archivo borrado");

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
                    pw.close();

                }
            } catch (Exception ex2)
            {
                ex2.printStackTrace();
            }
        }
    
    
    }
    

    public String SacarFecha(int intOpc)
    {
        String strEdad = "";
        String strAux = "";
        String strAux2 = "";
        String strAux3 = "";
        String strFecha = "";
        String strLinea;
        String strNombre = "";
        String strApellido = "";

        boolean booBand3 = true;

        while (booBand3)
        {
            System.out.println("Ingrese el nombre");
            strNombre = sc.nextLine();
            System.out.println("Ingrese el Apellido del");
            strApellido = sc.nextLine();

            File f = null;
            if (intOpc == 1)
            {
                f = new File("C:\\Archivos\\estudiantes.txt");
            }
            if (intOpc == 2)
            {
                f = new File("C:\\Archivos\\docentes.txt");
            }
            if (intOpc == 3)
            {
                f = new File("C:\\Archivos\\materias.txt");
            }
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
                    strAux2 = s1.next();
                    strAux3 = s1.next();

                    if (strNombre.equalsIgnoreCase(strAux2) && strApellido.equalsIgnoreCase(strAux3))
                    {
                        s1 = new Scanner(strLinea);
                        s1.useDelimiter("\\Q*\\E");

                        strAux = s1.next() + s1.next();
                        strFecha = s1.next();
                        System.out.print("El año de nacimento de " + strNombre + " " + strApellido + " es: ");
                        System.out.println("" + strFecha);
                        booBand3 = !true;
                        s1.close();

                    }

                }

                if (booBand3)
                {
                    System.out.println("Usuario No encontrado");
                }

            } catch (Exception ex)
            {

            }
        }

        return strFecha;
    }

    public int[] ArrayFecha(String strFecha)
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

    public String fechaActual()
    {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    public void CalcularFecha(int ArrayNacimiento[], int ArrayActual[])
    {
        int intAños = 0;
        int intMeses = 0;
        int intDia = 0;

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

        System.out.print(
                "Su edad es: ");
        System.out.println(
                "" + intAños + " años con " + intMeses + " meses y " + intDia + " dias");

    }
}
