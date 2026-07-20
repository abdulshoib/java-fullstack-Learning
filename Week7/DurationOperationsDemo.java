
import java.time.Duration;

public class DurationOperationsDemo {

    public static void main(String[] args) {

        Duration duration = Duration.ofHours(2);

        System.out.println("Original Duration : " + duration);

        System.out.println("After Adding 30 Minutes : "
                + duration.plusMinutes(30));

        System.out.println("After Subtracting 45 Minutes : "
                + duration.minusMinutes(45));
    }
}
