package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_Map_FlatMap {

    public static void main(String[] args) {
        // Map:
        List<Integer> number = Arrays.asList(12,7,9,13,11,6);
        System.out.println("List of numbers: " + number);
        List<Integer> obj = number.stream().map(s->s*s).collect(Collectors.toList());
        System.out.println(obj);

        //Flatmap:
        List<List<Integer>> number1 = new ArrayList<>();
        number1.add(Arrays.asList(1,2));
        number1.add(Arrays.asList(3,4));
        number1.add(Arrays.asList(5,6));
        System.out.println("List of numbers: " + number1);
        List<Integer> obj1 = number1.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
        System.out.println(obj1);

    }
}
