import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MyThread extends Thread {

    // Declare an instance variable of type List<Integer>
    List<Integer> list = new ArrayList<Integer>();

    // Create a parameterized constructor.
    MyThread(String name, List<Integer> list){
      super(name);
      this.list = list;
    }

    // Override the run() method here.   
    @Override
    public void run(){  
      ListUtils.insertNextId(this.list);
    }
}