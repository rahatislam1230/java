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
interface Controllable {
     void turnOn();
   void turnOff();
}

interface Connectable extends Controllable {
    void connectToNetwork();
}

abstract class SmartDevice {
    private String deviceName;
    final String brand = "TeachX";

    public abstract void showStatus();

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    void deviceInfo() {
        System.out.println("brand name:" + getDeviceName() + " brand:" + brand);
    }
}

class Remote {
    Remote() {
        System.out.println("I am a remote");
    }
}

class SmartTv extends SmartDevice implements Connectable {
    Remote remote;
    public void turnOn() {
        System.out.println("SmartTv turn on");
    }

    public void turnOff() {
        System.out.println("SmartTv turn off");
    }

    public void connectToNetwork() {
        System.out.println("SmartTv has connectToNetwork");
    }

    public void showStatus() {
        System.out.println("SmartTv status shown");
    }

    final void maxVolume() {
        System.out.println("SmartTv Volume: 100");
    }
}
class SmartSpeaker extends SmartDevice implements Connectable {
    public void turnOn() {
        System.out.println("SmartSpeaker turn on");
    }
    public void turnOff() {
        System.out.println("SmartSpeaker turn off");
    }
    public void connectToNetwork() {
        System.out.println("SmartSpeaker has connectToNetwork");
    }
    public void showStatus() {
        System.out.println("SmartSpeaker status shown");
    }
}

public class Start {
    public static void main(String[] args) {
        Connectable con = new SmartTv();
        con.turnOn();
        con.connectToNetwork();
        ((SmartTv)con).maxVolume();
        con.turnOff();
        con = new SmartSpeaker();
        con.turnOn();
        con.turnOn();
        con.connectToNetwork();
        con.turnOff();
        ((SmartDevice)con).deviceInfo();    }
}
interface Drivable{
    void accelerate();
    void brake();
}
class Car implements Drivable{
    private final String model;
    private int speed;
    public Car(String model){
        this.model=model;
        this.speed=0;
    }
    public void accelerate(){
        speed+=10;
        System.out.println(model+"accelerate:"+speed);
    }
    public void brake(){
        speed-=10;
        if(speed<0){
            speed=0;
        }else{
            System.out.println(model+"brake:"+speed);
        }
    }
    public String getModel(){
        return model;
    }
    public void setSpeed(int speed){
        if(speed>=0){
        this.speed=speed;
    }
    }
    public int getSpeed(){
        return speed;
    }
}

public class Start {
    public static void main(String[] args) {
       Car mc=new Car("hola");
       mc.accelerate();
       mc.accelerate();
       mc.brake();
       System.out.println(mc.getSpeed());
       System.out.println(mc.getModel());
  }
}
import java.util.Scanner;
abstract class Vehicle{
    abstract void displayDetails();
}
interface Mileage{
    void showMileage(double kmpl);
}
class Engine{
    private String category;
    private double capacity;
    private double price;
    public Engine(String category,double capacity,double price){
        this.category=category;
        this.capacity=capacity;
        this.price=price;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public String getCategory(){
        return  category;
    }
    public void setCapacity(double capacity){
        this.capacity=capacity;
    }
    public double getCapacity(){
        return capacity;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void showInfo(){
        System.out.println(" "+category+" "+capacity+" "+price);
    }

}
class Wheel{
    private double size;
    private String brand;
    private double price;
    Wheel(double size,String brand,double price){
        this.size=size;
        this.brand=brand;
        this.price=price;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setSize(double size){
        this.size=size;
    }
    public double getSize(){
        return size;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void showInfo(){
        System.out.println(" "+brand+" "+size+" "+price);
    }
}
class Car extends Vehicle implements Mileage{
    private String model;
    private String brand;
    private double price;
    private Engine engine;
    private Wheel wheel;
    final String company="BMW";
    Car(String model,String brand,double price,Engine engine,Wheel wheel){
        this.model=model;
        this.brand=brand;
        this.price=price;
        this.engine=engine;
        this.wheel=wheel;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }
    public Engine getEngine(){
        return engine;
    }
    public void setWheel(Wheel wheel){
        this.wheel=wheel;
    }
    public Wheel getWheel(){
        return wheel;
    }
    final void showCompany(){
        System.out.println("company"+company);
    }
    void displayDetails(){
        showCompany();
        System.out.println(" "+model+" "+brand+" "+price+" ");
        engine.showInfo();
        wheel.showInfo();
    }
    public void showMileage(double kmpl){
        System.out.println(kmpl);
    }
}

public class Start {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String category=sc.nextLine();
      sc.nextLine();
      double capacity=sc.nextDouble();
      double price=sc.nextDouble();
      Engine e =new Engine(category,capacity,price);
      double size=sc.nextDouble();
      sc.nextLine();
      String brand=sc.nextLine();
      sc.nextLine();
      double kmpl=sc.nextDouble();
      double price1=sc.nextDouble();
      Wheel w=new Wheel(size,brand,price1);
      String model=sc.nextLine();
      String brand1=sc.nextLine();
      sc.nextLine();
      double price2=sc.nextDouble();
      Vehicle v=new Car(model,brand1,price2,e,w);
      v.displayDetails();
      ((Car)v).showMileage(kmpl);

  }
}
import javax.swing.*;
import java.awt.event.*;
class BankAccount{
	private String accountno;
	private double balance;
	BankAccount(String accountno,double balance){
		this.accountno=accountno;
		this.balance=balance;
	}
	public String toString(){
		return "accountno"+accountno+"balance"+balance;
	}
	public void addBonus(){

	}

}
class SalaryAccount extends BankAccount{
	public SalaryAccount(String accountno,double balance){
		super(accountno,balance);
	}
	public String toString(){
		return super.toString()+"SalaryAccount";
	}
}
class BonousAccount extends BankAccount{
	private double bonusPrcentage;
	BonousAccount(String accountno,double balance,double bonusPrcentage){
		super(accountno,balance);
		this.bonusPrcentage=bonusPrcentage;
	}
	public void addBonus(){
		balance+=balance*(bonusPrcentage/100.0);
	}
	String toString(){
		return super.toString()+"BonousAccount"+bonusPrcentage;
	}
}
class Employee{
	private int id;
	private String name;
	private String salaryAccount;
	Employee(int id,String name,String salaryAccount){
		this.id=id;
		this.name=name;
		this.salaryAccount=salaryAccount;
	}
	void getID(int id){
		this.id=id;
	}
	int setID(){
		return id;
	}
	void getName(String name){
		this.name=name;
	}
	String setName(){
		return name;
	}
	void getSalaryAccount(String salaryAccount){
		this.salaryAccount=salaryAccount;
	}
	String setSalaryAccount(){
		return salaryAccount;
	}
	String toString(){
		return "Employee id"+id+"name"+name+"salaryAccount"+salaryAccount;
	}
}

class Main{
	public static void main(String[]args){
		  JFrame frame = new JFrame("Employee Account Info");
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        JButton showSalaryBtn = new JButton("Show Salary Account");
        JButton showBonusBtn = new JButton("Show Bonus Account");
        JButton applyBonusBtn = new JButton("Apply Bonus");
        SalaryAccount salaryAcc = new SalaryAccount("SAL123", 30000);
        BonusAccount bonusAcc = new BonusAccount("BON456", 40000, 10);
        Employee emp1 = new Employee(101, "Alice", salaryAcc);
        Employee emp2 = new Employee(102, "Bob", bonusAcc);
        final Employee[] current = {null};  
        showSalaryBtn.addActionListener(e -> {
            current[0] = emp1;
            outputArea.setText(emp1.toString());
        });

        showBonusBtn.addActionListener(e -> {
            current[0] = emp2;
            outputArea.setText(emp2.toString());
        });

        applyBonusBtn.addActionListener(e -> {
            if (current[0] != null) {
                current[0].applyBonusIfAny();
                outputArea.setText(current[0].toString());
            } else {
                outputArea.setText("Please select an employee first.");
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.add(showSalaryBtn);
        panel.add(showBonusBtn);
        panel.add(applyBonusBtn);
        panel.add(new JScrollPane(outputArea));

        frame.add(panel);
        frame.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class EmployeeBonusWithFile {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee Bonus System");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);

        JButton addEmpBtn = new JButton("Add Bonus Employee");
        JButton applyBonusBtn = new JButton("Apply Bonus");
        JButton saveBtn = new JButton("Save to File");
        JButton loadBtn = new JButton("Load from File");

        ArrayList<Employee> employeeList = new ArrayList<>();
        final Employee[] current = {null};

        // Add Bonus Employee (Input using JOptionPane)
        addEmpBtn.addActionListener(e -> {
            try {
                String idStr = JOptionPane.showInputDialog("Enter Employee ID:");
                String name = JOptionPane.showInputDialog("Enter Name:");
                String accNo = JOptionPane.showInputDialog("Enter Account No:");
                String balanceStr = JOptionPane.showInputDialog("Enter Balance:");
                String bonusStr = JOptionPane.showInputDialog("Enter Bonus Percentage:");

                int id = Integer.parseInt(idStr);
                double balance = Double.parseDouble(balanceStr);
                double bonus = Double.parseDouble(bonusStr);

                BonusAccount ba = new BonusAccount(accNo, balance, bonus);
                Employee emp = new Employee(id, name, ba);
                employeeList.add(emp);
                current[0] = emp;

                outputArea.setText("Added Employee:\n" + emp.toString());
            } catch (Exception ex) {
                outputArea.setText("Invalid input! Try again.");
            }
        });

        // Apply bonus
        applyBonusBtn.addActionListener(e -> {
            if (current[0] != null) {
                current[0].applyBonusIfAny();
                outputArea.setText("Bonus Applied:\n" + current[0].toString());
            } else {
                outputArea.setText("No employee selected.");
            }
        });

        // Save to file
        saveBtn.addActionListener(e -> {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("employee.txt"));
                for (Employee emp : employeeList) {
                    writer.write(emp.toString());
                    writer.newLine();
                    writer.write("----");
                    writer.newLine();
                }
                writer.close();
                outputArea.setText("Saved to employee.txt");
            } catch (IOException ex) {
                outputArea.setText("Error writing to file.");
            }
        });

        // Load from file
        loadBtn.addActionListener(e -> {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                reader.close();
                outputArea.setText("Loaded Data:\n" + sb.toString());
            } catch (IOException ex) {
                outputArea.setText("Error reading from file.");
            }
        });

        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.add(addEmpBtn);
        panel.add(applyBonusBtn);
        panel.add(saveBtn);
        panel.add(loadBtn);
        panel.add(new JScrollPane(outputArea));

        frame.add(panel);
        frame.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

class BankAccount {
    protected String accountNo;
    protected double balance;

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void addBonus() {
        // Default: no bonus
    }

    public String toString() {
        return "Account No: " + accountNo + "\nBalance: " + balance;
    }
}

class BonusAccount extends BankAccount {
    private double bonusPercentage;

    public BonusAccount(String accountNo, double balance, double bonusPercentage) {
        super(accountNo, balance);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public void addBonus() {
        balance += balance * (bonusPercentage / 100.0);
    }

    public String toString() {
        return super.toString() + "\nType: BonusAccount\nBonus Rate: " + bonusPercentage + "%";
    }
}

class Employee {
    private int id;
    private String name;
    private BankAccount salaryAccount;

    public Employee(int id, String name, BankAccount salaryAccount) {
        this.id = id;
        this.name = name;
        this.salaryAccount = salaryAccount;
    }

    public void applyBonusIfAny() {
        salaryAccount.addBonus();
    }

    public String toString() {
        return "Employee ID: " + id + "\nName: " + name + "\n" + salaryAccount.toString();
    }
}

public class EmployeeBonusGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee Bonus System");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);

        JButton addEmpBtn = new JButton("Add Bonus Employee");
        JButton applyBonusBtn = new JButton("Apply Bonus");
        JButton saveBtn = new JButton("Save to File");
        JButton loadBtn = new JButton("Load from File");

        ArrayList<Employee> employeeList = new ArrayList<>();
        final Employee[] current = {null};

        // Add employee
        addEmpBtn.addActionListener(e -> {
            try {
                String idStr = JOptionPane.showInputDialog("Enter Employee ID:");
                String name = JOptionPane.showInputDialog("Enter Name:");
                String accNo = JOptionPane.showInputDialog("Enter Account No:");
                String balStr = JOptionPane.showInputDialog("Enter Balance:");
                String bonusStr = JOptionPane.showInputDialog("Enter Bonus %:");

                int id = Integer.parseInt(idStr);
                double balance = Double.parseDouble(balStr);
                double bonus = Double.parseDouble(bonusStr);

                BonusAccount acc = new BonusAccount(accNo, balance, bonus);
                Employee emp = new Employee(id, name, acc);
                employeeList.add(emp);
                current[0] = emp;

                outputArea.setText("Employee added:\n\n" + emp.toString());
            } catch (Exception ex) {
                outputArea.setText("Invalid input. Please try again.");
            }
        });

        // Apply bonus
        applyBonusBtn.addActionListener(e -> {
            if (current[0] != null) {
                current[0].applyBonusIfAny();
                outputArea.setText("Bonus Applied:\n\n" + current[0].toString());
            } else {
                outputArea.setText("No employee selected.");
            }
        });

        // Save to file
        saveBtn.addActionListener(e -> {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("employee.txt"));
                for (Employee emp : employeeList) {
                    writer.write(emp.toString());
                    writer.newLine();
                    writer.write("----");
                    writer.newLine();
                }
                writer.close();
                outputArea.setText("Employee data saved to employee.txt");
            } catch (IOException ex) {
                outputArea.setText("Error writing to file.");
            }
        });

        // Load from file
        loadBtn.addActionListener(e -> {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                reader.close();
                outputArea.setText("Loaded from file:\n\n" + sb.toString());
            } catch (IOException ex) {
                outputArea.setText("Error reading file.");
            }
        });

        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.add(addEmpBtn);
        panel.add(applyBonusBtn);
        panel.add(saveBtn);
        panel.add(loadBtn);
        panel.add(new JScrollPane(outputArea));

        frame.add(panel);
        frame.setVisible(true);
    }
}
class PriceAccount {
    protected String accountNo;
    protected double price;

    public PriceAccount(String accountNo, double price) {
        this.accountNo = accountNo;
        this.price = price;
    }

    public void adjustPrice() {
        // No adjustment in base class
    }

    public String toString() {
        return "Account No: " + accountNo + "\nPrice: " + price;
    }
}

class DiscountAccount extends PriceAccount {
    private double discountPercent;

    public DiscountAccount(String accountNo, double price, double discountPercent) {
        super(accountNo, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public void adjustPrice() {
        price -= price * (discountPercent / 100.0);
    }

    public String toString() {
        return super.toString() + "\nType: DiscountAccount\nDiscount: " + discountPercent + "%";
    }
}

class PremiumAccount extends PriceAccount {
    private double premiumPercent;

    public PremiumAccount(String accountNo, double price, double premiumPercent) {
        super(accountNo, price);
        this.premiumPercent = premiumPercent;
    }

    @Override
    public void adjustPrice() {
        price += price * (premiumPercent / 100.0);
    }

    public String toString() {
        return super.toString() + "\nType: PremiumAccount\nPremium: " + premiumPercent + "%";
    }
}

class Product {
    private int id;
    private String name;
    private PriceAccount priceAccount;

    public Product(int id, String name, PriceAccount priceAccount) {
        this.id = id;
        this.name = name;
        this.priceAccount = priceAccount;
    }

    public void adjustPriceIfAny() {
        priceAccount.adjustPrice();
    }

    public String toString() {
        return "Product ID: " + id + "\nName: " + name + "\n" + priceAccount.toString();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ProductStoreGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Product Store");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);

        JButton addDiscountBtn = new JButton("Add Discount Product");
        JButton addPremiumBtn = new JButton("Add Premium Product");
        JButton applyAdjustmentBtn = new JButton("Adjust Price");
        JButton saveBtn = new JButton("Save to File");
        JButton loadBtn = new JButton("Load from File");

        ArrayList<Product> productList = new ArrayList<>();
        final Product[] current = {null};

        addDiscountBtn.addActionListener(e -> {
            try {
                String idStr = JOptionPane.showInputDialog("Enter Product ID:");
                String name = JOptionPane.showInputDialog("Enter Product Name:");
                String accNo = JOptionPane.showInputDialog("Enter Account No:");
                String priceStr = JOptionPane.showInputDialog("Enter Price:");
                String discountStr = JOptionPane.showInputDialog("Enter Discount %:");

                int id = Integer.parseInt(idStr);
                double price = Double.parseDouble(priceStr);
                double discount = Double.parseDouble(discountStr);

                DiscountAccount da = new DiscountAccount(accNo, price, discount);
                Product product = new Product(id, name, da);
                productList.add(product);
                current[0] = product;

                outputArea.setText("Product added:\n\n" + product.toString());
            } catch (Exception ex) {
                outputArea.setText("Invalid input.");
            }
        });

        addPremiumBtn.addActionListener(e -> {
            try {
                String idStr = JOptionPane.showInputDialog("Enter Product ID:");
                String name = JOptionPane.showInputDialog("Enter Product Name:");
                String accNo = JOptionPane.showInputDialog("Enter Account No:");
                String priceStr = JOptionPane.showInputDialog("Enter Price:");
                String premiumStr = JOptionPane.showInputDialog("Enter Premium %:");

                int id = Integer.parseInt(idStr);
                double price = Double.parseDouble(priceStr);
                double premium = Double.parseDouble(premiumStr);

                PremiumAccount pa = new PremiumAccount(accNo, price, premium);
                Product product = new Product(id, name, pa);
                productList.add(product);
                current[0] = product;

                outputArea.setText("Product added:\n\n" + product.toString());
            } catch (Exception ex) {
                outputArea.setText("Invalid input.");
            }
        });

        applyAdjustmentBtn.addActionListener(e -> {
            if (current[0] != null) {
                current[0].adjustPriceIfAny();
                outputArea.setText("Price Adjusted:\n\n" + current[0].toString());
            } else {
                outputArea.setText("No product selected.");
            }
        });

        saveBtn.addActionListener(e -> {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("product.txt"));
                for (Product p : productList) {
                    writer.write(p.toString());
                    writer.newLine();
                    writer.write("----");
                    writer.newLine();
                }
                writer.close();
                outputArea.setText("Saved to product.txt");
            } catch (IOException ex) {
                outputArea.setText("Error saving file.");
            }
        });

        loadBtn.addActionListener(e -> {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("product.txt"));
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                reader.close();
                outputArea.setText("Loaded Data:\n\n" + sb.toString());
            } catch (IOException ex) {
                outputArea.setText("Error loading file.");
            }
        });

        JPanel panel = new JPanel(new GridLayout(6, 1));
        panel.add(addDiscountBtn);
        panel.add(addPremiumBtn);
        panel.add(applyAdjustmentBtn);
        panel.add(saveBtn);
        panel.add(loadBtn);
        panel.add(new JScrollPane(outputArea));

        frame.add(panel);
        frame.setVisible(true);
    }
}
class BankAccount {
    protected String accountNo;
    protected double balance;

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void applyScholarship() {}

    public String toString() {
        return "Account No: " + accountNo + "\nBalance: " + balance;
    }
}

class MeritScholarshipAccount extends BankAccount {
    private double meritBonus;

    public MeritScholarshipAccount(String accountNo, double balance, double meritBonus) {
        super(accountNo, balance);
        this.meritBonus = meritBonus;
    }

    @Override
    public void applyScholarship() {
        balance += meritBonus;
    }

    public String toString() {
        return super.toString() + "\nType: MeritScholarship\nBonus: " + meritBonus;
    }
}

class NeedBasedScholarshipAccount extends BankAccount {
    private double percent;

    public NeedBasedScholarshipAccount(String accountNo, double balance, double percent) {
        super(accountNo, balance);
        this.percent = percent;
    }

    @Override
    public void applyScholarship() {
        balance += balance * (percent / 100.0);
    }

    public String toString() {
        return super.toString() + "\nType: NeedBasedScholarship\nRate: " + percent + "%";
    }
}

class Student {
    private int id;
    private String name;
    private BankAccount scholarshipAccount;

    public Student(int id, String name, BankAccount scholarshipAccount) {
        this.id = id;
        this.name = name;
        this.scholarshipAccount = scholarshipAccount;
    }

    public void applyScholarship() {
        scholarshipAccount.applyScholarship();
    }

    public String toString() {
        return "Student ID: " + id + "\nName: " + name + "\n" + scholarshipAccount.toString();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class StudentScholarshipGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scholarship System");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);

        JButton addMeritBtn = new JButton("Add Merit Student");
        JButton addNeedBtn = new JButton("Add Need-based Student");
        JButton applyBtn = new JButton("Apply Scholarship");
        JButton saveBtn = new JButton("Save");
        JButton loadBtn = new JButton("Load");

        ArrayList<Student> studentList = new ArrayList<>();
        final Student[] current = {null};

        addMeritBtn.addActionListener(e -> {
            try {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Student ID:"));
                String name = JOptionPane.showInputDialog("Enter Name:");
                String acc = JOptionPane.showInputDialog("Enter Account No:");
                double bal = Double.parseDouble(JOptionPane.showInputDialog("Enter Balance:"));
                double bonus = Double.parseDouble(JOptionPane.showInputDialog("Enter Merit Bonus:"));

                MeritScholarshipAccount m = new MeritScholarshipAccount(acc, bal, bonus);
                Student s = new Student(id, name, m);
                studentList.add(s);
                current[0] = s;

                outputArea.setText("Student Added:\n\n" + s);
            } catch (Exception ex) {
                outputArea.setText("Error in input.");
            }
        });

        addNeedBtn.addActionListener(e -> {
            try {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Student ID:"));
                String name = JOptionPane.showInputDialog("Enter Name:");
                String acc = JOptionPane.showInputDialog("Enter Account No:");
                double bal = Double.parseDouble(JOptionPane.showInputDialog("Enter Balance:"));
                double percent = Double.parseDouble(JOptionPane.showInputDialog("Enter Need-based %:"));

                NeedBasedScholarshipAccount n = new NeedBasedScholarshipAccount(acc, bal, percent);
                Student s = new Student(id, name, n);
                studentList.add(s);
                current[0] = s;

                outputArea.setText("Student Added:\n\n" + s);
            } catch (Exception ex) {
                outputArea.setText("Error in input.");
            }
        });

        applyBtn.addActionListener(e -> {
            if (current[0] != null) {
                current[0].applyScholarship();
                outputArea.setText("Scholarship Applied:\n\n" + current[0]);
            } else {
                outputArea.setText("No student selected.");
            }
        });

        saveBtn.addActionListener(e -> {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
                for (Student s : studentList) {
                    writer.write(s.toString());
                    writer.newLine();
                    writer.write("-----");
                    writer.newLine();
                }
                outputArea.setText("Saved to students.txt");
            } catch (IOException ex) {
                outputArea.setText("Error writing to file.");
            }
        });

        loadBtn.addActionListener(e -> {
            try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                outputArea.setText("Loaded Data:\n\n" + sb);
            } catch (IOException ex) {
                outputArea.setText("Error reading file.");
            }
        });

        JPanel panel = new JPanel(new GridLayout(6, 1));
        panel.add(addMeritBtn);
        panel.add(addNeedBtn);
        panel.add(applyBtn);
        panel.add(saveBtn);
        panel.add(loadBtn);
        panel.add(new JScrollPane(outputArea));

        frame.add(panel);
        frame.setVisible(true);
    }
}
class FuelAccount {
    protected String accountNo;
    protected double fuelAmount; // litres or kWh
    protected double unitPrice;

    public FuelAccount(String accountNo, double fuelAmount, double unitPrice) {
        this.accountNo = accountNo;
        this.fuelAmount = fuelAmount;
        this.unitPrice = unitPrice;
    }

    public double calculateFuelCost() {
        return fuelAmount * unitPrice;
    }

    public String toString() {
        return "Account No: " + accountNo +
               "\nFuel Amount: " + fuelAmount +
               "\nUnit Price: " + unitPrice +
               "\nTotal Cost: " + calculateFuelCost();
    }
}

class ElectricVehicleAccount extends FuelAccount {
    public ElectricVehicleAccount(String accountNo, double kWh, double pricePerKWh) {
        super(accountNo, kWh, pricePerKWh);
    }

    public String toString() {
        return "Electric Vehicle Account\n" + super.toString();
    }
}

class GasVehicleAccount extends FuelAccount {
    public GasVehicleAccount(String accountNo, double litres, double pricePerLitre) {
        super(accountNo, litres, pricePerLitre);
    }

    public String toString() {
        return "Gas Vehicle Account\n" + super.toString();
    }
}

class Vehicle {
    private String number;
    private FuelAccount fuelAccount;

    public Vehicle(String number, FuelAccount fuelAccount) {
        this.number = number;
        this.fuelAccount = fuelAccount;
    }

    public String toString() {
        return "Vehicle No: " + number + "\n" + fuelAccount.toString();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class VehicleFuelGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vehicle Fuel Cost System");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);

        JButton addElectricBtn = new JButton("Add Electric Vehicle");
        JButton addGasBtn = new JButton("Add Gas Vehicle");
        JButton saveBtn = new JButton("Save to File");
        JButton loadBtn = new JButton("Load from File");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        final Vehicle[] currentVehicle = {null};

        addElectricBtn.addActionListener(e -> {
            try {
                String number = JOptionPane.showInputDialog("Enter Vehicle No:");
                String acc = JOptionPane.showInputDialog("Enter Account No:");
                double unit = Double.parseDouble(JOptionPane.showInputDialog("Enter kWh used:"));
                double price = Double.parseDouble(JOptionPane.showInputDialog("Enter cost per kWh:"));

                ElectricVehicleAccount ev = new ElectricVehicleAccount(acc, unit, price);
                Vehicle v = new Vehicle(number, ev);
                vehicles.add(v);
                currentVehicle[0] = v;

                outputArea.setText("Electric Vehicle Added:\n\n" + v);
            } catch (Exception ex) {
                outputArea.setText("Invalid input.");
            }
        });

        addGasBtn.addActionListener(e -> {
            try {
                String number = JOptionPane.showInputDialog("Enter Vehicle No:");
                String acc = JOptionPane.showInputDialog("Enter Account No:");
                double unit = Double.parseDouble(JOptionPane.showInputDialog("Enter litres used:"));
                double price = Double.parseDouble(JOptionPane.showInputDialog("Enter cost per litre:"));

                GasVehicleAccount gv = new GasVehicleAccount(acc, unit, price);
                Vehicle v = new Vehicle(number, gv);
                vehicles.add(v);
                currentVehicle[0] = v;

                outputArea.setText("Gas Vehicle Added:\n\n" + v);
            } catch (Exception ex) {
                outputArea.setText("Invalid input.");
            }
        });

        saveBtn.addActionListener(e -> {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("vehicles.txt"))) {
                for (Vehicle v : vehicles) {
                    writer.write(v.toString());
                    writer.newLine();
                    writer.write("-----");
                    writer.newLine();
                }
                outputArea.setText("Saved to vehicles.txt");
            } catch (IOException ex) {
                outputArea.setText("Error writing file.");
            }
        });

        loadBtn.addActionListener(e -> {
            try (BufferedReader reader = new BufferedReader(new FileReader("vehicles.txt"))) {
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                outputArea.setText("Loaded Data:\n\n" + sb.toString());
            } catch (IOException ex) {
                outputArea.setText("Error reading file.");
            }
        });

        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.add(addElectricBtn);
        panel.add(addGasBtn);
        panel.add(saveBtn);
        panel.add(loadBtn);
        panel.add(new JScrollPane(outputArea));

        frame.add(panel);
        frame.setVisible(true);
    }
}

	
