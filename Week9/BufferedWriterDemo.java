import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args) {

        try {

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("Student.txt"));

            writer.write("Welcome to Java File Handling.");
            writer.newLine();
            writer.write("Learning BufferedWriter.");

            writer.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}