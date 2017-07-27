import java.util.*;

/**
 * Created by ibm on 7/27/2017.
 */
import java.util.HashMap;
import java.util.stream.Collectors;

public class HashMapTest  {
public static void main(String[] args) {
    HashMap<Integer, String> kvHashMap = new HashMap<Integer, String>();
    kvHashMap.put(100, "Mani");
    kvHashMap.put(200, "Maddy");
    kvHashMap.put(300, "singapore");
    for (HashMap.Entry m : kvHashMap.entrySet()) {
        System.out.println(m.getKey() + " " + m.getValue());
    }

    String Many= "Mannnnnnnnnnnn";
    System.out.println("String Many-------"+Many);

    for(HashMap.Entry k: kvHashMap.entrySet()) {
        k.setValue(Many);
    }

    for(HashMap.Entry m : kvHashMap.entrySet()){
        System.out.println(m.getKey() +" "+m.getValue());
    }
}
}
