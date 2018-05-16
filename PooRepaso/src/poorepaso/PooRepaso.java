/*
 Repaso de POO
 */
package poorepaso;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class PooRepaso
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

        String strCedula = " ";
        String strNombre = " ";
        String strApellido = " ";
        String strFecha = " ";
        String strGenero = " ";

        Estudiante objEstudiante = new Estudiante();
        Menu objMenu = new Menu();
        Scanner sc = new Scanner(System.in);
        intOpc = objMenu.presentarMenu();

        switch (intOpc)
        {
            case 1:
                System.out.println("Ingresar nombre del estudiante:");
                strNombre = sc.nextLine();
                System.out.println("Ingrear apellido: ");
                strApellido = sc.nextLine();
                System.out.println("Ingrear ingresar fecha de nacimiento dd/mm/yy : ");
                strFecha = sc.nextLine();
                System.out.println("Ingrear genero: ");
                strGenero = sc.nextLine();

                do
                {

                    System.out.println("Ingrear cedula ");
                    strCedula = sc.nextLine();

                    boolCedula = objEstudiante.comprobarCedula(strCedula);

                    if (boolCedula)
                    {
                        System.out.println("La cedula es correcta");
                        objEstudiante.grabarArchivo(strNombre, strApellido, strFecha, strGenero, strCedula);
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
                objEstudiante.presentarArchivo();
                objEstudiante.CalcularEdad();
                break;
                
            case 3:
                System.out.println("A");
                strNombre=sc.nextLine();
                System.out.println("B");
                strApellido=sc.nextLine();
                
                if (strNombre.equalsIgnoreCase(strApellido))
                {
                    System.out.println("*********");
                }
                
                
                break;

            default:
                System.err.println("Opcion incorrecta");

        }

    }
}
