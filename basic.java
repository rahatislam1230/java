class Test
{
    public static void main(String[] args)
    {
        System.out.println("My First Java Program.");
    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int a = 1;
        byte b=1;
        short c=1;
        long d=1;
        System.out.println(c+d);
    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
       int a=1;
       for (int i=0;i<5;++i){
           System.out.print((a + i) + "\n");
       }

    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
       int sum=0;
       for (int i=0;i<10;++i){
           int a=1+i;
           System.out.println(a);
           sum+=a;
       }
       System.out.println("sum"+sum);

    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
       for (int i=0;i<20;++i){
        if(i%2==0){
            System.out.println(i+"even");
        }else{
            System.out.println(i+"odd");
        }
       }


    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
       for (int i=0;i<20;++i){
        if(i%2==0){
            System.out.println(i+"even");
        }
        
       }


    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
       for (int i=0;i<20;++i){
        if(i%2==0){
            continue;
        }else{
            System.out.println(i+"odd");
        }
       }


    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int i=0;
        while(i<5){
            System.out.println(i);
            i++;
        }

    }
}

package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<5);

    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int [] numbers ={1,2,3,4,5};
        for(int num :numbers){
            System.out.println(num);
        }
    }
}
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n+"eve");
        } else {
            System.out.println(n+"odd");
        }
        sc.close();
    }
}
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i=0;i<n;++i){
        if (i % 2 == 0) {
            System.out.println(i+"eve");
        } else {
            System.out.println(i+"odd");
        }
        sc.close();
    }
    }
}
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(n>0){
                System.out.println(n*i);
            }
            else{
                System.out.println("invalid");
            }
        }
        sc.close();

}
}
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
       int[] n=new int[5];
       for(int i=0;i<n.length;++i){
           System.out.println(n[i]);
       }

}
}
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n.length; ++i) {
            n[i] = sc.nextInt();  
        }

        System.out.println("You entered:");
        for (int i = 0; i < n.length; ++i) {
            System.out.println(n[i]);
        }

        sc.close();
    }
}
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[3][3];

        System.out.println("Enter matrix elements (3x3):");
        for (int i = 0; i < n.length; ++i) {
            for (int j = 0; j < n[i].length; ++j) {
                n[i][j] = sc.nextInt();
            }
        }

        System.out.println("You entered:");
        for (int i = 0; i < n.length; ++i) {
            for (int j = 0; j < n[i].length; ++j) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
class Dog {
 
    String name;
    int age;
    
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void bark() {
        System.out.println(name + " is barking!");
    }
}

public class Main {
    public static void main(String[] args) {
 
        Dog myDog = new Dog("Buddy", 3);
        myDog.bark(); 
    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int a= 1;
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1=str2);
        System.out.println(str1.equals(str2));



    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int a= 1;
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1=str2);
        System.out.println(str1.equals(str2));
        str1=str1.toUpperCase();
        str1=str1.toLowerCase();
        System.out.println(str1);
        System.out.println(str1);



    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int z=1;
        System.out.println(z++ + --z);


    }
}
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
        int a= 2;
        System.out.println(Integer.toBinaryString(a));


    }
}
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = true;
        if(isSunny && isWarm){
            System.out.println("beach day");
        }else {
            System.out.println("no");

        }
    }
}
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = false;
        if(isSunny && isWarm){
            System.out.println("beach day");
        }else if(isSunny) {
            System.out.println("jaket");

        }else{
            System.out.println("home");
        }
    }
}
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
        int day =3;
        String dayName;
        if (day==1){
            dayName="mon";
        } else if (day==2) {
            dayName="wednes";
        }else if (day==3) {
            dayName="thus";
        }else if (day==4) {
            dayName="fri";
        }else if (day==5) {
            dayName="sat";
        }else if (day==6) {
            dayName="sunday";
        }
        else{
            dayName="invalid";
        }

        }
    }
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
                int day =3;
                String dayName;
                switch (day){
                    case 1:
                        dayName="mon";
                        break;
                    case 2:
                        dayName="tues";
                        break;
                    case 3:
                        dayName="wed";
                        break;
                    default:
                        dayName="inavlid";
                }
                System.out.println(dayName);

    }
    }
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
               int i=0;
               while(i<=100){
                   System.out.println("HEllo");
                   i++;
               }
               for(int j=0;j<=100;++j){
                   System.out.println("HEllo");
               }

    }
    }
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
              int[]a= new int[5];
              System.out.println(a[1]);


    }
    }

package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
              int[]a= new int[5];
              a[4]=55;
              System.out.println(a);
              for(int i=0;i<5;++i){
                  System.out.println(a[i]);
              }
              for(int i:a){
                  System.out.println(a[i]);
              }


    }
    }
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
              Car car = new Car();
              car.speed=100;
              car.color="green";
              car.drive();


    }
    }
package com.ok.java.datatypes;


public class Car {
    int speed ;
    String color;
    void drive(){
        System.out.println("driving");
    }
}
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
              Car car = new Car("green");
              car.setSpeed(12);



    }
    }
package com.ok.java.datatypes;


public class Car {
    private int speed ;
    private String color;
    public Car(String color){
        this.color=color;
    }
    public int setSpeed(int speed){
        if(speed<0){
            System.out.println("not possbile");
        }else{
            this.speed=speed;
            System.out.println("driving");
        }

        return speed;
    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        Smartphone smartphone= new Smartphone();
        smartphone.capture();



    }
    }
class Camera{
  void capture(){
      System.out.println("photo clicking");
  }

}
class Musicplay{
    {
        System.out.println("music");
    }

}
class Phone {
    void calling(String number){
        System.out.println("calling" + number);
    }

}
class Smartphone extends Camera{


}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.sayBye();
        dog.sleep();

    }
}
abstract class Amimal{
    abstract  void sayHEllo();
    abstract  void  sayBye();
    void sleep(){
        System.out.println("zzzz");
    }
}
class Dog extends Amimal{

    @Override
    void sayHEllo() {
        System.out.println("woff");
    }

    @Override
    void sleep() {
        super.sleep();
    }

    @Override
    void sayBye() {
        System.out.println("woff");
    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.sayBye();
        dog.sleep();

    }
}
abstract class Amimal{
    String color;
    boolean hasSuperPowers;
    public Amimal(){
        hasSuperPowers=false;
    }
    abstract  void sayHEllo();
    abstract  void  sayBye();
    void sleep(){
        System.out.println("zzzz");
    }
}
class Dog extends Amimal{

    @Override
    void sayHEllo() {
        System.out.println("woff");
    }

    @Override
    void sleep() {
        super.sleep();
    }

    @Override
    void sayBye() {
        System.out.println("woff");
    }
}
interface Mobile{
    int numberofbatteries = 1;
    void makeCall();
}
interface Mobileplayer{
    void playMusic();
}
class Smartphone implements Mobile,Mobileplayer{

    @Override
    public void makeCall() {
        System.out.println("calling ");
    }

    @Override
    public void playMusic() {
        System.out.println("music paying ");
    }
}
public class Student {
   private String name;
   private int rollNo;

   Student(String name, int rollNo){
      this.name = name;
      this.rollNo = rollNo;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getRollNo() {
      return rollNo;
   }

   public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
   }
}
```

Step 2: Create Data Access Object Interface [ StudentDao.java ]
```java
import java.util.List;

public interface StudentDao {
   public List<Student> getAllStudents();
   public Student getStudent(int rollNo);
   public void updateStudent(Student student);
   public void deleteStudent(Student student);
}
```

Step 3: Create concrete class implementing above interface [ StudentDaoImpl.java ] 
```java
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	
   // list is working as a database
   List<Student> students;

   public StudentDaoImpl(){
      students = new ArrayList<Student>();
      Student student1 = new Student("Robert",0);
      Student student2 = new Student("John",1);
      students.add(student1);
      students.add(student2);		
   }
   @Override
   public void deleteStudent(Student student) {
      students.remove(student.getRollNo());
      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
   }

   // retrive list of students from the database
   @Override
   public List<Student> getAllStudents() {
      return students;
   }

   @Override
   public Student getStudent(int rollNo) {
      return students.get(rollNo);
   }

   @Override
   public void updateStudent(Student student) {
      students.get(student.getRollNo()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
   }
}
```
Step 4: Use the StudentDao to demonstrate Data Access Object pattern usage [ DaoPatternDemo.java ]
```java
public class DaoPatternDemo {
   public static void main(String[] args) {
      StudentDao studentDao = new StudentDaoImpl();

      // print all students
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
      }

      // update student
      Student student =studentDao.getAllStudents().get(0);
      student.setName("Michael");
      studentDao.updateStudent(student);

      // get the student
      studentDao.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
   }
}
import java.lang.*;
class Start{
     public static void main(String[] args){
		 String name[]=new String[3];
		 double cpga[]= new double[3];
		 int roll[]=new int[3];
		 name[0]="rahat";name[1]="rahati";name[2]="kajib";
		 cpga[0]=3.9;cpga[1]=2.9;cpga[2]=1.9;
		 roll[0]=24;roll[1]=11;roll[2]=13;
		 
		 for(int i=0;i<3;++i){
			 System.out.println(name[i]);
			 System.out.println(cpga[i]);
			 System.out.println(roll[i]);
			 
		 }
	 }
}
```
import java.lang.*;
import java.util.Scanner;
class Start{
     public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 String name[]=new String[3];
		 double cpga[]= new double[3];
		 int roll[]=new int[3];
		 name[0]="rahat";name[1]="rahati";name[2]="kajib";
		 cpga[0]=3.9;cpga[1]=2.9;cpga[2]=1.9;
		 roll[0]=24;roll[1]=11;roll[2]=13;
		 for(int i=0;i<3;++i){
			 name[i]=sc.nextLine();
			 cpga[i]=sc.nextDouble();
			 roll[i]=sc.nextInt();
			 sc.nextLine();
			 
		 }
		 
		 for(int i=0;i<3;++i){
			 System.out.println(name[i]);
			 System.out.println(cpga[i]);
			 System.out.println(roll[i]);
			 
		 }
	 }
}
class Student {
    public Student(){
        System.out.println("welcome");
    }
}
class School{
    public static void main(String[]args){
        Student s = new Student();
    }
}
class Counter{
          static int count =0;
          public Counter(){
            count++;
            System.out.println(count);
          }
}
public class Main{
public static void main(String[]args){
    Counter c1=new Counter();
    Counter c2=new Counter();
    Counter c3=new Counter();
    System.out.println("Total objects created: " + Counter.count);

}}
class Empolyee{
    private int id;
    private String name;
    static {
        String commpanyName="AIUB";
        System.out.println(commpanyName);
    }
    Empolyee(){
        System.out.println("default const has been called");
    }
    void setId(int i){
        id =i;
    }
     int getId(){
        return id;
    }
    void setName(String n){
        name =n;
    }
    void showDisplay(){
        System.out.println("name"+name+"id"+id);
    }
}
class Main{
    public static void main(String[] args){
        Empolyee e = new Empolyee();
        e.setId(10);
        e.setName("rahat");
        e.showDisplay();

    }
}
class Empolyee{
    private int empID;
    private String empName;
    private double salary;
    void setID(int id){
        empID=id;
    }
    void setName(String name){
        empName=name;
    }
    void setSalary(double salar){
        salary= salar;
    }
    int getId(){
        return empID;
    }
    String getName(){
        return empName;
    }
    double getSalay(){
        return salary;
    }
    void show(){
        System.out.println(empID+empName+salary);
    }

}
class Main{
    public static void main(String[] args){
        Empolyee e1 = new Empolyee();
        Empolyee e2 = new Empolyee();
        e1.setID(11);
        e1.setName("rahat");
        e1.setSalary(10000);
        e2.setID(12);
        e2.setName("r");
        e2.setSalary(102000);
        e1.show();
        e2.show();


    }
}
class Animal{
    private String type;
    private String sound;
    void setType(String t){
        type=t;
    }
    void setSound(String s){
        sound=s;
    }
    String getType(){
        return type;
    }
    String getSound(){
        return sound;
    }
    void display(){
        System.out.println("Type"+type);
        System.out.println("Sound"+sound);
    }
}
class Main{
    public static void main(String[] args){
         Animal a = new Animal();
         a.setType("dog");
         a.setSound("bark");
         a.display();
    }
}
