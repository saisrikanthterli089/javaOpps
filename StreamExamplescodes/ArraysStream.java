package StreamExamplescodes;

import java.util.*;

public class ArraysStream {
    public static void main(String[] args) {
        int[] d = {34,5,4,3,2};

        int x = Arrays.stream(d).reduce(1, (a,b)->a*b);
       Integer list = Arrays.stream(d).reduce(1, (a,b)->a*b);
        System.out.println(x);
    }
}
