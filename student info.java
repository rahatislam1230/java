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
import java.util.Scanner;

public class Teacher {
    String name;
    float balance;
    String rank;
    int dep;

    private void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = input.nextLine();
        System.out.println("Enter the balance:");
        balance = input.nextFloat();
        input.nextLine(); // Consume the leftover newline
        System.out.println("Enter the rank:");
        rank = input.nextLine();
        System.out.println("Enter the department number:");
        dep = input.nextInt();
    }

    private void details() {
        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rank: " + rank);
        System.out.println("Department: " + dep);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.input();
        t.details();
    }
}
import java.util.Scanner;

public class Teacher {
    String name;
    float balance;
    String rank;
    int dep;

    private void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = input.nextLine();
        System.out.println("Enter the balance:");
        balance = input.nextFloat();
        input.nextLine(); // Consume the leftover newline
        System.out.println("Enter the rank:");
        rank = input.nextLine();
        System.out.println("Enter the department number:");
        dep = input.nextInt();
    }

    private void details() {
        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rank: " + rank);
        System.out.println("Department: " + dep);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Teacher t = new Teacher();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input Data");
            System.out.println("2. Display Data");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    t.input();
                    break;
                case 2:
                    t.details();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
