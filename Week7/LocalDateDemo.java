import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Current Date : " + today);
        System.out.println("Year         : " + today.getYear());
        System.out.println("Month        : " + today.getMonth());
        System.out.println("Month Value  : " + today.getMonthValue());
        System.out.println("Day          : " + today.getDayOfMonth());
        System.out.println("Day Of Week  : " + today.getDayOfWeek());
        System.out.println("Day Of Year  : " + today.getDayOfYear());
    }
}