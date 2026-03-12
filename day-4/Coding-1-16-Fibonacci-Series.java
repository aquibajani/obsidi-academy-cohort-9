public class Fibonacci {
    public static void main(String[] args) {

        // Predefined numbers to start off the Fibonacci series:
        int num1 = 0; int num2 = 1;
        int[] fibonacci = new int[10];

        fibonacci[0]=0;
        fibonacci[1]=1;

        for(int i=2; i<10; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            // fibonacci[2] = fibonacci[1] + fibonacci[0] = 1+0 = 1
            // fibonacci[3] = fibonacci[2] + fibonacci[1] = 1+1 = 2
            // fibonacci[4] = fibonacci[3] + fibonacci[2] = 2+1 = 3
            // ...
            // ...
            // fibonacci[9] = fibonacci[8] + fibonacci[7] = 21+13 = 34
        }

        // print the array
        for(int i=0; i<10; i++){
          System.out.print(fibonacci[i]+",");
        }
        
    }
}