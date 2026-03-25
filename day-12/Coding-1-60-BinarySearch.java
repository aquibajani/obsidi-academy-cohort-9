import java.util.ArrayList;

public class BinarySearch {
  // Function to perform binary search on ArrayList
  public static int binarySearch(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == target) {
                return mid; // Element found, return its index
            }

            if (list.get(mid) < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }

        return -1; // Element not found in the ArrayList
    }

  
  // FREEZE CODE BEGIN
//Do not modify below code
  public static void main(String[] args) {
    // Create an ArrayList of integers
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    
    // Key to be searched
    int key = 4;
    // Perform binary search on the ArrayList
    int result = binarySearch(list, key);
    // Print the result
    if (result == -1) {
      System.out.println("Element not present in the list");
    } else {
      System.out.println("Element found at index " + result);
    }
  }
  // FREEZE CODE END
}
