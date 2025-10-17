package src;
import java.util.function.Predicate;

public class BasicPrograms {
    public static void main(String[] args) {
        // Reverse a string
        Utilities.reverseString("Hello Java 21!");

        // Prime or not
        int number = 12;
        System.out.println(number + (Utilities.isPrime(number) ? " is prime" : " is not prime"));

        // Even or odd
        System.out.println(number + (Utilities.isEven(number) ? " is even" : " is odd"));

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(11)); // true
        System.out.println(isEven.test(9)); // false

    }
}
