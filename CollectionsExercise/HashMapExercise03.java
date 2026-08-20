package CollectionsExercise;
import java.util.*;
import java.util.Map.Entry;


public class HashMapExercise03 {
    public static void main(String[] args) {
        
                HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(101, "srikanth");
        hashMap.put(102,"Nikhila");
        hashMap.put(103,"terli");

        hashMap.containsValue("terli");
        Collection <String> list = hashMap.values();
        System.out.println(list);

        Set<Map.Entry<Integer,String>> entries =  hashMap.entrySet();
        for(Map.Entry<Integer,String> entry : entries ){
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }
    }
}
