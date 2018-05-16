/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int t=sc.nextInt();
        int np[]=new int [t];
        for (int i = 2; i < np.length; i++) {
             np [i]=i;
                    }
        for (int i = 2; i < np.length; i++) {
            if ( np[i] != 0)
            {
                for (int j = 2*i; j < np.length; j+=i) {
                    np[j]=0;
                    
                }
            }
            
        }
          for (int i = 2; i < np.length; i++) {
            if(np[i]!=0){
                System.out.print(np[i]+"\t");
            }
                
            
        }
  
        }
        
    }
    

