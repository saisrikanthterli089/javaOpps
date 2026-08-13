import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class practice {
    public static void main(String[] args) {
      
        // List list = new LinkedList<>();
        // list.add(Arrays.asList(a));
       
        // List<String> names = Arrays.asList(
        //                 "Sai",
        //                     "Ravi",
        //                     "Kiran",
        //                     "Sai",
        //                     "Ravi",
        //                     "Arun",
        //                     "Kiran",
        //                     "Sai"
        //                 );
        //                 System.out.println(names);


        // Set<String> set = names.stream().sorted().collect(Collectors.toSet());
        // Long count = names.stream().filter(n -> n.equals("Kiran")).count();
        // System.out.println(count);
        // String 
        char[] c = "demoscTerlisuuuuuueds".toCharArray();
        System.out.println("c charter values is : "+c.length);
        HashMap<Character,Integer> hashMap = new HashMap<>();
        
        for(char d : c){
        if(hashMap.containsKey(d)){
            hashMap.put(d,hashMap.get(d)+1);
        }else{
            hashMap.put(d,1);
        }
       
    }
     System.out.println(hashMap);
    }
}
