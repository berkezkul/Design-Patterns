import strategies.PaymentStrategy;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(double amount) {
        // Ödeme detaylarını topla
        paymentStrategy.collectPaymentDetails();
        // Ödeme işlemini gerçekleştir
        paymentStrategy.processPayment(amount);
    }
}
