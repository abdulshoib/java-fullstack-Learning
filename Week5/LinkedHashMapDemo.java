import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        // LinkedHashMap stores key-value pairs and maintains insertion order
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Shoaib");
        students.put(102, "Rahul");
        students.put(103, "Ayesha");
        students.put(104, "Priya");

        System.out.println("Student Records: " + students);

        // Access value using key
        System.out.println("Student with ID 102: " + students.get(102));

        // Update value
        students.put(103, "Ayesha Khan");

        // Remove value
        students.remove(104);

        System.out.println("After update and delete: " + students);
    }
}