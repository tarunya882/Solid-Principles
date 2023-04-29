package solidcleancode.notifier;

public class OrderNotifierToCustomer implements OrderNotifier {
     public void sendNotification(){
          System.out.println("Order notified to customer");
     }
}
