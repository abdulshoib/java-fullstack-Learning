import java.io.FileOutputStream;
import java.io.IOException;

public class MultipleLineWriter {

    public static void main(String[] args) {

        try {

            FileOutputStream output = new FileOutputStream("Marks.txt");

            String data =
                    "Rahul : 85\n" +
                    "Anjali : 92\n" +
                    "Amit : 76\n";

            output.write(data.getBytes());

            output.close();

            System.out.println("Marks saved successfully.");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}