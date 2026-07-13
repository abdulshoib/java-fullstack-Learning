import java.util.Optional;

public class OptionalIsPresentDemo {
    public static void main(String[] args) {

        Optional<String> course = Optional.of("Java 8 Features");

        if (course.isPresent()) {
            System.out.println("Course Name: " + course.get());
        }

        course.ifPresent(value -> System.out.println("Using ifPresent(): " + value));
    }
}