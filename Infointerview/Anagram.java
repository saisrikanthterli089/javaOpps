package Infointerview;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] c =s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c2);
        System.out.println(c);
        System.out.println(c2);
        

        System.out.println(new String(c).equals(new String(c2)));

    }
}
