import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    //easy example of hashmaps
    public static void main(String[] args) {
        //create a hashmap
        Map<String, Integer> map = new HashMap<>();
        //add elements to the hashmap
        map.put("a", 1);
        map.put("b", 2);
        map.put("b", map.get("b") + 1);
        map.put("c", 3);

        //Gets all the values and keys
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }


        //print the hashmap
        System.out.println(map);
        //get the value of a key
        System.out.println(map.get("a"));
        //remove a key
        map.remove("a");
        //print the hashmap
        System.out.println(map);
        //check if the hashmap contains a key
        System.out.println(map.containsKey("b"));
        //check if the hashmap contains a value
        System.out.println(map.containsValue(3));
        //get the size of the hashmap
        System.out.println(map.size());
        //clear the hashmap
        map.clear();
        //print the hashmap
        System.out.println(map);
    }
}