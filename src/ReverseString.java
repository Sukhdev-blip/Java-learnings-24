package src;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello, Java";
        // Option 1
        // String reversed = new StringBuilder(input).reverse().toString();

        // Option 2
        String reversed = input.transform(s -> new StringBuilder(s).reverse().toString());
        System.out.println(input);
        System.out.println(reversed);
    }
}
