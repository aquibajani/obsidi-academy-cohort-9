import java.util.Scanner;

public class IntegerOperations {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = 0, positiveCount = 0, negativeCount = 0, evenCount = 0, oddCount = 0, total = 0, count = 0;
    double average = 0.00;

    System.out.println("Enter the first integer(0 to terminate): ");
    userInput = scanner.nextInt();

    if(userInput == 0){
      System.out.println("No numbers are entered except 0.");
    } else {
        while(userInput!=0){
          System.out.println("Enter the next integer(0 to terminate): ");
          userInput = scanner.nextInt();
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
        }

         System.out.println("The number of positives is " + positiveCount);
         System.out.println("The number of negatives is " + negativeCount);
         System.out.println("The number of evens is " + evenCount);
         System.out.println("The number of odds is " + oddCount);
         System.out.println("The total is " + total);
         System.out.println("The average is " + average);

      }
		
	}

}
