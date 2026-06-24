
import java.util.TreeSet;

public class TreeSetNumbers {

    public static void main(String[] args) {

        // TreeSet stores numbers in ascending order
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10); // duplicate value ignored

        System.out.println("Numbers in sorted order: " + numbers);

        System.out.println("Smallest number: " + numbers.first());
        System.out.println("Largest number: " + numbers.last());

        System.out.println("Numbers less than 30: " + numbers.headSet(30));
        System.out.println("Numbers greater than or equal to 30: " + numbers.tailSet(30));
    }
}
