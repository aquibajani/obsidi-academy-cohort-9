import java.util.HashMap;
import java.util.Map;

public class HashMapManipulation {
	public static void main(String[] args) {
		// Create a HashMap and populate it with initial key-value pairs
		HashMap<String, Integer> myMap = new HashMap<>();
    myMap.put("A", 1);
    myMap.put("B", 2);
    myMap.put("C", 3);

		// Print the size of the map
		System.out.println("Map size: "+myMap.size());

		// Use a for-each loop to print the key-value pairs in the map
		// System.out.println(myMap);
    // System.out.println(myMap.keySet());
    // System.out.println(myMap.values());
    // System.out.println(myMap.entrySet());
    for(Map.Entry<String,Integer> e : myMap.entrySet()){
      System.out.println("Key: "+e.getKey()+", Value: "+e.getValue());
    }

		// Use get() method to get the value of key "A"
    System.out.println("Value of key 'A': "+myMap.get("A"));

    // use put() method to add a new key-value pair to the map
		myMap.put("D",4);
    System.out.println("Map after adding a new key-value pair: ");
    for(Map.Entry<String,Integer> e : myMap.entrySet()){
      System.out.println("Key: "+e.getKey()+", Value: "+e.getValue());
    }

		// Use the containsKey() method to check if the key "C" exists in the map
		if(myMap.containsKey("C")){
      System.out.println("Key 'C' exists in the map");
    }

	}
}