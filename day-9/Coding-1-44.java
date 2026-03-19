import java.util.LinkedList;

public class GameInventoryManager {
    public static void main(String[] args) {
        // 1. Create and populate the inventory
        LinkedList<String> inventory = new LinkedList<String>();
        inventory.addLast("Sword");
        inventory.addLast("Potion (Common)");
        inventory.addLast("Shield");
        inventory.addLast("Coin Bag (Common)");
        inventory.addLast("Axe");

        // 2. Search for Insertion Point
        int common = inventory.indexOf("Potion (Common)");
        System.out.println("First Common Item Index: " + common);

        
 
        // 3. Insert Rare Item after the common item
        inventory.add(common+1, "Dragon Scale Armor (Rare)");

        // 4. Discard Item (Note: Index 3 after insertion is "Shield")
        inventory.remove(3);
        System.out.println("Item removed: " + inventory.remove(3));
        // 5. Final Inventory
        System.out.println("Final Inventory Size: " + inventory.size());
        System.out.println("Final Inventory: " + inventory);
        System.out.println(inventory);
    }
}