class Animal{
    void Eat(){
        System.out.println("Animal eats :+6");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("The dog bark");
    }
}
class Cat extends Dog{
    void Meow(){
        System.out.println("The cat meows");
    }
}
class Main{
    public static void main(String[] args){
        Animal a = new Animal();
        a.Eat();
       // a.Bark();
        //a.Meow();
        Dog d = new Dog();
        d.Eat();
        d.Bark();
       // d.Meow();
        Cat c= new Cat();
        c.Eat();
        c.Bark();
        c.Meow();
    }
}
class Animal{
    void Eat(){
        System.out.println("Animal eats :+6");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("The dog bark");
    }
}
class Cat extends Dog{
    void Meow(){
        System.out.println("The cat meows");
    }
}
class Main{
    public static void main(String[] args){
        Cat c= new Cat();
        c.Eat();
        c.Bark();
        c.Meow();
    }
}
class Animal{
    void Eat(){
        System.out.println("Animal eats :+6");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("The dog bark");
        super.Eat();
        System.out.println("Dog barks");
    }

}
/*class Cat extends Dog{
    void Meow(){
        System.out.println("The cat meows");
    }
}*/
class Main{
    public static void main(String[] args){
        Dog c= new Dog();
        c.Eat();
        c.Bark();
        
    }
}/*Animal eats :+6
The dog bark
Animal eats :+6
Dog barks*/
  
class Animal{
    void Eat(){
        System.out.println("Animal eats :+6");
    }
}
class Dog extends Animal{
    @Override
    void Eat(){
        System.out.println("The dog bark");
       
    }

}

class Main{
    public static void main(String[] args){
        Dog c= new Dog();
        c.Eat();
      
        
    }
}
class Animal{
    void Eat(){
        System.out.println("Animal eats :+6");
    }
}
class Dog extends Animal{
    Dog(){
     super();
     System.out.println("d");
    
    }

}

class Main{
    public static void main(String[] args){
        Dog d= new Dog();
          
    }
}
class Animal{
    Animal(String type){
        System.out.println("Animal eats :+6"+ type);
    }
}
class Dog extends Animal{
    Dog(String breed){
     super("Dog");
     System.out.println("d"+ breed);
    
    }

}

class Main{
    public static void main(String[] args){
        Dog d= new Dog("lab");
          
    }
}
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        
        d.eat();
        d.bark();
        
        c.eat();
        c.meow();
    }
}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentId;
    String course;

    Student(String name, int age, String studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}
class Teacher extends Person {
    String teacherId;
    String subject;

    Teacher(String name, int age, String teacherId, String subject) {
        super(name, age);
        this.teacherId = teacherId;
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
    }
}
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Amy", 20, "S123", "CSE");
        Teacher t = new Teacher("Dr. Smith", 45, "T987", "Algorithms");
        Staff st = new Staff("John", 35, "Administration");

        System.out.println("--- Student ---");
        s.displayInfo();

        System.out.println("\n--- Teacher ---");
        t.displayInfo();

        System.out.println("\n--- Staff ---");
        st.displayInfo();
    }
}
class Person{
    private String name;
    private int age;
    Person(String name,int age){
        this.name= name;
        this.age =age;
    }
    void setName(String name){
        this.name= name;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    void displayInfo(){
        System.out.println("name"+name);
        System.out.println("age"+age);
    }
}
class Student extends Person{
    private String studentId;
    private String course;
    Student(String name,int age,String studentId,String course){
        super(name,age);
        this.studentId=studentId;
        this.course=course;
    }
    void setStudentid(String studentId){
        this.studentId=studentId;
    }
    void setcoure(String course){
        this.course=course;
    }
    String getstudent(){
        return studentId;
    }
    String getCours(){
        return course;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Student ID:"+studentId);
        System.out.println("Course"+ course);
    }
}
class Teacher extends Person{
    String teacherId;
    String subject;
    double salary;
    Teacher(String name,int age,String teacherId,String subject,double salary){
        super(name, age);
        this.teacherId=teacherId;
        this.subject=subject;
        this.salary=salary;
    }
    void setTeacherid(String teacherId){
        this.teacherId=teacherId;
    }
    void setSubject(String subject){
        this.subject=subject;
    }
    void setSalar(double salary){
        this.salary=salary;
    }
    String getteacher(){
        return teacherId;
    }
    String getSubject(){
        return subject;
    }
    double getSalary(){
        return salary;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("teacher Id :"+teacherId);
        System.out.println("subject:"+subject);
        System.out.println("salary:"+salary);
    }
}
class Staff extends Person{
    String department;
    String shift;
    Staff(String name,int age,String department,String shift){
        super(name, age);
        this.department=department;
        this.shift=shift;
    }
    void setDep(String department){
        this.department=department;
    }
    void setshif(String shift){
        this.shift=shift;
    }
    String getDep(){
        return department;
    }
    String getshift(){
        return shift;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("department"+department);
        System.out.println("shift"+shift);
    }
}

public class Start {
    public static void main(String[] args) {
        Person s= new Student("rahat",20,"s540","Cse");
        Person t = new Teacher("hj",45,"T202","java",75000.0);
        Person sf =new Staff("hi",38,"it","night");
        s.displayInfo();
        t.displayInfo();
        sf.displayInfo();
    }
}
class Person{
    private String name;
    private int age;
    Person(String name,int age){
        this.name= name;
        this.age =age;
    }
    void setName(String name){
        this.name= name;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    void displayInfo(){
        System.out.println("name"+name);
        System.out.println("age"+age);
    }
}
class Student extends Person{
    private String studentId;
    private String course;
    Student(String name,int age,String studentId,String course){
        super(name,age);
        this.studentId=studentId;
        this.course=course;
    }
    void setStudentid(String studentId){
        this.studentId=studentId;
    }
    void setcoure(String course){
        this.course=course;
    }
    String getstudent(){
        return studentId;
    }
    String getCours(){
        return course;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Student ID:"+studentId);
        System.out.println("Course"+ course);
    }
}
class Teacher extends Person{
   private String teacherId;
   private String subject;
   private double salary;
    Teacher(String name,int age,String teacherId,String subject,double salary){
        super(name, age);
        this.teacherId=teacherId;
        this.subject=subject;
        this.salary=salary;
    }
    void setTeacherid(String teacherId){
        this.teacherId=teacherId;
    }
    void setSubject(String subject){
        this.subject=subject;
    }
    void setSalar(double salary){
        this.salary=salary;
    }
    String getteacher(){
        return teacherId;
    }
    String getSubject(){
        return subject;
    }
    double getSalary(){
        return salary;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("teacher Id :"+teacherId);
        System.out.println("subject:"+subject);
        System.out.println("salary:"+salary);
    }
}
class Staff extends Person{
    private String department;
    private String shift;
    Staff(String name,int age,String department,String shift){
        super(name, age);
        this.department=department;
        this.shift=shift;
    }
    void setDep(String department){
        this.department=department;
    }
    void setshif(String shift){
        this.shift=shift;
    }
    String getDep(){
        return department;
    }
    String getshift(){
        return shift;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("department"+department);
        System.out.println("shift"+shift);
    }
}

public class Start {
    public static void main(String[] args) {
        Person s= new Student("rahat",20,"s540","Cse");
        Person t = new Teacher("hj",45,"T202","java",75000.0);
        Person sf =new Staff("hi",38,"it","night");
        s.displayInfo();
        t.displayInfo();
        sf.displayInfo();
    }
}
class Employee{
   private String name;
   private  String id;
   Employee(String name,String id){
    this.name=name;
    this.id=id;
   }
   void setName(String name){
    this.name=name;
   }
   void setId(String id){
    this.id=id;
   }
   String getName(){
    return name;
   }
   String getId(){
    return id;
   }
   void displayInfo(){
    System.out.println("name"+name);
    System.out.println("Id:"+id);
   }
}
class Manager extends Employee{
    private String department;
    private int teamSize;
    Manager(String name,String id,String department, int teamSize){
        super(name,id);
        this.department=department;
        this.teamSize=teamSize;
    }
    void setDep(String department){
        this.department=department;
    }
    String getdep(){
        return department;
    }
    void setTeamsize(int teamSize){
        this.teamSize=teamSize;
    }
    int getTeam(){
        return teamSize;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("department"+department);
        System.out.println("teamSize:"+teamSize);
    }
}
class Developer extends Employee{
    private String programmingleague;
    private int experience;
    Developer(String name,String id,String programmingleague, int experience){
        super(name,id);
        this.programmingleague=programmingleague;
        this.experience=experience;
    }
    void setpro(String programmingleague){
        this.programmingleague=programmingleague;
    }
    String getpro(){
        return programmingleague;
    }
    void setexp(int experience){
        this.experience=experience;
    }
    int getexp(){
        return experience;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("programmingleague"+programmingleague);
        System.out.println("experience:"+experience);
    }
}
class Intern extends Employee{
    private String university;
    private int durationMonth;
    Intern(String name,String id,String university, int durationMonth){
        super(name,id);
        this.university=university;
        this.durationMonth=durationMonth;
    }
    void setuni(String university){
        this.university=university;
    }
    String getuni(){
        return university;
    }
    void setduraM(int durationMonth){
        this.durationMonth=durationMonth;
    }
    int getexp(){
        return durationMonth;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("university"+university);
        System.out.println("durationMonth:"+durationMonth);
    }
}
public class Start {
    public static void main(String[] args) {
        Employee m= new Manager("raht","0dt","hkj5",14);
        Employee d =new Developer("kj","k5jk","hij",452);
        Employee i =new Intern("ijkj","H5jk","Lij",789);
        m.displayInfo();
        d.displayInfo();
        i.displayInfo();

    }
}
class Employee{
    private String name;
    private  String id;
    Employee(String name,String id){
        this.name=name;
        this.id=id;
    }
    void setName(String name){
        this.name=name;
    }
    void setId(String id){
        this.id=id;
    }
    String getName(){
        return name;
    }
    String getId(){
        return id;
    }
    void displayInfo(){
        System.out.println("name"+name);
        System.out.println("Id:"+id);
    }
}
class Manager extends Employee{
    private String department;
    private int teamSize;
    Manager(String name,String id,String department, int teamSize){
        super(name,id);
        this.department=department;
        this.teamSize=teamSize;
    }
    void setDep(String department){
        this.department=department;
    }
    String getdep(){
        return department;
    }
    void setTeamsize(int teamSize){
        this.teamSize=teamSize;
    }
    int getTeam(){
        return teamSize;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("department"+department);
        System.out.println("teamSize:"+teamSize);
    }
}
class Developer extends Employee{
    private String programmingleague;
    private int experience;
    Developer(String name,String id,String programmingleague, int experience){
        super(name,id);
        this.programmingleague=programmingleague;
        this.experience=experience;
    }
    void setpro(String programmingleague){
        this.programmingleague=programmingleague;
    }
    String getpro(){
        return programmingleague;
    }
    void setexp(int experience){
        this.experience=experience;
    }
    int getexp(){
        return experience;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("programmingleague"+programmingleague);
        System.out.println("experience:"+experience);
    }
}
class Intern extends Employee{
    private String university;
    private int durationMonth;
    Intern(String name,String id,String university, int durationMonth){
        super(name,id);
        this.university=university;
        this.durationMonth=durationMonth;
    }
    void setuni(String university){
        this.university=university;
    }
    String getuni(){
        return university;
    }
    void setduraM(int durationMonth){
        this.durationMonth=durationMonth;
    }
    int getexp(){
        return durationMonth;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("university"+university);
        System.out.println("durationMonth:"+durationMonth);
    }
}
public class Main {
    public static void main(String[] args) {
        Manager m= new Manager("raht","0dt","hkj5",14);
        Developer d =new Developer("kj","k5jk","hij",452);
        Intern i =new Intern("ijkj","H5jk","Lij",789);
        m.displayInfo();
        d.displayInfo();
        i.displayInfo();
        Employee[] e = new Employee[3];

        for (int j = 0; j < e.length; j++)  {
            e[j] = new Employee("rahat","rah45");
        }


    }
}
import java.util.Scanner;
class Battery{
    private String type;
    private int capacity;
    private  double price;
    Battery(String type,int capacity,double price){
        this.type=type;
        this.price=price;
        this.capacity=capacity;
    }
    void setType(String type){
        this.type=type;
    }
    String getType(){
        return type;
    }
    void setCapacity(int capacity){
        this.capacity=capacity;
    }
    int getCapacity(){
        return capacity;
    }
    void setPrice(double price){
        this.price=price;
    }
    double getPrice(){
        return price;
    }
}
class Camera{
    private String position;
    private double price;
    private int resolutaion;
    Camera(String position,double price,int resolutaione){
        this.position=position;
        this.price=price;
        this.resolutaion=resolutaion;
    }
    void setPrice(double price){
        this.price=price;
    }
    double getPrice(){
        return price;
    }
    void setPosition(String position){
        this.position=position;
    }
    String getPosition(){
        return position;
    }
    void setResoution(int resolutaion){
        this.resolutaion=resolutaion;
    }
    int getResoulion(){
        return resolutaion;
    }
}
class Smartphone{
    private String brand;
    private String model;
    private double basePrice;
    Battery battery;
    Camera []camera;
    Smartphone(String brand,String model,double basePrice,Battery battery,Camera[]camera){
        this.brand=brand;
        this.model=model;
        this.basePrice=basePrice;
        this.battery=battery;
        this.camera=camera;
    }
    double Calculte(){
        double sum =basePrice+battery.getPrice();
        for(int i=0;i<camera.length;i++){
            sum+=camera[i].getPrice();
        }
        return sum;
    }
    void info(){
        System.out.println("brand"+brand+"model:"+model+"basePrice"+basePrice+"battery:"+battery.getPrice()+battery.getType()+battery.getCapacity());
        for(int i=0;i<camera.length;i++){
            System.out.println(camera[i].getPrice()+camera[i].getPosition()+camera[i].getResoulion());
        }
        System.out.println("total"+Calculte());
    }
}
class Start{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String brand=sc.nextLine();
        String model=sc.nextLine();
        sc.nextLine();
        double basePrice=sc.nextDouble();
        String type=sc.nextLine();
        sc.nextLine();
        int capacity=sc.nextInt();
        double mprice=sc.nextDouble();
        Battery battery = new Battery(type,capacity,mprice);
        Camera [] camera= new Camera[3];
        for(int i=0;i<3;i++){
            sc.nextLine();
            String position=sc.nextLine();
            sc.nextLine();
            double price=sc.nextDouble();
            int resolutaione=sc.nextInt();
            camera[i]=new Camera(position,price,resolutaione);
        }
        Smartphone sm=new Smartphone(brand,model,basePrice,battery,camera);
        sm.info();
    }
}
class Course {
    private String courseName;
    private String code;
    private double creditHour;
    private double courseFee;


    Course(String courseName, String code, double creditHour, double courseFee) {
        this.courseName = courseName;
        this.code = code;
        this.creditHour = creditHour;
        this.courseFee = courseFee;
    }

    // Setters and Getters
    void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    String getCourseName() {
        return courseName;
    }

    void setCode(String code) {
        this.code = code;
    }

    String getCode() {
        return code;
    }

    void setCreditHour(double creditHour) {
        this.creditHour = creditHour;
    }

    double getCreditHour() {
        return creditHour;
    }

    void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    double getCourseFee() {
        return courseFee;
    }
}

class Student {
    private String name;
    private String id;
    private String department;
    Course[] courses;


    Student(String name, String id, String department, Course[] courses) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.courses = courses;
    }


    double[] calculateTotals() {
        double totalCredits = 0;
        double totalFee = 0;

        // Loop through courses and calculate totals
        for (int i = 0; i < courses.length; i++) {
            totalCredits += courses[i].getCreditHour();
            totalFee += courses[i].getCourseFee();
        }

        return new double[] { totalCredits, totalFee };
    }
}

class Start {
    public static void main(String[] args) {

        Course javaCourse = new Course("Java Programming", "CSE101", 3, 5000);
        Course dataStructuresCourse = new Course("Data Structures", "CSE102", 4, 6000);
        Course algorithmsCourse = new Course("Algorithms", "CSE103", 3, 5500);
        Course[] courses = { javaCourse, dataStructuresCourse, algorithmsCourse };

        Student student = new Student("Amy", "12345", "CSE", courses);


        double[] totals = student.calculateTotals();


        System.out.println("Total Credits: " + totals[0]);
        System.out.println("Total Course Fee: " + totals[1]);
    }
}

import java.util.Scanner;
class Customer{
    private String name;
    private String phone;
    private String address;
    Customer(String name,String phone,String address){
        this.name=name;
        this.phone=phone;
        this.address=address;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setPhone(String phone){
        this.phone=phone;
    }
    String getPhone(){
        return phone;
    }
    void setAddress(String address){
        this.address=address;
    }
    String getAddres(){
        return address;
    }
}
class Book{
    private String title;
    private String author;
    private double price;
    private int quantity;
    Book(String title,String author,double price,int quantity){
        this.title=title;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
    }
    void setTilte(String title){
        this.title=title;
    }
    String getTilte(){
        return title;
    }
    void setAuthor(String author){
        this.author=author;
    }
    String getAuthor(){
        return author;
    }
    void setPice(double price){
        this.price=price;
    }
    double getPrice(){
        return price;
    }
    void setQuantity(int quantity){
        this.quantity=quantity;
    }
    int getQuantity(){
        return quantity;
    }
}
class Bookstore{
    private Customer customer;
    private Book [] book;
    Bookstore(Customer customer,Book []book){
        this.customer=customer;
        this.book=book;
    }
    double calcu(){
        double total=0;
        for(int i=0;i<book.length;i++){
            total+=book[i].getPrice();
        }
        return total;
    }
    void show(){
        System.out.println(customer.getName()+customer.getPhone()+customer.getAddres());
        for(int i=0;i<book.length;i++){
            System.out.println(book[i].getTilte()+book[i].getAuthor()+book[i].getQuantity());
        }
        System.out.println(calcu());
    }

}
class Start {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        String phone=sc.nextLine();
        String address=sc.nextLine();
        Customer cs=new Customer(name, phone,address);
        Book book[]=new Book[3];
        for(int i=0;i<3;i++){
            String title=sc.nextLine();
            String author=sc.nextLine();
            sc.nextLine();
            double price=sc.nextDouble();
            int quantity=sc.nextInt();
            sc.nextLine();
            book[i]=new Book(title,author, price, quantity);
        }
        Bookstore bs = new Bookstore(cs,book);
        bs.show();
    }
}
import java.util.Scanner;
class Ram{
    private String brand;
    private  int size;
    private double price;
    Ram(String brand,int size,double price){
        this.brand=brand;
        this.size=size;
        this.price=price;
    }
    void setBrand(String brand){
        this.brand=brand;
    }
    String getBrand(){
        return brand;
    }
    void setSize(int size){
        this.size=size;
    }
    int getSize(){
        return size;
    }
    void setPirce(double price){
        this.price=price;
    }
    double getPirce(){
        return price;
    }
}
class Cpu{
    private String type;
    private double clockSpeed;
    private double price;
    Cpu(String type,double clockSpeed,double price){
        this.type=type;
        this.clockSpeed=clockSpeed;
        this.price=price;
    }
    void setType(String type){
        this.type=type;
    }
    String getType(){
        return type;
    }
    void setClockspeed(double clockSpeed){
        this.clockSpeed=clockSpeed;
    }
    double getClockspeed(){
        return clockSpeed;
    }
    void setPrice(double price){
        this.price=price;
    }
    double getPrice(){
        return price;
    }
}
class Computer{
    private String brand;
    private String model;
    private double basePrice;
    private Ram []ram;
    private Cpu cpu;
    Computer(String brand,String model,double basePrice,Ram []ram,Cpu cpu){
        this.brand=brand;
        this.model=model;
        this.basePrice=basePrice;
        this.ram=ram;
        this.cpu=cpu;
    }
    double Calculor(){
        double sum=0;
        sum+=cpu.getPrice();
        for(int i=0;i<ram.length;i++){
            sum+=ram[i].getPirce();
        }
        return sum;
    }
    void info(){
        System.out.println(cpu.getType()+cpu.getClockspeed()+cpu.getPrice());
        for(int i=0;i<ram.length;i++){
            System.out.println(ram[i].getSize()+ram[i].getBrand()+ram[i].getPirce());
        }
        System.out.println(Calculor());
    }
}
class Start {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String brand=sc.nextLine();
        String model=sc.nextLine();
        sc.nextLine();
        double basePrice=sc.nextDouble();
        String type= sc.nextLine();
        sc.nextLine();
        double clockSpeed=sc.nextDouble();
        double price=sc.nextDouble();
        Cpu cpu= new Cpu(type,clockSpeed, price);
        Ram ram[]=new Ram[3];
        for(int i=0;i<3;i++){
           String mbrand=sc.nextLine();
           sc.nextLine();
           int size=sc.nextInt();
           sc.nextLine();
           double mprice=sc.nextDouble();
           ram[i]=new Ram(mbrand,size,mprice);
        }
       Computer cp=new Computer(brand,model, basePrice,ram,cpu);
       cp.info();
    }
}

import java.util.Scanner;
class Roof{
    private String type;
    private double area;
    private double price;
    Roof(String type,double area,double price){
        this.type=type;
        this.area=area;
        this.price=price;
    }
    void setType(String type){
        this.type=type;
    }
    String getType(){
        return type;
    }
    void setArea(double area){
        this.area=area;
    }
    double getArea(){
        return area;
    }
    void setPrice(double price){
        this.price=price;
    }
    double getPrice(){
        return price;
    }
}
class Room{
    private String purpose;
    private double size;
    private  double price;
    Room(String purpose,double size,double price){
        this.purpose=purpose;
        this.size=size;
        this.price=price;
    }
    void setPurpose(String purpose){
        this.purpose=purpose;
    }
    String getPurpose(){
        return purpose;
    }
    void setSize(double size){
        this.size=size;
    }
    double getSize(){
        return size;
    }
    void setPrice(double price){
        this.price=price;
    }
    double getPrice(){
        return price;
    }

}
class House{
    private String location;
    private double baseCost;
    private Room []room;
    private Roof roof;
    House(String location,double baseCost,Room[] room,Roof roof){
        this.location=location;
        this.baseCost=baseCost;
        this.room=room;
        this.roof=roof;
    }
    double Calcute(){
        double total=0;
        total+=baseCost+roof.getPrice();
        for(int i=0;i<room.length;i++){
            total+=room[i].getPrice();
        }
        return total;
    }
    void info(){
        System.out.println(roof.getPrice()+roof.getArea()+roof.getType());
        for(int i=0;i<room.length;i++){
            System.out.println(room[i].getPurpose()+room[i].getPrice()+room[i].getSize());
        }System.out.println(Calcute());
    } 
}
class Start {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String type=sc.nextLine();
        String location=sc.nextLine();
        sc.nextLine();
        double baseCost=sc.nextDouble();
        double area=sc.nextDouble();
        double price=sc.nextDouble();
        Roof roof=new Roof(type,area,price);
        Room room []=new Room[3];
        for(int i=0;i<3;i++){
            sc.nextLine();
             String purpose=sc.nextLine();
             sc.nextLine();
             double size=sc.nextDouble();
             double nprice=sc.nextDouble();
             room[i]=new Room(purpose,size,nprice);
        }
        House h =new House(location,baseCost,room,roof);
        h.info();
    }
}
import java.util.Scanner;

class Cpu {
    private String brand;
    private double price;

    public Cpu(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Ram {
    private int sizeGB;
    private double price;

    public Ram(int sizeGB, double price) {
        this.sizeGB = sizeGB;
        this.price = price;
    }

    public void setSizeGB(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Computer {
    private String brand;
    private String model;
    private double basePrice;
    private Cpu cpu;
    private Ram[] ramList;

    public Computer(String brand, String model, double basePrice, Cpu cpu, Ram[] ramList) {
        this.brand = brand;
        this.model = model;
        this.basePrice = basePrice;
        this.cpu = cpu;
        this.ramList = ramList;
    }

    public double calculateTotalPrice() {
        double total = basePrice + cpu.getPrice();
        for (int i = 0; i < ramList.length; i++) {
            total += ramList[i].getPrice();
        }
        return total;
    }

    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("CPU: " + cpu.getBrand() + " ($" + cpu.getPrice() + ")");
        for (int i = 0; i < ramList.length; i++) {
            System.out.println("RAM " + (i + 1) + ": " + ramList[i].getSizeGB() + "GB ($" + ramList[i].getPrice() + ")");
        }
        System.out.println("Total Price: $" + calculateTotalPrice());
    }
}

class GamingComputer extends Computer {
    private String gpuModel;
    private double gpuPrice;

    public GamingComputer(String brand, String model, double basePrice, Cpu cpu, Ram[] ramList, String gpuModel, double gpuPrice) {
        super(brand, model, basePrice, cpu, ramList);
        this.gpuModel = gpuModel;
        this.gpuPrice = gpuPrice;
    }

    @Override
    public double calculateTotalPrice() {
        return super.calculateTotalPrice() + gpuPrice;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("GPU: " + gpuModel + " ($" + gpuPrice + ")");
        System.out.println("Total Gaming Computer Price: $" + calculateTotalPrice());
    }
}

public class Start {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input CPU
        System.out.print("Enter CPU Brand: ");
        String cpuBrand = input.nextLine();
        System.out.print("Enter CPU Price: ");
        double cpuPrice = input.nextDouble();
        Cpu cpu = new Cpu(cpuBrand, cpuPrice);

        // Input RAMs
        System.out.print("Enter number of RAM modules: ");
        int ramCount = input.nextInt();
        Ram[] ramList = new Ram[ramCount];

        for (int i = 0; i < ramCount; i++) {
            System.out.print("Enter size (GB) of RAM " + (i + 1) + ": ");
            int size = input.nextInt();
            System.out.print("Enter price of RAM " + (i + 1) + ": ");
            double price = input.nextDouble();
            ramList[i] = new Ram(size, price);
        }

        input.nextLine();

     
        System.out.print("Enter Computer Brand: ");
        String brand = input.nextLine();
        System.out.print("Enter Model: ");
        String model = input.nextLine();
        System.out.print("Enter Base Price: ");
        double basePrice = input.nextDouble();

        input.nextLine(); 

        System.out.print("Is this a Gaming Computer? (yes/no): ");
        String isGaming = input.nextLine();

        Computer comp;
        if (isGaming.equalsIgnoreCase("yes")) {
            System.out.print("Enter GPU Model: ");
            String gpuModel = input.nextLine();
            System.out.print("Enter GPU Price: ");
            double gpuPrice = input.nextDouble();
            comp = new GamingComputer(brand, model, basePrice, cpu, ramList, gpuModel, gpuPrice);
        } else {
            comp = new Computer(brand, model, basePrice, cpu, ramList);
        }

        System.out.println("\n--- Computer Information ---");
        comp.showInfo();

        input.close();
    }
}
import java.util.Scanner;
class Cpu {
    private String brand;
    private double price;
    Cpu(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return brand;
    }

    void setPrice(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }
}
class Ram {
    private int sizeGB;
    private double price;

    Ram(int sizeGB, double price) {
        this.sizeGB = sizeGB;
        this.price = price;
    }

    void setSizeGb(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    int getSizeGb() {
        return sizeGB;
    }

    void setPrice(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }
}
class Computer {
    private String brand;
    private String model;
    private double basePrice;
    private Cpu cpu;         
    private Ram[] ram;       

    Computer(String brand, String model, double basePrice, Cpu cpu, Ram[] ram) {
        this.brand = brand;
        this.model = model;
        this.basePrice = basePrice;
        this.cpu = cpu;
        this.ram = ram;
    }
    void setBrand(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return brand;
    }
    void setModel(String model) {
        this.model = model;
    }
    String getModel() {
        return model;
    }
    void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    double getBasePrice() {
        return basePrice;
    }
    Cpu getCpu() {
        return cpu;
    }
    Ram[] getRamArray() {
        return ram;
    }

    double calculateTotalPrice() {
        double total = basePrice + cpu.getPrice();
        for (int i = 0; i < ram.length; i++) {
            total += ram[i].getPrice();
        }
        return total;
    }

    void showInfo() {
        System.out.println("Computer Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Base Price: " + basePrice);
        System.out.println("CPU: " + cpu.getBrand() + ", Price: " + cpu.getPrice());

        for (int i = 0; i < ram.length; i++) {
            System.out.println("RAM " +  ram[i].getSizeGb() + "GB, Price: " + ram[i].getPrice());
        }

        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

class GamingComputer extends Computer {
    private String gpuModel;
    private double gpuPrice;
    GamingComputer(String brand, String model, double basePrice, Cpu cpu, Ram[] ram, String gpuModel, double gpuPrice) {
        super(brand, model, basePrice, cpu, ram); 
        this.gpuModel = gpuModel;
        this.gpuPrice = gpuPrice;
    }
    void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }
    String getGpuModel() {
        return gpuModel;
    }
    void setGpuPrice(double gpuPrice) {
        this.gpuPrice = gpuPrice;
    }
    double getGpuPrice() {
        return gpuPrice;
    }
    double calculateTotalPrice() {
        double total = getBasePrice() + getCpu().getPrice() + gpuPrice;
        for (int i = 0; i < getRamArray().length; i++) {
            total += getRamArray()[i].getPrice();
        }
        return total;
    }
    void showInfo() {
        super.showInfo();
        System.out.println("GPU Model: " + gpuModel + ", GPU Price: " + gpuPrice);
        System.out.println("Total Gaming Computer Price: " + calculateTotalPrice());
    }
}
public class Start {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel i7", 300.0);
        Ram[] rams = {
            new Ram(8, 50.0),
            new Ram(8, 50.0)
        };

        GamingComputer gc = new GamingComputer("Asus", "ROG Strix", 500.0, cpu, rams, "NVIDIA RTX 4070", 600.0);
        gc.showInfo();
    }
}

class Computer {
    String brand;
    double basePrice;

    Computer(String brand, double basePrice) {
        this.brand = brand;
        this.basePrice = basePrice;
    }

    double calculateTotalPrice() {
        return basePrice;
    }

    void showInfo() {
        System.out.println("Computer Brand: " + brand);
        System.out.println("Base Price: $" + basePrice);
    }
}

class GamingComputer extends Computer {
    String gpuModel;
    double gpuPrice;

    GamingComputer(String brand, double basePrice, String gpuModel, double gpuPrice) {
        super(brand, basePrice);
        this.gpuModel = gpuModel;
        this.gpuPrice = gpuPrice;
    }

    @Override
    double calculateTotalPrice() {
        return basePrice + gpuPrice;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("GPU Model: " + gpuModel);
        System.out.println("GPU Price: $" + gpuPrice);
    }

    void extraGamingFeature() {
        System.out.println("Extra gaming feature enabled!");
    }
}

public class Start {
    public static void main(String[] args) {
        
        GamingComputer gamingPC = new GamingComputer("Asus", 1000.0, "RTX 4080", 1200.0);

        Computer comp = gamingPC;

        comp.showInfo();
        System.out.println("Total Price: $" + comp.calculateTotalPrice());

      
        ((GamingComputer) comp).extraGamingFeature();  
        
        if (comp instanceof GamingComputer) {
            GamingComputer gComp = (GamingComputer) comp;
            gComp.extraGamingFeature(); 
        }
    }
}







