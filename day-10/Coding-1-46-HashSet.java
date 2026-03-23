import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class LinkedHashSetManipulation {

	public static void main(String[] args) {
		// Create a LinkedHashSet and populate it with the elements A, B and C.
    LinkedHashSet<String> set = new LinkedHashSet<>();
    set.add("A");
    set.add("B");
    set.add("C");

		// Print the size of the set
    System.out.println("Set size: " + set.size());

		// Use for each loop to print the elements in the set
		System.out.println("First Iteration");
    for(String s : set) {
      System.out.println(s);
    }

		// Use iterator to print the elements in the set
    System.out.println("Second Iteration");
		Iterator<String> iterator = set.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }

		// Use remove() method to remove the element A from the set
		set.remove("A");
    System.out.println("New set: "+set);
        
		// Use contains() method to check if the element B exists in the set
    if(set.contains("B")){
      System.out.println("Element B exists");
    } else {
      System.out.println("Element B does not exist");
    }

		// Use clear() method to remove all elements from the set
		set.clear();
    

        // Print the set to show that it is empty.
        System.out.println(set);
	}
}