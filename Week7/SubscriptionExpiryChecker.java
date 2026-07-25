
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SubscriptionExpiryChecker {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate expiryDate = today.plusMonths(6);

        long daysLeft = ChronoUnit.DAYS.between(today, expiryDate);

        System.out.println("Today's Date : " + today);
        System.out.println("Expiry Date  : " + expiryDate);
        System.out.println("Days Left    : " + daysLeft);
    }
}
