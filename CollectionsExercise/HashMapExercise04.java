package CollectionsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapExercise04 {
    public static void main(String[] args) {
           HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(102,"hello world");
        hashmap.put(102, "John");
        hashmap.put(103, "David");
        hashmap.put(104, "Sam");
        hashmap.put(105, "Steve");
        hashmap.put(106, "Anu");
    
        Map<Integer,String> mapresult=hashmap.entrySet()
        .stream()
        .filter(e->e.getValue().startsWith("S"))
        .collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
        System.out.println(mapresult);
    }
}
