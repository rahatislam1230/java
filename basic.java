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
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i=0;i<n;++i){
        if (i % 2 == 0) {
            System.out.println(i+"eve");
        } else {
            System.out.println(i+"odd");
        }
        sc.close();
    }
    }
}
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(n>0){
                System.out.println(n*i);
            }
            else{
                System.out.println("invalid");
            }
        }
        sc.close();

}
}
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
       int[] n=new int[5];
       for(int i=0;i<n.length;++i){
           System.out.println(n[i]);
       }

}
}
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n.length; ++i) {
            n[i] = sc.nextInt();  
        }

        System.out.println("You entered:");
        for (int i = 0; i < n.length; ++i) {
            System.out.println(n[i]);
        }

        sc.close();
    }
}
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[3][3];

        System.out.println("Enter matrix elements (3x3):");
        for (int i = 0; i < n.length; ++i) {
            for (int j = 0; j < n[i].length; ++j) {
                n[i][j] = sc.nextInt();
            }
        }

        System.out.println("You entered:");
        for (int i = 0; i < n.length; ++i) {
            for (int j = 0; j < n[i].length; ++j) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
class Dog {
 
    String name;
    int age;
    
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void bark() {
        System.out.println(name + " is barking!");
    }
}

public class Main {
    public static void main(String[] args) {
 
        Dog myDog = new Dog("Buddy", 3);
        myDog.bark(); 
    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int a= 1;
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1=str2);
        System.out.println(str1.equals(str2));



    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int a= 1;
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1=str2);
        System.out.println(str1.equals(str2));
        str1=str1.toUpperCase();
        str1=str1.toLowerCase();
        System.out.println(str1);
        System.out.println(str1);



    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        int z=1;
        System.out.println(z++ + --z);


    }
}
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
        int a= 2;
        System.out.println(Integer.toBinaryString(a));


    }
}
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = true;
        if(isSunny && isWarm){
            System.out.println("beach day");
        }else {
            System.out.println("no");

        }
    }
}
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = false;
        if(isSunny && isWarm){
            System.out.println("beach day");
        }else if(isSunny) {
            System.out.println("jaket");

        }else{
            System.out.println("home");
        }
    }
}
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
        int day =3;
        String dayName;
        if (day==1){
            dayName="mon";
        } else if (day==2) {
            dayName="wednes";
        }else if (day==3) {
            dayName="thus";
        }else if (day==4) {
            dayName="fri";
        }else if (day==5) {
            dayName="sat";
        }else if (day==6) {
            dayName="sunday";
        }
        else{
            dayName="invalid";
        }

        }
    }
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
                int day =3;
                String dayName;
                switch (day){
                    case 1:
                        dayName="mon";
                        break;
                    case 2:
                        dayName="tues";
                        break;
                    case 3:
                        dayName="wed";
                        break;
                    default:
                        dayName="inavlid";
                }
                System.out.println(dayName);

    }
    }
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
               int i=0;
               while(i<=100){
                   System.out.println("HEllo");
                   i++;
               }
               for(int j=0;j<=100;++j){
                   System.out.println("HEllo");
               }

    }
    }
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
              int[]a= new int[5];
              System.out.println(a[1]);


    }
    }

package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
              int[]a= new int[5];
              a[4]=55;
              System.out.println(a);
              for(int i=0;i<5;++i){
                  System.out.println(a[i]);
              }
              for(int i:a){
                  System.out.println(a[i]);
              }


    }
    }
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
              Car car = new Car();
              car.speed=100;
              car.color="green";
              car.drive();


    }
    }
package com.ok.java.datatypes;


public class Car {
    int speed ;
    String color;
    void drive(){
        System.out.println("driving");
    }
}
package com.ok.java.datatypes;

import java.util.function.IntBinaryOperator;

public class test {
    public static void main(String[] args) {
              Car car = new Car("green");
              car.setSpeed(12);



    }
    }
package com.ok.java.datatypes;


public class Car {
    private int speed ;
    private String color;
    public Car(String color){
        this.color=color;
    }
    public int setSpeed(int speed){
        if(speed<0){
            System.out.println("not possbile");
        }else{
            this.speed=speed;
            System.out.println("driving");
        }

        return speed;
    }
}
package com.ok.java.datatypes;

public class test {
    public static void main(String[] args) {
        Smartphone smartphone= new Smartphone();
        smartphone.capture();



    }
    }
class Camera{
  void capture(){
      System.out.println("photo clicking");
  }

}
class Musicplay{
    {
        System.out.println("music");
    }

}
class Phone {
    void calling(String number){
        System.out.println("calling" + number);
    }

}
class Smartphone extends Camera{


}
