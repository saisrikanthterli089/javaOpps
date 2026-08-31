package StringsExercise;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringwithHashMapex01{
    public static void main(String[] args) {
        String s = "this is the new way of deivising! the is";

        String[] s1 = s.split(" ");
       Map<String,Integer> map = Arrays.stream(s1).collect(Collectors.toMap(Function.identity(),e->1,(oldvalues,newValues)->oldvalues+newValues));

       System.out.println(map);
    }
}