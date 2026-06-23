
import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDuplicateRemoval {

    public static void main(String[] args) {

        // ArrayList allows duplicate values
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original List: " + numbers);

        // HashSet removes duplicate values automatically
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println("After Removing Duplicates: " + uniqueNumbers);
    }
}
