
public class GenericPrintDemo {

    public static <T> void printValue(T value) {
        System.out.println("Value : " + value);
    }

    public static void main(String[] args) {

        printValue("Java");
        printValue(100);
        printValue(99.5);
        printValue(true);
    }
}
