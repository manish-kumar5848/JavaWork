public class PolymorphismDemo {
    public static  void main( String [] args){
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Kia kia = new Kia(8, "Kia A8 ");
        System.out.println(kia.startEngine());
        System.out.println(kia.accelerate());
        System.out.println(kia.brake());

        Ford ford = new Ford(8, "Ford Figo");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

    }
    }

class Car{
    private boolean engine;
    private int cylnders;
    private int wheels;
    private String name;

    public Car(int cylnder, String name) {
        this.engine = true;
        this.cylnders =cylnders ;
        this.wheels =4 ;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylnder() {
        return cylnders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        return "Car ----> Start Engine";
    }
    public String accelerate(){
        return "Car ----> accelerate";
    }
    public String brake(){
        return "Car ----> Brake";
    }

}

class Kia extends Car{
       public Kia (int cylinders,String name){
           super(cylinders,name);
        }

    @Override
    public String startEngine() {
        return "Kia ----> Start Engine";
    }

    @Override
    public String accelerate() {
        return "Kia -----> accelerate";
    }

    @Override
    public String brake() {
        return "Kia ----> brake";
    }
}
class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders,name);
    }

    @Override
    public String startEngine() {
        return "Ford ----> Start Engine";
    }

    @Override
    public String accelerate() {
        return "Ford -----> accelerate";
    }

    @Override
    public String brake() {
        return "Ford ----> brake";
    }
}

