/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda.secuencial;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class BusquedaSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int A[]={2,5,6,8,77,9,55,2,3};
        int cont=0, pos=0;
        Boolean encontro=false;
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese el numero a buscar");
        int num=s.nextInt();
        while(!encontro&&cont<A.length){
        if(A[cont]==num){
        encontro=true;
        pos=cont;
        }
        cont++;
        
        
        }
        if(encontro){
            System.out.println("El dato esta en la posicion"+pos);
        }
        
        
        
    }
    
}
