
import java.time.LocalTime;

public class LocalTimeOperationsDemo {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        System.out.println("Current Time   : " + currentTime);
        System.out.println("After 2 Hours  : " + currentTime.plusHours(2));
        System.out.println("After 30 Min   : " + currentTime.plusMinutes(30));
        System.out.println("Before 45 Min  : " + currentTime.minusMinutes(45));
    }
}
