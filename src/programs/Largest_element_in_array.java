package programs;

import java.util.Scanner;

public class Largest_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array : ");

        int a[]= new int[7];
        int max;
        for(int i = 0 ; i < 7 ; i++){
            a[i]= sc.nextInt();
        }
        max=a[0];
        for (int i = 0 ; i < 7 ; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Maximum integer is: " +max);
    }
}

