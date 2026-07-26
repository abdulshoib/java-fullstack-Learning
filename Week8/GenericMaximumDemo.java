
public class GenericMaximumDemo {

    public static <T extends Comparable<T>> T findMaximum(T first, T second) {

        if (first.compareTo(second) > 0) {
            return first; 
        }else {
            return second;
        }
    }

    public static void main(String[] args) {

        System.out.println("Maximum Integer : " + findMaximum(25, 40));

        System.out.println("Maximum String : " + findMaximum("Java", "Python"));

        System.out.println("Maximum Double : " + findMaximum(15.8, 12.3));
    }
}
