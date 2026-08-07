import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("Employee.txt");

            writer.write("Employee ID : 101\n");
            writer.write("Employee Name : Rahul\n");
            writer.write("Department : IT");

            writer.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}