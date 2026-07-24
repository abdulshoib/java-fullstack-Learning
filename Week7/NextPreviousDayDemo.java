
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NextPreviousDayDemo {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Today          : " + today);
        System.out.println("Next Monday    : "
                + today.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
        System.out.println("Previous Friday: "
                + today.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
    }
}
