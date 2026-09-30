package PracticeInterview;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        String result="";
        int count = 0;
        int consonets =0;


        for(int i=s.length()-1;i>=0;i--){
            result= result+s.charAt(i);
        }

        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'|| s.charAt(i)=='o'){
                count++;
            }
            else{
                consonets++;
            }
        }
        System.out.println(count);
        System.out.println(consonets);
        String str="TerlisiT";

        Map<Character,Integer> map =new LinkedHashMap<>();

       
        for(char c : str.toLowerCase().toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character,Integer> mapEntrys : map.entrySet()){
            if(mapEntrys.getValue()>1){
                System.out.println(mapEntrys.getKey());
            }
        }

        String dat="hello";
        char d;
        for(char c : dat.toCharArray()){
            
            System.out.println((char)(c-32));   
        }


    }
}