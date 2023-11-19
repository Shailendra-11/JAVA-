import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class imple_hashmap {
    static void HashMap() {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Akash",78 );
        mp.put("Rahul",12 );
        mp.put("Riya", 78);
        System.out.println(mp.get("Akash"));
        mp.put("Akash", 25);
        System.out.println(mp.get("Rahul"));
        System.out.println(mp.get("Akash"));
        // mp.remove("Rahul");
        System.out.println(mp.containsKey("Rahul"));
        System.out.println(mp.containsKey("Akash"));
        mp.putIfAbsent("Riya", 56);
        mp.putIfAbsent("shail", 45);
        System.out.println(mp.keySet());
        // get all values in the hashmap
        System.out.println(mp.values());
        // Get all entries in the Hashmap
        System.out.println(mp.entrySet());
       for (String key: mp.keySet()) {
            System.out.printf("Age of %s is %d\n" , key, mp.get(key));
            
       }
       System.out.println();
       for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n" ,e.getKey(), e.getValue());
       } 
    }

    public static void main(String[] args) {
        HashMap();
    }
}