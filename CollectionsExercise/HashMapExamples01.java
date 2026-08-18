package CollectionsExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Set;

public class HashMapExamples01 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(102,"hello world");
        hashmap.put(102, "John");
        hashmap.put(103, "David");
        hashmap.put(104, "Sam");
        hashmap.put(105, "Steve");
        hashmap.put(106, "Anu");


      
        // for(Map.Entry<Integer,String> entry:hashmap.entrySet()){
        //     System.out.println(entry.getKey());
        // }
        System.out.println("keys in hashmap : " +hashmap.keySet());
        System.out.println("values in hashMap : "+hashmap.values());

       HashMap<Integer,String> result= hashmap.entrySet().stream()
        .filter(e ->e.getValue().equals("John"))
        .peek((Map.Entry<Integer,String> entry)->System.out.println(entry.getValue()))
        .map( entry->Map.Entry<Integer,String>(entry.getkey(),entry.getValue().toUpperCase()))
        .collect(Collectors.toMap((Map.Entry<Integer,String> entry)-> entry.getKey(),(Map.Entry<Integer,String> entry)->entry.getValue()));
        
    }
}
