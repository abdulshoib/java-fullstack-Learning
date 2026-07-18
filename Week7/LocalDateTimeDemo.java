
import java.time.LocalDateTime;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current Date and Time : " + currentDateTime);
        System.out.println("Year    : " + currentDateTime.getYear());
        System.out.println("Month   : " + currentDateTime.getMonth());
        System.out.println("Day     : " + currentDateTime.getDayOfMonth());
        System.out.println("Hour    : " + currentDateTime.getHour());
        System.out.println("Minute  : " + currentDateTime.getMinute());
        System.out.println("Second  : " + currentDateTime.getSecond());
    }
}
