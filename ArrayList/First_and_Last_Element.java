package ArrayList;

import java.util.Arrays;
import java.util.List;

public class First_and_Last_Element {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 44, 32, 67, 88, 9, 4, 90);

        int fist = numList.get(0);
        int last = numList.get(numList.size() - 1);

        System.out.println("First : " + fist + "\nLast : " + last);
    }
}
