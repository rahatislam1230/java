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
