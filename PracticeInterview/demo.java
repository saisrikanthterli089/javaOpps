package PracticeInterview;

public class demo {
    public static void main(String[] args) {
        String[] str = {"flower","floor","flight"};


        String s= "floors";
        String prifix = str[0];

    

        for(int i=1;i<str.length-1;i++){
            while(!str[i].startsWith(prifix)){
                prifix=prifix.substring(0,prifix.length()-1);

                if(prifix.isEmpty()){
                    break;
                }
            }
            System.out.println(prifix);
        }

    }
}
