package ComparableandComparatorex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
    private int id;
    private String name;

    Employee(int id, String name)
    {

        this.id = id;
        this.name = name;

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

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }


}

public class ComparableExample01 {
    public static void main(String[] args)
    {

        List<Employee> list= Arrays.asList(
            new Employee(1001, "terli"),
            new Employee(2003,"Demo1"),
            new Employee(9004,"Hello"),
            new Employee(9003, "Sai Srikanth"),
             new Employee(2003,"Save001"),
            new Employee(9004,"Same"),
            new Employee(9003, "Enkorgene")
        );

        for(Employee e : list){
            System.out.println(e.getName());
        }

        Comparator<Employee> comparator = new Comparator<Employee>(){

            @Override
            public int compare(Employee o1, Employee o2) {
              return o1.getName().compareTo(o2.getName());
            }

        };

        list.stream().
        filter(
            e->
            {
                String name1 = e.getName();
                if(name1.length()>10 ){
                    return true;
                }return false;
    }).map(e->e.getName().toUpperCase())
    .forEach(employee->
        System.out.println(employee));
    
    }
}
