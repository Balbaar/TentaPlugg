import java.util.*;

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
        map.put("c", 4);

        //Gets all the values and keys
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
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

        //Example of StringBuilders
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");


        //Small example of Set<String>
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("b");
        set.add("c");

        //Prints out the set
        System.out.println(set);
        //Checks if the set contains a value
        System.out.println(set.contains("a"));

        String str = "ABCBA";
        String str2 = "ABCCBA";

        Character c = 'A';

    }
}