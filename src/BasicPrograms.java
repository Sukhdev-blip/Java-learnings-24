package src;

public class BasicPrograms {
    public static void main(String[] args) {
        // Reverse a string
        Utilities.reverseString("Hello Java 21!");

        // Prime or not
        int number = 11;
        System.out.println(number + (Utilities.isPrime(number) ? " is prime" : " is not prime"));
    }
}
