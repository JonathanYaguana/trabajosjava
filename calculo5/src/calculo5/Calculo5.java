/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Calculo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("Ingrese a");
        a = sc.nextDouble();
        System.out.print("Ingrese b");
        b = sc.nextDouble();
        /*List<String> list = new ArrayList<>();
        while (true) {
            System.out.print("Ingrese una formula o signo: ");
            String formula = sc.next();
            if (formula.contains("fin")) {
                break;
            } else {

                list.add(formula);
            }
        }
        for (int i = 0; i < list.size(); i++) {

        }*/

        double[] x = {a, b};
        double[] y = new double[2];
        for (int i = 0; i < 2; i++) {
            double xx =0.125 *Math.pow(x[i], 4);
            double yy = 1.5 * Math.pow(x[i], 2);
            y[i] = xx-yy;
            System.out.println(yy);
            System.out.println(y[i]);
            System.out.println(xx);
        }

        System.out.println("Resultado: " + ((double) y[0] - y[1]));
    }

}
