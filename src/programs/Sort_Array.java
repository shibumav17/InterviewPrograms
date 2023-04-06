package programs;

public class Sort_Array {
    public static void main(String[] args) {
        int arr[] = {1,20,34,5,6,67,78,21,26};
        System.out.println("Array elements after sorting:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}

