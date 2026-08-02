
import java.util.ArrayList;
import java.util.Collections;

public class WrapperStatisticsDemo {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(80);
        marks.add(95);
        marks.add(78);
        marks.add(88);
        marks.add(91);

        int total = 0;

        for (Integer mark : marks) {
            total += mark;
        }

        double average = (double) total / marks.size();

        System.out.println("Marks    : " + marks);
        System.out.println("Highest  : " + Collections.max(marks));
        System.out.println("Lowest   : " + Collections.min(marks));
        System.out.println("Average  : " + average);
    }
}
