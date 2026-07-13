
import java.util.Optional;

public class OptionalOfNullableDemo {

    public static void main(String[] args) {

        String name = null;

        Optional<String> optionalName = Optional.ofNullable(name);

        if (optionalName.isPresent()) {
            System.out.println("Name: " + optionalName.get());
        } else {
            System.out.println("Name value is null");
        }
    }
}
