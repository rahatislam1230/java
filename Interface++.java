import java.util.Scanner;
class Customer {
    private String name;
    private BankAccount account;

    Customer(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }
}

abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingAccount extends BankAccount implements Transaction {
    private static final double INTEREST_RATE = 0.05;

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

   
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class FixedDepositAccount extends BankAccount implements Transaction {
    private static final double INTEREST_RATE = 0.08;
    private int termMonths;

    public FixedDepositAccount(String accountNumber, double balance, int termMonths) {
        super(accountNumber, balance);
        this.termMonths = termMonths;
    }
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE * (termMonths / 12.0);
    }
    public void deposit(double amount) {
        System.out.println("Cannot deposit to fixed account");
    }

    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from fixed account before maturity");
    }
}

final class BankUtility {
    public final void displayBankName() {
        System.out.println("My Bank International");
    }
}

public class Start{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankUtility utility = new BankUtility();
        utility.displayBankName();
        String savingAccNum = scanner.nextLine();
        
        double savingBalance = scanner.nextDouble();
        scanner.nextLine(); 
        SavingAccount savingAccount = new SavingAccount(savingAccNum, savingBalance);
        String fdAccNum = scanner.nextLine();
        double fdBalance = scanner.nextDouble();
        int term = scanner.nextInt();
        scanner.nextLine(); 
        FixedDepositAccount fdAccount = new FixedDepositAccount(fdAccNum, fdBalance, term);
        String customer1Name = scanner.nextLine();
        Customer customer1 = new Customer(customer1Name, savingAccount);
        String customer2Name = scanner.nextLine();
        Customer customer2 = new Customer(customer2Name, fdAccount);
        double depositAmount = scanner.nextDouble();
        savingAccount.deposit(depositAmount);
        double withdrawAmount = scanner.nextDouble();
        savingAccount.withdraw(withdrawAmount); 
        double fdDeposit = scanner.nextDouble();
        fdAccount.deposit(fdDeposit);
        double fdWithdraw = scanner.nextDouble();
        fdAccount.withdraw(fdWithdraw);
        System.out.println(customer1.getName() + "'s Saving Account (" + 
                         savingAccount.getAccountNumber() + "):");
        System.out.println("  Balance: " + savingAccount.getBalance());
        System.out.println("  Interest: " + savingAccount.calculateInterest());

        System.out.println(customer2.getName() + "'s Fixed Deposit Account (" + 
                         fdAccount.getAccountNumber() + "):");
        System.out.println("  Balance: " + fdAccount.getBalance());
        System.out.println("  Interest: " + fdAccount.calculateInterest());

    }
}
