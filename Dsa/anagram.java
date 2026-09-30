package Dsa;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class anagram {
    public static void main(String[] args) {
        String [] s1 = {"eat", "tea", "tan", "ate", "nat", "bat"};



        Map<String,List<String>> map = Arrays.stream(s1)
        // .map(e->{
        //     char[] c = e.toCharArray();
        //     Arrays.sort(c);
        //     for(char c1: )
        // })

        .collect(Collectors.groupingBy(e->{
            char[] c = ((String) e).toCharArray();
            Arrays.sort(c);
            return new String(c);
        }));



        System.out.println(map);

        // Map<String,List> map = Arrays.stream(s1).map(e->{
        //     char[] c = e.toCharArray();
        //     Arrays.sort(c);
        //     StringBuilder sb = new StringBuilder();
        //    for(char cd : c){
        //     sb.append(cd);
            
        //    }
        //    return sb.toString();
        // }).collect(Collectors.toMap(Function.identity(),e->new ArrayList((List.of(e),(e1,e2)->{e1.add(e2)}));

    }
}
