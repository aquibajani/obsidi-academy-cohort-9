import java.util.Scanner;

public class PalindromeChecker {

   public static void main(String[] args) {
       System.out.println("Enter the string to check for palindrome: ");
       Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();
       String reverseInput = "";
      //  String reverseInput2 = new StringBuilder(input).reverse().toString();
      //  System.out.println(reverseInput2);
      
       // Fill in the code below to reverse the input string and store it in the reverseInput variable
       for(int i=input.length()-1; i>=0; i--){
        reverseInput = reverseInput + input.charAt(i);
       }

       if(input.equals(reverseInput)){
        System.out.println("Input string is palindrome");
       } else {
        System.out.println("Input string is not palindrome");
       }
       // Write the code below to display "Input string is palindrome" or "Input string is not palindrome". 
       //Note: you'll have to write the logic to make that decision, as well.

      
   }
}
