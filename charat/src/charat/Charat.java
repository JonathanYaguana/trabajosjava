/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charat;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Charat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int suma=0;
        String a="";
        System.out.println("Ingrese el caracter");
        Scanner sn=new Scanner (System.in);
        a=sn.next();
        System.out.println(""+a.charAt(2));
            suma=5+Integer.parseInt(String.valueOf(a.charAt(2)));
        System.out.println(""+suma);    
    }
    }
    

