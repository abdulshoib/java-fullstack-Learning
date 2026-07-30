import java.util.ArrayList;
import java.util.Collections;

public class StudentMarksStatistics {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(65);
        marks.add(92);
        marks.add(78);
        marks.add(85);
        marks.add(70);

        System.out.println("Marks : " + marks);
        System.out.println("Highest : " + Collections.max(marks));
        System.out.println("Lowest : " + Collections.min(marks));
    }
}