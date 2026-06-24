
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        // TreeSet stores unique elements in sorted order
        TreeSet<String> skills = new TreeSet<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("Spring Boot");
        skills.add("JDBC");
        skills.add("Java"); // duplicate value, ignored by TreeSet

        System.out.println("Skills in sorted order: " + skills);

        // Search element
        if (skills.contains("Java")) {
            System.out.println("Java is available");
        } else {
            System.out.println("Java is not available");
        }

        // Remove element
        skills.remove("SQL");

        System.out.println("After removing SQL: " + skills);

        // Size of TreeSet
        System.out.println("Total skills: " + skills.size());
    }
}
