
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Tony");
        students.put(102, "Rahul");
        students.put(103, "Arun");
        students.put(104, "Priya");

        System.out.println("Student Records: " + students);

        System.out.println("Student with ID 102: " + students.get(102));

        students.put(103, "Ayesha Khan");

        students.remove(104);

        System.out.println("After update and delete: " + students);
    }
}
