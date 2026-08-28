package streamsexcrices;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapWithStreamsStrings{
    public static void main(String[] args) {
        String s = "Hello World What are you doing";

        String a[];
         a = s.split(" ");
         String trimvalues=s.replace(" ", "");
         char[] c =trimvalues.toCharArray();
         HashMap<Character,Integer> hashMap = new HashMap<>();

        //  Map<Character,Integer> mapdata = new String(c).chars()
        //  .mapToObj(ch->(char)ch)
                                               
        //                                         .collect(Collectors.toMap(Function.identity(),1,(e,b)->e+b));

Map<Character, Integer> mapdata =
        new String(c).chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toMap(
                        Function.identity(),
                        e -> 1,
                        (e,b) -> e + b
                ));
                System.out.println(mapdata);

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