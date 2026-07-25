import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EventCountdown {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Event Year : ");
        int year = scanner.nextInt();

        System.out.print("Enter Event Month : ");
        int month = scanner.nextInt();

        System.out.print("Enter Event Day : ");
        int day = scanner.nextInt();

        LocalDate eventDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        long days = ChronoUnit.DAYS.between(today, eventDate);

        if (days >= 0)
            System.out.println("Days Remaining : " + days);
        else
            System.out.println("Event already completed.");

        scanner.close();
    }
}