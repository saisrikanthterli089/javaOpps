package StringsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String s = "This is the New york times";
         s =s.replace(" ", "");
        
         char[] c = s.toCharArray();
         Map<Character,Integer> list1 = new String(c)
                                        .chars()
                                        .mapToObj(h->(char) h)
                                        .collect(Collectors.toMap(cd->cd,e->1, (oldvalue,newvalue)->oldvalue+newvalue));

                 Map<Character,Long> map1 = s.chars()
                                            .mapToObj(ch->(char) ch)
                                            .collect(Collectors.groupingBy(cs->cs,Collectors.counting()));                     

        // Map<Object,Integer> list = Arrays.stream(c).boxed().mapToObj(c->(char)c).collect(Collectors.toMap(c->c, e -> 1,(oldvalue,newvalues)->oldvalue+newvalues));
    }
}
