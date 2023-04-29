package solidcleancode.payment;

public class CashOnDelivery implements PaymentInstrument {
    public void collectPayment(){
        System.out.println("Paid using cash");
    }
}
