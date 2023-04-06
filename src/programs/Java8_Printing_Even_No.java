package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_Printing_Even_No {

    public static void main(String[] args) {
        List<Integer> sc = Arrays.asList(2,3,4,5,6,7,8,9,10);

        List<Integer> list1 = sc.stream().filter(i-> i%2 ==0).collect(Collectors.toList());
        System.out.println(list1);

        List<Integer> list2 = sc.stream().filter(i -> i>4).collect(Collectors.toList());
        System.out.println(list2);
    }
}
