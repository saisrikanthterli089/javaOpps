package Infointerview;
import java.util.*;
import java.util.function.Function;


import java.util.stream.Collectors;

public class MaxOccurance {
    public static void main(String[] args) {
        String s = "success";
        Long max_Length=0l;
        Character c = null;
        Map<Character,Long> map = s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        // Map<Character,Long> map = s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    

        for(Map.Entry<Character,Long> entity : map.entrySet()){
            if(max_Length<entity.getValue()){
                max_Length=entity.getValue();
                c=entity.getKey(); 

            }

        
        }
        System.out.println(c +" : "+max_Length.toString());

    }
}
