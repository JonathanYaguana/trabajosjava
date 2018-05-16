/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeberPOO;

/**
 *
 * @author edu_r
 */
public class figuras {

    double radio;
    double area;
    double perimetro;
}

class Circulo extends figuras {

    public double AreaCirculo(double radio) {
        area = Math.PI * (Math.pow(radio, 2));
        return area;
    }

    public double PerimetroCirculo(double radio) {
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

}

class Cuadrado extends figuras {

    public double AreaCuadrado(double lado) {
        area = Math.pow(lado, 2);
        return area;
    }

    public double PerimetroCuadrado(double lado) {
        perimetro = lado * 4;
        return perimetro;
    }
}

class Triangulo extends figuras {

    public double AreaTriangulo(double altura, double base) {
        area = (altura * base) / 2;
        return area;
    }

    public double PerimetroTriangulo(double altura, double base) {
        double hip = (double) Math.sqrt((altura * altura) + (base * base));
        perimetro = altura + base + hip;
        return perimetro;
    }
}

class Rectangulo extends figuras {

    public double AreaRectangulo(double base, double altura) {
        area = base * altura;
        return area;
    }

    public double PerimetroRectangulo(double base, double altura) {
        perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }
}
