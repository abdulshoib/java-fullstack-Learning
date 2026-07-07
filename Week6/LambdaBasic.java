interface Greeting {
    void sayHello();
}

public class LambdaBasic {
    public static void main(String[] args) {

        // Lambda expression implementation
        Greeting greeting = () -> System.out.println("Hello, welcome to Java 8 Lambda Expressions");

        greeting.sayHello();
    }
}