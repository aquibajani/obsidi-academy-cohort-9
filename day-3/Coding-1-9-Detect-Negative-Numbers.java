// Import the Scanner library
import java.util.Scanner;

public class NegNumbers {
    public static void main(String[] args) {
    String result = "";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int userInput = scanner.nextInt();

    if(userInput > 0){
      result = "The number is positive.";
    } else if(userInput < 0){
      result = "The number is negative.";
    } else {
      result = "The number is equal to zero.";
    }

    System.out.println(result);
        
    }

}
