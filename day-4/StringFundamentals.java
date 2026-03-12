public class StringTest {
   public static void main(String[] args) {
     String greeting = "Hello";
    //  greeting[0] = 'H';
    //  greeting[1] = 'e';
    //  greeting[2] = 'l';
    //  greeting[3] = 'l';
    //  greeting[4] = 'o';
    //  greeting[5] = '\0';

    //  char[] letters = new char[5];
    //  char[0] = 'H';
    //  char[1] = 'e';
    //  char[2] = 'l';
    //  char[3] = 'l';
    //  char[4] = 'o';

    //  int[] numbers = new int[5];
    //  int[] numbers = {1,2,3,4};

     // This code gets the class of the greeting object
     Class currClass = greeting.getClass();
     System.out.println(currClass);

     // This code gets the parent class for the child class
     Class parentClass = currClass.getSuperclass();
     System.out.println(parentClass);
   }
}
