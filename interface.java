class Emolpyee{
    String name;
    Emolpyee(){
        
    }
    Emolpyee(String name){
        this.name=name;
    }
}
class Bank{
    private String name;
    private Emolpyee [] emolpyee;
    Bank(String name,Emolpyee[] emolpyee){
        this.name=name;
        this.emolpyee=emolpyee;
    }
    void display(){
        System.out.println(name);
        for(int i=0;i<emolpyee.length;i++){
            System.out.println(emolpyee[i].name);
        }

    }
}
class Start{
    public static void main(String[] args){
        Emolpyee[] emolpyee=new Emolpyee[2];
        for(int i=0;i<2;i++){
            emolpyee[i] = new Emolpyee();
        }
        emolpyee[0].name="rahat";
        emolpyee[1].name="kola";
        Bank bank =new Bank("Bank",emolpyee);
        bank.display();
    }
}
abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
    void setRadi(double radius){
        this.radius=radius;
    }
    double getRadi(){
        return radius;
    }
    void showC(){
        System.out.print("Circle");
    }
    double area(){
        return 3.14*getRadi()*getRadi();
    }
}
class Reactagle extends Shape{
    private double length,width;
    Reactagle(double length,double width){
        this.length=length;
        this.width=width;
    }
    void setLength(double length){
        this.length=length;
    }
    double getLength(){
        return length;
    }
    void setWith(double width){
        this.width=width;
    }
    double getWith(){
        return width;
    }
    void showR(){
        System.out.print("Reactagle");
    }
    double area(){
        return getLength()*getWith();
    }
}
class Start{
    public static void main(String[] args){
        Shape s= new Circle(5.0);
        s= new Reactagle(50.0,50.5);
        System.out.println(s.area());
        System.out.print(s.area());
        ((Circle)s).showC();
        ((Reactagle)s).showR();

    }
}
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    void setRadi(double radius) {
        this.radius = radius;
    }
    
    double getRadi() {
        return radius;
    }
    
    void showC() {
        System.out.println("Circle");
    }
    
    @Override
    double area() {
        return 3.14 * getRadi() * getRadi();
    }
}

class Reactagle extends Shape {
    private double length, width;
    
    Reactagle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    void setLength(double length) {
        this.length = length;
    }
    
    double getLength() {
        return length;
    }
    
    void setWith(double width) {
        this.width = width;
    }
    
    double getWith() {
        return width;
    }
    
    void showR() {
        System.out.println("Reactagle");
    }
    
    @Override
    double area() {
        return length * width;
    }
}

final class MyMath {
    public final int sq(int x) {
        return x * x;
    }
}

class Start {
    public static void main(String[] args) {
        Object  p = new Circle(5.0);
        System.out.println("Circle area: " + ((Shape)p).area());
        ((Circle)p).showC();
        p = new Reactagle(50.0, 50.5);
        System.out.println("Rectangle area: " + ((Shape)p).area());
        ((Reactagle)p).showR();
        p = new MyMath();
        System.out.println("Square: " + ((MyMath)p).sq(5));
    }
}
// is a relasonship
//Inheritance child/sub/derived is parent/super/base//
// single level inheritance
class Calc{
    public  int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return  n1 - n2;
    }
}// redundancy is a crime //
class AdvCal extends Calc{
    public  int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return  n1/n2;
    }
}
class Main{
    public static void main(String[] args){
     AdvCal obj = new AdvCal();
     int r1 =obj.add(4,5);
     int r2=obj.sub(7,3);
     int r3 =obj.multi(4,5);
     int r4=obj.div(7,3);
        System.out.println(r1+ " " +r2+ "" +r3+ " " +r4);
    }
}
//multi level inheritance
class Calc{
    public  int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return  n1 - n2;
    }
}// redundancy is a crime //
class AdvCal extends Calc{
    public  int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return  n1/n2;
    }
}
class VeryAdvCal extends AdvCal{
    public  double power(int n1,int n2){
        return Math.pow(n1,n2);
    }

}
class Main{
    public static void main(String[] args){
     VeryAdvCal obj = new VeryAdvCal();
     int r1 =obj.add(4,5);
     int r2=obj.sub(7,3);
     int r3 =obj.multi(4,5);
     int r4=obj.div(7,3);
     double r5=obj.power(8,5)
        System.out.println(r1+ " " +r2+ "" +r3+ " " +r4+ " "+r5);
    }
}
// ambiguity problem multiple inheritance doest work
class  A{

}
class B{

}
class C{
    
}///
// polymorphism
class  A{
    public void show(){
        System.out.println("in show A");
    }
}
class B extends A{
    public void show(){
        System.out.println("in show B");
    }
}

class Main{
    public static void main(String[] args){
       A obj = new B();
       obj.show();

    }
}
// polymorphism runtime
class  A{
    public void show(){
        System.out.println("in show A");
    }
}
class B extends A{
    public void show(){
        System.out.println("in show B");
    }
}

class Main{
    public static void main(String[] args){
       A obj = new A();
       obj.show();
        obj = new B();
        obj.show();
        

    }
}
// final - method variable class
// it stops inheritance
 class Cal{
    public final void show(){
        System.out.println("in show");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class AdvC extends Cal{
    // it stops inheritance in class
    public void show(){
        System.out.println("in show");// it cant override it
    }
}
class Main{
    public static void main(String[] args){
        Cal obj=new Cal();
        obj.show();
        obj.add(4,5);
    }
}
class A{
    void show1(){
        System.out.println("in A");
    }
}
class B extends A{
    void show2(){
        System.out.println("in B");
    }
}
class Main{
    public static void main(String[] args){
         A obj=(A)new B();// upcasting
         obj.show1();

         B obj1= (B)obj;// down casting
         obj1.show2();
         
        ((B)obj).show2();// down casting
    }
}
//abstract class can have normal method but abstract method must have abstract class
abstract class Car{
    public abstract void drive();
    public abstract  void fly();
    void playMusice(){
        System.out.println("play music");
    }
}
class WagonR extends Car{
    public void drive(){
        //use Public always
        System.out.println("driving...");
    }
    public void fly(){
        System.out.println("flying");
    }
}

class Main{
    public static void main(String[] args){
        Car obj =new WagonR();
        obj.drive();
        obj.playMusice();
        obj.fly();
    }
}
//abstract class can have normal method but abstract method must have abstract class
abstract class Car{
    public abstract void drive();
    public abstract  void fly();
    void playMusice(){
        System.out.println("play music");
    }
}
abstract class WagonR extends Car{
    public void drive(){
        //use Public always
        System.out.println("driving...");
    }
}

class UpdatedWagon extends WagonR{ // concrete class only has a object
    public void fly(){
        System.out.println("flying");
    }
}
class Main{
    public static void main(String[] args){
        Car obj =new UpdatedWagon();
        obj.drive();
        obj.playMusice();
        obj.fly();
    }
}
//Inner class
abstract class A{
  public abstract void show();

}
class B extends A{
    public void show(){
        System.out.println("in B");
    }
}

class Main{
    public static void main(String[] args){
        A obj= new A(){// anonyous inner class
            public void show(){
                System.out.println("in new a");
            }
        };
        obj.show();

    }
}
//interface
interface A{ // it's not a class but by default class and method becomes abstract
     void show();
     void config();
}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("int config");
    }
}

class Main{
    public static void main(String[] args){
         A obj;
       /* obj= new A();*/ //you cant instantiate it
         obj=new B();
         obj.show();
         obj.config();
    }
}
//interface
interface A{ // it's not a class but by default class and method becomes abstract
    int age;  //  by default every thing in the interface is final and static
    // so cant use variable without giving it a value
    void show();
     void config();
}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("int config");
    }
}

class Main{
    public static void main(String[] args){
         A obj;
       /* obj= new A();*/ //you cant instantiate it
         obj=new B();
         obj.show();
         obj.config();
    }
}
//interface
interface A{ // it's not a class but by default class and method becomes abstract
    int age=44;

    //  by default every thing in the interface is final and static
    // so cant use variable without giving it a value
    void show();
     void config();
}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("int config");
    }
}

class Main{
    public static void main(String[] args){
         A obj;
       /* obj= new A();*/ //you cant instantiate it
         obj=new B();
         obj.show();
         obj.config();
         A.age=45;// you cant change it
        System.out.println(A.age);// always final
    }
}
//interface
interface Computer{
     void code();
}
class  Laptop implements Computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code,comile.run faster");
    }
}
class Developer{
    public void devApp(Computer lab){
        lab.code();
    }
}

class Main{
    public static void main(String[] args){
        Computer lab= new Laptop();
        Computer des= new Desktop();
        Developer n=new Developer();
        n.devApp(des);

    }
}
//interface
interface A{ // it's not a class but by default class and method becomes abstract
    int age=44;

    //  by default every thing in the interface is final and static
    // so cant use variable without giving it a value
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{

}
class B implements A,Y{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("int config");
    }
    public void run(){
        System.out.println("runinng");
    }
}

class Main{
    public static void main(String[] args){
        A obj;

        obj=new B();
        obj.show();
        obj.config();
        obj.run();// doest work

        System.out.println(A.age);// always final
    }
}
//interface
interface A{ // it's not a class but by default class and method becomes abstract
    int age=44;

    //  by default every thing in the interface is final and static
    // so cant use variable without giving it a value
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{

}
class B implements A,Y{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("int config");
    }
    public void run(){
        System.out.println("runinng");
    }
}

class Main{
    public static void main(String[] args){
        A obj;

        obj=new B();
        obj.show();
        obj.config();
        X obj1= new B();
        obj1.run();

        System.out.println(A.age);// always final
    }
}
interface Engine {
    int MAX_SPEED = 240; // final & static by default

    void start();
    void stop();
}

interface Electric extends Engine {
    void charge();
}

interface FuelPowered {
    void refuel();
}

abstract class Vehicle {
    public abstract void drive();

    public void horn() {
        System.out.println("Beep beep!");
    }
}

abstract class Tesla extends Vehicle implements Electric {
    public void start() {
        System.out.println("Electric engine started");
    }

    public void stop() {
        System.out.println("Electric engine stopped");
    }

    public void charge() {
        System.out.println("Charging the Tesla");
    }
}

class ModelX extends Tesla {
    public void drive() {
        System.out.println("Driving Model X...");
    }
}

class Toyota extends Vehicle implements FuelPowered {
    public void drive() {
        System.out.println("Driving Toyota...");
    }

    public void refuel() {
        System.out.println("Refueling Toyota...");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new ModelX();      // Polymorphism
        car1.drive();                     // Output: Driving Model X...
        car1.horn();                      // Output: Beep beep!

        Electric elec = new ModelX();     // Interface ref
        elec.start();                     // Output: Electric engine started
        elec.charge();                    // Output: Charging the Tesla
        System.out.println(Electric.MAX_SPEED); // Output: 240

        Vehicle car2 = new Toyota();      // Another polymorphic object
        car2.drive();                     // Output: Driving Toyota...
        car2.horn();                      // Output: Beep beep!

     
        ((Toyota)car2).refuel();

        // Anonymous inner class
        Vehicle bike = new Vehicle() {
            public void drive() {
                System.out.println("Driving an anonymous bike");
            }
        };
        bike.drive();                     // Output: Driving an anonymous bike
    }
}
