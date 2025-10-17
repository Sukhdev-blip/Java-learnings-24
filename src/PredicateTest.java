package src;

import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven=n->n%2==0;
        List<Integer> even=numbers.stream().filter(isEven).toList();
        List<Integer> odd=numbers.stream().filter(isEven.negate()).toList();

        System.out.println(even); // true
        System.out.println(odd); // false

    }
}
