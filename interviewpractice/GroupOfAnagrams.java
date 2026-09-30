// package interviewpractice;

// public class GroupOfAnagrams {
//     public static void main(String[] args) {
//         String [] str = {"flower","flow","floor"};
//         String prefix = str[0];
        
//         for(int i =1; i<str.length;i++){
//             int j=1;
//             while(!prefix.startsWith(str[i])){
//                 prefix=prefix.substring(0,str[i].length()-j);
//                 j++;
//             }
//         }
//         System.out.println(prefix);
//     }
// }


package interviewpractice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupOfAnagrams {

    public static void main(String[] args) {

        // String[] str = {"flower", "flow", "floor"};

        // String prefix = str[0];

        // for (int i = 1; i < str.length; i++) {

        //     while (!str[i].startsWith(prefix)) {
        //         prefix = prefix.substring(0, prefix.length() - 1);
        //     }
        // }

        // System.out.println(prefix);




        String[] str = {"eat","demo","rat","ate","emod","listen","silent"};
            List<List<String>> list = Arrays.asList(
                Arrays.asList("eat", "dte"),
                Arrays.asList("demo", "emod"),
                Arrays.asList("listen", "silent")
            );


        list.stream().flatMap(e->e.stream()).filter(e->e.startsWith("d")).map(e->{
            return e.substring(0,1).toUpperCase()+e.substring(1);

        }).forEach(e->System.out.println(e));;


        Map<String,List<String>> map = Arrays.stream(str).collect(Collectors.toMap(e->{
            char[] c =((String) e).toCharArray();
            Arrays.sort(c);
            return new String(c);
        }, e->new ArrayList(Arrays.asList(e)),(oldlist,newList)-> {oldlist.addAll(newList);return oldlist;}));

        for(Map.Entry<String,List<String>> map1 : map.entrySet()){
            System.out.println(map1.getKey()+"\t"+map1.getValue());
        }



    }
}



