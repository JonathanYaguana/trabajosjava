/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie.fibonacci;

/**
 *
 * @author Edison
 */
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.println("cuantos terminos desea:");
        System.out.println(a);
        for (int i = 1; i < 10; i++) {
            System.out.println(c);
            b = a + b;
            a = b;
            b = c;
        }
    }
}
