class Test
{
    public static void main(String[] args)
    {
        System.out.println("My First Java Program.");
    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int a = 1;
        byte b=1;
        short c=1;
        long d=1;
        System.out.println(c+d);
    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
       int a=1;
       for (int i=0;i<5;++i){
           System.out.print((a + i) + "\n");
       }

    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
       int sum=0;
       for (int i=0;i<10;++i){
           int a=1+i;
           System.out.println(a);
           sum+=a;
       }
       System.out.println("sum"+sum);

    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
       for (int i=0;i<20;++i){
        if(i%2==0){
            System.out.println(i+"even");
        }else{
            System.out.println(i+"odd");
        }
       }


    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
       for (int i=0;i<20;++i){
        if(i%2==0){
            System.out.println(i+"even");
        }
        
       }


    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
       for (int i=0;i<20;++i){
        if(i%2==0){
            continue;
        }else{
            System.out.println(i+"odd");
        }
       }


    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int i=0;
        while(i<5){
            System.out.println(i);
            i++;
        }

    }
}

package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<5);

    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int [] numbers ={1,2,3,4,5};
        for(int num :numbers){
            System.out.println(num);
        }
    }
}
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n+"eve");
        } else {
            System.out.println(n+"odd");
        }
        sc.close();
    }
}
