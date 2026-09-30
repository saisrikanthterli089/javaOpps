package PracticeInterview;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";

       Set set = new HashSet<>();

       int left =0;
       int maxLength =0;

       for(int right =0;right<str.length()-1;right++){

        while(set.contains(str.charAt(right))){
            set.remove(left);
        }

        set.add(str.charAt(right));

        maxLength = Math.max(maxLength, right-left+1);

       }

    }
}
