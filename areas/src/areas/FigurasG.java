/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

/**
 *
 * @author Edison
 */
public class FigurasG {

    double area;
    double perimetro;
    double pi = 3.14;
    double radio;
}

class Cuadrado extends FigurasG {

    public double AreaC(double lado) {
        area = lado * lado;
        return area;
    }

    public double PerimetroC(double lado) {
        perimetro = lado * 4;
        return perimetro;
    }
}

class TrianguloR extends FigurasG {

    public double AreaT(double altura, double base) {
        area = (altura * base) / 2;
        return area;
    }

    public double PerimetroT(double altura, double base) {
        double hipotenusa = (double) Math.sqrt((altura * altura) + (base * base));
        perimetro = altura + base + hipotenusa;
        return perimetro;
    }
}

class Circulo extends FigurasG {

    public double AreaCi(double radio) {
        area = pi * radio * radio;
        return area;
    }

    public double PerimetroCi(double radio) {
        perimetro = 2 * pi * radio;
        return perimetro;
    }

}

class Rectangulo extends FigurasG {

    public double AreaR(double base,double altura) {
        area = base * altura;
        return area;
    }

    public double PerimetroR(double base,double altura) {
        perimetro = (base*2)+(altura*2);
        return perimetro;
    }
}
