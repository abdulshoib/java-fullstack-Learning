import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDaysDemo {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2026, 1, 1);
        LocalDate endDate = LocalDate.of(2026, 7, 18);

        long days = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Start Date : " + startDate);
        System.out.println("End Date   : " + endDate);
        System.out.println("Total Days : " + days);
    }
}