import java.util.*;
import java.lang.*;
class Student{
	String name[]=new String[3] ;
	double cgpa[]=new double[3];
	int id[]=new int[3];
}
class Funtion{
	 public static void main(String[] args) {
	 Student s = new Student();
	 Scanner sc = new Scanner(System.in);
	 for(int i=0;i<3;i++){
	 	s.name[i]=sc.nextLine();
	 	s.cgpa[i]=sc.nextDouble();
	 	s.id[i]=sc.nextInt();
	 	sc.nextLine();
	 }
	 for(int i=0;i<3;i++){
	    System.out.println(s.name[i]);
	    System.out.println(s.cgpa[i]);
	    System.out.println(s.id[i]);
	 }

	}
}
import java.util.*;
import java.lang.*;
class Funtion{
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int b=sc.nextInt();
	 int c= sc.nextInt();
	 if(a>b){
	 	if(a>c){
	 		System.out.println("a is the biggest");
	 	}else{
	 		System.out.println("c is the biggest");
	 	}
	 }else{
	 	if(b>c){
	 		System.out.println("b is the biggest");
	 	}else{
	 		System.out.println("c is the biggest");
	 	}
	 }

	}
}
import java.util.*;
import java.lang.*;
class Funtion{
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int N=sc.nextInt();
	 int sum=N*(N+1)/2;
	 System.out.println(sum);

	}
}
import java.util.*;
import java.lang.*;
class Funtion{
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n=sc.nextInt();
	 
	 int fib;
	 
	 if(n<0){
	 	System.out.println("enter postive");
	 }else{
	 	int sum=1;
	 	for(int i=1;i<=n;i++){
	 		sum*=i;
	 	}
	 	 System.out.println(sum);
	 
	}
	
	 sc.close();
	}
}
import java.util.*;
import java.lang.*;
class Function {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }

        sc.close();
    }
}
import java.util.*;
import java.lang.*;
class Function { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
              for(int j=1;j<=i;j++){
                System.out.print("*");
              }
              System.out.println();
        }
        sc.close();
    }
}
import java.util.*;
import java.lang.*;
class Function { 
    static boolean ispal(int n){
        int ori=n,rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return ori== rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(ispal(n)){
            System.out.println("is pal");

        }else{
            System.out.println("not is pal");
        }
    }
}

import java.util.*;

class Student {
    private String name;
    private int id;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter method for ID
    public int GetId() {
        return id;
    }

    // Getter method for Name
    public String GetName() {
        return name;
    }

    // Setter method for ID
    public void SetId(int id) {
        this.id = id;
    }

    // Setter method for Name
    public void SetName(String name) {
        this.name = name;
    }

    // Method to display student info
    public void Info() {
        System.out.println("ID: " + id + " NAME: " + name);
    }
}

class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student name
        System.out.println("Enter name:");
        String name = sc.nextLine();

        // Input student ID
        System.out.println("Enter the ID:");
        int id = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Create student object
        Student s = new Student(name, id);

        // Display initial student info
        System.out.println("Student details:");
        s.Info();

        // Ask if the user wants to update the details
        System.out.println("Do you want to update? (yes/no)");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            // Input updated name
            System.out.println("Enter new name:");
            String Newname = sc.nextLine();

            // Input updated ID
            System.out.println("Enter new ID:");
            int newId = sc.nextInt();

            // Update student details
            s.SetId(newId);
            s.SetName(Newname);

            // Display updated info
            System.out.println("Updated information:");
            s.Info();
        }

        // Close scanner
        sc.close();
    }
}
import java.lang.*;
class Human{
    String name;
    int age;
    String Check(){
        if(age>0 && age<=18){
            return "young";
        }else if(age>=19 && age<=60){
            return "adult";
        }else{
            return "old";
        }
    }
}
class Main{
    public static void main(String[] args){
        Human h1=new Human();
        h1.name="rahat";
        h1.age=20;
        System.out.println(h1.Check());
    }
}
import java.lang.*;
class Book{
    String title;
    String author;
    double price;
    String Check(){
        if(price>1000){
            return "Expensive Book";
        }else{
            return"Affordable Book";
        }
    }
}
class Start{
    public static void main(String[] args){
        Book b1=new Book();
        b1.title="jakson";
        b1.author="author";
        b1.price=500;
        System.out.println(b1.Check());
    }
}
import java.lang.*;
class Vehicle{
    String modelName;
    double speed;
    String Check(){
        if(speed>120){
            return "over speeding";
        }else{
            return"Normal speed";
        }
    }
}
class Start{
    public static void main(String[] args){
    Vehicle v1 =new Vehicle();
    v1.modelName = "bmw";
    v1.speed = 115;
    System.out.println(v1.Check());
}
}
import java.lang.*;
class BankAccount{
    int account_number;
    String account_holder_name;
    double balance;
    public void deposite(double amoubt){
        if(amoubt>0){
            balance+=amoubt;
            System.out.println(amoubt);
        }else{
            System.out.println("invalid");
        }
    }
    public void withdraw(double amoubt){
        if(amoubt>0 && amoubt<=balance){
            balance-=amoubt;
            System.out.println(amoubt);
        }else if(amoubt>balance){
            System.out.println("tor taka nai");
        }else{
            System.out.println("invalid");
        }
    }
    public void checkBalance(){
        System.out.println(balance);
    }

}
class Start{
    public static void main(String[]args){
    BankAccount b1=new BankAccount();
    b1.account_number=120;
    b1.account_holder_name="rahat";
    b1.balance=12000000;
    b1.deposite(1000000);
    b1.withdraw(1000000000);
    b1.checkBalance();
}
}
import java.lang.*;
class Student{
    String name;
    int age;
    double[] grades=new double[4];
    double Calcute(){
        double sum=0;
        for(int i=0;i<4;i++){
          sum+=grades[i];
        }
        return sum/4;

    }
}
class Start{
    public static void main(String[] args){
        Student [] s= new Student[4];
        for(int i=0;i<3;i++){
            s[i]=new Student();
            s[i].name="rahat";
            s[i].age=20;
            for(int j=0;j<4;j++){
                s[i].grades[j]=60;
            }
            System.out.println(s[i].Calcute());
        }


    }
}
import java.lang.*;
class Vehicle{
    String make;
    String mode;
    int year;
    Vehicle(String make,String mode,int year){
        this.make=make;
        this.mode=mode;
        this.year=year;
    }
    void Details(){
        System.out.println("make:"+ make +"mode:"+ mode +"year:"+ year);
    }
}
class Start{
    public static void main(String[] args){
    Vehicle v1= new Vehicle("japan","toyta",2000);
    v1.Details();
}
}
class Person {
    private int id;
    private String name;
    private int age;
    void setId(int i){
        id=i;
    }
    void setName(String n){
        name=n;
    }
    void setAge(int a){
        age=a;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    void show() {
        System.out.println("id = " + id + " " + "name = " + name + " " + "age = " + age);
    }
}
public class Start {
    public static void main(String[] args) {
        Person ps[] = new Person[3];
        for (int i = 0; i < ps.length; i++) {
            ps[i] = new Person();
        }
        ps[0].setId(2054);
        ps[0].setAge(20);
        ps[0].setName("Rahat");
        ps[1].setId(2055);
        ps[1].setAge(22);
        ps[1].setName("Sami");
        ps[2].setId(2056);
        ps[2].setAge(25);
        ps[2].setName("Arif");
        for (int i = 0; i < ps.length; i++) {
                System.out.println(ps[i].getName() + " " + ps[i].getAge()+" "+ps[i].getId());
            }
        }
}
public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setId(90);
		p1.setName("Something");
		System.out.println(p1.getId());
		System.out.println(p1.getName());
	}
}
 
class Person {
	private int id;
	private String name;
 
	public void setId(int i) {
		id = i;
	}
 
	public void setName(String n) {
		name = n;
	}
 
	public int getId() {
		return id;
	}
 
	public String getName() {
		return name;
	}
}
public class ArrayExample {
	public static void main(String[] args) {
		Person persons[] = new Person[3];
 
		Person p1 = new Person(1, "xyz", 50);
		persons[0] = p1;
 
		// p1.show();
		// persons[0].show()
 
		persons[1] = new Person(2, "abc", 35);
 
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				System.out.println(persons[i]);
			}
			else {
				persons[i].show();
			}
		}	
	}
}
 
class Person {
	int id;
	String name;
	int age;
 
	Person() { System.out.println("Default Constructor of Person"); }
 
	Person(int i, String n, int a) {
		System.out.println("Parameterized Constructor of Person");
		id = i;
		name = n;
		age = a;
	}
 
	void show() {
		System.out.println("id = " + id + " " + "name = " + name + " " + "age = " + age);
	}
}
import java.util.Scanner;
 
public class StringExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		sc.nextLine();
		String b = sc.nextLine();
		Person p1 = new Person(a, b);
		p1.show();
	}
}
 
class Person {
	int id;
	String name;
 
	Person(int i, String n) {
		id = i;
		name = n;
	}
 
	void show() {
		System.out.println("Id = " + id + " " + "Name = " + name);
	}
}
public class StringExample {
	public static void main(String[] args) {
 
		String s1 = "Hello";
		String s2 = "Hallo";
		String s3 = new String("Hello");
 
		int len = s1.length();
		System.out.println("length of s1 = " + len);
 
		char ch = s1.charAt(2);
		System.out.println("Char At 0 position in s1 = " + ch);
 
		int pos = s1.indexOf("l");
		System.out.println("Position of e in s1 = " + pos);
 
		boolean isEqual = s1.equals(s2);
		System.out.println("s1.equals(s2) = " + isEqual);
 
		String s4 = s1.substring(1, 4); // ell
		System.out.println("s1.substring(1, 4) = " + s4);
 
		boolean isEmpty = s1.isEmpty();
		System.out.println("s1.isEmpty() = " + isEmpty);
 
		String s5 = s1.concat(s4);
		System.out.println("s1.concat(s4) = " + s5);
 
		int compare = s1.compareTo(s2); // s1 = Hello, s2 = Hallo
		System.out.println("s1.compareTo(s2) = " + compare);
	}
}
public class Student {
    private String name;
    private int age;
    private String grade;
    String getName() {
        return name;
    }
    void setName(String n) {
        name = n;
    }

    int getAge() {
        return age;
    }
    void setAge(int a) {
        age = a;
    }
    String getGrade() {
        return grade;
    }
    void setGrade(String g) {
        this.grade = g;
    }
    public void StudentInfo() {
        System.out.println("Name: " + name+"Age: " + age+"Grade: " + grade);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("samiya");
        s1.setAge(20);
        s1.setGrade("A");
        s2.setName("abiha");
        s2.setAge(21);
        s2.setGrade("B");
        Student s[] = new Student[6];
        s[0] = s1;
        s[2] = s2;
        s[4] = new Student();
        s[4].setName("masud");
        s[4].setAge(22);
        s[4].setGrade("c");
        for (int i = 0; i < 3; i++) {
            if (s[i] != null) {
                System.out.println("Name: " + s[i].getName()+"Age: " + s[i].getAge()+"Grade: " + s[i].getGrade());
            } else {
                System.out.println("No information available");
            }
        }
    }
}
