package programs;

public class Armstrong_Number {

    public static void main(String[] args) {

        int n = 111;
        int value = n;
        int sum = 0;

        while(n>0) {
            int r = n % 10;
            sum = (r * r * r) + sum;
            n = n / 10;
        }
        if (value==sum) {
            System.out.println("Armstrong no.");
        }
        else{
            System.out.println("NOt Armstrong no.");
        }
    }
}
