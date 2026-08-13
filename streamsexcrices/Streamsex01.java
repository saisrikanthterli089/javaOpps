package streamsexcrices;
import java.util.Arrays;
import java.util.List;

public class Streamsex01 {
    public static void main(String args[]){
        
        Integer arr[] = {5,8,2,6,934,2,4};
        int target = 10;
        List<Integer> list = Arrays.asList(arr);
         list.stream().filter(a ->{
            int x = target-a;
            return list.contains(x);
            

        }).distinct().sorted().forEach(a->System.out.println(a ));

    }
}