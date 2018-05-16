/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda.hass;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class BusquedaHass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ced = "";
        int key = 0;
        int A[] = new int[10];
        String B[] = new String[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula");
        ced = s.next();
        for (int i = 0; i < 10; i++) {
            A[i] = Integer.parseInt(String.valueOf(ced.charAt(i)));
        }
        for (int i = 0; i < A.length - 1; i++) {
            key = (key + A[i])%9;
            
            //System.out.println(""+ A[i]);

        }
        System.out.println("" + key);
        System.out.println("Ingrese el nombre");
        B[key] = s.next();

        for (int i = 0; i < A.length - 1; i++) {
            
            System.out.println(""+ B[i]);
        }
        
        System.out.println("Ingrese el numero que desea buscar");
        
        
        
        
    }
}
