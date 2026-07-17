import java.time.LocalDate;

public class LocalDateOperationsDemo {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Today            : " + today);
        System.out.println("After 10 Days    : " + today.plusDays(10));
        System.out.println("Before 1 Month   : " + today.minusMonths(1));
        System.out.println("After 2 Years    : " + today.plusYears(2));
    }
}