package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArraylistUsingStream {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2 ,3 ,3, 23, 45,665,76,77,85,43,335,34,9,0));

        System.out.println("Arraylist before sorting: " + numList);

        List<Integer> sortedNums = numList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Array List After sorting: " + sortedNums);
//        sortedNums.forEach(System.out::println);
    }
}
