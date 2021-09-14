public class AbstrctionDemo {
    public static void main(String [] args){
        System.out.println("Welcome to abstract class");
        Rectangle r1 = new Rectangle();
        r1.draw();
    }
}
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("I am drawing Rectangle");

    }
}
