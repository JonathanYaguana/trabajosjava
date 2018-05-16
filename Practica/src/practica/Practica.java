/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author edu_r
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array [] =  {5, 3, 6, 2,1};
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1; j++) {
              int  aux =0;
                if(array[j] > array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] =aux;
                }
            }
        }
        
                        for (int i = 0; i < 5; i++) {
                            System.out.print(array[i]+ " " );
        
        
    }
    }
    
}
