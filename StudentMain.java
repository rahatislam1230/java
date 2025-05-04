import java.util.*;
import java.lang.*;
class Student{
    private String name;
    private int id;
    public Student(String name,int id){
        this.name =name;
        this.id = id;
    }
    public int GetId(){
        return id;
    }
    public String GetName(){
        return name;
    }
    public void SetId(int id){
        this.id=id;
    }
    public void SetName(String name){
        this.name =name;
    }
    public void Info(){
        System.out.println("ID:"+id +" NAME: "+name);
    }
} 
class StudentMain { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the id");
        int id = sc.nextInt();
        Student s=new Student(name,id);
        System.out.println("Student details");
        s.Info();
        System.out.println("undate yes or no");
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("enter name");
            String Newname=sc.nextLine();
            System.out.println("enter id");
            int newId=sc.nextInt();
            s.SetId(newId);
            s.SetName(name);
            System.out.println("updated information");
            s.Info();
        }
        sc.close();


    }
}
