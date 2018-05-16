/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author edu_r
 */
public class Metodos
{

    public int[] MenoraMayor(int[] datos)
    {
        
        int aux;
        for (int i = 0; i <= 4; i++)
        {
            for (int j = i+1; j <= 4; j++)
            {
                if (datos[i] >= datos[j])
                {

                    aux = datos[i];
                    datos[i] = datos[j];
                    datos[j] = aux;
                }

            }
        }
        return datos;
    }
    public int[] MayorMenor(int[] datos)
    {
        
        int aux;
        for (int i = 0; i <= 4; i++)
        {
            for (int j = i+1; j <= 4; j++)
            {
                if (datos[i] <= datos[j])
                {

                    aux = datos[i];
                    datos[i] = datos[j];
                    datos[j] = aux;
                }

            }
        }
        return datos;
    }

}
