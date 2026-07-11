
import java.util.function.Function;

public class FunctionComposeDemo {

    public static void main(String[] args) {

        Function<Integer, Integer> multiplyByTwo = number -> number * 2;
        Function<Integer, Integer> addTen = number -> number + 10;

        // compose executes second function first, then first function
        int result = multiplyByTwo.compose(addTen).apply(5);

        System.out.println("Result using compose(): " + result);
    }
}
