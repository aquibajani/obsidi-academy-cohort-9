import java.util.Scanner;

public class IntegerOperations {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = 0, positiveCount = 0, negativeCount = 0, evenCount = 0, oddCount = 0, count = 0;
    double average = 0.00, total = 0.00;

    System.out.print("Enter the first integer(0 to terminate): ");
    userInput = scanner.nextInt();

    if(userInput == 0){
      System.out.println("No numbers are entered except 0.");
    } else {
        while(userInput!=0){
          
          count++;
          //calculations
          if(userInput > 0){
            positiveCount++;
          } else {
            negativeCount++;
          }

          if(userInput % 2 == 0){
            evenCount++;
          } else {
            oddCount++;
          }

          total = total + userInput;
          average = total / count;

          System.out.print("Enter the next integer(0 to terminate): ");
          userInput = scanner.nextInt();
        }

         System.out.println("The number of positives is " + positiveCount +".");
         System.out.println("The number of negatives is " + negativeCount +".");
         System.out.println("The number of evens is " + evenCount +".");
         System.out.println("The number of odds is " + oddCount +".");
         System.out.println("The total is " + (int) total +".");
         System.out.printf("The average is %.2f.\n", average);

      }
		
	}

}
