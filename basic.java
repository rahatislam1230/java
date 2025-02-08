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
