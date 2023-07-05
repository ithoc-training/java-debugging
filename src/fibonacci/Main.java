package fibonacci;

public class Main {

    public final static int MAX_INDEX = 32767; // Error 1: Value was greater than max short datatype


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
