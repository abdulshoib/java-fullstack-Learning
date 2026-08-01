class Calculator {

    @Deprecated
    public void oldMethod() {
        System.out.println("Old Method");
    }

    public void newMethod() {
        System.out.println("New Method");
    }
}

public class DeprecatedDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.oldMethod();
        calculator.newMethod();
    }
}