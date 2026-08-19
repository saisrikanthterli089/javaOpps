package streamsexcrices;

import java.util.*;
import java.util.stream.Collectors;

public class StreamEx03IntegerToString {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,6,15,13,12,5,167,9);

        Set<String> set = list.stream().map(e -> e+"").filter(e -> e.startsWith("1")).collect(Collectors.toSet());
        System.out.println(set);
    }
}
