package deber;

public class ClassAreas 
{
    double areaCirculo;
    double areaCuadrado;
    double areaRectangulo;
    double areaTriangulo;

    public double getAreaCirculo() 
    {
        return areaCirculo;
    }

    public double getAreaCuadrado() 
    {
        return areaCuadrado;
    }

    public double getAreaRectangulo() 
    {
        return areaRectangulo;
    }

    public double getAreaTriangulo() 
    {
        return areaTriangulo;
    }

    
    
    
    
    public void setAreaCirculo(double r)
    {
        this.areaCirculo = 3.14*(r * r);
    }

    public void setAreaCuadrado(double l) 
    {
        this.areaCuadrado = l * l;
    }

    public void setAreaRectangulo(double b , double a) 
    {
        this.areaRectangulo = b * a;
    }

    public void setAreaTriangulo(double b , double a) 
    {
        this.areaTriangulo = b * a* 1/2;
    }
}
