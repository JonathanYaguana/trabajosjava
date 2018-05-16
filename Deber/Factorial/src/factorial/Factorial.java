package factorial;

/**
 *
 * @author Davis
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(getFactorial(8));
    }

    private static int getFactorial(int max) {
        if (max < 1) {
            return 1;
        } else {
            return max * getFactorial(--max);
        }
    }
}
