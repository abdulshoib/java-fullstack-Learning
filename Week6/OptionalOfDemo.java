import java.util.Optional;

public class OptionalOfDemo {
    public static void main(String[] args) {

        String name = "Java";

        Optional<String> optionalName = Optional.of(name);

        if (optionalName.isPresent()) {
            System.out.println("Value is present: " + optionalName.get());
        } else {
            System.out.println("Value is not present");
        }
    }
}