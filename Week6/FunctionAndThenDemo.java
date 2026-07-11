
import java.util.function.Function;

public class FunctionAndThenDemo {

    public static void main(String[] args) {

        Function<Integer, Integer> multiplyByTwo = number -> number * 2;
        Function<Integer, Integer> addTen = number -> number + 10;

        // andThen executes first function first, then second function
        int result = multiplyByTwo.andThen(addTen).apply(5);

        System.out.println("Result using andThen(): " + result);
    }
}
