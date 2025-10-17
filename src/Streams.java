package src;

import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<char[]> filteredNames =
                Stream.of("Alice", "Delta", "Charlie", "David")
//                        .filter(s -> s.startsWith("A") || s.startsWith("D"))
//                        .toList();
//        .map(String::toUpperCase).toList();
//        .sorted().toList();
        .map(String::toCharArray).toList();
        System.out.println(filteredNames);
    }
}
