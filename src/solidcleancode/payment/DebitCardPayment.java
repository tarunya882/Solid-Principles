package solidcleancode.payment;

public class DebitCardPayment implements OnlinePayment {
    @Override
    public void authenticatePaymentDetails() {
        System.out.println("Verified account details ");
    }

    @Override
    public void runFraudChecks() {
        System.out.println("Checks if any fraud activities present");
    }
    @Override
    public void collectPayment() {
        authenticatePaymentDetails();
        runFraudChecks();
        System.out.println("Payment done online");
    }
}
