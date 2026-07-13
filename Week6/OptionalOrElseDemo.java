
import java.util.Optional;

public class OptionalOrElseDemo {

    public static void main(String[] args) {

        String username = null;

        Optional<String> optionalUsername = Optional.ofNullable(username);

        String result = optionalUsername.orElse("Default User");

        System.out.println("Username: " + result);

        String course = "Java";

        Optional<String> optionalCourse = Optional.ofNullable(course);

        String courseResult = optionalCourse.orElse("No Course Available");

        System.out.println("Course: " + courseResult);
    }
}
