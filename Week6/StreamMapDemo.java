
import java.util.ArrayList;

public class StreamMapDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("java");
        names.add("sql");
        names.add("jdbc");
        names.add("spring");

        System.out.println("Names in uppercase:");

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));
    }
}
