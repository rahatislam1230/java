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
// Interface definition (shows polymorphism capability)
interface PersonInfo {
    String getName();
    String getID();
}

// Student implementation
class Student implements PersonInfo {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String getName() {
        return "Student: " + name;
    }

    @Override
    public String getID() {
        return "S-" + studentId;
    }
}

// Teacher implementation
class Teacher implements PersonInfo {
    private String name;
    private String employeeId;

    public Teacher(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String getName() {
        return "Professor: " + name;
    }

    @Override
    public String getID() {
        return "T-" + employeeId;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create array of PersonInfo objects (polymorphism)
        PersonInfo[] people = new PersonInfo[3];
        people[0] = new Student("Alice Johnson", "1001");  // Student as PersonInfo
        people[1] = new Teacher("Dr. Smith", "2001");     // Teacher as PersonInfo
        people[2] = new Student("Bob Wilson", "1002");    // Another Student

        // Process using normal for loop (polymorphism in action)
        System.out.println("School Personnel Details:");
        for (int i = 0; i < people.length; i++) {
            PersonInfo person = people[i];
            // The same method call behaves differently based on actual object type
            System.out.println(person.getName() + " | ID: " + person.getID());
        }
    }
}
