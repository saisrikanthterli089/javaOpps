package PracticeInterview;

import java.util.LinkedHashMap;
import java.util.Map;

public class anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listan";
        Map<Character,Integer> map1 = new LinkedHashMap<>();
         Map<Character,Integer> map2 = new LinkedHashMap<>();

        for(char c : s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        for(char c : s2.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map1.entrySet()){
            if(entry.getValue()!=map2.get(entry.getKey())){
                break;
            }
           
        }
        

    }
}
