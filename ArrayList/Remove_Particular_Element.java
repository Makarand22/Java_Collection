package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Particular_Element {
    public static void main(String[] args) {
        //List<Integer> numList = Arrays.asList(1, 2, 4, 3, 2, 5, 6,32, 23, 5, 5);
        //Arrays.asList() returns a fixed-size list that does not support structural modifications

        List<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 4, 3, 2, 5, 6, 32, 23, 5, 5));

        numList.remove(2); //remove at index 2 -> 4

        numList.removeIf( num -> num == 5); // Use RemoveIf() function to remove particular element from all index

        System.out.println(numList);
    }
}
