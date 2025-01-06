class FundsCheck {

    private double balance = 1000.00;
    public boolean haveEnoughMoney(double amount) {
        System.out.println("Checking funds for " + amount);
        return balance >= amount;
    }
    public void decreaseBalance(double amount) {
        balance -= amount;
        System.out.println("Funds withdrawn: " + amount);
    }
}
