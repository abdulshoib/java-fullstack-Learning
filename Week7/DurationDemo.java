
import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo {

    public static void main(String[] args) {

        LocalTime start = LocalTime.of(9, 30);
        LocalTime end = LocalTime.of(17, 45);

        Duration duration = Duration.between(start, end);

        System.out.println("Hours   : " + duration.toHours());
        System.out.println("Minutes : " + duration.toMinutes());
    }
}
