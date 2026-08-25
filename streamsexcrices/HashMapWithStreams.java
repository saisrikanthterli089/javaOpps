package streamsexcrices;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashMapWithStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,3,4,2,5,3,2,6);
        
        list.stream().filter(e->{
            Integer y = 10-e;
            if(list.contains(y) && (list.indexOf(e)!=list.indexOf(y))){
                return true;
            }else return false;
        }).distinct().forEach(s -> System.out.println(s));

        Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(map);
    }
}
