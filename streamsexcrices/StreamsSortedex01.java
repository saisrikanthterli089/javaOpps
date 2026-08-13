package streamsexcrices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

class Employee{
    private int id;
    private String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

public class StreamsSortedex01 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"srikanth"));
        list.add(new Employee(201,"Terli"));
        list.add(new Employee(905,"sai"));
        list.add(new Employee(903,"ssaiknanth"));
    
    
        List<String> resultList = list.stream()
                                    .filter(e->e.getName().startsWith("s"))
                                    .map(e->e.getName().toUpperCase())
                                    .peek(e->System.out.println(e))
                                    .collect(Collectors.toList());


        System.out.println(resultList);
    }

    

}
