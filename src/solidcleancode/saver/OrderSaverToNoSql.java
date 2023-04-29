package solidcleancode.saver;

public class OrderSaverToNoSql implements OrderSaver {
    @Override
    public void save() {
        System.out.println("Order Saved to nosql");
    }
}
