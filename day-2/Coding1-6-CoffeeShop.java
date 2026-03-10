import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        String drink = "";
        double price = 0.0;
        System.out.println("\nWelcome to JavaBean Café!");
        System.out.println("Please select a drink:");
        // Display the menu
        System.out.println("\n1. Espresso - $3.00\n2. Chai Latte - $4.50\n3. Cappuccino - $4.00\n4. Cappuccino - $4.00\n5. Matcha - $4.75");
        System.out.print("Enter your choice (1-5): ");
        // Prompt the user to enter the number
        choice = scanner.nextInt();
        // Switch Logic
        switch(choice){
          case 1:
              drink = "Espresso";
              price = 3.00;
              break;
          case 2:
              drink = "Chai Latte";
              price = 4.50;
              break;
          case 3:
              drink = "Cappuccino";
              price = 4.00;
              break;
          case 4:
              drink = "Americano";
              price = 3.50;
              break;
          case 5:
              drink = "Matcha";
              price = 4.75;
              break;
          default:
              System.out.println("Invalid Input!");
        }

        if(choice>=1 && choice<=5){
          System.out.printf("You selected %s. Price: $%.2f%n", drink, price);
          System.out.println("Thank you for your order!");    
        }
        
        scanner.close();
    }
}