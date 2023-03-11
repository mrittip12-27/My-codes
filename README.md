import java.util.ArrayList;
import java.util.Collections;

public class Arlst {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(38);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);

        list.remove(4);
        System.out.println("after delete list is-  "+list);
        System.out.println(list.get(4));

        list.set(4, 7);
        System.out.println(" after changing a number of list- "+list);
        list.add(8);
        System.out.println(" after adding a number to list- "+list);

        System.out.println(list.get(4));
        
        Collections.sort(list);
        System.out.println("sorted list "+list);                                                                                                  

    }
    
}
