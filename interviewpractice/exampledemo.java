package interviewpractice;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class exampledemo {
    public static void main(String[] args) {
        String d = "Hello World";
        char[] c = d.toCharArray();

        Map<Character,List<Character>> map = d.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity()));

        for (Map.Entry<Character,List<Character>> entitys : map.entrySet()) {
            System.out.println(entitys.getKey()+" "+entitys.getValue());
        }   

        
      //  Map<Character,Long> map = new String(c).chars().mapToObj(e->(char) e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        
    }
}
