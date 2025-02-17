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
