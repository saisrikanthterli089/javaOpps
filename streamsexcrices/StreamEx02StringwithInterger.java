package streamsexcrices;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamEx02StringwithInterger {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("terli");
        list.add("Srikanth");
        list.add("Sai");
        list.add("Demo");

        List<Integer> l = list.stream()
        .mapToInt(e -> e.length())
        .filter(e -> e>4)
        .boxed()
        .collect(Collectors.toList());
        System.out.println(l);
    }
}
