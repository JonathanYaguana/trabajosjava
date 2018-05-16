package deber;

public class Deber 
{
    public static void main(String[] args) 
    {
        boolean booRepetir = true;
        
        while(booRepetir == true)
        {
            POO objPOO = new POO();//// llamamos a la clase POO  en forma de objeto "objPOO"
            
            int opcion = objPOO.Menu();/// del objeto "objPOO" llamamos el metodo "Menu" dentro de clase POO
            
            boolean booRepetirSubMenu = true;
            
            switch(opcion)
            {
                //////CIRCULO ////
                case 1:
                    
                    while (booRepetirSubMenu == true)
                    {
                        System.out.println("\n\tCIRCULO");  
                        opcion = objPOO.MenuPerimetroArea();/// del objeto "objPOO" llamamos el metodo "PerimetroArea" dentro de clase POO
                        
                        switch(opcion)
                        {
                            /// PERIMETRO ////
                            case 1:
                                System.out.println("\nEL CIRCULO DE RADIO: "+ objPOO.RadioCirculo());                                
                                System.out.println("TIENE UN PERIMETRO DE: "+ objPOO.PerimetroCirculo());
                                break;
                                
                            ///// AREA ////
                            case 2:
                                System.out.println("\nEL CIRCULO DE RADIO: "+ objPOO.RadioCirculo());                                
                                System.out.println("TIENE UNA AREA DE: "+ objPOO.AreaCirculos());
                                break;
                                
                            /// MENU PRINCIPA 
                            case 3:
                                booRepetirSubMenu = false;
                                break;
                                
                            default:
                                break;
                        }
                    }
                    break;
                    
                ///// CUADRADO //////////////
                case 2:
                    while (booRepetirSubMenu == true)
                    {
                        System.out.println("\n\tCUADRADO");  
                        opcion = objPOO.MenuPerimetroArea();/// del objeto "objPOO" llamamos el metodo "PerimetroArea" dentro de clase POO
                        
                        switch(opcion)
                        {
                            /// PERIMETRO ////
                            case 1:
                                System.out.println("\nEL CUADRADO DE LADO: "+ objPOO.LadosCuadrados());                                
                                System.out.println("TIENE UN PERIMETRO DE: "+ objPOO.PerimetroCuadradp());
                                break;
                                
                            ///// AREA ////
                            case 2:
                                System.out.println("\nEL CUADRADO DE LADO: "+ objPOO.LadosCuadrados());                                
                                System.out.println("TIENE UN AREA DE: "+ objPOO.AreaCuadrado());
                                
                                break;
                                
                            /// MENU PRINCIPA 
                            case 3:
                                booRepetirSubMenu = false;
                                break;
                                
                            default:
                                break;
                        }
                    }
                    break;
                    
                /////// TRIANGULO /////
                case 3:
                    while (booRepetirSubMenu == true)
                    {
                        System.out.println("\n\tTRIANGULO");  
                        opcion = objPOO.MenuPerimetroArea();/// del objeto "objPOO" llamamos el metodo "PerimetroArea" dentro de clase POO
                        
                        switch(opcion)
                        {
                            /// PERIMETRO ////
                            case 1:
                                System.out.println("\nEL TRIANGULO DE LADO: "+ objPOO.LadosTriangulo());                                
                                System.out.println("TIENE UN PERIMETRO DE: "+ objPOO.PerimetroTriangulo());
                                
                                break;
                                
                            ///// AREA ////
                            case 2:
                                objPOO.BaseAturaTriangulo();
                                System.out.println("TIENE TRIANGULO TINE UNA AREA DE: "+ objPOO.AreaTriangulo());
                                break;
                                
                            /// MENU PRINCIPA 
                            case 3:
                                booRepetirSubMenu = false;
                                break;
                                
                            default:
                                break;
                        }
                    }
                    break;
                    
                //// RECTANGULO //////
                case 4:
                    while (booRepetirSubMenu == true)
                    {
                        System.out.println("\n\tRECTANGULO");  
                        opcion = objPOO.MenuPerimetroArea();/// del objeto "objPOO" llamamos el metodo "PerimetroArea" dentro de clase POO
                        
                        switch(opcion)
                        {
                            /// PERIMETRO ////
                            case 1:
                                objPOO.BaseAltutaRectangulo();                                                           
                                System.out.println("EL RECTANGULO TIENE UN PERIMETRO DE: "+ objPOO.PerimetroRectangulo());
                                break;
                                
                            ///// AREA ////
                            case 2:
                                objPOO.BaseAltutaRectangulo();                                                           
                                System.out.println("EL RECTANGULO TIENE UN AREA DE: "+ objPOO.AreaRectangulo());
                                
                                break;
                                
                            /// MENU PRINCIPA 
                            case 3:
                                booRepetirSubMenu = false;
                                break;
                                
                            default:
                                break;
                        }
                    }
                    break;
                    
                    
                case 5:
                    booRepetir = false;
                    break;
                    
                default:
                    break;
            }
            
        }
        
    }
    
}
