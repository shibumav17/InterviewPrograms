package programs;

public class Palindrome_No {
    public static void main(String[] args) {

        int n = 121;
        int value = n;
        int sum = 0 ;

        while (n>0) {
            int rem = n % 10;
            sum = (sum*10)+rem;
            n = n/10;
        }
        if (value == sum){
            System.out.println("It is a palindrome no.  ");
        }
        else{
            System.out.println("It is not a palindrome no. ");
        }
    }
}