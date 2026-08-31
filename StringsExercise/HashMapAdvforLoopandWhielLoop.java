package StringsExercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapAdvforLoopandWhielLoop {

    public static void main(String[] args) {
        
        HashMap<Integer,String> HashMap = new HashMap<>();
        HashMap.put(101, "srikanth");
        HashMap.put(102,"terli");
        HashMap.put(104,"sai");

        Iterator<Map.Entry<Integer,String>>  entries = HashMap.entrySet().iterator();

        while(entries.hasNext()){
            Map.Entry<Integer,String> entry = entries.next();

            System.out.println(entry.getKey() +" : "+entry.getValue());
        }

        for (Map.Entry<Integer,String> entriesdata : HashMap.entrySet()) {
            System.out.println(entriesdata.getKey() +" : "+entriesdata.getValue());
        }
    }
}
