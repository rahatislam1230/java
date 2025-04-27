class Character{
    private int health;
    protected int attackPower;
    private String name;
    public Character(String name,int health,int attackPower){
        this.name=name;
        this.health=health;
        this.attackPower=attackPower;
    } 
    void Hset(int health){
        this.health=health;
    }
    int Hget(){
        return health;
    }
    void Aset(int attackPower){
        this.attackPower=attackPower;
    }
    int Aget(){
        return attackPower;
    }
    void Nset(String name){
        this.name=name;
    }
    String Nget(){
        return name;
    }

    public void attack(Character target){
        System.out.println(this.name+"attacks"+target.name+"with"+ this.attackPower);
        target.takeDamage(this.attackPower);
    } 
    public void takeDamage(int damage){
        this.health -=damage;
        System.out.println(this.name+"takes"+damage+"damge"+this.health);
    }
}
class Warrior extends Character{
    public Warrior(String name,int health,int attackPower){
        super(name,health,attackPower);
    }
    public void heavyAttack(Character target){
        int heavyDamage=this.attackPower * 2;
        System.out.println(heavyDamage+"damge!");
        target.takeDamage(heavyDamage);
    }
}
class Mage extends Character{
    public Mage(String name,int health,int attackPower){
        super(name,health,attackPower);
    }
    public void castSpell(Character target){
        int spellDamage=this.attackPower + 10;
        System.out.println(spellDamage);
        target.takeDamage(spellDamage);
    }
}
class Start{
    public static void main(String[] args){
        Warrior w=new Warrior("conon",100,20);
        Mage m = new Mage("Meline",80,15);
        w.attack(m);
        m.castSpell(w);
        w.heavyAttack(m);
    }
}
class GameCharacter{
    private String name;
    private int level;
    GameCharacter(String name,int level){
        this.name =name;
        this.level=level;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setLevel(int level){
        this.level=level;
    }
    int getLevel(){
        return level;
    }
    void displayCharacterInfo(){
        System.out.println(name);
        System.out.println(level);
    }
}
class Warrior extends GameCharacter{
    private String weaponType;
    Warrior(String name,int level,String weaponType){
        super(name,level);
        this.weaponType=weaponType;
    }
    void setWeaponType(String weaponType){
        this.weaponType=weaponType;
    }
    String getWeaponType(){
        return weaponType;
    }
    @Override 
    void displayCharacterInfo(){
        super.displayCharacterInfo();
        System.out.println(weaponType);
    }
}
class Mage extends GameCharacter{
    private String magicType;
    Mage(String name,int level,String magicType){
        super(name,level);
        this.magicType=magicType;
    }
    void setmType(String magicType){
        this.magicType=magicType;
    }
    String getmType(){
        return magicType;
    }
    @Override 
    void displayCharacterInfo(){
        super.displayCharacterInfo();
        System.out.println(magicType);
    }
}
class Start{
    public static void main(String[] args){
        Warrior w=new Warrior("Warrior",1500,"gobline");
        Mage m=new Mage("wizz",1000,"fire");
        w.displayCharacterInfo();
        m.displayCharacterInfo();
    }
}
class BankAccount{
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    void setAc(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    String getAc(){
        return accountHolderName;
    }
    void setAn(int accountNumber){
        this.accountNumber=accountNumber;
    }
    int getAn(){
        return accountNumber;
    }
    void setBal(double balance){
        this.balance=balance;
    }
    double getBal(){
        return balance;
    }
    void displayAccountInfo(){
        System.out.println(accountHolderName+""+accountNumber+""+balance);
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    SavingsAccount(String accountHolderName,int accountNumber,double balance,double interestRate){
        super(accountHolderName,accountNumber,balance);
        this.interestRate=interestRate;
    }
    void setIntR(double interestRate){
        this.interestRate=interestRate;
    }
    double getIntR(){
        return interestRate;
    }
    @Override
    void displayAccountInfo(){
        super.displayAccountInfo();
        System.out.println(accountHolderName+""+accountNumber+""+balance+""+interestRate);
    }
}
class Vehicle{
    private String brand;
    private String model;
    Vehicle(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    void setBrand(String brand){
        this.brand=brand;
    }
    String getBrand(){
        return brand;
    }
    void setModel(String model){
        this.model=model;
    }
    String getModel(){
        return model;
    }
    void displayVehicleInfo(){
        System.out.println(brand+""+model);
    }
}
class Car extends Vehicle{
    private String type;
    Car(String brand,String model,String type){
        super(brand,model);
        this.type=type;
    }
    void setType(String type){
        this.type=type;
    }
    String getType(){
        return type;
    }
    
    void displayCarInfo(){
        super.displayVehicleInfo();
        System.out.println(type);
    }
}
class Start{
    public static void main(String[] args){
        Car c= new Car("bmw","b4","hyper");
        c.displayCarInfo();
    }
}
class BankAccount{
    private String accountNumber;
    private int balance;
    BankAccount(String accountNumber,int balance){
        this.accountNumber=accountNumber;
        this.balance= balance;
    }
    void setAcN(String accountNumber){
        this.accountNumber=accountNumber;
    }
    String getAcN(){
        return accountNumber;
    }
    void setAcc(int balance){
        this.balance=balance;
    }
    int getAcc(){
        return balance;
    }
    void deposit( double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposit"+ amount);
        }else{
            System.out.println("No taka");
        }
    }
    void withdraw(double amount){
        balance -=amount;
        if(amount>0 && balance>=amount){
            System.out.println("You have taken"+amount);
        }else{
            System.out.println("taka nai");
        }
    }
    void display(){
        System.out.println(accountNumber+""+balance);
    }
}
class SavingAccount extends BankAccount{
     private double interestRate;
     private double loanAmount;
     SavingAccount(String accountNumber,int balance,double interestRate,double loanAmount){
        super(accountNumber,balance);
        this.interestRate=interestRate;
        this.loanAmount=loanAmount;
     }
     void setIR(double interestRate){
        this.interestRate=interestRate;
     }
     double getIR(){
        return interestRate;
     }
     void setLR(double loanAmount){
        this.loanAmount=loanAmount;
     }
     double getLR(){
        return loanAmount;
     }
    /* void applyInterest(double interest){
        balance= (int)(balance*interest/100);
     }*/
     void applyForLoan(double amount){
        loanAmount +=amount;
        if(amount>0){
            System.out.println("loanAmount"+ amount);
        }else{
            System.out.println("cant give you loan");
        }
     }
     void repayLoan(double amount){
        loanAmount -=amount;
         if(amount>0 && loanAmount>=amount){
            System.out.println("You curi krsos"+amount);
        }else{
            System.out.println("taka nai");
        }
    }
    @Override
    void display(){
         super.display();
         System.out.println(loanAmount+""+interestRate);
    }
 
}
class Start{
    public static void main(String[] args){
        SavingAccount sa =new SavingAccount("rahat",10000,0.5,5000);
        sa.withdraw(2000);
        sa.deposit(50000);

        sa.repayLoan(500);
        sa.display();
    }
}
