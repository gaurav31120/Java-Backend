import java.util.*;

public class MapAndOptional { 
 
    public static void main(String[] args) {
        // Important --Map, List, Set, Immutable Types
        
        List<Integer> arr = new ArrayList<>();
        Map<String, Integer> marks = new HashMap<>();
        // HashMap children hai Map ka
        // Map is key, value pair

        marks.put("rahul", 100);
        marks.put("simmy", 200);

        for(Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("------------");
        }

        // System.out.println(marks.get("rohit")>10); // Null pointer exception
        Optional<Integer> marksOfRohit = Optional.ofNullable(marks.get("rohit"));
        if(marksOfRohit.isPresent()) {
            //
        }
        else {
            System.out.println("I am not present");
        }
    }

    // Optional -- Container is used to remove null pointer exception.
    
}
