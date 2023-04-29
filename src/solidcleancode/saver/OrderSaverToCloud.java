package solidcleancode.saver;

public class OrderSaverToCloud implements OrderSaver {
    @Override
    public void save() {
        System.out.println("Order saved to cloud");
    }
}
