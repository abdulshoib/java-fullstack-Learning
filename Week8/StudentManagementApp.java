
import java.util.ArrayList;

public class StudentManagementApp {

    public static void main(String[] args) {

        ArrayList<Student<Integer>> students = new ArrayList<>();

        students.add(new Student<>(101, "Rahul", 85, StudentStatus.ACTIVE));
        students.add(new Student<>(102, "Anjali", 92, StudentStatus.GRADUATED));
        students.add(new Student<>(103, "Amit", 76, StudentStatus.ACTIVE));

        System.out.println("Student Details");

        for (Student<Integer> student : students) {
            student.display();
        }
    }
}
