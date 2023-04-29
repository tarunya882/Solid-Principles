package solidcleancode;

import solidcleancode.notifier.OrderNotifier;
import solidcleancode.saver.OrderSaver;
import solidcleancode.validator.OrderValidator;

public class OrderProcessor {
    OrderValidator orderValidator;
    OrderSaver orderSaver;
    OrderNotifier orderNotifier;
    public OrderProcessor(OrderValidator orderValidator,OrderSaver orderSaver,OrderNotifier orderNotifier){
        this.orderValidator= orderValidator;
        this.orderSaver=orderSaver;
        this.orderNotifier=orderNotifier;
    }
    public void process() {
        orderValidator.validate();
        orderSaver.save();
        orderNotifier.sendNotification();
    }
}

