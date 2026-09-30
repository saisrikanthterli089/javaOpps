package interviewpractice;

import java.util.*;

public class LongestSubstringwithKChar {
    public static void main(String[] args) {
        String s = "eceeedadc";
        int k =2;
        int right;
        int maxlenght =0;
        Set set = new LinkedHashSet<>();

        for(right=0;right<s.length()-1;right++){
            
            if(set.size()<=k){
                System.out.println(right+"\t"+set.size());
                set.add(s.charAt(right));
                maxlenght++;
            }else{
                break;
            }
        }
        System.out.println(set);
        System.out.println(s.substring(0,maxlenght-1));
    }
}
