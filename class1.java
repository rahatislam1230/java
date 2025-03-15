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
