package StreamExamplescodes;

import java.util.Arrays;

public class CharStream {
    public static void main(String[] args) {
        char[] c = {'i','j','l','o','u','l','a','a'};


        String d = new String(c).chars().mapToObj(ch->(char)ch).reduce("",(a+b)->a.append(b));
    }
}
