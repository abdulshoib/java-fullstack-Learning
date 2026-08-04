import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) {

        try {

            FileOutputStream output = new FileOutputStream("Student.txt");

            String message = "Welcome to Java File Handling.";

            output.write(message.getBytes());

            output.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}