package streamsexcrices;

import java.nio.file.OpenOption;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class StreamEx02ReduceTerminal {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Spring Boot","Data Jpa");
        List<Integer> l = Arrays.asList(99,8,78,65,34);
        Integer count = list.stream()
                    .mapToInt(e -> e.length())
                    .boxed()
                    .reduce(0,(a,b)->a+b);


       int x = l.stream()
       .filter(e -> e>50)
        .reduce(1,(a,b)->a*b);

        System.out.println(x);


       Optional<Integer> in = l.stream().skip(1).findFirst();

       IntSummaryStatistics ist = l.stream().mapToInt(Integer::intValue()).summaryStatics();
       System.out.println(in.get());
    }
}
