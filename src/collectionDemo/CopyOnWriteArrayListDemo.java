package collectionDemo;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> cowal= new CopyOnWriteArrayList<>();
        cowal.addIfAbsent(2);
        cowal.addIfAbsent(3);
        cowal.addIfAbsent(4);
        cowal.addIfAbsent(5);
        cowal.addIfAbsent(6);
        cowal.addIfAbsent(7);
        ArrayList<Integer> al=new ArrayList<>();
        al.add(5);
        al.add(9);
        al.add(10);
        al.add(7);
        al.add(11);
        System.out.println(cowal.addAllAbsent(al));//return number of item inserted
        System.out.println(cowal);
        try {
            Iterator<Integer> iterator = cowal.iterator();
            while(iterator.hasNext()) {
                iterator.remove();
            }
        }catch(UnsupportedOperationException e) {
            System.out.println("Method not supported:");// we can't remove items from CopyOnWriteArrayList.
        }
        System.out.println("******************************************************************************************8");
        CopyOnWriteArraySet<String> s1 = new CopyOnWriteArraySet<>();
        // it has no specific method as available in CopyOnWriteArraySet.
        //it has all method that are available in set  it just provide concurrency control.
        s1.add("A");
        s1.add("B");
        s1.add("C");
        System.out.println(s1);
        List<String> s2= new ArrayList<>();
        s2.add("A");
        s2.add("D");
        s2.add("E");
        System.out.println(s1.addAll(s2));// return Boolean value
        System.out.println(s1);

        try {
           Iterator<String> it= s1.iterator();
            while (it.hasNext()){
                it.remove();
            }

        }catch(UnsupportedOperationException e){
            System.out.println(e);
            System.out.println("Unsupported Method");
        }




    }
}
