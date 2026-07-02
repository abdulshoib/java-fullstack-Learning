import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapStudentRecords {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> studentRecords = new LinkedHashMap<>();

        studentRecords.put(1, "Shoaib");
        studentRecords.put(2, "Rahul");
        studentRecords.put(3, "Ayesha");
        studentRecords.put(4, "Priya");

        System.out.println("Student Records in Insertion Order:");

        for (Map.Entry<Integer, String> entry : studentRecords.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}