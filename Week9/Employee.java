import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name,
                    String department, double salary) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {

        System.out.println("-------------------------");
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
    }
}