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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {
    String name;
    int roll;
    float cgpa;

    // Constructor
    Student(String name, int roll, float cgpa) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input Data");
            System.out.println("2. Display All Data");
            System.out.println("3. Show Statistics");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: // Input Data
                    System.out.print("Enter the number of students: ");
                    int n = input.nextInt();
                    input.nextLine(); // Consume newline

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nEnter details for Student " + (i + 1) + ":");
                        System.out.print("Name: ");
                        String name = input.nextLine();
                        System.out.print("Roll: ");
                        int roll = input.nextInt();
                        System.out.print("CGPA: ");
                        float cgpa = input.nextFloat();
                        input.nextLine(); // Consume newline
                        students.add(new Student(name, roll, cgpa));
                    }
                    break;

                case 2: // Display All Data
                    if (students.isEmpty()) {
                        System.out.println("No data available.");
                    } else {
                        System.out.println("\nAll Student Data:");
                        for (Student s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3: // Show Statistics
                    if (students.isEmpty()) {
                        System.out.println("No data available.");
                    } else {
                        float sum = 0, highest = Float.MIN_VALUE, lowest = Float.MAX_VALUE;
                        ArrayList<Float> cgpaList = new ArrayList<>();

                        for (Student s : students) {
                            float c = s.cgpa;
                            sum += c;
                            if (c > highest) highest = c;
                            if (c < lowest) lowest = c;
                            cgpaList.add(c);
                        }

                        float average = sum / students.size();
                        Collections.sort(cgpaList);

                        // Middle CGPA Calculation
                        float middle;
                        int mid = cgpaList.size() / 2;
                        if (cgpaList.size() % 2 == 1) {
                            middle = cgpaList.get(mid); // Odd number of elements
                        } else {
                            middle = (cgpaList.get(mid - 1) + cgpaList.get(mid)) / 2; // Even number of elements
                        }

                        // Display Statistics
                        System.out.println("\nStatistics:");
                        System.out.println("Sum of CGPAs: " + sum);
                        System.out.println("Average CGPA: " + average);
                        System.out.println("Highest CGPA: " + highest);
                        System.out.println("Lowest CGPA: " + lowest);
                        System.out.println("Middle CGPA: " + middle);
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
