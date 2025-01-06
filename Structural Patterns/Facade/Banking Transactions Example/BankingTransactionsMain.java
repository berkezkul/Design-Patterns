public class BankingTransactionsMain {
    public static void main(String[] args) {
        BankAccountFacade bankAccount = new BankAccountFacade(123456, 7890);
        bankAccount.withdrawCash(500.00);
    }
}
