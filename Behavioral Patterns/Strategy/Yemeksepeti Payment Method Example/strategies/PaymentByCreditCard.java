package strategies;

import java.util.Scanner;

public class PaymentByCreditCard implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String cardCVV;

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Card Number: ");
        cardNumber = scanner.nextLine();
        System.out.print("Enter Card Holder Name: ");
        cardHolderName = scanner.nextLine();
        System.out.print("Enter Card CVV: ");
        cardCVV = scanner.nextLine();
    }

    @Override
    public boolean validatePaymentDetails() {
        // Basit doğrulama mantığı
        return cardNumber.length() == 16 && cardCVV.length() == 3;
    }

    @Override
    public void processPayment(double amount) {
        if (validatePaymentDetails()) {
            System.out.println("Payment of " + amount + " processed using Credit Card.");
        } else {
            System.out.println("Invalid Credit Card Details.");
        }
    }
}
