
import java.util.function.Supplier;

class CourseInfo {

    public CourseInfo() {
        System.out.println("CourseInfo object created using constructor reference");
    }

    public void displayCourse() {
        System.out.println("Topic: Java 8 Method Reference");
    }
}

public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        // Using constructor reference
        Supplier<CourseInfo> courseSupplier = CourseInfo::new;

        CourseInfo course = courseSupplier.get();

        course.displayCourse();
    }
}
