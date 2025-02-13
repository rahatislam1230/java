import java.util.Scanner;

class Student {
    String name;
    int roll;
    float cgpa;

    public void getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        name = input.nextLine();
        System.out.println("Enter roll:");
        roll = input.nextInt();
        System.out.println("Enter CGPA:");
        cgpa = input.nextFloat();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Student s = new Student();  // Changed from 'student' to 'Student'
        s.getInput();
        s.display();
    }
}
import java.util.Scanner;

public class teacher {
    String name;
    float balance;
    String rank;
    int dep;
    private void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        name= input.nextLine();
        System.out.println("Enter the balace");
        balance=input.nextFloat();
        System.out.println("Enter the rank ");
        rank=input.nextLine();
        System.out.println("Enter dep");
        dep=input.nextInt();
    }
    private void detaisl(){
        System.out.println("name"+name);
        System.out.println("balance"+balance);
        System.out.println("rank"+rank);
        System.out.println("dep"+dep);
    }
    public static void main(String[] args){
        teacher t = new teacher();
        t.input();
        t.detaisl();
    }
}
