
package collectionDemo;
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String > ll = new LinkedList<>();
        ll.add("Ram");
        ll.add("Shyam");
        ll.add("Ravi");
        ll.add(1, "Gaurav");
        System.out.println(ll);
        ll.remove("Ravi");
        System.out.println(ll);
        Iterator<String> it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
