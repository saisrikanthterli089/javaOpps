package StreamExamplescodes;

import java.util.*;
// import java.util.function.Function;
import java.util.stream.Collectors;

public class ListStream {
    public static void main(String[] args) {
        Integer[] a = {34,4,3,23,42,4};
        List<Integer> l = new ArrayList<>();
        l=Arrays.asList(a);
        System.out.println(l);


        Map<Integer,Long> mapresult = l.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));

        System.out.println(mapresult);

    }
}
