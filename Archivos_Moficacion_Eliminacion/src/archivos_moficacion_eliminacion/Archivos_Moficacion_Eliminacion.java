/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_moficacion_eliminacion;

import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public class Archivos_Moficacion_Eliminacion
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int intOpc = 0;

        Boolean boolCedula;
        Boolean booBand = true;
        Boolean booBand1 = true;
        Boolean booBand2 = true;
        Boolean booBand3 = true;
        Boolean booBandDocente = true;

        String strCedula = " ";
        String strNombre = " ";
        String strApellido = " ";
        String strFecha = " ";
        String strCarrera = " ";

        Operaciones objOperaciones = new Operaciones();
        Menu objMenu = new Menu();
        Scanner sc = new Scanner(System.in);

        while (booBand2)
        { //Repite menu
            intOpc = objMenu.presentarMenu();
            switch (intOpc)
            {
                case 1: // Estudiante
                    booBand = true;
                    while (booBand) //Repetir Menu Estudiante
                    {
                        intOpc = objMenu.presentarMenuEstudiante();

                        switch (intOpc)
                        {
                            case 1:
                                System.out.println("Ingresar nombre del estudiante:");
                                strNombre = sc.nextLine();
                                System.out.println("Ingrear apellido: ");
                                strApellido = sc.nextLine();
                                System.out.println("Ingrear ingresar fecha de nacimiento dd/mm/yy : ");
                                strFecha = sc.nextLine();
                                System.out.println("Ingrear Carrera: ");
                                strCarrera = sc.nextLine();

                                do
                                {

                                    System.out.println("Ingrear cedula ");
                                    strCedula = sc.nextLine();

                                    boolCedula = objOperaciones.comprobarCedula(strCedula);

                                    if (boolCedula)
                                    {
                                        System.out.println("La cedula es correcta");
                                        objOperaciones.grabarArchivo(strNombre, strApellido, strFecha, strCarrera, strCedula, 1);
                                        System.out.println("Estudiante registrado");
                                        booBand = false;

                                    } else
                                    {

                                        System.err.println("La cedula es incorrecta");

                                        booBand = true;

                                    }
                                } while (booBand);
                                break;
                            case 2:
                                System.out.println("===== Estudiantes =====");

                                objOperaciones.presentarArchivo(1);

                                break;
                            case 3:
                                //Modificar dato
                                System.out.println("Ingrese el nombre  ");
                                strNombre = sc.nextLine();
                                System.out.println("Ingrese el apellido");
                                strApellido = sc.nextLine();
                                System.out.println("Ingrese el nuevo dato ");
                                strFecha = sc.nextLine();
                                objOperaciones.ModificarArchivo(strNombre, strApellido, strFecha, 1);
                                break;

                            case 4:
                                System.out.println("Ingrese el nombre  ");
                                strNombre = sc.nextLine();
                                System.out.println("Ingrese el apellido");
                                strApellido = sc.nextLine();

                                objOperaciones.EliminarArchivo(strNombre, strApellido, 1);
                                break;

                            case 5:

                                strFecha = "";

                                strFecha = objOperaciones.SacarFecha(1);

                                objOperaciones.CalcularFecha(objOperaciones.ArrayFecha(strFecha), objOperaciones.ArrayFecha(objOperaciones.fechaActual()));

                                break;

                            case 6:

                                booBand = false;
                                break;

                            default:
                                System.out.println("Opcion Incorrecta");
                        }

                    } //Termina Menu Estudiante

                    break;
                case 2: //Docente
                    booBandDocente = true;
                    while (booBandDocente) //Repetir Menu Docente
                    {
                        intOpc = objMenu.presentarMenuDocente();

                        switch (intOpc)
                        {
                            case 1:
                                System.out.println("Ingresar nombre del Docente:");
                                strNombre = sc.nextLine();
                                System.out.println("Ingrear apellido: ");
                                strApellido = sc.nextLine();
                                System.out.println("Ingrear ingresar fecha de nacimiento dd/mm/yy : ");
                                strFecha = sc.nextLine();
                                System.out.println("Ingrear Titulo: ");
                                strCarrera = sc.nextLine();

                                do
                                {

                                    System.out.println("Ingrear cedula ");
                                    strCedula = sc.nextLine();

                                    boolCedula = objOperaciones.comprobarCedula(strCedula);

                                    if (boolCedula)
                                    {
                                        System.out.println("La cedula es correcta");
                                        objOperaciones.grabarArchivo(strNombre, strApellido, strFecha, strCarrera, strCedula, 2);
                                        System.out.println("Docente registrado");
                                        booBand = false;

                                    } else
                                    {

                                        System.err.println("La cedula es incorrecta");

                                        booBand = true;

                                    }
                                } while (booBand);
                                break;
                            case 2:
                                System.out.println("===== Docentes =====");

                                objOperaciones.presentarArchivo(2);

                                break;
                            case 3:

                                System.out.println("Ingrese el nombre  ");
                                strNombre = sc.nextLine();
                                System.out.println("Ingrese el apellido");
                                strApellido = sc.nextLine();
                                System.out.println("Ingrese el nuevo dato ");
                                strFecha = sc.nextLine();
                                objOperaciones.ModificarArchivo(strNombre, strApellido, strFecha, 3);
                                break;

                            case 4:
                                System.out.println("Ingrese el nombre  ");
                                strNombre = sc.nextLine();
                                System.out.println("Ingrese el apellido");
                                strApellido = sc.nextLine();

                                objOperaciones.EliminarArchivo(strNombre, strApellido, 1);
                                break;

                            case 5:

                                strFecha = "";

                                strFecha = objOperaciones.SacarFecha(2);

                                objOperaciones.CalcularFecha(objOperaciones.ArrayFecha(strFecha), objOperaciones.ArrayFecha(objOperaciones.fechaActual()));

                                break;

                            case 6:

                                booBandDocente = false;
                                break;

                            default:
                                System.out.println("Opcion Incorrecta");
                        }

                    } //Termina Menu Docente

                    break;
                case 3:// Materia

                    break;
                case 4:
                    booBand2 = false;

                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }

        } //termina menu

    }

}
