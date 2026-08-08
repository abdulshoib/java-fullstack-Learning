
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerializationDemo {

    public static void main(String[] args) {

        Employee employee
                = new Employee(
                        501,
                        "Rahul",
                        "Development",
                        55000
                );

        try {

            FileOutputStream file
                    = new FileOutputStream("employee.ser");

            ObjectOutputStream output
                    = new ObjectOutputStream(file);

            output.writeObject(employee);

            output.close();
            file.close();

            System.out.println(
                    "Employee object serialized successfully."
            );

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
