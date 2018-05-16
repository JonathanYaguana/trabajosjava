/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoprueba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edu_r
 */
public class RepasoPrueba
{
static File fNuevo = new File("c:\\prac\\estudiante1.bin");
    static File fFichero = new File("c:\\prac\\estudiante.bin");
    //static ArrayList use = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        File fFichero = new File("c:\\prac\\estudiante.bin");

        int intOpcion = 0;
        int intIndice = 0;

        String strLinea = "";
        String strLinea2 = "";

        String strNombre;
        String strApellido;
        String strEdad;
        String strCedula;
        

        LeerFicheroSub();

        
        // 
        //   LeerFicheroSub();
        System.out.println("Seleccione el usuario a modificar la clave");

        intOpcion = sc.nextInt();

        intOpcion = intOpcion - 1;

        strLinea = (String) use.get(intOpcion);
        
        
        System.out.println("Ingrese nueva linea");
        System.out.println("Ingrese Nombre");
        String strNombre1 = sc.next();
        System.out.println("Ingrese Apellido");
        String strApellido1 = sc.next();
        System.out.println("Ingrese edad");
        String strEdad1 = sc.next();
        System.out.println("Ingrese Cedula");
        String strCedula1 = sc.next();

//        intIndice = strLinea.indexOf("*");
//
//        strNombre = strLinea.substring(0, intIndice);
//
//        strLinea2 = strLinea.substring(intIndice + 1);
//
//        intIndice = strLinea2.indexOf("*");
//
//        strApellido = strLinea2.substring(0, intIndice);
//
//        strLinea2 = strLinea.substring(intIndice + 1);
//
//        intIndice = strLinea2.indexOf("*");
//
//        strEdad = strLinea2.substring(0, intIndice);
//
//        strCedula = strLinea.substring(intIndice + 1).replace('*', ' ').trim();
//
////        strLinea = strNombre + "*" + strApellido + "*" + strEdad + "*" + strCedula + "*";
        System.out.println(strLinea);
        strLinea2=strNombre1 + "*" + strApellido1 + "*" + strEdad1 + "*" + strCedula1 + "*";
        System.out.println(strLinea2);

        ModificarFichero(fFichero, strLinea, strLinea2);
        //EliminarFichero(fFichero,strLinea );

        LeerFicheroSub();

    }

    public static void ModificarFichero(File fAntiguo, String strLnAntigua, String strLnNueva) {

        try {

            if (fAntiguo.exists()) {

                BufferedReader br = new BufferedReader(new FileReader(fAntiguo));

                String strLinea;

                while ((strLinea = br.readLine()) != null) {

                    if (strLinea.toUpperCase().trim().equals(strLnAntigua.toUpperCase().trim())) {

                        EscribirFichero2(fNuevo, strLnNueva);

                    } else {

                        EscribirFichero2(fNuevo, strLinea);

                    }
                }
                br.close();

                BorrarFichero(fAntiguo);

                fNuevo.renameTo(fAntiguo);

            } else {
                System.out.println("Archivo no existe");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void EscribirFichero(File fArchivo, String strCadena) {

        try {
            FileWriter fichero = new FileWriter(fArchivo, true);
            PrintWriter pw = new PrintWriter(fichero);
            pw.println(strCadena + "*");
            System.out.println("Se guardo un nuevo registro");

            fichero.close();
            pw.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void EscribirFichero2(File fFichero, String strCadena) {

        try {

            BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fFichero, true)));

            br.write(strCadena + "\r\n");

            br.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    

    public static void EliminarFichero(File fAntiguo, String strAntigua) {

        try {
            if (fAntiguo.exists()) {
                BufferedReader bre = new BufferedReader(new FileReader(fAntiguo));

                String strLinea;

                while ((strLinea = bre.readLine()) != null) {
                    if (strLinea.toUpperCase().trim().equals(strAntigua.toUpperCase().trim())) {

                    } else {
                        EscribirFichero(fNuevo, strLinea);
                    }
                }
                bre.close();

                BorrarFichero(fAntiguo);

                fNuevo.renameTo(fAntiguo);
                //   BorrarFichero(fNuevo);
            } else {
                System.out.println("Fichero No Existe");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void BorrarFichero(File fFichero) {

        try {

            if (fFichero.exists()) {

                fFichero.delete();
                System.out.println("Fichero asido borrado");

            } else {

                System.out.println("Fichero no asido borrado");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void LeerFicheroSub() {

        int intIndice;
        int intCont = 1;

        try {

            if (fFichero.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(fFichero));
                String strLinea;
                String strNombre;
                String strApellido;
                String strEdad;
                String strCedula;

                while ((strLinea = br.readLine()) != null) {

                    intIndice = strLinea.indexOf("*");

                    strNombre = strLinea.substring(0, intIndice);

                    strLinea = strLinea.substring(intIndice + 1);

                    intIndice = strLinea.indexOf("*");

                    strApellido = strLinea.substring(0, intIndice);

                    strLinea = strLinea.substring(intIndice + 1);

                    intIndice = strLinea.indexOf("*");

                    strEdad = strLinea.substring(0, intIndice);

                    strCedula = strLinea.substring(intIndice + 1).replace('*', ' ').trim();

                    System.out.println("\n" + intCont + ".-Usuario: " + strNombre + "\n   Apellido: " + strApellido + "\n   Edad: " + strEdad + "\n   Cedula: " + strCedula);

                    use.add(strNombre + "*" + strApellido + "*" + strEdad + "*" + strCedula + "*");

                    intCont++;
                }
                br.close();

            } else {
                System.out.println("Fichero no existe");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
    
    
    
    
    
    
 
    
    

 
//
///*   
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        
//
//        File archivo = null;
//        FileReader fr = null;
//        BufferedReader br = null;
//
//        int intIndice = 0;
//
//        String strCadena = " ";
//        String strNombre = "";
//        String strApellido = "";
//        String strFecha = "";
//        String strCedula = "";
//        String strEdad = "";
//
//        try
//        {
//            //archivo = new File("C:\\Users\\edu_r\\Documents\\Archivos Netbeans\\usuarios.txt");
//            fr = new FileReader(archivo);
//            br = new BufferedReader(fr);
//            int IntOpc = 0;
//            FileOutputStream FOS = null;
//            DataOutputStream DataOut = null;
//
//            FOS = new FileOutputStream("C:\\Users\\edu_r\\Documents\\Archivos Netbeans\\usuarios.bin", true);
//            DataOut = new DataOutputStream(FOS);
//
//            while (IntOpc != -1)
//            {
//                System.out.println("Ingrese -1 para salir");
//
//                IntOpc = sc.nextInt();
//
//                if (IntOpc != -1)
//                {
//                    Scanner s = new Scanner(System.in);
//                    System.out.println("Ingrese los nombre del estudiante");
//                    
//                    strNombre = s.nextLine();
//
//                    System.out.println("Ingrese los apellidos del estudiante");
//                    strApellido = s.nextLine();
//
//                    System.out.println("Ingrese la cedula del estudiante");
//                    strCedula = s.nextLine();
//
//                    System.out.println("Ingrese la edad del estudiante");
//                    strEdad = s.nextLine();
//                    
//                    strCadena=strNombre + "*" + strApellido + "*" + strCedula + "*" + strEdad + "*";
//
//                    DataOut.writeUTF(strCadena+"\n\r");
//                    
//                    System.out.println("Hola");
//                    FOS.close();
//                    
//                }
//
//            }
//
//            while ((strCadena = br.readLine()) != null)
//            {
//                intIndice = strCadena.indexOf("*");
//                strNombre = strCadena.substring(0, intIndice);
//                System.out.println("" + strNombre);
//                strCadena = strCadena.substring(intIndice + 1);
//                System.out.println("" + strCadena);
//                intIndice = strCadena.indexOf("*");
//                strApellido = strCadena.substring(0, intIndice);
//                System.out.println("" + strApellido);
//                strCadena = strCadena.substring(intIndice + 1);
//                System.out.println("" + strCadena);
//                intIndice = strCadena.indexOf("*");
//                strFecha = strCadena.substring(0, intIndice);
//                System.out.println("" + strFecha);
//                strCadena = strCadena.substring(intIndice + 1);
//                System.out.println("" + strCadena);
//                intIndice = strCadena.indexOf("*");
//                strCedula = strCadena.substring(0, intIndice);
//                System.out.println("" + strCedula);
//                strCadena = strCadena.substring(intIndice + 1).replace("*", "").trim();
//                System.out.println("" + strCadena);
//
//            }
//
//        } catch (IOException ex)
//        {
//            ex.printStackTrace();
//        } finally
//        {
//            try
//            {
//                if (null != fr)
//                {
//                    fr.close();
//                }
//            } catch (IOException ex1)
//            {
//                ex1.printStackTrace();
//            }
//
//        }
//
//    }
//
//}
