/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author edu_r
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList cola = new LinkedList();
        System.out.println(cola);
        cola.addFirst(1);
        System.out.println(cola);
        cola.addFirst(56);
        System.out.println(cola);
        cola.addFirst(100);
        System.out.println(cola);
        System.out.println(cola.removeLast());
        System.out.println(cola);
        Collections.sort(cola);
        System.out.println(cola);
        System.out.println(cola.peekLast());
    }

}
