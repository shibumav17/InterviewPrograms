package programs;

public class Count_Number_of_Words_In_String {

    public static void main(String[] args) {
        String s = "welcome to Pune";
        int count = 1;
        for (int i = 0; i<s.length() - 1; i++){
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')){
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }
}
