
public class LambdaRunnableDemo {

    public static void main(String[] args) {

        // Runnable using lambda expression
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task running: " + i);
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
