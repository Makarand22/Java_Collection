package ArrayList;

import java.util.*;

public class Remove_Repeated_Elements {
    public static void main(String[] args) {
        List<String > nameList = Arrays.asList("Ram", "shyam", "Amol", "John", "shyam", "Amol");

//        Convert the ArrayList to Set
//        Now convert the Set back to ArrayList. This will remove all the repeated elements

        // HashSet does not main the insertion order
        // Faster due to hashing - O(1) for add, remove, and contains in average case
        Set <String> newSet = new HashSet<>(nameList);
        List<String> filteredList = new ArrayList<>(newSet);
        System.out.println("Using HashMap : "+filteredList);

        // Slightly slower than HashSet due to maintaining a linked list for ordering
        // Uses a LinkedHashMap internally, which maintains a doubly linked list for order.
        Set <String> newSet2 = new LinkedHashSet<>(nameList);
        List<String> filteredList2 = new ArrayList<>(newSet2);
        System.out.println("Using LinkedHashSet : "+ filteredList2);

    }
}
