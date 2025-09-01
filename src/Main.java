public class Main {
    public static void main(String[] args) {
        // Display bank information using static variables
        System.out.println("Bank Name: " + BankAccount.getBankName());
        System.out.println("Interest Rate: " + (BankAccount.getInterestRate() * 100) + "%");
        System.out.println();

        // Create at least 3 bank accounts with different names and initial balances
        BankAccount account1 = new BankAccount("John Doe", 1000.0);
        BankAccount account2 = new BankAccount("Jane Smith", 2500.0);
        BankAccount account3 = new BankAccount("Bob Johnson", 500.0);

        System.out.println();
        System.out.println("=== Account Operations ===");

        // Demonstrate deposits and withdrawals
        account1.deposit(500.0);
        account2.withdraw(300.0);

        System.out.println();
        System.out.println("=== Interest Calculation ===");


        System.out.println(account1.getAccountHolderName() + "'s interest: $" +
                account1.calculateInterest());
        System.out.println(account2.getAccountHolderName() + "'s interest: $" +
                account2.calculateInterest());
        System.out.println(account3.getAccountHolderName() + "'s interest: $" +
                account3.calculateInterest());

        System.out.println();


        System.out.println("Total Accounts Created: " + BankAccount.getTotalAccounts());

        System.out.println();
        System.out.println("=== Account Details ===");


        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account3.displayAccountInfo();
    }
}
