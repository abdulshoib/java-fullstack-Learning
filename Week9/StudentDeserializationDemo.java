import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserializationDemo {

    public static void main(String[] args) {

        try {

            FileInputStream file =
                    new FileInputStream("student.ser");

            ObjectInputStream input =
                    new ObjectInputStream(file);

                    
            Student student =
                    (Student) input.readObject();

            input.close();
            file.close();

            System.out.println("Student object deserialized successfully.");
            student.display();

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}