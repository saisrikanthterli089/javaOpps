package Dsa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
//            Set<Character> set = new HashSet<>();

//     int left = 0;
//     int maxLength = 0;
//     int start = 0;                                                  //      a

//     String s = "bacabcefbb";                                          //    set       =    [a,b,c,e]
//                                                                     //   maxlength  =    3
//                                                                     //   start      =  left : 3

//     for (int right = 0; right < s.length(); right++) {

//         while (set.contains(s.charAt(right))) {
//             set.remove(s.charAt(left));
//             left++;
//         }

//         set.add(s.charAt(right));

//         if (right - left + 1 > maxLength) {
//             maxLength = right - left + 1;
//             start = left;
//         }
//     }

//     return s.substring(start, start + maxLength);
// }




Set set = new LinkedHashSet<>();

        String s = "abcbcadef";
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int start = 0;


        for(right=0;right<s.length();right++)
            {

            while(set.contains(s.charAt(right)))
                {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            if(right-left+1>maxLength){
                maxLength=right-left+1;
                start=left;
            }

        }
        System.out.println( s.substring(start,start + maxLength));

    }
}
