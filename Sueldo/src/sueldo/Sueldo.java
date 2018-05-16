/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Sueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Calcular el sueldo a pagar a tres empleados");
        double hn, hx, hd,spedro,smaria,sjose;
        int a,b,c,a2,b2,c2,a3,b3,c3;
        Scanner s = new Scanner(System.in);
        
        System.out.println("\n"+"Primer Empleado: Pedro");
                   
        System.out.print("Horas Normales: ");
        a=s.nextInt();
        if(a>70)
            System.out.println("El limites son 70 horasde trabajo");
            hn=5.5*a;
        System.out.print("Horas Extras: ");
        b=s.nextInt();
        if(a+b>70)
            System.out.println("El limites son 70 horas de trabajo");      
        
        hx=11*b;
        System.out.print("Horas Adicionales: ");
        c=s.nextInt();
        if(a+b+c>70)
            System.out.println("El limites son 70 horas de trabajo");
        hd=16.5*c;
        spedro=hn+hx+hd;
        
        System.out.println("\n"+"Segundo Empleado: María");
        System.out.print("Horas Normales: ");
        a2=s.nextInt();
        if(a2>50)
            System.out.println("El limites son 50 horas de trabajo");
        System.out.print("Horas Extras: ");
        b2=s.nextInt();
        if(a2+b2>50)
            System.out.println("El limites son 50 horas de trabajo");
        System.out.print("Horas Adicionales: ");
        c2=s.nextInt();
        if(a2+b2+c2>50)
            System.out.println("El limites son 50 horas de trabajo");
        hn=5.5*a2;
        hx=11*b2;
        hd=16.5*c2;
        smaria=hn+hx+hd;
        
        System.out.println("\n"+"Tercer Empleado: Juan");
        System.out.print("Horas Normales: ");
        a3=s.nextInt();
        if(a3>60)
            System.out.println("El limites son 60 horas de trabajo");
        System.out.print("Horas Extras: ");
        b3=s.nextInt();
        if(a3+b3>60)
            System.out.println("El limites son 60 horas de trabajo");
        System.out.print("Horas Adicionales: ");
        c3=s.nextInt();
        if(a3+b3+c3>60)
            System.out.println("El limites son 60 horas de trabajo");
        hn=5.5*a3;
        hx=11*b3;
        hd=16.5*c3;
        sjose=hn+hx+hd;
        
        System.out.println("\n"+"El valor a pagar es: "+"\n");
        System.out.println("Empleados  H.Normales  H.Extra  H.Adicional   Sueldo");
        System.out.println("Pedro\t\t"+a+" \t"+b+" \t\t"+c+"\t"+spedro);
        System.out.println("María\t\t"+a2+"\t"+b2+"\t\t"+c2+"\t"+smaria);
        System.out.println("Juan \t\t"+a3+"\t"+b3+"\t\t"+c3+"\t"+sjose);

    }

}

   