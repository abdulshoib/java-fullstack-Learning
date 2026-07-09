
import java.util.function.Predicate;

public class PredicateEvenNumber {

    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> number % 2 == 0;

        int number = 20;

        if (isEven.test(number)) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
