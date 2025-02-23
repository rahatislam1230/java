import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {
        String name ="tony";
        String fullname="tony stark";
        String sectence= "my name tony stark";
        System.out.println(name);
    }

}
import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String name = sc.next();
        System.out.println("your name " +  name);
    }

}
import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {
       // concatenation
        String firstName="tony";
        String lastName ="stark";
        String fullName= firstName+ lastName;
        System.out.println(fullName);
    }

}
import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {
       // concatenation
        String firstName="tony";
        String lastName ="stark";
        String fullName= firstName+ " "+lastName;
        System.out.println(fullName);
    }

}
import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {
       // concatenation
        String firstName="tony";
        String lastName ="stark";
        String fullName= firstName+ " "+lastName;
        System.out.println(fullName.length());//legth of the funtion
    }

}
import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {
       // concatenation
        String firstName="tony";
        String lastName ="stark";
        String fullName= firstName+ " "+lastName;
        System.out.println(fullName.length());//legth of the funtion
        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }

}
import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {
       // compare
        String name1="tony";
        String name2 ="tony";
        // 1 s1>s2 : +ve value
        // 2 s1==s2
        // 3 s1<s2
        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal");

        }else{
            System.out.println("Strings are not are equal");
        }

    }

}
import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {
       // compare
        String name1="tony";
        String name2 ="tony";
        // 1 s1>s2 : +ve value
        // 2 s1==s2: 0
        // 3 s1<s2: -ve value
        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal");

        }else{
            System.out.println("Strings are not are equal");
        }

    }

}
import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {
       // compare
        String name1="tony";
        String name2 ="Tony";
        // 1 s1>s2 : +ve value
        // 2 s1==s2: 0
        // 3 s1<s2: -ve value
        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal");

        }else{
            System.out.println("Strings are not are equal");
        }
        if(name1==name2){
            System.out.println("strings are equal");

        }else{
            System.out.println("Strings are not are equal");
        }


    }

}
import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {
       // compare
        String name1="tony";
        String name2 ="Tony";
        // 1 s1>s2 : +ve value
        // 2 s1==s2: 0
        // 3 s1<s2: -ve value
        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal");

        }else{
            System.out.println("Strings are not are equal");
        }
        if(name1==name2){
            System.out.println("strings are equal");

        }else{
            System.out.println("Strings are not are equal");
        }
        if(new String("Tony")== new String("Tony"))
        {
            System.out.println("strings are equal");

        }else{
            System.out.println("Strings are not are equal");
        }

    }

}
import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {
        // substring
        String sentence = "My name is Tony";

        String name = sentence.substring(8,sentence.length());
        System.out.println(name);
    }
}
import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));
        // set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);
    }
}
import java.util.Scanner;
public class Strings{


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));
        // set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);
        sb.insert(0,'s');
        System.out.println(sb);
    }
}
