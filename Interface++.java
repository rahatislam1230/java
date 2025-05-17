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
class IDcard{
    private String idnum;
    private String issueDa;
    IDcard(String idnum,String issueDa){
        this.idnum=idnum;
        this.issueDa=issueDa;
    }
    void setIdNum(String idnum){
        this.idnum=idnum;
    }
    String getIdNum(){
        return idnum;
    }
    void setIssueD(String issueDa){
        this.issueDa=issueDa;
    }
    String getIssueD(){
        return issueDa;
    }
}
interface PersonaInfo{
    String getName();
    String getId();
}
class Student implements PersonaInfo{
    private String name;
    private String studentid;
    private IDcard idCard;
    public Student(String name,String studentid,IDcard idCard){
        this.name=name;
        this.studentid=studentid;
        this.idCard=idCard;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setID(String studentid){
        this.studentid=studentid;
    }
    public String getId(){
        return studentid;
    }
    public void setIdCard(IDcard idCard){
        this.idCard=idCard;
    }
    public IDcard getIdCard(){
        return idCard;
    }
}
class Teacher implements PersonaInfo{
    private String tname;
    private String teacherid;
    private IDcard idCard;
    public Student(String tname,String teacherid){
        this.tname=tname;
        this.teacherid=teacherid; 
    }
    public void setName(String tname){
        this.tname=tname;
    }
    public String getName(){
        return tname;
    }
    public void setID(String teacherid){
        this.teacherid=teacherid;
    }
    public String getId(){
        return teacherid;
    }
}
class Course{
    private String courseName;
    private Teacher teacher;
    public Course(String courseName){
        this.courseName=courseName;
    }
    public void setTeacher(Teacher teacher){
        this.teacher=teacher;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }
    public String getCourseName() {
        return courseName;
    }
}
final class FinalExam {
    private String examName;
    public FinalExam(String examName) {
        this.examName = examName;
    }
    public final void announceResults() {
        System.out.println("Official results for " + examName + " have been published!");
    }
}
public class Main {
    public static void main(String[] args) {
      

      //////
    }
}
interface Movable {
    void moveForward();
    void moveBackward();
    void turnLeft();
    void turnRight();
}

abstract class GameEntity {
    public void render() {
        System.out.println("Render:" + texture + " x:" + x + " y:" + y);
    }

    abstract void update();
    private int x, y;
    private String texture;

    public void setX(int x) { 
        this.x = x; 
    }
    public int getX() {
     return x; 
 }

    public void setY(int y) { 
        this.y = y; 
    }
    public int getY() { 
        return y;
     }

    public void setTexture(String texture) { 
        this.texture = texture; 
    }
    public String getTexture() { 
        return texture; 
    }
}

abstract class Enemy extends GameEntity {
    public abstract void attack();
}

class Zombie extends Enemy {
    public void attack() { 
        System.out.println("zombie attacking"); 
    }
    public void update() { 
        System.out.println("zombie moving "); 
    }
}

class Alien extends Enemy {
    public void attack() { 
        System.out.println("Alien attacking");
         }
    public void update() { 
        System.out.println("Alien moving");
         }
}

class Robot extends Enemy {
    public void attack() { 
        System.out.println("Robot attacking"); 
    }
    public void update() { 
        System.out.println("Robot moving");
         }
}

class Item {
    private String name;
    public Item(String name) { 
        this.name = name;
         }
    public void setName(String name) {
     this.name = name; 
 }
    public String getName() { 
        return name; 
    }
    public String toString() { 
        return name; 
    }
}

class Inventory {
    private Item[] items;
    private int itemCount;

    public Inventory(int capacity) {
        items = new Item[capacity];
        itemCount = 0;
    }

    public void addItems(Item item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Inventory is full");
        }
    }

    public void showItems() {
        for (int i = 0; i < itemCount; i++) {
            System.out.println(" " + items[i].getName());
        }
    }

    public void setItem(Item[] items) {
        this.items = items;
    }
    public Item[] getItem() {
        return items;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
    public int getItemCount() {
        return itemCount;
    }
}

class Player extends GameEntity implements Movable {
    private Inventory inventory; 
    public Player() {
        inventory = new Inventory(5);
    }
    public void moveForward() { setY(getY() + 1); }
    public void moveBackward() { setY(getY() - 1); }
    public void turnLeft() { setX(getX() - 1); }
    public void turnRight() { setX(getX() + 1); }

    public void update() {
        System.out.println("Player updating...");
    }
    public void addItemToInventory(Item item) {
        inventory.addItems(item);
    }

    public void showInventory() {
        inventory.showItems();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}

public class Start {
    public static void main(String[] args) {

        Player player = new Player();
        player.setTexture("hero");
        player.setX(10);
        player.setY(5);
        player.render();
        player.addItemToInventory(new Item("Sword"));
        player.addItemToInventory(new Item("Potion"));
        player.addItemToInventory(new Item("Map"));
        Enemy[] enemies = { new Zombie(), new Alien(), new Robot() };
        for (int i = 0; i < enemies.length; i++) {
            enemies[i].attack();
            enemies[i].update();
        }
    }
}
interface Drivable {
    void accelerate();
    void brake();
}

class Car implements Drivable {
    private final String model;
    private int speed;

    public Car(String model) {
        this.model = model;
        this.speed = 0;  // default speed
    }

    // Implementing accelerate method
    public void accelerate() {
        speed += 10;
        System.out.println(model + " accelerated. Current speed: " + speed);
    }

    // Implementing brake method
    public void brake() {
        speed -= 10;
        if (speed < 0) speed = 0; // prevent negative speed
        System.out.println(model + " braked. Current speed: " + speed);
    }

    // Getter for model (final, so no setter)
    public String getModel() {
        return model;
    }

    // Getter and setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }
}
public class Start {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.accelerate(); // Toyota accelerated. Current speed: 10
        myCar.accelerate(); // Toyota accelerated. Current speed: 20
        myCar.brake();      // Toyota braked. Current speed: 10
        System.out.println("Final speed: " + myCar.getSpeed());
        System.out.println("Model: " + myCar.getModel());
    }
}
