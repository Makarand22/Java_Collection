package ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 6, 6, 7, 3, 4, 5);

        System.out.println("Array List with duplicates : " + list);

        List<Integer> newList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        newList.forEach(System.out::println);

    }
}
