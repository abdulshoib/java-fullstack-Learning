
import java.util.TreeSet;

public class TreeSetStudentMarks {

    public static void main(String[] args) {

        // TreeSet stores unique marks in sorted order
        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(85);
        marks.add(72);
        marks.add(90);
        marks.add(66);
        marks.add(78);
        marks.add(90); // duplicate value ignored

        System.out.println("Student marks in ascending order: " + marks);

        System.out.println("Lowest marks: " + marks.first());
        System.out.println("Highest marks: " + marks.last());

        System.out.println("Marks in descending order: " + marks.descendingSet());

        System.out.println("Marks below 80: " + marks.headSet(80));
        System.out.println("Marks 80 and above: " + marks.tailSet(80));
    }
}
