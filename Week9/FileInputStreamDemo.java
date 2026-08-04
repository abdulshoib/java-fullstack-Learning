import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) {

        try {

            FileInputStream input = new FileInputStream("Student.txt");

            int character;

            while ((character = input.read()) != -1) {

                System.out.print((char) character);
            }

            input.close();

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}