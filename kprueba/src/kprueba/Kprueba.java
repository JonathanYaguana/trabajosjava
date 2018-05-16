/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kprueba;

import java.util.Scanner;

/**
 *
 * @author edu_r
 */
public class Kprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int n,x;
        System.out.println("Ingrese");
        n = in.nextInt();
        /*int cont=2, cantidad=0;
        boolean primo;
        while(cantidad<n){
        primo=true;
            for (int i = 2; i <= cont/2; i++) {
                if(cont%i==0)
                primo=false;
            }
        if(primo==true){
                System.out.println(cont);
        cantidad++;
        }
        cont++;
        }*/
        
       Primo(n);
        
        
    }
    public static void Primo(int n){
     int cont=2, cantidad=0, p;
        boolean primo;
        while(cantidad<(n)){
        primo=true;
            for (int i = 2; i <= cont/2; i++) {
                if(cont%i==0)
                primo=false;
            }
        if(primo==true){
                System.out.println(cont);
        cantidad++;
        }
       cont=cont+1;
        }
       
        
    }
}
