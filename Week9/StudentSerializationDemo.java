import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerializationDemo {

    public static void main(String[] args) {

        Student student =
                new Student(101, "Shoaib", 85);

        try {

            FileOutputStream file =
                    new FileOutputStream("student.ser");

            ObjectOutputStream output =
                    new ObjectOutputStream(file);

            output.writeObject(student);

            output.close();
            file.close();

            System.out.println("Student object serialized successfully.");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}