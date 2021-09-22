package collectionDemo;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class concurrentMapDemo {
    public static void main(String[] args) {

        ConcurrentMap<Integer,String> cm1= new ConcurrentHashMap<>();
        cm1.put(100,"aman");
        cm1.putIfAbsent(102,"Divyansh");
        cm1.putIfAbsent(103,"rahul");
        System.out.println(cm1);
        System.out.println(cm1.remove(100,"aman"));
        System.out.println(cm1.remove(102,"manish"));
        System.out.println(cm1.replace(102,"aman","amitesh"));
        System.out.println(cm1);
        System.out.println(cm1.replace(103,"rahul","Awanish"));
        System.out.println(cm1);

        System.out.println("*******************************************************************************");
        ConcurrentHashMap<Integer,String> chm= new ConcurrentHashMap<>();
        chm.put(100,"aman");
        chm.putIfAbsent(102,"Divyansh");
        chm.putIfAbsent(103,"rahul");
        System.out.println(chm);
        System.out.println(chm.remove(100,"aman"));
        System.out.println(chm.remove(102,"manish"));
        System.out.println(chm.replace(102,"aman","amitesh"));
        System.out.println(chm);
        System.out.println(chm.replace(103,"rahul","Awanish"));
        System.out.println(chm);


    }
}

