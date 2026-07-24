
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class FirstLastDayDemo {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Today's Date      : " + today);
        System.out.println("First Day         : "
                + today.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("Last Day          : "
                + today.with(TemporalAdjusters.lastDayOfMonth()));
    }
}
