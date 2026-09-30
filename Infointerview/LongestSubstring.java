package Infointerview;
import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcdedb";

        int left=0;
        int right;
        int max_Length=0;
        int start =0;
        Set<Character> set = new LinkedHashSet<>();
        for(right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
          
            }
            set.add(s.charAt(right));
            if(right-left+1>max_Length){
                max_Length=right-left+1;
                start=left;
            }
        }

        System.out.println(s.substring(start,max_Length+start));

    }
}
