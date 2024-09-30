package Task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        OrderService orderService = new OrderService();

        Runnable runnable = () -> {
          orderService.increaseOrderCount();
        };

        for (int i = 0; i < 10000; i++) {
            new Thread(runnable).start();
        }

        Thread.sleep(2000);

        int orderCount = orderService.getOrderCount();
        System.out.println(orderCount);

    }
}
