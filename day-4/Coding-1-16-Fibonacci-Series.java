import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want? : ");
        int userCount = scanner.nextInt();
        // Predefined numbers to start off the Fibonacci series:
        int num1 = 0; int num2 = 1;
        int[] fibonacci = new int[userCount];

        fibonacci[0]=0;
        fibonacci[1]=1;

        for(int i=2; i<userCount; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            // fibonacci[2] = fibonacci[1] + fibonacci[0] = 1+0 = 1
            // fibonacci[3] = fibonacci[2] + fibonacci[1] = 1+1 = 2
            // fibonacci[4] = fibonacci[3] + fibonacci[2] = 2+1 = 3
            // ...
            // ...
            // fibonacci[9] = fibonacci[8] + fibonacci[7] = 21+13 = 34
        }

        // print the array
        for(int i=0; i<userCount; i++){
          System.out.print(fibonacci[i]);
          if(i==userCount-1){
            continue;
          } else {
            System.out.print(",");
          }
        }
        
    }
}