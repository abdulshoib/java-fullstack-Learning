
class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("Key   : " + key);
        System.out.println("Value : " + value);
    }
}

public class GenericPairDemo {

    public static void main(String[] args) {

        Pair<Integer, String> student
                = new Pair<>(101, "Shoaib");

        Pair<String, Double> product
                = new Pair<>("Laptop", 55000.00);

        student.display();
        product.display();
    }
}
