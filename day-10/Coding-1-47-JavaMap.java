import java.util.*;
public class MapDemo {

    public static void main(String[] args) {
      // Create a HashMap object
      HashMap<Integer, String> numbers= new HashMap<>();

      // Add key-value pairs to the map
      numbers.put(1, "one");
      numbers.put(2, "two");
      numbers.put(3, "three");
      numbers.put(4, "four");
      numbers.put(5, "five");
      numbers.put(6, "six");
      numbers.put(7, "seven");
      numbers.put(8, "eight");
      numbers.put(9, "nine");
      numbers.put(10, "ten");

      // Print the generated map object with keys and values
      printMap(numbers);

      // remove the entry with the key of 7
      numbers.remove(7);

      // add new key-value pair of 11 and eleven
      numbers.put(11, "eleven");

      // Print the generated map object with keys and values
      printMap(numbers);
    }

    public static void printMap(HashMap<Integer, String> map){
      // Loop through the Map 
      for (Integer i : map.keySet()) {
        // Print out the key and value
        System.out.println(i + " : " + map.get(i));
      }
    }
}