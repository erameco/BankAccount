public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private static int numAccounts = 0;
    private static double totalAmount = 0.0;


    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numAccounts++;
        totalAmount += checkingBalance + savingsBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalAmount += amount;
        System.out.println("Deposited $" + amount + " into " + accountType + " account.");
    }

    public void withdraw(double amount, String accountType) {
        boolean sufficientFunds = false;
        if (accountType.equalsIgnoreCase("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                sufficientFunds = true;
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                sufficientFunds = true;
            }
        }

        if (sufficientFunds) {
            totalAmount -= amount;
            System.out.println("Withdrew $" + amount + " from " + accountType + " account.");
        } else {
            System.out.println("Insufficient funds in " + accountType + " account.");
        }
    }

    public void displayTotalMoney() {
        System.out.println("Total money in Checking: $" + checkingBalance);
        System.out.println("Total money in Savings: $" + savingsBalance);
    }

    public static int getNumAccounts() {
        return numAccounts;
    }

    public static double getTotalAmount() {
        return totalAmount;
    }






}