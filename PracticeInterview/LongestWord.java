package PracticeInterview;

public class LongestWord {
    public static void main(String[] args) {
        String s = "I love programming in234refdewfdew Java";

        String longest ="";

        String[] str = s.split(" ");

        for(String st : str){
            if(st.length()>longest.length()){
                longest=st;
            }
        }
        System.out.println(longest);

    }
}
