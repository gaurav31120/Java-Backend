// import java.util.ArrayList;
import java.util.*;


public class List2 {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);

        int[] arr1 = {'a','b','c'};

        for(int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // Output
        // 1
        // 1
        // 1
        // 1
        // 1
    }
    
}
