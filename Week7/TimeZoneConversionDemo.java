
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneConversionDemo {

    public static void main(String[] args) {

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime londonTime
                = indiaTime.withZoneSameInstant(ZoneId.of("Europe/London"));

        ZonedDateTime usaTime
                = indiaTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("India  : " + indiaTime);
        System.out.println("London : " + londonTime);
        System.out.println("USA    : " + usaTime);
    }
}
