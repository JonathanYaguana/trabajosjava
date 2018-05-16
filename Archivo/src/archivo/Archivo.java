package archivo;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author mauricio
 */
public class Archivo
{

    Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        String strUsuario = " ";
        String strPassword = " ";
        String strCadena = " ";
        String strUser = " ";
        String strPass = " ";
        String strNUser = " ";
        String strNpass = " ";
        String strNpass2 = " ";

        String strLinea = " ";

        String strNombre = " ";
        String StrApellido = " ";
        String StrCedula = " ";
        String strEdad = " ";

        int intIndice = 0;
        int intOpcion = 0;
        int intContador = 1;

        boolean booExiste = false;
        boolean boolBand1 = true;
        boolean boolBand2 = true;
        boolean boolBand3 = true;
        boolean boolBand4 = true;
        boolean boolBand5 = true;

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner sc = new Scanner(System.in);

        ArrayList usuario = new ArrayList();

        System.out.println("Bienvenidos al Sistema\n");
        System.out.println("Ingrese el usuario: ");

        strUsuario = sc.nextLine();

        System.out.println("Ingrese la contraceña: ");

        strPassword = sc.nextLine();

        try
        {
            archivo = new File("C:\\Archivos\\Usuarios.txt");

            fr = new FileReader(archivo);

            br = new BufferedReader(fr);

            while ((strCadena = br.readLine()) != null)
            {

                strCadena = strCadena.substring(0);
                intIndice = strCadena.indexOf('*');

                strUser = strCadena.substring(0, intIndice);
                strPass = strCadena.substring(intIndice + 1);
                strPass = strPass.replace('*', ' ');
                strPass = strPass.trim();

                if ((strUsuario.equals(strUser)) && (strPassword.equals(strPass)))

                {
                    booExiste = true;
                    menu Objmenu = new menu();

                    while (boolBand1 == true)
                    {
                        intOpcion = Objmenu.mostrarMenu();

                        switch (intOpcion)
                        {
                            case 1:
                                System.out.println("Administrar Usuarios");

                                while (boolBand2 == true)
                                {
                                    intOpcion = Objmenu.mostarUsuarios();
                                    switch (intOpcion)
                                    {
                                        case 1:
                                            //Es para escribir en un archivo

                                            System.out.println("Ingresar el nuevo usuario usuario");
                                            strNUser = sc.nextLine();

                                            while (boolBand5)
                                            {

                                                System.out.println("Ingresar la clave del usuario");
                                                strNpass = sc.nextLine();

                                                System.out.println("Repita la clave del usuario");
                                                strNpass2 = sc.nextLine();

                                                if (strNpass.contains(strNpass2))

                                                {

                                                    boolBand5 = false;
                                                } else
                                                {
                                                    System.out.println("La contraceña no coincide");

                                                }

                                                FileWriter fichero = null;
                                                PrintWriter pw = null;

                                                try
                                                {
                                                    fichero = new FileWriter("C:\\Archivos\\Usuarios.txt", true);

                                                    pw = new PrintWriter(fichero);

                                                    pw.println(strNUser + "*" + strNpass + "*");
                                                    System.out.println("Se guardo el nuevo usuario");

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

                                            break;
                                        case 2:
                                            //modificar archivo
                                            System.out.println("============");
                                            File archi = new File("C:\\Archivos\\Usuarios.txt");
                                            FileReader carch = new FileReader(archi); //leer el conenido de es archivo 
                                            BufferedReader rarch = new BufferedReader(carch); // permiter recorre line por plinea

                                            while ((strCadena = rarch.readLine()) != null)
                                            {
                                                strCadena = strCadena.substring(0);
                                                intIndice = strCadena.indexOf('*');
                                                strUser = strCadena.substring(0, intIndice);
                                                strPass = strCadena.substring(intIndice + 1);
                                                strPass = strPass.replace('*', ' ');
                                                strPass = strPass.trim();
                                                System.out.println(intContador + " el usuario es: " + strUser + " clave: " + strPass);
                                                intContador = intContador + 1;

                                                usuario.add(strUser + "*" + strPass + "*");
                                            }
                                            System.out.println("seleccione el numero del Usuario a Modificar:");
                                            intOpcion = sc.nextInt();
                                            intOpcion = intOpcion - 1;

                                            strNUser = (String) usuario.get(intOpcion);

                                            System.out.println("Ingrese la nueva contraseña");
                                            sc.nextLine();
                                            strNpass = sc.nextLine();

                                            System.out.println("Repita la clave");
                                            strNpass2 = sc.nextLine();

                                            //PROCESO DE MODIFICACION
                                            String strNuevo = "C:\\Archivos\\Usuarios1.txt";
                                            File nuevo = new File(strNuevo);
                                            FileWriter fichero = null;
                                            PrintWriter pw = null;

                                            try
                                            {
                                                if (archi.exists())
                                                {
                                                    FileReader fr2 = new FileReader((archivo));
                                                    BufferedReader br2 = new BufferedReader(fr2);
                                                    while ((strCadena = br.readLine()) != null)
                                                    {
                                                        if (strCadena.toUpperCase().trim().equals(strNUser.toUpperCase().trim()))
                                                        {

                                                            
                                                                fichero = new FileWriter(strNuevo, true);
                                                                pw = new PrintWriter(fichero);
                                                                intIndice = strNUser.indexOf("*");
                                                                pw.println(strNUser.substring(0, intIndice - 1) + "*" + strNpass + "*");
                                                            
                                                        } else
                                                        {
                                                            fichero = new FileWriter(strNuevo, true);
                                                            pw = new PrintWriter(fichero);
                                                            pw.println(strCadena);

                                                        }
                                                    }

                                                    archi.delete();
                                                    System.out.println("Archivo borrado");
                                                    nuevo.renameTo(archi);
                                                    br.close();

                                                }
                                            } catch (Exception ex)
                                            {
                                                ex.printStackTrace();
                                            }

                                            break;
                                        case 3:

                                            break;
                                        case 4:

                                            //Es para leer y presentar los datos del archivo
                                            File f = new File("C:\\Archivos\\Usuarios.txt");
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

                                                    System.out.println("El usuario es: " + s1.next() + " La clave es: " + s1.next());

                                                }
                                            } catch (Exception ex)
                                            {

                                            }

                                            break;
                                        case 5:
                                            boolBand2 = false;
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }

                                }
                                break;
                            case 2:
                                while (boolBand3)
                                {

                                    intOpcion = Objmenu.mostarEstudiantes();

                                    switch (intOpcion)
                                    {

                                        case 1:

                                            int intValor = 0;
                                            FileOutputStream fos = null;
                                            DataOutputStream salida = null;

                                            try
                                            {
                                                while (intValor != -1)
                                                {

                                                    System.out.println("Ingrese el nombre del estudiante ");
                                                    strNombre = sc.nextLine();

                                                    System.out.println("Ingrese los apellidos del estudiante");
                                                    StrApellido = sc.nextLine();

                                                    System.out.println("Ingrese la cedula del estudiante");
                                                    StrCedula = sc.nextLine();
                                                    System.out.println("Ingrese la edad del estudiante");
                                                    strEdad = sc.nextLine();

                                                    fos = new FileOutputStream("C:\\Archivos\\Estudiantes.bin", true);
                                                    salida = new DataOutputStream(fos);
                                                    salida.writeUTF(strNombre + "*" + StrApellido + "*" + StrCedula + "*" + strEdad + "*" + "\n");

                                                    System.out.println("Ingrese -1 para salir");
                                                    intValor = sc.nextInt();
                                                }
                                            } catch (Exception ex)
                                            {
                                                ex.printStackTrace();

                                            } finally
                                            {
                                                try
                                                {
                                                    if (fos != null)
                                                    {
                                                        fos.close();

                                                    }
                                                    if (salida != null)
                                                    {
                                                        salida.close();
                                                    }

                                                } catch (Exception ex2)
                                                {

                                                    ex2.printStackTrace();
                                                }
                                            }

                                            break;
                                        case 2:
                                            System.out.println("Modificar");

                                            break;
                                        case 3:
                                            System.out.println("Eliminar");
                                            break;
                                        case 4:
                                            System.out.println("Mostrar");
                                            break;
                                        case 5:
                                            System.out.println("Regresar");
                                            break;
                                        default:
                                            throw new AssertionError();

                                    }
                                }

                                break;
                            case 3:
                                while (boolBand3)
                                {

                                    intOpcion = Objmenu.mostarEstudiantes();

                                    switch (intOpcion)
                                    {

                                        case 1:

                                            int intValor = 0;
                                            FileOutputStream fos = null;
                                            DataOutputStream salida = null;

                                            try
                                            {
                                                while (intValor != -1)
                                                {

                                                    System.out.println("Ingrese el nombre del docente");
                                                    strNombre = sc.nextLine();

                                                    System.out.println("Ingrese los apellidos del docente");
                                                    StrApellido = sc.nextLine();

                                                    System.out.println("Ingrese la cedula del docente");
                                                    StrCedula = sc.nextLine();
                                                    System.out.println("Ingrese fecha de nacimiento");
                                                    strEdad = sc.nextLine();
                                                    System.out.println("Ingrese fecha de titulo");
                                                    strEdad = sc.nextLine();

                                                    fos = new FileOutputStream("C:\\Archivos\\Docente.bin", true);
                                                    salida = new DataOutputStream(fos);
                                                    salida.writeUTF(strNombre + "*" + StrApellido + "*" + StrCedula + "*" + strEdad + "*" + "\n");

                                                    System.out.println("Ingrese -1 para salir");
                                                    intValor = sc.nextInt();
                                                }
                                            } catch (Exception ex)
                                            {
                                                ex.printStackTrace();

                                            } finally
                                            {
                                                try
                                                {
                                                    if (fos != null)
                                                    {
                                                        fos.close();

                                                    }
                                                    if (salida != null)
                                                    {
                                                        salida.close();
                                                    }

                                                } catch (Exception ex2)
                                                {

                                                    ex2.printStackTrace();
                                                }
                                            }

                                            break;
                                        case 2:
                                            System.out.println("Modificar");
                                            break;
                                        case 3:
                                            System.out.println("Eliminar");
                                            break;
                                        case 4:
                                            System.out.println("Mostrar");
                                            break;
                                        case 5:

                                            break;
                                        default:
                                            throw new AssertionError();

                                    }
                                }
                                break;
                            case 4:
                                boolBand1 = false;
                                break;
                            default:
                                throw new AssertionError();
                        }

                    }

                }

            }
            if (booExiste == false)
            {
                System.out.println("No existe le usuario");
            }

        } catch (IOException ex)
        {
            ex.printStackTrace();
        } finally
        {
            try
            {
                if (null != fr)
                {
                    fr.close();
                }
            } catch (IOException ex1)
            {
                ex1.printStackTrace();
            }

        }

    }

}
