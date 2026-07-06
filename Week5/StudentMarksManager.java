import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMarksManager {
    public static void main(String[] args) {

        HashMap<Integer, String> studentNames = new HashMap<>();
        HashMap<Integer, Integer> studentMarks = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Marks Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    studentNames.put(id, name);
                    studentMarks.put(id, marks);

                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.println("\nStudent Records:");

                    for (Map.Entry<Integer, String> entry : studentNames.entrySet()) {
                        int studentId = entry.getKey();
                        System.out.println("ID: " + studentId +
                                ", Name: " + entry.getValue() +
                                ", Marks: " + studentMarks.get(studentId));
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    if (studentNames.containsKey(searchId)) {
                        System.out.println("Student Found");
                        System.out.println("Name: " + studentNames.get(searchId));
                        System.out.println("Marks: " + studentMarks.get(searchId));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to update marks: ");
                    int updateId = sc.nextInt();

                    if (studentMarks.containsKey(updateId)) {
                        System.out.print("Enter new marks: ");
                        int newMarks = sc.nextInt();

                        studentMarks.put(updateId, newMarks);
                        System.out.println("Marks updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();

                    if (studentNames.containsKey(deleteId)) {
                        studentNames.remove(deleteId);
                        studentMarks.remove(deleteId);

                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}