package programs;

public class Missing_Number_In_Array {
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,5,7,8};
        int n = arr.length+1;

        int sum = (n*(n+1))/2;

        for(int i = 0 ; i<arr.length; i++){
            sum= sum - arr[i];
        }
        System.out.println("Missing Number is " + sum);
    }
}
