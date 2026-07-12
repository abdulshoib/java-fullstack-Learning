
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCountCollectDemo {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(45);
        marks.add(78);
        marks.add(90);
        marks.add(35);
        marks.add(66);
        marks.add(88);

        long passedCount = marks.stream()
                .filter(mark -> mark >= 50)
                .count();

        List<Integer> passedMarks = marks.stream()
                .filter(mark -> mark >= 50)
                .collect(Collectors.toList());

        System.out.println("Passed Count: " + passedCount);
        System.out.println("Passed Marks: " + passedMarks);
    }
}
