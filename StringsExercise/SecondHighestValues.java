package StringsExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class SecondHighestValues {
    public static void main(String[] args) {
        
        int[] x ={8,49,303,2943,3834,43};
        
     Arrays.asList(x).stream().sorted().skip(1).limit(2).forEach(e->System.out.println(e));
     Arrays
        .stream(x)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .limit(2    )
        .forEach(System.out::println);

    }
}
