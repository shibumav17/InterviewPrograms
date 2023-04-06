package programs;

public class Reverse_string {

    public static void main(String args[]) {

        String name= "Test";
        System.out.print("After reverse string is: ");
        int i = name.length();  //determining the length of the string
        while(i>0) {
            System.out.print(name.charAt(i-1));  //printing the character at index i-1
            i--;   //decreasing the length of the string
        }
    }
}

