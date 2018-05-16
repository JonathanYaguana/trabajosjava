package arreglobidimensionalrep;

public class Metodos {

    int order[] = new int[5];

    public int[] MenoraMayor(int[] valor) {
        int aux;
        for (int i = 0; i <= 4; i++) {
            for (int j = i + 1; j <= 3; j++) {
                if (valor[i] >= valor[j]) {

                    aux = valor[i];
                    valor[i] = valor[j];
                    valor[j] = aux;
                }

            }

        }
//        for (int i = 0; i <=4; i++) {
//            System.out.println(valor[i]);     
//        }

        return order;
    }

    public int[] MayoraMenor(int[] valor) {

        return order;
    }

}
