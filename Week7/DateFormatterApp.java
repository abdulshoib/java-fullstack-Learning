import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterApp {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Current Date & Time");
        System.out.println(now.format(formatter));
    }
}