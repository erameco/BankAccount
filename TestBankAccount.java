public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(3000.0, 20670.0);

        account.deposit(600.0, "checking");
        account.deposit(1800.0, "savings");

        account.withdraw(400.0, "checking");
        account.withdraw(3056.0, "savings");

        account.displayTotalMoney();
    }
}
