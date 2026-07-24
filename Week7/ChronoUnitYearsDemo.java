
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitYearsDemo {

    public static void main(String[] args) {

        LocalDate joiningDate = LocalDate.of(2020, 6, 15);
        LocalDate today = LocalDate.now();

        long years = ChronoUnit.YEARS.between(joiningDate, today);
        long months = ChronoUnit.MONTHS.between(joiningDate, today);

        System.out.println("Joining Date : " + joiningDate);
        System.out.println("Today's Date : " + today);
        System.out.println("Completed Years : " + years);
        System.out.println("Completed Months : " + months);
    }
}
