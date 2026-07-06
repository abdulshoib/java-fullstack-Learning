
import java.util.HashSet;
import java.util.TreeSet;

public class EmployeeSkillManager {

    public static void main(String[] args) {

        HashSet<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("JDBC");
        skills.add("Spring Boot");
        skills.add("Java");
        skills.add("Git");

        System.out.println("Unique Skills:");
        System.out.println(skills);

        TreeSet<String> sortedSkills = new TreeSet<>(skills);

        System.out.println("\nSkills in Sorted Order:");
        System.out.println(sortedSkills);

        if (skills.contains("Java")) {
            System.out.println("\nJava skill is available.");
        }

        skills.remove("JDBC");

        System.out.println("\nAfter removing JDBC:");
        System.out.println(skills);
    }
}
