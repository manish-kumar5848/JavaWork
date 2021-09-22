package collectionDemo;
import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String > st = new HashMap<>();
        st.put(1,"Ram");
        st.put(2,"Shyam");
        st.put(3,"Aman");
        st.put(4,"Divyansh");
        System.out.println(st.keySet());
        System.out.println(st.remove(2,"Shyam"));
        System.out.println(st.containsKey(1));
        System.out.println(st.containsValue("Divyansh"));
        System.out.println(st.get(3));
        Set sm= st.entrySet(); // converting to set
        Iterator it = sm.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();//Converting to Map.Entry so that we can get key and value separate
            System.out.println(entry.getKey()+ "==" + entry.getValue());
        }
        System.out.println(st.entrySet()); // return a collection view of the mappings contained in this map
        st.replace(3,"Suman");
        System.out.println(st.entrySet());
        System.out.println("*********************************************************************************************************");
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(15,"Harshit");
        lhm.put(32,"Piyush");
        lhm.put(43,"Manish");
        lhm.put(54,"Alok");
         Set lhms= lhm.entrySet();
        Iterator ii= lhms.iterator();
        while (ii.hasNext()){
            Map.Entry kv= (Map.Entry)ii.next();
            System.out.println(kv.getKey() +"="+ kv.getValue() );
        }
        System.out.println("************************************************************************************");
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        System.out.println(map.putIfAbsent(100,"Amit"));
        map.putIfAbsent(104,"Awanish");
        System.out.println(map.entrySet());
        System.out.println(map.ceilingEntry(103));
        System.out.println(map.firstKey());
        System.out.println(map.headMap(102));


    }
}

