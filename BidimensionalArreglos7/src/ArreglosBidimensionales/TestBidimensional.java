package ArreglosBidimensionales;

import java.util.Scanner;

public class TestBidimensional
{

    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner lct = new Scanner(System.in);
        int intValor = 0;
        int intOpcion = 0, intOpcion1 = 0, intOpcion2 = 0;
        boolean boolBand1 = true, boolBand2 = true, boolBand3 = true;
        Menu objMenu = new Menu();//Llamo a la Clase Menu
        Metodos objMetodos = new Metodos();

        while (boolBand1 == true)
        {
            intOpcion = objMenu.MostrarMenu();//Llamo al Método de la clase Menu

            switch (intOpcion)
            {

                case 1:

                    while (boolBand2 == true)
                    {
                        intOpcion1 = objMenu.MenuSelecTipo();

                        switch (intOpcion1)
                        {
                            case 1:
                                objMetodos.MenorMayorF();

                                break;

                            case 2:
                                objMetodos.MenorMayorC();
                                break;

                            case 3:
                                boolBand2 = false;
                                break;
                        }
                    }
                    boolBand2 = true;
                    break;

                case 2:
                    while (boolBand3 == true)
                    {
                        intOpcion2 = objMenu.MenuSelecTipo();

                        switch (intOpcion2)
                        {
                            case 1:
                                objMetodos.MayorMenorF();
                                break;

                            case 2:
                                objMetodos.MayorMenorC();

                                break;

                            case 3:
                                boolBand3 = false;
                                break;
                        }
                    }
                    boolBand3 = true;

                    break;

                case 3:
                    boolBand1 = false;
                    break;

            }
        }
        boolBand1 = true;

    }

}
