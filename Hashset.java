import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); 
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(4);
        System.out.println(set);


        set.remove(4);
        System.out.println(set);


        if(set.contains(2))
        {
            System.out.println("found");
        }
            else{
                System.out.println("notfound");
            }


            Iterator it = set.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
    }
    
}
