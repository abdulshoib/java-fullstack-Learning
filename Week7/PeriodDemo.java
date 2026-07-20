import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

    public static void main(String[] args) {

        LocalDate joiningDate = LocalDate.of(2022, 7, 1);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(joiningDate, currentDate);

        System.out.println("Years  : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days   : " + period.getDays());
    }
}