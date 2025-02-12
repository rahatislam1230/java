import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display student details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

public class StudentManagementSystem {
    private static final ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    // Method to add a new student
    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        studentList.add(new Student(id, name, age));
        System.out.println("Student added successfully!");
    }

    // Method to view all students
    public static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            System.out.println("\n--- Student Records ---");
            for (Student student : studentList) {
                student.display();
            }
        }
    }

    // Method to update student information
    public static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        for (Student student : studentList) {
            if (student.getId() == id) {
                sc.nextLine(); // Consume newline
                System.out.print("Enter new name: ");
                String newName = sc.nextLine();
                System.out.print("Enter new age: ");
                int newAge = sc.nextInt();
                student.setName(newName);
                student.setAge(newAge);
                System.out.println("Student record updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Method to delete a student record
    public static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.remove(i);
                System.out.println("Student record deleted successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Main method
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using the system!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
