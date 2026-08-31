package StreamExamplescodes;

import java.util.Arrays;

public class CharStream {
    public static void main(String[] args) {
        char[] c = {'i','j','l','o','u','l','a','a'};


String d = new String(c)
        .chars()
        .mapToObj(ch -> String.valueOf((char) ch))
        .reduce("", (a, b) -> a.concat(b));
     }
}
