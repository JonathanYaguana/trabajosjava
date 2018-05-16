package deber;

import java.util.Scanner;

public class POO 
{
    ClassPerimetro objPerimetro= new ClassPerimetro();///llamamos la clase  "ClassPerimetro" donde me retornan todo los metodos dentro de ahi get y set
                                                    //// y le designamos con u nombre "objPerimetro" donde esta contenido todo
    
    ClassAreas objAreas = new  ClassAreas();///llamamos la clase  "ClassAreas" donde me retornan todo los metodos dentro de ahi get y set
                                            //// y le designamos con u nombre "objAreas" donde esta contenido todo
    
    Scanner ingreso = new Scanner(System.in);///llamamos la clase  "Scanner" donde me retornan todo los metodos dentro
                                            //// y le designamos con u nombre "ingreso" donde esta contenido todo
    
    
   
    public int Menu()////// CREAMOS EL MEDODO "Menu" Q TIENE UN RETORNO INT /////
    {
        int opcion = 0;
        System.out.println("\tMENU DE FIGURAS");
        System.out.println("1. CIRCULO");
        System.out.println("2. CUADRADO");
        System.out.println("3. TRIANGULO");
        System.out.println("4. RECTANGULO");
        System.out.println("5. SALIR");
        System.out.print("\nIngrese una opción: ");
        opcion = ingreso.nextInt();
        
        return opcion;
    }
    
    
    
    public int MenuPerimetroArea()////// CREAMOS EL MEDODO "MenuPerimetroArea" Q TIENE UN RETORNO INT /////
    {
        System.out.println("1. ENCONTRAR PERIMETRO");
        System.out.println("2. ENCONTRAR AREA");
        System.out.println("3. IR A MENU");
        System.out.print("\nIngrese una opción: ");
        int opcion = ingreso.nextInt();
        
        return opcion;
    }
    
    //////////////////////// PERIMETRO CIRCULO ////////////////////////
    public double RadioCirculo()// medto con retorno double/////
    {
        double doRadio = 0.0;
        
        System.out.print("\nINGRESE RADIO DE CIRCULO: ");
        doRadio = ingreso.nextDouble();
        
        objPerimetro.setPeriCirculo(doRadio);///carga del objeto "objPerimetro" en el metodo "setPeriCirculo(doRadio)" enviendo el "doRadio" como parametro
        objAreas.setAreaCirculo(doRadio);///carga del objeto "objAreas" en el metodo "setAreaCirculo(doRadio)" enviendo el "doRadio" como parametro
        
        return doRadio;//// retorna el "doRadio"
    }    
    public double PerimetroCirculo()//metodo con retorno double ///////
    {        
        return objPerimetro.getPeriCirculo();//del objeto "objPerimetro" retorna el metodo "getPeriCirculo()"
    }    
    public double AreaCirculos()
    {
        return objAreas.getAreaCirculo();//del objeto "objAreas" retorna el metodo "getAreaCirculo()"
    }
    
    
    
    
    //////////////////////  CUADRADO ///////////////    
    public double LadosCuadrados()
    {
        double doLado = 0.0;
        
        System.out.print("\nINGRESE DIMENCION DE LADO: ");
        doLado = ingreso.nextDouble();
        
        objPerimetro.setPeriCuadrado(doLado);///carga del objeto "objPerimetro" en el metodo "setPeriCuadrado(doLado)" enviendo el "doLado" como parametro
        objAreas.setAreaCuadrado(doLado);///carga del objeto "objAreas" en el metodo "setAreaCuadrado(doLado)" enviendo el "doLado" como parametro
        
        return    doLado;//// retorna el "doLado"
    }    
    public double PerimetroCuadradp()
    {
        return objPerimetro.getPeriCuadrado();//del objeto "objPerimetro" retorna el metodo "getPeriCuadrado()"
    }
    public double AreaCuadrado()
    {
        return objAreas.getAreaCuadrado();//del objeto "objAreas" retorna el metodo "getAreaCuadrado()"
    }
    
    
    
    
    //////////////////////  TRIANGULO ///////////////
    public double LadosTriangulo()
    {
        double doLado = 0.0;
        
        System.out.print("\nINGRESE DIMENCION DE LADO: ");
        doLado = ingreso.nextDouble();
        
        objPerimetro.setPeriTriangulo(doLado);///carga del objeto "objPerimetro" en el metodo "setPeriTriangulo(doLado)" enviendo el "doLado" como parametro
        
        return    doLado;     //// retorna el lado
    }
    public void BaseAturaTriangulo()
    {
        double base = 0.0;
        double altura = 0.0;
        
        System.out.print("\nINGRESE BASE: ");
        base = ingreso.nextDouble();
        
        System.out.print("\nINGRESE ALTURA: ");
        altura = ingreso.nextDouble();
        
        objAreas.setAreaTriangulo(base, altura);///carga del objeto "objAreas" en el metodo "setAreaTriangulo(base, altura)" enviendo el "base, altura" como parametros
    }    
    public double PerimetroTriangulo()
    {
        return objPerimetro.getPeriTriangulo();//del objeto "objPerimetro" retorna el metodo "getPeriTriangulo()"
    }   
    public double AreaTriangulo()
    {
        return objAreas.getAreaTriangulo();//del objeto "objAreas" retorna el metodo "getAreaTriangulo()"
    }
    
    
    
    
    //////////////////////  RECTANGULO ///////////////    
    public void BaseAltutaRectangulo()
    {
        double doBase = 0.0;
        double doAltura = 0.0;
        
        System.out.print("\nINGRESE BASE: ");
        doBase = ingreso.nextDouble();
        
        System.out.print("\nINGRESE ALTURA: ");
        doAltura = ingreso.nextDouble();
        
        objPerimetro.setPeriRectangulo(doBase , doAltura);///carga del objeto "objPerimetro" en el metodo "setPeriRectangulo(doBase , doAltura)" enviendo el "doBase , doAltura" como parametro
        objAreas.setAreaRectangulo(doBase , doAltura);///carga del objeto "objAreas" en el metodo "setAreaRectangulo(doBase , doAltura)" enviendo el "doBase , doAltura" como parametro
    }
    public double PerimetroRectangulo()
    {
        return objPerimetro.getPeriRectangulo();//del objeto "objPerimetro" retorna el metodo "getPeriRectangulo()"
    }
    public double AreaRectangulo()
    {
        return objAreas.getAreaRectangulo();//del objeto "objAreas" retorna el metodo "getAreaRectangulo()"
    }
}

