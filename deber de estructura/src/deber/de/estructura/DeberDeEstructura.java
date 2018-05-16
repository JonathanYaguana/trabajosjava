/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber.de.estructura;

import java.util.Arrays;

/**
 *
 * @author edu_r
*/

public class DeberDeEstructura {
String [] arreglo; 
        int tamaño, contador;
public DeberDeEstructura (int tam){
tamaño=tam;
arreglo=new String[tam];
Arrays.fill(arreglo,"-1");
}
public void funcionHash(String[] cadenaArreglo,String[]arreglo){
int i;
    for ( i = 0; i < cadenaArreglo.length; i++) {
        String elemento=cadenaArreglo[i];
        int indiceArreglo=Integer.parseInt(elemento)%30;
        System.out.println("El indice es "+indiceArreglo+"Para el elemento"+elemento);
        while(arreglo[indiceArreglo]!="-1"){
        indiceArreglo++;
            System.out.println("Ocurrio una colicion en el indice"+(indiceArreglo-1)+"Cambiar al indice"+indiceArreglo);
            indiceArreglo%=tamaño;
        
        }
        arreglo[indiceArreglo]=elemento;
    }

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese el numero de cedula");
        
        
    }
    
}
