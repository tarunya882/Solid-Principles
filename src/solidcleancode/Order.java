package solidcleancode;

import solidcleancode.notifier.OrderNotifier;
import solidcleancode.notifier.OrderNotifierToCustomer;
import solidcleancode.payment.DebitCardPayment;
import solidcleancode.payment.PaymentInstrument;
import solidcleancode.saver.OrderSaver;
import solidcleancode.saver.OrderSaverToCloud;
import solidcleancode.validator.AddressValidator;
import solidcleancode.validator.OrderValidator;

public class Order{
    public static void main(String[] args) {
        OrderValidator orderValidator=new AddressValidator();
        OrderSaver orderSaver=new OrderSaverToCloud();
        OrderNotifier orderNotification=new OrderNotifierToCustomer();
        OrderProcessor orderProcessor=new OrderProcessor(orderValidator,orderSaver,orderNotification);
        orderProcessor.process();
        PaymentInstrument paymentType=new DebitCardPayment();
        paymentType.collectPayment();
    }
}
