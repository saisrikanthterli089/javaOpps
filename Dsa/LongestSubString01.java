package Dsa;

import java.util.*;

public class LongestSubString01 {
    public static void main(String args[])
    {
        String s = "abcababbb";

        int right =0;
        int left =0;
        int maxLength=0;
        int start=0;

        Set set = new LinkedHashSet<>();

        for(right=0;right<s.length()-1;right++){
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(right));
                left++;
            }

            set.add(s.charAt(right));

            if(right-left+1<maxLength){
                maxLength=right-left+1;
                start=left;
            }

        }
        System.out.println(Integer.MAX_VALUE);

    }
}
