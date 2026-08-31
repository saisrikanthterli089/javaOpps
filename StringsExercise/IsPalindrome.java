package StringsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class IsPalindrome {
    public static void main(String[] args) {
        String s ="EANaE";

        char[] c = s.toCharArray();
        String result="";
        String result1="";

        for(int i=c.length-1;i>=0;i--){
            result=result+c[i];
        }
        System.out.println(result.equalsIgnoreCase(s));


        List list = new ArrayList<>();

        for(int i =c.length-1;i>=0;i--){
            list.add(c[i]);
        }
System.out.println(list);
        for(int i =0;i<list.size();i++){
            result1=result1+list.get(i);
        }
        System.out.println(result1);
        // char[]  c= s.toCharArray();
        // Stack<Character> stack = new Stack<>();
        // for (char d : c) {
        //     stack.push(d);
        // }
        // String result="";
        // for(char cc : stack){
        //     result=result+stack.pop();
        // }
        // System.out.println(result);
    }
}
