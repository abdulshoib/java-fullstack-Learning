
import java.util.ArrayList;

public class LambdaForEachDemo {

    public static void main(String[] args) {

        ArrayList<String> skills = new ArrayList<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("JDBC");
        skills.add("Spring Boot");

        System.out.println("Skills List:");

        // forEach with lambda expression
        skills.forEach(skill -> System.out.println(skill));
    }
}
