import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        // HashSet stores only unique elements
        HashSet<String> skills = new HashSet<>();

        // Adding elements
        skills.add("Java");
        skills.add("SQL");
        skills.add("JDBC");
        skills.add("Java"); // duplicate, ignored by HashSet

        // Display HashSet
        System.out.println("Skills: " + skills);

        // Search element
        if (skills.contains("Java")) {
            System.out.println("Java skill is available");
        } else {
            System.out.println("Java skill is not available");
        }

        // Remove element
        skills.remove("SQL");

        System.out.println("After removing SQL: " + skills);

        // Size of HashSet
        System.out.println("Total skills: " + skills.size());
    }
}