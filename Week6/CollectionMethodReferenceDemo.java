
import java.util.ArrayList;

public class CollectionMethodReferenceDemo {

    public static void main(String[] args) {

        ArrayList<String> topics = new ArrayList<>();

        topics.add("Lambda Expression");
        topics.add("Functional Interface");
        topics.add("Predicate");
        topics.add("Consumer");
        topics.add("Supplier");
        topics.add("Function");
        topics.add("Stream API");
        topics.add("Optional Class");

        System.out.println("Java 8 Topics:");

        // Using method reference with forEach
        topics.forEach(System.out::println);
    }
}
