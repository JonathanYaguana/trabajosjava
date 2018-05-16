package torredehanoi;

/**
 *
 * @author Ordenador
 */
public class TorreDeHanoi {

    private static Torre t1, t2, t3;
    private static int discsNum;

    public static void main(String[] args) {
        discsNum = 3;

        t1 = new Torre(discsNum);
        t2 = new Torre();
        t3 = new Torre();

        draw();

        int d = 0;

        while (!t3.isDone(discsNum)) {
            d++;
            if (d == 7) {
                break;
            }

            if (t1.isEmpty() || t2.isEmpty() || t3.isEmpty()) {
                if (t1.isEmpty()) {
                    if (t2.size() > t3.size()) {
                        t1.add(t2.last());
                        t2.refresh();
                    } else {
                        t1.add(t3.last());
                        t3.refresh();
                    }
                } else if (t2.isEmpty()) {
                    t2.add(t1.last());
                    t1.refresh();
                } else if (t3.isEmpty()) {
                    t3.add(t1.last());
                    t1.refresh();
                }
            } else {
                int a = t1.last();
                int b = t2.last();
                int c = t3.last();

                int m = getMenor(a, b, c);

                if (m == a) {

                } else if (m == b) {
                    if (t1.last() == m + 1) {
                        t1.add(t2.last());
                        t2.refresh();
                    } else {
                        t3.add(t2.last());
                        t2.refresh();
                    }
                } else {

                }
            }

            draw();
        }
    }

    private static int getMenor(int a, int b, int c) {
        int menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor) {
            menor = c;
        }

        return menor;
    }

    private static void draw() {
        for (int i = discsNum - 1; i >= 0; i--) {
            if (t1.size() > i) {
                s(t1.getDiscAt(i) + " ");
            } else {
                s("x ");
            }

            if (t2.size() > i) {
                s(t2.getDiscAt(i) + " ");
            } else {
                s("x ");
            }

            if (t3.size() > i) {
                s(t3.getDiscAt(i) + " ");
            } else {
                s("x ");
            }

            s("\n");
        }

        s("\n");
    }

    private static void s(String text) {
        System.out.print(text);
    }
}
