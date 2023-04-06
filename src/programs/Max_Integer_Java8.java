package programs;

import java.util.*;
public class Max_Integer_Java8 {
    public static void main(String[] args) {
        //Create collections lists
        List<Integer> list = Arrays.asList(20, 10, 100, 140, 250);
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());

        //Integer max = Collections.max(list);
        System.out.println("Maximum element is: " +max);
    }
}

