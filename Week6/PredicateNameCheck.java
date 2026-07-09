
import java.util.function.Predicate;

public class PredicateNameCheck {

    public static void main(String[] args) {

        Predicate<String> startsWithA = name -> name.startsWith("A");

        String name = "Abdul";

        if (startsWithA.test(name)) {
            System.out.println(name + " starts with A");
        } else {
            System.out.println(name + " does not start with A");
        }
    }
}
