package programs;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Iteration {
    public static void main(String[] args) {
        //Iterating HashMap through for-each loop:

        HashMap<Integer, String> map = new HashMap<Integer,String>();
        map.put(1,"Harshit");
        map.put(2,"Mukul");
        map.put(3,"Rajat");

        for(Map.Entry<Integer,String> obj: map.entrySet()){
            System.out.println(obj.getKey()+ ": " +obj.getValue());
        }
    }
}
