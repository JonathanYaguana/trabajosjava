import java.util.Random;

/**
 * Created by 2do A Programacion on 21/07/2016.
 */
public class Main {

    private static int[] numCedulas;
    private static String[][] aMultiplicar;
    private static String[] res;

    public static void main(String[] args) {
        numCedulas = new int[10];
        aMultiplicar = new String[10][10];
        res = new String[10];

        fillNumCedulas(numCedulas);
        fillAMultiplicar(aMultiplicar);

        for (int c = 0; c < numCedulas.length; c++) {
            String r = "";

            for (int f = 0; f < numCedulas.length; f++) {

                try {
                    int a = numCedulas[f];
                    int b = Integer.valueOf(aMultiplicar[f][c]);
                    r += String.valueOf(a * b);
                } catch (Exception e) {
                    r += numCedulas[f] + aMultiplicar[f][c];
                }

                r += " ";
            }

            res[c] = r;
        }

        System.out.println("\nArray A:\n");

        for (int numCedula : numCedulas) {
            msg(numCedula + " ");
        }

        System.out.println("\n\nArray B:\n");

        for (int c = 0; c < numCedulas.length; c++) {
            for (int f = 0; f < numCedulas.length; f++) {
                msg(aMultiplicar[c][f] + " ");
            }
            System.out.println();
        }

        System.out.println("\nArray Resultado:\n");

        for (int c = 0; c < numCedulas.length; c++) {
            System.out.println(res[c] + " ---> " + transformThis(res[c]));
        }
    }

    private static void fillNumCedulas(int[] numCedulas) {
        Random random = new Random();
        for (int i = 0; i < numCedulas.length; i++) {
            numCedulas[i] = random.nextInt(10);
        }
    }

    private static void fillAMultiplicar(String[][] aMultiplicar) {
        Random random = new Random();

        for (int c = 0; c < numCedulas.length; c++) {
            for (int f = 0; f < numCedulas.length; f++) {
                int x = random.nextInt(10);

                if (random.nextBoolean()) {
                    aMultiplicar[c][f] = "" + x;
                } else {
                    aMultiplicar[c][f] = letras[x];
                }
            }
        }
    }

    private static String transformThis(String toTrasnform) {
        String transformed = "";
        String[] all = toTrasnform.split(" ");
        for (String x : all) {
            try {
                int a = Integer.valueOf(x);
                transformed += a;
            } catch (Exception e) {
                String letter = String.valueOf(x.charAt(x.length() - 1));
                int num = Integer.valueOf(x.substring(0, x.length() - 1));
                for (int i = 0; i < num; i++) {
                    transformed += letter;
                }
            }

            transformed += " ";
        }

        return transformed;
    }

    private static void msg(String msg) {
        System.out.print(msg);
    }

    private static final String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
}
