package programs;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        /*System.out.println("Enter a no. till which you want the fibonacci series ");
        Scanner sc = new Scanner(System.in); */
        int term = 13; //sc.nextInt();
        int a=0;
        int b = 1;
        int c;

        for(int i = 1; i<=term; i++){
            System.out.print( a + " ");
            c = a+b;
            a = b;
            b = c;
        }
    }
}
