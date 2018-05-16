/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areayperimetro;

/**
 *
 * @author Edison
 */
public class AreayPerimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double l = 43.17;//lados iguales
        int b = 10;//base
        int h = 42;//altura
        double perimetro = 0, area = 0;
        System.out.println("el perimetro y el area de un triangulo isoceles");
        System.out.println("La base es:" + b + "cm");
        System.out.println("Lados iguales:" + l + "cm");
        System.out.println("La altura:" + h + "cm");
        perimetro = l + l + b;
        area = b * h / 2;
        System.out.println("El perimetro es:" + perimetro + "cm");
        System.out.println("El area es:" + area + "cm^2");

    }

}
