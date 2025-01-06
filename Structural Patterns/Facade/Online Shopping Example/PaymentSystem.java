public class PaymentSystem {
    public boolean makePayment(String account, double amount){
        System.out.println("From account " + account + "Amount: " + amount);

        return true;
    }

    public void refund(String account, double amount){
        System.out.println("To account " + account + "Amount: " + amount);
    }
}
