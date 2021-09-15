public class InheritnceDemo {
    public static void  main(String [] args){
       Animal animal = new Animal("Animal",1,1,5,5);
       Dog dog = new Dog("Tommy",8,8,4,1);
       dog.eat();
       dog.walk();
       dog.run();
    }
}

class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;
    public Animal(String name,int brain,int body,int size,int weight){
        this.name= name;
        this.brain= brain;
        this.body= body;
        this.size= size;
        this.weight = weight;
    }

    public int getBody() {
        return body;
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void move(int speed){
        System.out.println("Animal is Moving at " + speed);
    }

}

class Dog extends Animal {
    private int legs;
    private int tails;


    public Dog(String name, int size, int weight, int legs, int tails) {
        super(name,1,1, size, weight);// calls the constructor of Base Class
        this.legs= legs;
        this.tails= tails;
    }
    private void chew(){
        System.out.println("Animal.chew() is called");
    }
    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();
    }

    public void run(){
        System.out.println("Dog.run() is called ");
        move(5);
    }
    public void walk(){
        System.out.println("Dog.walk() is Called");
        move(10);
    }
}