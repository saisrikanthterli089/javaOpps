package CollectionsExercise;

import java.util.HashMap;

public class HashMapExercise01 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(101,"srikanth");
        hashMap.put(109,"Terli");
        hashMap.put(108,"sai");
        hashMap.put(908,"Nikhila");
        hashMap.put(111,"shero");
        hashMap.put(112,"piku");

        hashMap.entrySet().stream().map(e -> e.getValue().toUpperCase()).peek(e->System.out.println(e)).forEach(e->System.out.println(e));
    }
}
