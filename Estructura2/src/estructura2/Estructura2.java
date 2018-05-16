package estructura2;

/* BLADIMIR S MINGA M
bladiminga46@gmail.com */
public class Estructura2 {

    public static String[][] M = new String[30][10];
    public static String c = "";
    public static String name = "";
    public static int aux;
    public static int[] tem = new int[10];

    public static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int op = 0;
        while (op < 3) {
            System.out.println("Registro # " + (op + 1));
            boolean ver = false;
            while (ver == false) {
                System.out.print("Ingrese el número de  cedula correcto >> ");
                c = sc.nextLine();
                ver = verificar(c);

                for (int i = 0; i < 10; i++) {
                    tem[i] = Integer.parseInt(String.valueOf(c.charAt(i)));
                }
            }
            System.out.print("Ingrese  nombre >> ");
            name = sc.nextLine();
            guardar(name, c, index(tem), tem[4]);
            op++;
        }
        boolean ver = false;
        while (ver == false) {
            ver = true;
            System.out.println("");
            System.out.print("Presione  X  para dejar de buscar ó ingrese un numero de cedula para buscar por Hash >> ");
            c = sc.nextLine();
            if (c.contentEquals("x") || c.contentEquals("X")) {
                ver = true;
            } else {
                ver = verificar(c);
                if (ver) {
                    for (int i = 0; i < 10; i++) {
                        tem[i] = Integer.parseInt(String.valueOf(c.charAt(i)));
                    }
                    buscar(index(tem), indexc(tem[4]));
                    ver = false;
                }
            }
        }
    }

    public static void guardar(String name, String c, int fila, int columna) {
        M[fila][columna - 1] = c;
        M[fila][columna] = name;
    }

    public static void buscar(int fila, int columna) {
        System.out.println(M[fila][columna - 1] + " " + M[fila][columna]);
    }

    public static int index(int[] ced) {
        int index = 0;
        for (int i = 0; i < ced.length; i++) {
            index += ced[i];
        }
        index = index * ced[9];
        index = index + ced[0];
        if (index < 30) {
            return index;
        } else {
            String a = Integer.toString(index) + ced[5];
            String aux = a;
            int b = Integer.parseInt(String.valueOf(a.charAt(0)));
            int c = Integer.parseInt(String.valueOf(a.charAt(1)));
            a = Integer.toString(b) + Integer.toString(c);
            index = Integer.parseInt(a);
            if (index < 30) {
                return index;
            } else {
                b = Integer.parseInt(String.valueOf(aux.charAt(1)));
                c = Integer.parseInt(String.valueOf(aux.charAt(2)));
                a = Integer.toString(b) + Integer.toString(c);
                index = Integer.parseInt(a);
                while (index > 29) {
                    index = index - (ced[7] + 3);
                }
                return index;
            }
        }
    }

    public static int indexc(int a) {
        if (a == 0) {
            return 1;
        } else if (a < 6) {
            return a;
        } else {
            a = a - (tem[0]);
            return a;
        }
    }

    public static boolean verificar(String c) {
        int[] ce = new int[10];
        for (int i = 0; i < 10; i++) {
            ce[i] = Integer.parseInt(String.valueOf(c.charAt(i)));
        }

        int suma = 0;
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                int aux = ce[i] * 2;
                if (aux > 9) {
                    aux = aux - 9;
                }
                ce[i] = aux;
            }
            suma = suma + ce[i];
        }
        suma = 10 - (suma % 10);
        if (suma == 10) {
            suma = 0;
        }
        if (suma == ce[9]) {
            return true;
        } else {
            return false+++;
        }
    }
}
