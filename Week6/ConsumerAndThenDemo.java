
import java.util.function.Consumer;

public class ConsumerAndThenDemo {

    public static void main(String[] args) {

        Consumer<String> printUpperCase = text -> {
            System.out.println("Uppercase: " + text.toUpperCase());
        };

        Consumer<String> printLength = text -> {
            System.out.println("Length: " + text.length());
        };

        Consumer<String> result = printUpperCase.andThen(printLength);

        result.accept("java consumer");
    }
}
