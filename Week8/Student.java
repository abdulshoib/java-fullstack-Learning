public class Student<T> {

    private T studentId;
    private String name;
    private Integer marks;
    private StudentStatus status;

    public Student(T studentId, String name, Integer marks, StudentStatus status) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
        this.status = status;
    }

    public void display() {
        System.out.println("-----------------------------");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Marks      : " + marks);
        System.out.println("Status     : " + status);
    }
}