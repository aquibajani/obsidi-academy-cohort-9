import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;
        int attempts = 0;
        int pin;
        boolean accessGranted = false;

        Scanner scanner = new Scanner(System.in);
        /*  

        initilization;
        do {
          // loop body
          // updation
        } while(condition);

        */

       do {
            System.out.print("Enter your 4-digit PIN: ");
            pin = scanner.nextInt();

            if (pin == CORRECT_PIN) {
                accessGranted = true;
                System.out.println("Access granted. Welcome!");
                break;
            } else {
              attempts++;
              if (attempts < 3) {
                 System.out.println("Incorrect PIN. Try again.");
              } else {
                System.out.println("Incorrect PIN. Account locked.");
              }
            }
        } while (attempts < 3);
        
        scanner.close();
    }
}