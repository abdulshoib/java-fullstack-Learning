import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentMarksWriter {

    public static void main(String[] args) {

        try {

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("Marks.txt"));

            writer.write("Rahul : 85");
            writer.newLine();

            writer.write("Anjali : 92");
            writer.newLine();

            writer.write("Amit : 78");

            writer.close();

            System.out.println("Student marks saved.");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}