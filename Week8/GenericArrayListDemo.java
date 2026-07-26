
import java.util.ArrayList;

public class GenericArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Core Java");
        courses.add("Spring Boot");
        courses.add("React");
        courses.add("MySQL");

        System.out.println("Courses:");

        for (String course : courses) {
            System.out.println(course);
        }
    }
}
