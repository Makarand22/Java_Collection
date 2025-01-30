package ArrayList;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_to_ArrayList {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.of(1, 2, 3, 4, 5, 6, 6, 6, 7, 4, 3);

        //System.out.println("Stream : " + numStream);
        //numStream.forEach(System.out::print);

        ArrayList<Integer>
                arrayList = new ArrayList<>(numStream.collect(Collectors.toList()));

        System.out.println("ArrayList : "+arrayList);
    }


}
