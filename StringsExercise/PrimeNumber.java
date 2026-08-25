package StringsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {
    public static void main(String[] args) {
        Integer[] num = {0,3,5,30,56,7,65,90,111,31, 37, 41, 43, 47,48};

        List<Integer> list = Arrays.asList(num).stream()
                            .filter(e->{
                                if(e==0 || (e<=1 && e%2!=0)){
                                    return false;
                                }else{
                                    for(int i=2;i<=e/2;i++){
                                        if(e%i==0){
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                            }).collect(Collectors.toList());
            System.out.println(list);
    }
}
