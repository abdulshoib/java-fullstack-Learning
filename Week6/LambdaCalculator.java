interface Calculator {
    int add(int a, int b);
}

public class LambdaCalculator {
    public static void main(String[] args) {

        // Lambda expression with parameters
        Calculator calculator = (a, b) -> a + b;

        int result = calculator.add(10, 20);

        System.out.println("Addition result: " + result);
    }
}