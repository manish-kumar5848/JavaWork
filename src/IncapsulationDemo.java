public class IncapsulationDemo {
    public static void main(String [] args){
       IncDemo Id1= new IncDemo();
       Id1.setName("Manish");
       System.out.println(Id1.getName());
    }


}
class IncDemo{
    private String Name;
    public void setName(String newName) {
        this.Name = newName;
    }
    public String getName(){
        return Name;
    }
}
