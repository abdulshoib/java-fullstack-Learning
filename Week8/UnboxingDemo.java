public class UnboxingDemo {

    public static void main(String[] args) {

        Integer salary = 45000;

        int employeeSalary = salary;

        System.out.println("Wrapper Object : " + salary);
        System.out.println("Primitive Value: " + employeeSalary);
    }
}