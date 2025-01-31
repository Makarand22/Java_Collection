package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compare_Two_ArrayList {
    public static void main(String[] args) {
        List<String> firstList = Arrays.asList("Red", "Yellow", "Pink", "Black", "Brown", "Grey");
        List<String> secondList = Arrays.asList("Red", "Yellow", "Grey");

        List<String> compareadList = new ArrayList<>();
        for (String element : firstList) {
            compareadList.add(secondList.contains(element) ? "Yes" : "No");
        }
        System.out.println(compareadList);
    }
}
