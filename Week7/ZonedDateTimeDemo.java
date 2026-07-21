
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

    public static void main(String[] args) {

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usaTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("India Time");
        System.out.println(indiaTime);

        System.out.println("\nUSA Time");
        System.out.println(usaTime);

        System.out.println("\nLondon Time");
        System.out.println(londonTime);
    }
}
