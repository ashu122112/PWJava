import java.util.HashMap;
import java.util.Map;

public class hashMapfunction {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        
        //functionality of put function 
        hashmap.put(1, "Priya");
        hashmap.put(2,"Rohan");
        hashmap.put(3, "Bhoomi");
        hashmap.put(6, "rohi");

        System.out.println("Hashmap of given data : "+ hashmap);

        //functionality of get function
        String result=hashmap.get(3);
        System.out.println("The value at key 3 is "+result);

        //functionality of containsKey function
        System.out.println(hashmap.containsKey(5));

        //functionality of remove func
        hashmap.remove(6);
        System.out.println("Updated Hashmap: " + hashmap);

        //iteration over the loop
        for (Map.Entry<Integer,String> e:hashmap.entrySet()){
            System.out.println("Hashmap is :");
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
