package Maps;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class A001Maps {

    public static void main(String[] args) {
        hashMapLearn();
        linkedHashMapLearn();
        treeMapLearn();
    }



    public static void hashMapLearn() {

        System.out.println("-- HashMap --");

        // Syntax
        Map<Integer, String> map = new HashMap<>();

        // Put (Add)
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(2, "JavaScript");   // Updates existing key

        System.out.println("Map : " + map);

        // Size
        System.out.println("Size : " + map.size());

        // Get
        System.out.println("Get(2) : " + map.get(2));

        // Contains Key
        System.out.println("ContainsKey(3) : " + map.containsKey(3));

        // Contains Value
        System.out.println("ContainsValue(Java) : " + map.containsValue("Java"));

        // Remove
        System.out.println("Remove(3) : " + map.remove(3));

        System.out.println("After Remove : " + map);

        // Keys
        System.out.println("Keys : " + map.keySet());

        // Values
        System.out.println("Values : " + map.values());

        // Entry Set
        System.out.println("EntrySet : " + map.entrySet());

        // Iteration
        System.out.println("Iteration");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Empty
        System.out.println("isEmpty : " + map.isEmpty());

        // Clear
        map.clear();

        System.out.println("After Clear : " + map);

        System.out.println();
    }



    public static void linkedHashMapLearn() {

        System.out.println("-- LinkedHashMap --");

        // Syntax
        Map<Integer, String> map = new LinkedHashMap<>();

        // Put
        map.put(3, "C++");
        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println("Map : " + map);

        // Get
        System.out.println("Get(1) : " + map.get(1));

        // Remove
        map.remove(2);

        System.out.println("After Remove : " + map);

        // Iteration
        System.out.println("Iteration");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
    }



    public static void treeMapLearn() {

        System.out.println("-- TreeMap --");

        // Syntax
        TreeMap<Integer, String> map = new TreeMap<>();

        // Put
        map.put(30, "C++");
        map.put(10, "Java");
        map.put(20, "Python");
        map.put(40, "JavaScript");

        System.out.println("Map : " + map);

        // First Key
        System.out.println("FirstKey : " + map.firstKey());

        // Last Key
        System.out.println("LastKey : " + map.lastKey());

        // Higher Key
        System.out.println("HigherKey(20) : " + map.higherKey(20));

        // Lower Key
        System.out.println("LowerKey(20) : " + map.lowerKey(20));

        // Ceiling Key
        System.out.println("CeilingKey(25) : " + map.ceilingKey(25));

        // Floor Key
        System.out.println("FloorKey(25) : " + map.floorKey(25));

        // Remove
        map.remove(20);

        System.out.println("After Remove : " + map);

        // Iteration
        System.out.println("Iteration");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
    }
}


//map.put(k,v);            // Insert
//map.get(k);              // Get value
//map.remove(k);           // Remove
//map.containsKey(k);      // Check key
//map.containsValue(v);    // Check value
//map.size();              // Size
//map.clear();             // Remove all
//map.keySet();            // Keys
//map.values();            // Values
//map.entrySet();          // Key-Value pairs