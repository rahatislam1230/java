import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the name: ");
        n=s.nextInt();
        for(int i = 0;i<=n; i++){
            for(int j=0;j<=i;j++){
            System.out.print("*");

        }
            System.out.println();
        }

    }
}
import java.util.Scanner;

public class funtion {
    public static  void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name= sc.next();
        printMyName(name);
    }    
}
import java.util.Scanner;

    public  static  int calculateSum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println(sum);

    }    
import java.util.Scanner;

   // public  static  int calculateSum(int a,int b){
       // return a+b;
   // }
public static  int calculateProduct(int a,int b){
    return a*b;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println(calculateProduct(a,b));

    }    

import java.util.Scanner;

   // public  static  int calculateSum(int a,int b){
       // return a+b;
   // }
public static  int Fact(int n){
    if(n>0){
        return n*Fact(n-1);
    }else{
        return 1;
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Fact(a));

    }    
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        int[] marks= new int [3];
        Scanner sc= new Scanner(System.in);
        System.out.println("marks");
        int mark =sc.nextInt();

        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }

}

