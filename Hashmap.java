import java.util.*;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("tony", 1);
        map.put("rony", 2);
        map.put("pony", 3);
        map.put("sony", 3);
        map.put("kony", 4);
        map.put("fony", 5);
        map.put("thony", 6);
        System.out.println(map);

        map.put("thony", 9);
        System.out.println(map);

        if(map.containsKey("pony"))
            {
            System.out.println("found");
            }
        else{
            System.out.println("not found");
            }

        System.out.println(map.get("thony"));
        for(Map.Entry<String, Integer>e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys= map.keySet();
        for(String key: keys)
        {
            System.out.println(key+" "+map.get(key));
        }
        System.out.println(map.size());
    
    }
    
}
