package CollectionsExercise;

import java.util.ArrayList;
import java.util.List;

public class ListExercise01 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(89);
        list.add(99);
        list.add(89);
        System.out.println("main list is : "+list);
       System.out.println(list.get(2));
       System.out.println(list.indexOf(89));
    }
}
