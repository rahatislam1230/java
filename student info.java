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
