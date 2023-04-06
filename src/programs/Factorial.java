package programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       /* System.out.println("Enter any number:");
           Scanner sc= new Scanner(System.in); */
    int n=5; // sc.next();
    int factorial=1;

    for(int i=n; i>0; i--){
        factorial=factorial*i;
    }
        System.out.println("Factorial is : "+factorial);
    }

}
