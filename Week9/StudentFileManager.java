import java.io.*;
import java.util.Scanner;

public class StudentFileManager {

    private static final String TEXT_FILE = "students.txt";
    private static final String OBJECT_FILE = "student.ser";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== STUDENT FILE MANAGEMENT SYSTEM =====");

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Marks: ");
        int marks = scanner.nextInt();

        Student student = new Student(id, name, marks);

        saveToTextFile(student);
        saveObject(student);

        System.out.println();
        System.out.println("===== SAVED STUDENT =====");

        readTextFile();

        System.out.println();
        readObject();

        scanner.close();
    }

    public static void saveToTextFile(Student student) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(TEXT_FILE, true))) {

            writer.write(
                    student.getId() + "," +
                    student.getName() + "," +
                    student.getMarks()
            );

            writer.newLine();

            System.out.println("Student details saved to text file.");

        } catch (IOException e) {

            System.out.println("Unable to save text file.");
        }
    }

    public static void readTextFile() {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(TEXT_FILE))) {

            String line;

            System.out.println("Student Records:");

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println("Unable to read student file.");
        }
    }

    public static void saveObject(Student student) {

        try (ObjectOutputStream output =
                     new ObjectOutputStream(
                             new FileOutputStream(OBJECT_FILE))) {

            output.writeObject(student);

            System.out.println(
                    "Student object serialized successfully."
            );

        } catch (IOException e) {

            System.out.println("Unable to serialize student.");
        }
    }

    public static void readObject() {

        try (ObjectInputStream input =
                     new ObjectInputStream(
                             new FileInputStream(OBJECT_FILE))) {

            Student student = (Student) input.readObject();

            System.out.println("Deserialized Student:");

            student.display();

        } catch (IOException | ClassNotFoundException e) {

            System.out.println(
                    "Unable to deserialize student."
            );
        }
    }
}