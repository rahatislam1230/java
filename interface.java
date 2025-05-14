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
