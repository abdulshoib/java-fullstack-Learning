
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEmployeeSalary {

    public static void main(String[] args) {

        LinkedHashMap<String, Double> salaryMap = new LinkedHashMap<>();

        salaryMap.put("Shoaib", 30000.0);
        salaryMap.put("Rahul", 28000.0);
        salaryMap.put("Ayesha", 35000.0);
        salaryMap.put("Priya", 32000.0);

        System.out.println("Employee Salary Details:");

        for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Update salary
        salaryMap.put("Shoaib", 35000.0);

        System.out.println("\nAfter Salary Update:");
        System.out.println(salaryMap);
    }
}
