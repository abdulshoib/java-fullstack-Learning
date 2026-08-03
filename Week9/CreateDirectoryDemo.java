import java.io.File;

public class CreateDirectoryDemo {

    public static void main(String[] args) {

        File directory = new File("StudentData");

        if (directory.mkdir())
            System.out.println("Directory created successfully.");
        else
            System.out.println("Directory already exists.");
    }
}