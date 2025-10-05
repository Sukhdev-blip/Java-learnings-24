package src;

public class Utilities {
    static void reverseString(String input) {
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + new StringBuilder(input).reverse());
    }
    static boolean isPrime(int n) {
        return n > 1
                && java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .noneMatch(i -> n % i == 0);
    }
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
