
import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentSearch {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Shoaib");
        students.put(102, "Rahul");
        students.put(103, "Ayesha");
        students.put(104, "Priya");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID to search: ");
        int id = sc.nextInt();

        if (students.containsKey(id)) {
            System.out.println("Student Found: " + students.get(id));
        } else {
            System.out.println("Student not found");
        }

        sc.close();
    }
}
