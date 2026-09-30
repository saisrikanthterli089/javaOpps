package Infointerview;

// import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;
import java.util.Map.Entry;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        String s = "aabbcddee";

        Map<Character,Long> map =s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(e->e,Collectors.counting()));
       
        for(Map.Entry<Character, Long> entries : map.entrySet()){
            if(entries.getValue()==1){
                System.out.println(entries.getKey()+" "+entries.getValue());
            }
        }
    }
}
