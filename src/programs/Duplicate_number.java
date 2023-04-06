package programs;

public class Duplicate_number {

    public static void main(String[] args) {
        Integer arr[]= {3, 9, 7, 6, 5, 3, 6};
        boolean value=false;

        for(int i=0; i< arr.length; i++){
            for(int j= i+1; j< arr.length; j++){
                if (arr[i].equals(arr[j])){
                    System.out.println("Duplicate element is : " +arr[i]);
                    value=true;
                }
            }
        }
        if(value==false){
            System.out.println("Duplicate element not found");
        }
    }
}
