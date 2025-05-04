public class Student {
    private String name;
    private int age;
    private String grade;
    String getName() {
        return name;
    }
    void setName(String n) {
        name = n;
    }

    int getAge() {
        return age;
    }
    void setAge(int a) {
        age = a;
    }
    String getGrade() {
        return grade;
    }
    void setGrade(String g) {
        this.grade = g;
    }
    public void StudentInfo() {
        System.out.println("Name: " + name+"Age: " + age+"Grade: " + grade);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("samiya");
        s1.setAge(20);
        s1.setGrade("A");
        s2.setName("abiha");
        s2.setAge(21);
        s2.setGrade("B");
        Student s[] = new Student[6];
        s[0] = s1;
        s[2] = s2;
        s[4] = new Student();
        s[4].setName("masud");
        s[4].setAge(22);
        s[4].setGrade("c");
        for (int i = 0; i < 3; i++) {
            if (s[i] != null) {
                System.out.println("Name: " + s[i].getName()+"Age: " + s[i].getAge()+"Grade: " + s[i].getGrade());
            } else {
                System.out.println("No information available");
            }
        }
    }
}