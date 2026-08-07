import java.io.FileWriter;
import java.io.IOException;

public class FileAppendDemo {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("Employee.txt", true);

            writer.write("\nSalary : 50000");
            writer.write("\nLocation : Hyderabad");

            writer.close();

            System.out.println("Data appended successfully.");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}