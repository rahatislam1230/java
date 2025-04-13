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
