package streamsexcrices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamsevennum {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(5,2,6,3,677,345,76,88,54);

        List<Integer> greaterThan10Interger = list.stream().filter(z->z>10).sorted().collect(Collectors.toList());
        List<Integer> evenIntegers = list.stream().filter(z->z%2==0).sorted().collect(Collectors.toList());

        System.out.println("greaterThan10Interger : "+greaterThan10Interger);
        System.out.println("evenIntegers : "+evenIntegers);

    }
}
