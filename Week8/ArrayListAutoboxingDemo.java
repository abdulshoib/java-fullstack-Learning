import java.util.ArrayList;

public class ArrayListAutoboxingDemo {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(80);
        marks.add(90);
        marks.add(75);
        marks.add(88);

        int total = 0;

        for (Integer mark : marks) {
            total += mark;
        }

        System.out.println("Marks : " + marks);
        System.out.println("Total : " + total);
        System.out.println("Average : " + (total / marks.size()));
    }
}