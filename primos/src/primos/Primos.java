/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

/**
 *
 * @author edu_r
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int x : primos(50)) {
            System.out.print(x + " ");
        }
    }

    private static int[] primos(int max) {
        int[] primos = new int[max];
        int c = 0;
        int num = 0;

        while (c != max) {
            num++;
            int res = 1;

            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    res++;
                }

                if (res > 2) {
                    break;
                }
            }

            if (res <= 2) {
                primos[c] = num;
                c++;
            }
        }

        return primos;
    }

}
