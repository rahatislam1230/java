class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentId;
    String course;

    Student(String name, int age, String studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}
class Teacher extends Person {
    String teacherId;
    String subject;

    Teacher(String name, int age, String teacherId, String subject) {
        super(name, age);
        this.teacherId = teacherId;
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
    }
}
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Amy", 20, "S123", "CSE");
        Teacher t = new Teacher("Dr. Smith", 45, "T987", "Algorithms");
        Staff st = new Staff("John", 35, "Administration");

        System.out.println("--- Student ---");
        s.displayInfo();

        System.out.println("\n--- Teacher ---");
        t.displayInfo();

        System.out.println("\n--- Staff ---");
        st.displayInfo();
    }
}
