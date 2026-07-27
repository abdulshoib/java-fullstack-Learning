
public class GenericStudent<T> {

    private T studentId;

    public GenericStudent(T studentId) {
        this.studentId = studentId;
    }

    public void showStudent() {
        System.out.println("Student ID : " + studentId);
    }

    public static void main(String[] args) {

        GenericStudent<Integer> s1
                = new GenericStudent<>(101);

        GenericStudent<String> s2
                = new GenericStudent<>("STU205");

        s1.showStudent();
        s2.showStudent();
    }
}
