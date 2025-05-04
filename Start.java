import java.util.Scanner;
class Roof{
    private String type;
    private double area;
    private double price;
    Roof(String type,double area,double price){
        this.type=type;
        this.area=area;
        this.price=price;
    }
    void setType(String type){
        this.type=type;
    }
    String getType(){
        return type;
    }
    void setArea(double area){
        this.area=area;
    }
    double getArea(){
        return area;
    }
    void setPrice(double price){
        this.price=price;
    }
    double getPrice(){
        return price;
    }
}
class Room{
    private String purpose;
    private double size;
    private  double price;
    Room(String purpose,double size,double price){
        this.purpose=purpose;
        this.size=size;
        this.price=price;
    }
    void setPurpose(String purpose){
        this.purpose=purpose;
    }
    String getPurpose(){
        return purpose;
    }
    void setSize(double size){
        this.size=size;
    }
    double getSize(){
        return size;
    }
    void setPrice(double price){
        this.price=price;
    }
    double getPrice(){
        return price;
    }

}
class House{
    private String location;
    private double baseCost;
    private Room []room;
    private Roof roof;
    House(String location,double baseCost,Room[] room,Roof roof){
        this.location=location;
        this.baseCost=baseCost;
        this.room=room;
        this.roof=roof;
    }
    double Calcute(){
        double total=0;
        total+=baseCost+roof.getPrice();
        for(int i=0;i<room.length;i++){
            total+=room[i].getPrice();
        }
        return total;
    }
    void info(){
        System.out.println(roof.getPrice()+roof.getArea()+roof.getType());
        for(int i=0;i<room.length;i++){
            System.out.println(room[i].getPurpose()+room[i].getPrice()+room[i].getSize());
        }System.out.println(Calcute());
    } 
}
class Start {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String type=sc.nextLine();
        String location=sc.nextLine();
        sc.nextLine();
        double baseCost=sc.nextDouble();
        double area=sc.nextDouble();
        double price=sc.nextDouble();
        Roof roof=new Roof(type,area,price);
        Room room []=new Room[3];
        for(int i=0;i<3;i++){
            sc.nextLine();
             String purpose=sc.nextLine();
             sc.nextLine();
             double size=sc.nextDouble();
             double nprice=sc.nextDouble();
             room[i]=new Room(purpose,size,nprice);
        }
        House h =new House(location,baseCost,room,roof);
        h.info();
    }
}






















