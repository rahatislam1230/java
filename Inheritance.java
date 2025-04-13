class Animal{
    void Eat(){
        System.out.println("Animal eats :+6");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("The dog bark");
    }
}
class Cat extends Dog{
    void Meow(){
        System.out.println("The cat meows");
    }
}
class Main{
    public static void main(String[] args){
        Animal a = new Animal();
        a.Eat();
       // a.Bark();
        //a.Meow();
        Dog d = new Dog();
        d.Eat();
        d.Bark();
       // d.Meow();
        Cat c= new Cat();
        c.Eat();
        c.Bark();
        c.Meow();
    }
}
class Animal{
    void Eat(){
        System.out.println("Animal eats :+6");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("The dog bark");
    }
}
class Cat extends Dog{
    void Meow(){
        System.out.println("The cat meows");
    }
}
class Main{
    public static void main(String[] args){
        Cat c= new Cat();
        c.Eat();
        c.Bark();
        c.Meow();
    }
}
class Animal{
    void Eat(){
        System.out.println("Animal eats :+6");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("The dog bark");
        super.Eat();
        System.out.println("Dog barks");
    }

}
/*class Cat extends Dog{
    void Meow(){
        System.out.println("The cat meows");
    }
}*/
class Main{
    public static void main(String[] args){
        Dog c= new Dog();
        c.Eat();
        c.Bark();
        
    }
}/*Animal eats :+6
The dog bark
Animal eats :+6
Dog barks*/
  
