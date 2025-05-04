import java.util.Scanner;

class StudentGradeCal {
    static {
        System.out.println("====welcome====");
    }
    
    static class Student {
        private String name;
        private int rollno;
        private int[] marks;
        
        // Constructor was missing closing brace
        public Student(String name, int rollno, int[] marks) {
            this.name = name;
            this.rollno = rollno;
            this.marks = marks;
        }  // Added missing closing brace for constructor
        
        public String getName() {
            return name;
        }
        
        public int getRollnum() {
            return rollno;
        }
        
        public int[] getMarks() {
            return marks;
        }
        
        public int calcuT() {
            int total = 0;
            for(int mark : marks) {
                total += mark;
            }
            return total;
        }
        
        public double calAv() {
            return (double)calcuT() / marks.length;
        }
        
        public char grade() {
            double avg = calAv();
            if(avg >= 90) return 'A';
            else if (avg >= 80) return 'B';
            else if (avg >= 70) return 'C';
            else if (avg >= 60) return 'D';
            else return 'F';
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll: ");
        int rollno = sc.nextInt();
        int[] marks = new int[3];
        System.out.println("Enter marks for 3 subjects:");
        for(int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }
        
        Student s = new Student(name, rollno, marks);
        
        System.out.println("\n==== Student Details ====");
        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollnum());
        System.out.print("Marks: ");
        for(int mark : s.getMarks()) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal: " + s.calcuT());
        System.out.printf("Average: %.2f\n", s.calAv());
        System.out.println("Grade: " + s.grade());
        
        sc.close();
    }
}
			
			