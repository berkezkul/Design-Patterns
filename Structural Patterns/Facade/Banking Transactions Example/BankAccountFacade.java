class BankAccountFacade {
    private final int accountNumber;
    private final int securityCode;

    private final AccountNumberCheck accountCheck;
    private final SecurityCodeCheck codeCheck;
    private final FundsCheck fundsCheck;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;
        this.accountCheck = new AccountNumberCheck();
        this.codeCheck = new SecurityCodeCheck();
        this.fundsCheck = new FundsCheck();
    }

    public void withdrawCash(double amount) {
        if (accountCheck.accountActive(accountNumber) &&
                codeCheck.isCodeCorrect(securityCode) &&
                fundsCheck.haveEnoughMoney(amount)) {
            fundsCheck.decreaseBalance(amount);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Transaction failed!");
        }
    }
}
