
enum OrderStatus {
    PLACED,
    CONFIRMED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

public class OrderStatusDemo {

    public static void main(String[] args) {

        OrderStatus status = OrderStatus.SHIPPED;

        System.out.println("Current Order Status : " + status);

        if (status == OrderStatus.SHIPPED) {
            System.out.println("Your order is on the way.");
        }
    }
}
