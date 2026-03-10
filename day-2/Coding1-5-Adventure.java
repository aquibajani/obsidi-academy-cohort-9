import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // escapse sequences
        System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");

        // Add else-ifs for s, e, w - comment
        String command = scan.nextLine();
        if (command.equals("n")) {
            System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
        } else if(command.equals("e")) {
            System.out.println("You are \t now entering the beach shack!");
        } else if(command.equals("s")) {
            System.out.println("You are now at the sea!");
        } else if(command.equals("w")) {
            System.out.println("You are now headed west!");
        } else {
          System.out.println("End of adventure!");
        }
        
        System.out.print("\nEnd of adventure!");   
        scan.close();
    }
}