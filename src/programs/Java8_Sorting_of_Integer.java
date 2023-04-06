package programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_Sorting_of_Integer {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 23, -4, 0, 18);

        //Ascending order
        /*
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        System.out.println(list);
        System.out.println(sortedList);  */

        //Descending order:
        List<Integer> sortedList = list.stream().sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedList);

    }
}


