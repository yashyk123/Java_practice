import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Day15 {
    public static void main(String[] args) {
        TreeMap<String,Integer> hm = new TreeMap<>();
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put("three", 3);
        hm.put("four", null);
        //hm.put(null, null);

        System.out.println(hm.entrySet());
        for(HashMap.Entry<String, Integer> a : hm.entrySet())
        {
            System.out.println("key " + a.getKey() +" value " + a.getValue());
    
        }
    }
}
