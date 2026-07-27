
public class GenericSwapDemo {

    public static <T> void swap(T first, T second) {

        System.out.println("Before Swap");
        System.out.println("First  : " + first);
        System.out.println("Second : " + second);

        T temp = first;
        first = second;
        second = temp;

        System.out.println("\nAfter Swap");
        System.out.println("First  : " + first);
        System.out.println("Second : " + second);
    }

    public static void main(String[] args) {

        swap(10, 20);
        System.out.println();

        swap("Java", "Spring");
    }
}
