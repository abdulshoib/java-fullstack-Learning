public class GenericBox<T> {

    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Stored Value : " + value);
    }

    public static void main(String[] args) {

        GenericBox<String> course =
                new GenericBox<>("Spring Boot");

        GenericBox<Integer> marks =
                new GenericBox<>(95);

        course.display();
        marks.display();
    }
}