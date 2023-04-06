package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge_Two_List_ {
    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(4, 6, 5, 3));

        ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(7, 3, 8, 5, 9, 10));

        List<Integer> combinedList = Stream.of(listOne, listTwo).flatMap(x -> x.stream())
                .sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        System.out.println(combinedList);
    }

}
