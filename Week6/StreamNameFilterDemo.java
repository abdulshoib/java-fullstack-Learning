import java.util.ArrayList;

public class StreamNameFilterDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Abdul");
        names.add("Ayesha");
        names.add("Rahul");
        names.add("Aman");
        names.add("Priya");

        System.out.println("Names starting with A:");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));
    }
}