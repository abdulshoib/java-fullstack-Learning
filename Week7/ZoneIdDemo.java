import java.time.ZoneId;

public class ZoneIdDemo {

    public static void main(String[] args) {

        ZoneId india = ZoneId.of("Asia/Kolkata");
        ZoneId usa = ZoneId.of("America/New_York");
        ZoneId london = ZoneId.of("Europe/London");

        System.out.println("India Zone  : " + india);
        System.out.println("USA Zone    : " + usa);
        System.out.println("London Zone : " + london);
    }
}