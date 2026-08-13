import java.lang.reflect.Method;

class Bird {
     private int x =23;
     int y = 26;

     Bird(){
        System.out.println("Defalut constructor!");
     }

     Bird(int x, int y ){
        this.x = x;
        this.y = y;
        System.out.println(x +" : "+y);
     }

     private void demo(){
        System.out.println("hello private method");
     }

     public String democlassresturn(int x,int y){
        return x +" :"+ y;
     }
}

public class ReflectionEx01{

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalAccessException, InstantiationException {
       
            Class birdClass = Class.forName("Bird");
         System.out.println(birdClass.getModifiers());

         Object objectbirdClass = birdClass.newInstance();

         // Method  method =objectbirdClass.getDeclaredMethod("demo");

         // System.out.println(birdClass.getDeclaredMethods());
         // Method[] methods = birdClass.getDeclaredMethods();
         // for(Method method : methods){
         //    System.out.println(method.isAccessible());
         //    if(method.isAccessible() !=true){
         //       method.setAccessible(true);
         //       System.out.println(method.isAccessible());
         //       System.out.println("checke ing the void "  +method.getReturnType().equals("Void"));
         //    }

         
         // }
      
        

    }
}

