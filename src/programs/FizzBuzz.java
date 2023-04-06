package programs;

public class FizzBuzz {
    public static void main(String[]args ) {
        // Write your code here , inherit int n =15;
        int n = 15;
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                System.out.println("FizzBuzz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(i);

        }

    }}