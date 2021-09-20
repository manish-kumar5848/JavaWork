package collectionDemo;
import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        set.remove("One");
        System.out.println("*************************************************************************************************************");
        Iterator<String> ii=set.iterator();
        while(ii.hasNext())
        {
            System.out.println(ii.next());
        }
        System.out.println("*************************************************************************************************************");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Two"));

        LinkedHashSet<String > LHS = new LinkedHashSet<>();
        LHS.add("Aman");
        LHS.add("ravi");
        System.out.println(LHS);
        LHS.add("Aman");
        System.out.println(LHS);
        System.out.println("*************************************************************************************************************");
        TreeSet<Integer> ts= new TreeSet<>();
        ts.add(85);
        ts.add(25);
        ts.add(19);
        ts.add(21);
        System.out.println(ts);
        System.out.println(ts.contains(19));
        System.out.println(ts.first());
        System.out.println(ts.last());

    }
}
