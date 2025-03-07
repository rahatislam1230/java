import java.util.*;
import java.lang.*;
class Student{
	String name[]=new String[3] ;
	double cgpa[]=new double[3];
	int id[]=new int[3];
}
class Funtion{
	 public static void main(String[] args) {
	 Student s = new Student();
	 Scanner sc = new Scanner(System.in);
	 for(int i=0;i<3;i++){
	 	s.name[i]=sc.nextLine();
	 	s.cgpa[i]=sc.nextDouble();
	 	s.id[i]=sc.nextInt();
	 	sc.nextLine();
	 }
	 for(int i=0;i<3;i++){
	    System.out.println(s.name[i]);
	    System.out.println(s.cgpa[i]);
	    System.out.println(s.id[i]);
	 }

	}
}
