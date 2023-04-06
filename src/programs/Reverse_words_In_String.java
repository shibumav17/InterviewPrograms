package programs;

public class Reverse_words_In_String {
    public static void main(String[] args) {
        String s = "My name is Harshit";
        String a[] = s.split(" ");
        String str = "";

        /*for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }*/
        System.out.println(s);
        for(int i = a.length-1; i>=0;i--){
            str = str + a[i] + " ";
        }
        System.out.println(str);
    }
}
