import java.util.ArrayList;

public class ArrayListModification {
    public static void main(String[] args) {
        // Create an ArrayList
         ArrayList<String> languages = new ArrayList<>();
         
        // Add elements to the ArrayList
        languages.add("java");
         languages.add("javascript");
         languages.add("swift");
         languages.add("python");


        // Print the original ArrayList using forEach and a lambda
        System.out.println("Original ArrayList:");
        // for(String s:languages){
        //   System.out.println(s);
        // }    
        forEach(s->System.out.println(s));    

        // Modify all elements to uppercase using replaceAll()
        languages.replaceAll(s -> s.toUpperCase());

        
        System.out.println("\nUpdated ArrayList:");
         // Print the updated ArrayList using forEach and a lambda
         forEach(s->System.out.println(s));

    }
}
