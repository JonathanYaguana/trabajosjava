/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mideber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author edu_r
 */
public class MiDeber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Conversiones numero;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num;
        String res;

        System.out.print("Valor recibido : ");
        int vr = Integer.parseInt(in.readLine());

        System.out.print("Valor  a cobrar : ");
        int vc = Integer.parseInt(in.readLine());
        num = vr - vc;

        numero = new Conversiones(num);
        res = numero.convertirLetras(num);
        System.out.print("Su Vuelto es : " + res);
        System.out.println("\n");
    }

}
