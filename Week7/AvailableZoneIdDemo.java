
import java.time.ZoneId;

public class AvailableZoneIdDemo {

    public static void main(String[] args) {

        System.out.println("First 20 Available Time Zones:\n");

        ZoneId.getAvailableZoneIds()
                .stream()
                .sorted()
                .limit(20)
                .forEach(System.out::println);
    }
}
