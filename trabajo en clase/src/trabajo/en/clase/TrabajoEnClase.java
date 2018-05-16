/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.en.clase;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class TrabajoEnClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        double may, men;
        double cambiop;
        String cambion;
        String a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de estudiantes");
        n = sc.nextInt();
        String nom[] = new String[n];
        double not1[] = new double[n];
        double not2[] = new double[n];
        double prom[] = new double[n];
        for (int i = 0; i < not2.length; i++) {
            System.out.println("Ingrese el Nombre del estudiante" + i);
            nom[i] = sc.next();
            System.out.println("Ingrese la nota 1");
            not1[i] = sc.nextDouble();
            System.out.println("Ingrese la nota 2");
            not2[i] = sc.nextDouble();
            prom[i] = (not1[i] + not2[i]) / 2;
        }
        may = prom[0];
        men = prom[0];
        a = nom[0];
        b = nom[0];
        for (int i = 1; i < prom.length; i++) {
            if (may < prom[i]) {
                cambiop = may;
                cambion = a;
                may = prom[i];
                a = nom[i];
            }
            if (men > prom[i]) {
                cambiop = men;
                cambion = b;
                men = prom[i];
                b = nom[i];
            }
        }
        System.out.println("El alumno con maoyor promedio: " + a + "  "+ may);
        System.out.println("El alumno con menor promedio: " + b + "  "+ men);

        System.out.println("Los alumons con menor promedo de 0 a 6.9");
       System.out.println("nombre\t nota1\tnota2\tpromedio");
        for (int i = 0; i < prom.length; i++) {
            if (prom[i]<=6.9)
                
                System.out.println(nom[i] + "\t" + not1[i] + "\t" + not2[i] + "\t" + prom[i]);
       }
        System.out.println("Los alumnos con mayor promedio de 7 a 10 de  son:");
        System.out.println("nombre\tnota1\t\tnota2\t\tpromedio");
        for (int i = 0; i < prom.length; i++) {
            if (prom[i]>=6.9)
            System.out.println(nom[i] + "\t" + not1[i] + "\t\t" + not2[i] + "\t\t" + prom[i]);
       }
    }
}
