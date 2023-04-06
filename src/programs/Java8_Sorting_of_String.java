package programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_Sorting_of_String {
    public static void main(String[] args) {
        List< String > fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Dragonfruit");
        fruits.add("Guava");
        fruits.add("CustordApple");

        //Ascending order
        List <String> sortedList = fruits.stream().sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList);

        //Descending order
        /*
        List < String > sortedList1 = fruits.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList1); */
    }
}
