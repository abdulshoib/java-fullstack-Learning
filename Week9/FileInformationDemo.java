
import java.io.File;

public class FileInformationDemo {

    public static void main(String[] args) {

        File file = new File("Student.txt");

        if (file.exists()) {

            System.out.println("File Name : " + file.getName());
            System.out.println("Path : " + file.getAbsolutePath());
            System.out.println("Readable : " + file.canRead());
            System.out.println("Writable : " + file.canWrite());
            System.out.println("Size : " + file.length() + " bytes");

        } else {

            System.out.println("File not found.");
        }
    }
}
