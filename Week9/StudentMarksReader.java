import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentMarksReader {

    public static void main(String[] args) {

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader("Marks.txt"));

            String line;

            System.out.println("Student Marks");

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}