package Task1;

public class OrderService {

    public OrderService() {
    }

    int orderCount;

    public synchronized void increaseOrderCount() {
        this.orderCount += 1;
    }

    public int getOrderCount() {
        return orderCount;
    }

}
