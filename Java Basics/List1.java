import java.util.ArrayList;
import java.util.List;

public class List1 {

    public static void main(String[] args) {
        
        List<String> arr = new ArrayList<>(); //define
        int[] arr1 = {1,2,3};
        char[] arr2 = {'a','b','c'};

        for(int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        // output: 
        // 1
        // 2
        // 3
        // a
        // b
        // c
    }
}