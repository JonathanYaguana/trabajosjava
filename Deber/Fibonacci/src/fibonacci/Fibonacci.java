package fibonacci;

/**
 *
 * @author Davis
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(getFibonacci(1, 1, 14));
    }

    private static int getFibonacci(int a, int b, int max) {
        if (max <= 2) {
            return 1;
        } else {
            return b + getFibonacci(a + b, a, --max);
        }
    }
}
