
import java.time.LocalDateTime;

public class LocalDateTimeOperationsDemo {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Current DateTime : " + now);
        System.out.println("After 5 Days     : " + now.plusDays(5));
        System.out.println("After 3 Hours    : " + now.plusHours(3));
        System.out.println("Before 2 Months  : " + now.minusMonths(2));
    }
}
