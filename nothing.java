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
