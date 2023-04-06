package programs;

public class Frequency_of_element_A_in_array {

    public static void main(String[] args) {
        String name = "My name is Harshit Chandel";

        int totalcount = name.length();

        int totalcount_without_element_a = name.replace("a","").length();

        int result = totalcount - totalcount_without_element_a;

        System.out.println("frequency of element a :" +result);
    }
}
