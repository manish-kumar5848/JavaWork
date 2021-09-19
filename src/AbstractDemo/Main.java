package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Abstract Demo");
        Dog dog = new Dog("Tommy");
        dog.eat();
        dog.breathe();
        Parrot parrot = new Parrot("Golu");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
    }
}
