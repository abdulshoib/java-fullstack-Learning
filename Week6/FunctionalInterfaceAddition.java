
@FunctionalInterface
interface AddNumbers {

    int add(int a, int b);
}

public class FunctionalInterfaceAddition {

    public static void main(String[] args) {

        AddNumbers addition = (a, b) -> a + b;

        int result = addition.add(25, 35);

        System.out.println("Addition Result: " + result);
    }
}
