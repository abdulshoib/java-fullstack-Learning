
import java.io.FileReader;
import java.io.IOException;

public class CharacterCountDemo {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("Employee.txt");

            int count = 0;

            while (reader.read() != -1) {

                count++;
            }

            reader.close();

            System.out.println("Total Characters : " + count);

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}
