package interviewpractice;
import java.util.*;

import javax.sound.sampled.Line;
public class LongestSubstring01{
    public static void main(String[] args) {
        
        // String str = "this is the latest the codes for thdfsgeData PROGRAMMING ";
        // String[] strarrays = str.split(" ");

        // String LongestSubstring = "";
        // for(String s: strarrays){
        //  if(s.length()>LongestSubstring.length()){
        //     LongestSubstring=s;
        //  }
        // }
        // System.out.println(LongestSubstring);


        String  str = "abcdeabcdac";
        Set set = new LinkedHashSet();

        int right =0;
        int left = 0;
        int maxLen =0;
        int start =0;

        for(right=0;right<str.length()-1;right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if(right-left+1>maxLen){
                maxLen=right-left+1;
                start=left;
            }
        }
        System.out.println(str.substring(start,maxLen));

    }
}