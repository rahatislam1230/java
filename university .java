public class Main{
    public static void main(String[] args) {
        Student s= new Student();
        Eomployee e = new Eomployee();
        Person p = new Person();
        System.out.println("start");
        p.display();
        e.display();
        s.display();
        System.out.println("end");
    }
}
class Person{
    static int count ;
    Person(){
        System.out.println("person"+ count);
        count++;
    }
    void display(){
        System.out.println("counter"+count);
    }
}
class Eomployee extends Person{
    Eomployee(){
        System.out.println("employ="+count);
    }
}
class Student extends Person{
    Student(){
        System.out.println("student"+count);
    }
}
public class StringExample {
	public static void main(String[] args) {
 
		String s1 = "Hello";
		String s2 = "Hallo";
		String s3 = new String("Hello");
 
		int len = s1.length();
		System.out.println("length of s1 = " + len);
 
		char ch = s1.charAt(2);
		System.out.println("Char At 0 position in s1 = " + ch);
 
		int pos = s1.indexOf("l");
		System.out.println("Position of e in s1 = " + pos);
 
		boolean isEqual = s1.equals(s2);
		System.out.println("s1.equals(s2) = " + isEqual);
 
		String s4 = s1.substring(1, 4); // ell
		System.out.println("s1.substring(1, 4) = " + s4);
 
		boolean isEmpty = s1.isEmpty();
		System.out.println("s1.isEmpty() = " + isEmpty);
 
		String s5 = s1.concat(s4);
		System.out.println("s1.concat(s4) = " + s5);
 
		int compare = s1.compareTo(s2); // s1 = Hello, s2 = Hallo
		System.out.println("s1.compareTo(s2) = " + compare);
	}
}
public class ArrayExample {
	public static void main(String[] args) {
		Person persons[] = new Person[3];
 
		Person p1 = new Person(1, "xyz", 50);
		persons[0] = p1;
 
		// p1.show();
		// persons[0].show()
 
		persons[1] = new Person(2, "abc", 35);
 
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				System.out.println(persons[i]);
			}
			else {
				persons[i].show();
			}
		}	
	}
}
 
class Person {
	int id;
	String name;
	int age;
 
	Person() { System.out.println("Default Constructor of Person"); }
 
	Person(int i, String n, int a) {
		System.out.println("Parameterized Constructor of Person");
		id = i;
		name = n;
		age = a;
	}
 
	void show() {
		System.out.println("id = " + id + " " + "name = " + name + " " + "age = " + age);
	}
}
public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setId(90);
		p1.setName("Something");
		System.out.println(p1.getId());
		System.out.println(p1.getName());
	}
}
 
class Person {
	private int id;
	private String name;
 
	public void setId(int i) {
		id = i;
	}
 
	public void setName(String n) {
		name = n;
	}
 
	public int getId() {
		return id;
	}
 
	public String getName() {
		return name;
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Employee e = new Employee();
        Person p = new Person();

        System.out.println("start");
        p.display();
        e.display();
        s.display();
        System.out.println("end");
    }
}

class Person {
    static int count;

    Person() {
        System.out.println("person " + count);
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                count++;
            } else {
                System.out.println("no");
            }
        }
    }

    void display() {
        System.out.println("counter " + count);
    }
}

class Employee extends Person {
    Employee() {
        System.out.println("employee = " + count);
    }
}

class Student extends Person {
    Student() {
        System.out.println("student " + count);
    }
}
