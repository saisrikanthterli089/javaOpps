package Dsa.practiceExercise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ex01reduce {
    public static void main(String[] args) {
        String[] str = {"Demo","Terli","Sai","Srikanth"}

       // int sum = Arrays.stream(i).reduce(0, (a,b)->a+b);
        // System.out.println(sum);

       Map<Character,List<Integer>> map = Arrays.stream(str)
    .collect(Collectors.toMap(
        e -> e.charAt(0),
        e -> new ArrayList<>(List.of(e))
    ));


    }
}
