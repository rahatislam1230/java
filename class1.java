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
import java.util.*;
import java.lang.*;
class Funtion{
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int b=sc.nextInt();
	 int c= sc.nextInt();
	 if(a>b){
	 	if(a>c){
	 		System.out.println("a is the biggest");
	 	}else{
	 		System.out.println("c is the biggest");
	 	}
	 }else{
	 	if(b>c){
	 		System.out.println("b is the biggest");
	 	}else{
	 		System.out.println("c is the biggest");
	 	}
	 }

	}
}
