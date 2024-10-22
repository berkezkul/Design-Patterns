package strategies;

import java.util.Scanner;

public class PaymentByPayPal implements PaymentStrategy {
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PayPal Email: ");
        email = scanner.nextLine();
        System.out.print("Enter PayPal Password: ");
        password = scanner.nextLine();
    }

    @Override
    public boolean validatePaymentDetails() {
        // Basit doğrulama mantığı
        return email.contains("@") && password.length() > 4;
    }

    @Override
    public void processPayment(double amount) {
        if (validatePaymentDetails()) {
            System.out.println("Payment of " + amount + " processed using PayPal.");
        } else {
            System.out.println("Invalid PayPal Credentials.");
        }
    }
}
