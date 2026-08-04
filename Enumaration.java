enum EnumDemoSample{
    MONDAY,
    TUESDAY(103, 104, "Terli"),
    WEDNESSDAY(105, 106, "sai"),
    THURSDAY(107, 108, "terli1"),
    FRIDAY(109, 110, "sai1"),
    SATURDAY(111, 112, "srikanth1"),
    SUNDAY(113, 114, "Terli1122");

    public void printmessage(){
        if(this.equals(FRIDAY)){
            System.out.println(name);
        }
        System.out.println("this is : "+this);
    }
    String name ="hello";
    EnumDemoSample(){
        System.out.println("Zero Paramters");
    }
    EnumDemoSample(int x , int y,String data){
        System.out.println("x : "+x + " Y : "+y+" data : "+data);
    }




}

public class Enumaration {
    public static void main(String[] args) {
        
       EnumDemoSample.FRIDAY.printmessage();
    //System.out.println(EnumDemoSample.TUESDAY.name);
    }
}