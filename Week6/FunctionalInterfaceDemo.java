
@FunctionalInterface
interface Message {

    void showMessage();
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        Message message = () -> System.out.println("This is a Functional Interface example");

        message.showMessage();
    }
}
