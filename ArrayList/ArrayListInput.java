package ArrayList;

import java.util.ArrayList;

public class ArrayListInput {
    public static void main(String[] args) {
        ArrayList<String> colour_list = new ArrayList<>();
        colour_list.add("Red");
        colour_list.add("Yellow");
        colour_list.add("Blue");
        colour_list.add(0,"Pink");  // Insert element at particular position

        System.out.println("Colour List : " + colour_list );
    }
}
