package interviewpractice;
import java.util.*;

public class SmallestSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        int minLength =0;
        int right;
        String reslut="";
        int left =0;
        Map map = new HashMap();
        for(right =0;right<s.length();right++)
            {
                System.out.println(right);
              reslut=reslut+s.charAt(right);
              if(t.contains(reslut)){
               System.out.println(reslut);

                
              }
        }

    }
}
