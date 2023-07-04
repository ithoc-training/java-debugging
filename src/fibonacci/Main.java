package fibonacci;

public class Main {

    public final static int MAX_INDEX = 33333;


    public static void main(String[] args) {

        final Fibonacci fibonacci = new Fibonacci((short) MAX_INDEX);

        try {

            long[] fibonacciSequence = fibonacci.sequence();

            long fibonacciNumber = fibonacciSequence[MAX_INDEX];
            System.out.println("Max. Fibonacci number: " + fibonacciNumber);

        } catch (Exception e) {
            e.printStackTrace(System.err);
        }

    }

}
