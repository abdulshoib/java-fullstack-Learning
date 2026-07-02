
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapLoginHistory {

    public static void main(String[] args) {

        // LinkedHashMap is useful when order matters
        LinkedHashMap<String, String> loginHistory = new LinkedHashMap<>();

        loginHistory.put("Shoaib", "09:00 AM");
        loginHistory.put("Rahul", "09:15 AM");
        loginHistory.put("Ayesha", "09:30 AM");
        loginHistory.put("Priya", "09:45 AM");

        System.out.println("User Login History:");

        for (Map.Entry<String, String> entry : loginHistory.entrySet()) {
            System.out.println(entry.getKey() + " logged in at " + entry.getValue());
        }
    }
}
