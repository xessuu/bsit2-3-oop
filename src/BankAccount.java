public class BankAccount {

    private static final String bankName = "Liceo Bank";
    private static int totalAccounts = 0;
    private static final double interestRate = 0.03; // 3.0%
    private static int accountCounter = 0;


    private String accountNumber;
    private String accountHolderName;
    private double balance;


    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountNumber = generateAccountNumber();
        totalAccounts++;

        System.out.println("Account Created: " + accountNumber + " for " + accountHolderName +
                " with initial balance: $" + initialBalance);
    }


    private static String generateAccountNumber() {
        accountCounter++;
        return String.format("ACC%03d", accountCounter);
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolderName + " deposited $" + amount +
                    ". New balance: $" + balance);
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount +
                    ". New balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal!");
        }
    }


    public double calculateInterest() {
        return balance * interestRate;
    }


    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Bank: " + bankName);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("------------------------");
    }


    public static int getTotalAccounts() {
        return totalAccounts;
    }


    public static String getBankName() {
        return bankName;
    }


    public static double getInterestRate() {
        return interestRate;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}
