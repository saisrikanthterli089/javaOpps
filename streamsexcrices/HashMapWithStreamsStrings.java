package streamsexcrices;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapWithStreamsStrings{
    public static void main(String[] args) {
        String s = "Hello World What are you doing";

        String a[];
         a = s.split(" ");
         String trimvalues=s.replace(" ", "");
         char[] c =trimvalues.toCharArray();
         HashMap<Character,Integer> hashMap = new HashMap<>();

         HashMap<Character,Integer> mapdata = Arrays.asList(c).stream()
                                                .

        // for(char d : c){
        //     if(hashMap.containsKey(d)){
        //         hashMap.put(d,hashMap.get(d)+1);
        //     }else{
        //         hashMap.put(d,1);
        //     }
        // }
        // System.out.println(hashMap);
    }
}