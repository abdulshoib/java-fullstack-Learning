
import java.util.HashMap;
import java.util.Map;

public class HashMapEmployeeSalary {

    public static void main(String[] args) {

        HashMap<String, Double> salary = new HashMap<>();

        salary.put("Shoaib", 30000.0);
        salary.put("Rahul", 28000.0);
        salary.put("Ayesha", 35000.0);
        salary.put("Priya", 32000.0);

        System.out.println("Employee Salary Details:");

        for (Map.Entry<String, Double> entry : salary.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        salary.put("Shoaib", 35000.0);

        System.out.println("After salary update:");
        System.out.println(salary);
    }
}
