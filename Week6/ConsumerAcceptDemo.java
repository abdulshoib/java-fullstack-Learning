import java.util.function.Consumer;

public class ConsumerAcceptDemo {
    public static void main(String[] args) {

        // Consumer takes input but does not return output
        Consumer<String> display = message -> {
            System.out.println("Message: " + message);
        };

        display.accept("Consumer interface uses accept() method");
        display.accept("It is a predefined functional interface in Java 8");
    }
}