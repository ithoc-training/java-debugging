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

        for (int i = 3; i <= size + 1; i++) {
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
