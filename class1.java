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
import java.util.*;
import java.lang.*;
class Funtion{
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int N=sc.nextInt();
	 int sum=N*(N+1)/2;
	 System.out.println(sum);

	}
}
import java.util.*;
import java.lang.*;
class Funtion{
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n=sc.nextInt();
	 
	 int fib;
	 
	 if(n<0){
	 	System.out.println("enter postive");
	 }else{
	 	int sum=1;
	 	for(int i=1;i<=n;i++){
	 		sum*=i;
	 	}
	 	 System.out.println(sum);
	 
	}
	
	 sc.close();
	}
}
import java.util.*;
import java.lang.*;
class Function {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }

        sc.close();
    }
}
import java.util.*;
import java.lang.*;
class Function { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
              for(int j=1;j<=i;j++){
                System.out.print("*");
              }
              System.out.println();
        }
        sc.close();
    }
}
import java.util.*;
import java.lang.*;
class Function { 
    static boolean ispal(int n){
        int ori=n,rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return ori== rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(ispal(n)){
            System.out.println("is pal");

        }else{
            System.out.println("not is pal");
        }
    }
}


