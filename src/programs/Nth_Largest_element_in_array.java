package programs;

 public class Nth_Largest_element_in_array {
    public static void main(String[] args) {
        int []a = {5,34,23,53,34,56,43};

        int n=2;

        for(int i = 0; i<a.length - 1; i++){
            for(int j = i+1; j<a.length; j++){
                int temp = 0;
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==n-1){
                System.out.println( n + " largest element is: " +a[i]);
                break;
            }
        }
    }
}
