import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserializationDemo {

    public static void main(String[] args) {

        try (
            FileInputStream file =
                    new FileInputStream("employee.ser");

            ObjectInputStream input =
                    new ObjectInputStream(file)
        ) {

            Employee employee =
                    (Employee) input.readObject();

            System.out.println(
                    "Employee object deserialized successfully."
            );

            employee.display();

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}