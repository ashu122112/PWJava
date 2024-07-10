import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class typesofHashMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Priya");
        map.put(2, "Raj");
        map.put(7, "Ritik");
        map.put(5, "nikhil");

        System.out.println("HashMap is : "+ map);

        //linkedhashmap : inserrion order is same here 
        LinkedHashMap<Integer,String> map1=new LinkedHashMap<>();
        map1.put(1,"Priya");
        map1.put(2, "Raj");
        map1.put(7, "Ritik");
        map1.put(5, "nikhil");

        System.out.println("LinkedHashMap is : "+ map1);

        //TreeMap : sorted order
        TreeMap<Integer,String> map2=new TreeMap<>();
        map2.put(1,"Priya");
        map2.put(2, "Raj");
        map2.put(7, "Ritik");
        map2.put(5, "nikhil");

        System.out.println("TreeMap is : "+ map);
    }
}
