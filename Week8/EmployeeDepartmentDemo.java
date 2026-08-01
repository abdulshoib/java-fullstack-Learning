
enum Department {
    HR,
    SALES,
    FINANCE,
    DEVELOPMENT,
    TESTING
}

public class EmployeeDepartmentDemo {

    public static void main(String[] args) {

        Department department = Department.DEVELOPMENT;

        System.out.println("Department : " + department);

        switch (department) {

            case DEVELOPMENT:
                System.out.println("Developing software.");
                break;

            case TESTING:
                System.out.println("Testing applications.");
                break;

            default:
                System.out.println("Other Department.");
        }
    }
}
