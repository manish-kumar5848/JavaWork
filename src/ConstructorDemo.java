public class ConstructorDemo {
    public static  void main(String [] args){
     Student s1 = new Student();
     s1.display();
     Student s2 = new Student(2,"Aman");
     s2.display();
    }
}
class Student{
     int id;
     String name;
     Student(){
         this.id= 1;
         this.name= "Manish";
     }
     Student(int x, String y){
         this.id= x;
         this.name =y;

     }
     void display(){
         System.out.println("Student id is "+id +" and Name is "+name);
     }
}
