import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetManipulation {

  public static void printSet(HashSet<String> set){
    // Iterator i = set.iterator();
    // while(i.hasNext()){
    //   System.out.println("Value: "+i.next());
    // }
    for(String s : set){
      System.out.println("Value: "+s);
    }
  }

	public static void main(String[] args) {
		// Create a HashSet and populate it with initial values
		HashSet<String> mySet = new HashSet<>();
    mySet.add("A");
    mySet.add("B");
    mySet.add("C");

		// Print the size of the set
		System.out.println("Set size: "+mySet.size());

		// Use for loop to print the values in the set
		printSet(mySet);

		// Use add() method to add a new value to the set
		mySet.add("D");
    System.out.println("Set after using add(): ");
    printSet(mySet);

		// Use remove() method to remove a value from the set
		mySet.remove("A");
     System.out.println("Set after using remove(): ");
    printSet(mySet);

		// Use contains() method to check if the value "C" exists in the set
		if(mySet.contains("C")){
      System.out.println("Value 'C' exists in the set.");
    }
	}
}