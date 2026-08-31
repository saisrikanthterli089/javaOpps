package StreamExamplescodes;

import java.util.*;
import java.util.function.Function;
// import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringArrays {
    public static void main(String[] args) {
        String[] s = {"java","Spriing boot","spring","dog","cat"};
        String reverseString = "hello world";
        String d = Arrays.stream(s).reduce("", (a,b)->a+b);

        Map<Character,Long> map = d.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //char which return the a = 95 and b = 96 like that so it return to intstream from charater for that 

        //we need to use mapToObj
        List<String> l = new ArrayList<>();
        String resultreverstring="";
      for(int i = (reverseString.length()-1);i>=0;i--){
        
            resultreverstring=resultreverstring+reverseString.charAt(i);
      }
      System.out.println(resultreverstring);
      System.out.println(reverseString);


        l.add("cat");
        l.add("dog");
        l.add("monkey");
        l.add("donkey");
        l.add("dinosur");

        Map<Integer,List<String>> mapdata =  l.stream().collect(Collectors.groupingBy(e->e.length()));
        Optional<String> data = Arrays.stream(s).collect(Collectors.maxBy(Comparator.comparingInt(e->e.length())));
        System.out.println(data.get());

System.out.println(mapdata);

        System.out.println(d);
        System.out.println(map);

    }
}
