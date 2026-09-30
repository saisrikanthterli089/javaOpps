package Infointerview;

public class ReverseString {
    public static void main(String[] args) {
        
    
    String s="Infosys demo data";
    String[] sarray = s.split(" ");
    
    String reslut="";
        for(int i = sarray.length-1;i>=0;i--){
            // reslut=reslut+s.charAt(i);
            reslut=reslut+sarray[i]+" ";
        }
        System.out.println(reslut);
    }
}
