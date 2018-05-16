package cedulapro;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class CedulaPro
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su cédula: ");
        String cedula = scanner.next();

        if (cedula.length() != 10 || !isCedulaCorrecta(cedula))
        {
            System.out.println("Su cédula es incorrecta.");
        } else
        {
            System.out.println("Su cedula es correcta.");
        }
    }

    private static boolean isCedulaCorrecta(String cedula)
    {
        int sumaTotal = 0;

        for (int i = 0; i < cedula.length() - 1; i++)
        {
            int numero = Integer.valueOf(String.valueOf(cedula.charAt(i)));

            int total = numero;
            if (i % 2 == 0)
            {
                total += numero;
            }

            if (total > 9)
            {
                total -= 9;
            }

            sumaTotal += total;
        }

        int tempSum = ((sumaTotal / 10) + 1) * 10;

        int ultimoNumero = Integer.valueOf(String.valueOf(cedula.charAt(cedula.length() - 1)));
        return tempSum - sumaTotal == ultimoNumero;
    }
}
