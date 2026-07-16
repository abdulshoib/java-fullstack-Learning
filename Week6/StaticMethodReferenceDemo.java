
import java.util.function.Function;

class NumberUtility {

    public static int findSquare(int number) {
        return number * number;
    }
}

public class StaticMethodReferenceDemo {

    public static void main(String[] args) {

        // Using lambda expression
        Function<Integer, Integer> squareUsingLambda = number -> NumberUtility.findSquare(number);

        System.out.println("Square using lambda: " + squareUsingLambda.apply(5));

        // Using static method reference
        Function<Integer, Integer> squareUsingMethodReference = NumberUtility::findSquare;

        System.out.println("Square using method reference: " + squareUsingMethodReference.apply(10));
    }
}
