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
        map.put(30, "C++");
        map.put(10, "Java");
        map.put(20, "Python");
        map.put(40, "JavaScript");   // Updates existing key
        map.put(20, "snake");

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
        map.put(30, "C++");
        map.put(10, "Java");
        map.put(20, "Python");
        map.put(40, "JavaScript");
        map.put(20, "snake");

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
        map.put(20, "snake");

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



/*
        |                    | `HashMap`              | `LinkedHashMap`               | `TreeMap`        |
        | ------------------ | ---------------------  | ----------------------------  | ---------------  |
        | Ordering           | No guaranteed order    | Insertion order               | Sorted order     |
        | Typical speed      | Very fast              | Very fast                     | Slower           |
        | `get()` / `put()`  | ~ O(1)                 | ~ O(1)                        | ~ O(log n)       |
        | Allows 1 null key  | ✅                     | ✅                            | Not generally    |
        | Allows null values | ✅                     | ✅                            | ✅               |
        | Main idea          | Fast                   | Remember insertion order      | Keep sorted       |


        TreeMap exception (sorts on basis of keys [There is no natural ordering for null] [hence null not aloud])
        You can make a TreeMap accept a null key if you provide a Comparator that knows how to handle null:

        TreeMap<Integer, String> map =
                new TreeMap<>(java.util.Comparator.nullsFirst(
                        java.util.Comparator.naturalOrder()
                ));

        map.put(null, "X");
        map.put(10, "A");
        map.put(20, "B");

        System.out.println(map);
*/