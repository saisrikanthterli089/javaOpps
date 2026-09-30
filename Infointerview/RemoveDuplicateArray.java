package Infointerview;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        
    
    int[] a ={1,2,4,5,3,2,1};
    // Set set = (Set)Arrays.asList(a);
   Set set = Arrays.stream(a).boxed().distinct().collect(Collectors.toSet());

     System.out.println(set);
    }
}
