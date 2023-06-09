public class Genericos {
    public static void main(String[] args) {

        System.out.println("Maior " + max(1, 2, 3));
        System.out.println("Maior " + max('a', 'c', 'b'));
    }

    public static <T extends Comparable<T>> T max(T x, T y, T z) {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }

        if (z.compareTo(max) > 0) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }

}
