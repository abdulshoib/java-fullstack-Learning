import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EmployeeExperienceCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Joining Year : ");
        int year = scanner.nextInt();

        System.out.print("Enter Joining Month : ");
        int month = scanner.nextInt();

        System.out.print("Enter Joining Day : ");
        int day = scanner.nextInt();

        LocalDate joiningDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("\nJoining Date : " + joiningDate);
        System.out.println("Current Date : " + today);
        System.out.println("Experience : "
                + experience.getYears() + " Years "
                + experience.getMonths() + " Months "
                + experience.getDays() + " Days");

        scanner.close();
    }
}