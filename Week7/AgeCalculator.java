import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Birth Year : ");
        int year = scanner.nextInt();

        System.out.print("Enter Birth Month : ");
        int month = scanner.nextInt();

        System.out.print("Enter Birth Day : ");
        int day = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.println("\nAge Details");
        System.out.println("Years  : " + age.getYears());
        System.out.println("Months : " + age.getMonths());
        System.out.println("Days   : " + age.getDays());

        scanner.close();
    }
}