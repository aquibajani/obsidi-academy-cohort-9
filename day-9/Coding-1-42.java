import java.util.LinkedList;

public class BrowserHistoryManager {
    public static void main(String[] args) {
        // 1. Create a LinkedList for history
        LinkedList<String> history = new LinkedList<>();

        // 2. Visit Pages (Add to end/tail)
        history.addLast("homepage.com");  
        history.addLast("products.com");
        history.addLast("aboutus.com");

        // 3. Go Back (Remove Last/Tail)
        System.out.println("User went back from: "+history.removeLast());

        // 4. Visit a New Page
        history.addLast("sales.com");

        // 5. View Current History
        System.out.print("Current History: "+ history);

    }
}
