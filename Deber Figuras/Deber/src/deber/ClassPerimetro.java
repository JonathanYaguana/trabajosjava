package deber;


public class ClassPerimetro 
{
    double periCirculo;
    double periCuadrado;
    double periRectangulo;
    double periTriangulo;

    public double getPeriCirculo() 
    {
        return periCirculo;
    }

    public double getPeriCuadrado()
    {
        return periCuadrado;
    }

    public double getPeriRectangulo() 
    {
        return periRectangulo;
    }

    public double getPeriTriangulo() 
    {
        return periTriangulo;
    }

    
    
    
    
    public void setPeriCirculo(double radio) 
    {
        this.periCirculo = 2 * 3.14 * radio;
    }

    public void setPeriCuadrado(double lado) 
    {
        this.periCuadrado = 4 * lado;
    }

    public void setPeriRectangulo(double base , double altura) 
    {
        this.periRectangulo = 2 * (base + altura);
    }

    public void setPeriTriangulo(double lados)
    {
        this.periTriangulo = 3 * lados;
    }
    
}
