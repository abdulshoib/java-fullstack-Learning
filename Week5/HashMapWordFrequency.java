
import java.util.HashMap;

public class HashMapWordFrequency {

    public static void main(String[] args) {

        String sentence = "java is easy java is powerful";

        String[] words = sentence.split(" ");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }

        System.out.println("Word Frequency:");
        System.out.println(frequency);
    }
}
