package Infointerview;

public class Longestpalidromsubstring {
    public static void main(String[] args) {
        

        String s = "abaabad";
        int start =0;
        int end =0;
        

        for(int i =0;i<s.length();i++){
            int len1 = loopclass(s, i, i);
            int len2 = loopclass(s, i, i+1);

           int max_Length = Math.max(len1, len2);
            if(max_Length>end-start){
                start = i-(max_Length-1)/2;
                end = i+max_Length/2;

            }

            
        }

        System.out.println(s.substring(start,end+1));

      
    }
      public static int loopclass(String s1,int left,int right){

        while(left>=0 && right <s1.length() && s1.charAt(left)==s1.charAt(right)){
            left --;
            right ++;
        }
            return right-left-1;
        }
}
