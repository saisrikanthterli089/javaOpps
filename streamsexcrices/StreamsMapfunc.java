package streamsexcrices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.omg.CORBA.SystemException;
import org.omg.Messaging.SyncScopeHelper;

public class StreamsMapfunc {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(86,99,04,3,56,75,3,2,4,6);
        List<Integer> restultList=list.stream().filter(n->n>10)
        .map(n->n*2)
        .peek(n->System.out.println("new one ------:   \n"+n))
        .map(n->n*5)
        .sorted()
        .peek(n->System.out.println(n))
        .collect(Collectors.toList());

        System.out.println(restultList);
    }

}
