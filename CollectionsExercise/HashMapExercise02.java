package CollectionsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public String toString(){
        return "id : "+this.id+" "+"Name : "+this.name;
    }
    
}

public class HashMapExercise02 {
    public static void main(String[] args) {
                List<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"srikanth"));
        list.add(new Employee(201,"Terli"));
        list.add(new Employee(905,"sai"));
        list.add(new Employee(903,"ssaiknanth"));


        HashMap<Integer,List> hashmap = new HashMap<>();
        hashmap.put(101, list);
        hashmap.put(102,Arrays.asList(3,6,58,99));
        hashmap.put(103,Arrays.asList(99,8,47,5,3));

        hashmap.entrySet().stream().forEach(entry->{
            entry.getValue().stream().filter(e -> e instanceof Employee)
            .forEach(e->
                {
                    Employee emp = (Employee) e;
                    System.out.println(emp.getName().toUpperCase());
                }
            );
          
        });
    }
}
