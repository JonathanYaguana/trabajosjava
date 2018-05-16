/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insercion;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Insercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner lectura = new Scanner(System.in);
        int[] Arreglo; 
        int longitud, key, i;
 
        System.out.println("\t\t INSERCION : ");
        // longitud del arreglo
        System.out.print("Ingrese la Cantidad Numeros a Ordenar: ");
        longitud = lectura.nextInt();
 
        // Creando un arreglo
        Arreglo = new int[longitud];
 
        // Leer todos los numero a ordenar
        System.out.println("Ingresar   " + longitud + " -  Numeros : ");
        for(int n=0; n<longitud ; n++){
            Arreglo[n] = lectura.nextInt();
        }
 
        // Ordenar los Numeros utilizando el metodo Burbuja
        for(int j=1 ; j<longitud ; j++){
            key = Arreglo[j];
            i = j-1;
            //Inserta A[j] en la ya ordenada
            while(i >= 0 && Arreglo[i]>key){
                Arreglo[i+1]= Arreglo[i];
                i--;
            }
            Arreglo[i+1] = key;
        }
 
 
        // Mostra el arreglo ordenado
        for(int n=0; n<longitud ; n++)
            System.out.print(Arreglo[n]+" ");
    }
    }
    

