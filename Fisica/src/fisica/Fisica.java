/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Fisica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double k = 9 * Math.pow(10, 9);
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        int ap = scanner.nextInt();
        /*int b = scanner.nextInt();
        int bp = scanner.nextInt();*/
        double r = scanner.nextDouble();
        int rp = scanner.nextInt();
        double rf = r * Math.pow(10, rp);

        //double total = (k * (a * Math.pow(10, ap)) * (b * Math.pow(10, bp))) / (rf*rf);
        double total = (k * (a * Math.pow(10, ap))) / (rf * rf);
        System.out.println("\n" + total);
    }

    private class Ops {

        private int base, exponente;
        private double res;

        public Ops() {
            this.res = (double) base * Math.pow(10, exponente);
        }

        public double getRes() {
            return this.res;
        }
    }

}
