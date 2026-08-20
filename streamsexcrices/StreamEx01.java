package streamsexcrices;

import java.util.*;
import java.util.stream.Collectors;

public class StreamEx01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,6,4,5,3,44,90);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer i1 , Integer i2){
                return i2-i1;
            }
        };
       List l = list.stream()
        .filter(e->e%2==0)
        .sorted(comparator)
        .skip(1)
        .limit(1)
        .collect(Collectors.toList());
        System.out.println(l);
    }
}
