import strategies.PaymentByCreditCard;
import strategies.PaymentByPayPal;
import strategies.PaymentStrategy;

import java.util.Scanner;

public class StrategyMain {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        int choice = scanner.nextInt();

        PaymentStrategy strategy = null;

        switch (choice) {
            case 1:
                strategy = new PaymentByCreditCard();
                break;
            case 2:
                strategy = new PaymentByPayPal();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Kullanıcının seçtiği stratejiyi ayarla
        paymentService.setPaymentStrategy(strategy);

        // Ödeme işlemini başlat
        paymentService.processOrder(50.0); // Ödenecek miktar 50.0
    }
}
