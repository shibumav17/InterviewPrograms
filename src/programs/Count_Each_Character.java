package programs;
import java.util.HashMap;
import java.util.Map;

public class Count_Each_Character {
    static void characterCount(String inputString) {
        // Creating a HashMap containing char as a key and occurrences as  a value
        HashMap <Character,Integer> charCountMap = new HashMap<>();
        // Converting given string to char array
        char[] string = inputString.toCharArray();
        // checking each char of string
        for (char c : string) {
            if (charCountMap.containsKey(c)) {
                // If char is present in charCountMap,incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                //If char is not present in charCountMap,putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }}
        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }}
    // Driver Code
    public static void main(String[] args) {
        String str = "abbbcccd";
        characterCount(str);
    }}

