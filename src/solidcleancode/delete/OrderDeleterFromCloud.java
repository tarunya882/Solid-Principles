package solidcleancode.delete;

public class OrderDeleterFromCloud implements OrderDeleter{
    @Override
    public void delete() {
        System.out.println("Order deleted from cloud");
    }
}