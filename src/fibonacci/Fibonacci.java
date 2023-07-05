package fibonacci;

/**
 * The code is intended to generate a Fibonacci sequence up to a given length.
 */
public class Fibonacci {

    private final short size;

    public Fibonacci(short size) {
        this.size = size;
    }


    public long[] sequence() {
        if (size <= 1) {
            throw new RuntimeException("Size is too small.");
        }

        Long[] fibonacciSequence = new Long[size + 1];
        fibonacciSequence[0] = 0L;
        fibonacciSequence[1] = 1L; // Error 2: Initialisation of second element was missing.

        for (int i = 2; i <= size; i++) {
            // Error 3: Index startet from 3 instead of 2.
            // Error 4: Size was added by one what was wrong.
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        return convert(fibonacciSequence);
    }


    private long[] convert(Long[] array) {

        long[] primitives = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            primitives[i] = array[i];
        }

        return primitives;
    }

    public short getSize() {
        return size;
    }

}
