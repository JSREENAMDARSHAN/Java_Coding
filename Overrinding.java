class Animal{
    void makeSound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dogs barks");
    }
}
public class Overrinding{
    public static void main(String[] args){
        Animal obj = new Animal();
        obj.makeSound();
        Animal obj1 = new Dog();
        obj1.makeSound();
    }
} 