package AbstractDemo;

public abstract class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is Pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in , Breathe out ,Repeat");

    }
    public abstract void fly();
}
