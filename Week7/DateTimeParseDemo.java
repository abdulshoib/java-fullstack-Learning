
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParseDemo {

    public static void main(String[] args) {

        String date = "18-07-2026";

        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println("Parsed Date : " + localDate);
    }
}
