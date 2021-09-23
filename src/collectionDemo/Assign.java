package collectionDemo;

import org.jetbrains.annotations.Contract;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Assign {

    public static void main(String[] args) {

        Student s1 = new Student("aman",1);
        Student s2 = new Student("rahul",2);
        Student s3 = new Student("Divyansh",3);
        Student s4 = new Student("Sham",3);
        HashSet<Student> hs1= new HashSet<Student>();
        hs1.add(s1);
        hs1.add(s2);
        hs1.add(s3);
        hs1.add(s4);
        System.out.println(hs1.size());
//        Iterator<Student> iterator = hs1.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next().getId());
//            System.out.println(iterator.next().getName());
//        }
        for(Student st:hs1){
            System.out.println(st.getId()+" "+ st.getName());
        }
    }
}

class Student {
    String name;
     int id;
    Student(String name, Integer id){
        this.name= name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj)
    {
        return this.getId() == ((Student) obj).getId();
    }

    @Override
    public int hashCode()
    {
        return id;
    }

}
