
class Demo{
    static int y=23;
    static{
        System.out.println("this is static block code \b "+y);
    }
    public static int getvaluesRandom(){
        return 234;
    }

    Demo(int y){
        this.y=y;
    }
    public Demo getObject(){
        return this;
    }
}

class Demo1 {
    public int getvaluesOfy(){
        return Demo.y;
    }
    public Demo getObject(){
        return new Demo(999).getObject();
    }
}
class classexamples{
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
       Demo1 demo1 = new Demo1();
       System.out.println("main values : "+demo1.getObject().getvaluesRandom()); 
    }
}