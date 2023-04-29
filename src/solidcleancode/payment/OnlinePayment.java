package solidcleancode.payment;

public interface OnlinePayment extends PaymentInstrument {
    public void authenticatePaymentDetails();
    public void runFraudChecks();
}
