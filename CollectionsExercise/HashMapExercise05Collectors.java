package CollectionsExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee1{
    private int id;
    private int salary;
    private String name;
    private String department;

    public Employee1(int id,int salary,String name,String department){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.department = department;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    
}

public class HashMapExercise05Collectors {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                    new Employee1(101, 50000, "Srikanth", "IT"),
                    
                    new Employee1(103, 70000, "shame", "IT"),
                    new Employee1(102, 60000, "Sai", "HR"),
                    new Employee1(103, 70000, "RaviNarayan", "IT")
                     );
// this is used for the collectors to map to HashMap functions
        Map<Integer,String> hashMapresult = employees.stream()
                                                .collect(Collectors.toMap(
                                                    e-> e.getId(),
                                                    Employee1::getName,
                                                (oldValue,newValue)->newValue));
        System.out.println(hashMapresult);

// groupby the id's which is the used 
        Map<String,List<Employee1>> map = employees.stream().collect(Collectors.groupingBy(Employee1::getDepartment));

        System.out.println("this is the group of list of employees based upon the department ");


// groupby the departments and count the employess in the department
        Map<String,Long> mapcount = employees.stream()
        .collect(Collectors
                            .groupingBy(e->e.getDepartment(),Collectors.counting()));
       
        System.out.println("this is group count by "+ mapcount);


// groupby working with max min avg sum of each department 

        Map<String,Integer> maptotalSalryofdeptgroup = 
                                        employees.stream()
                                        .collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.summingInt(Employee1::getSalary)));

                                        System.out.println("total salary by departments! "+ maptotalSalryofdeptgroup);
         

         Map<String,Double> mapavgSalryofdeptgroup = 
                                        employees.stream()
                                        .collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.averagingInt(Employee1::getSalary)));

                                        System.out.println("total salary by departments! "+ maptotalSalryofdeptgroup);
            System.out.println("avg salary of Employee "+ mapavgSalryofdeptgroup);

        Map<String,Optional<Employee1>> mapmaxSalryofdeptgroup = 
                                        employees.stream()
                                        .collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.maxBy(Comparator.comparingInt(Employee1::getSalary))));

                                    
                                        System.out.println("total salary by departments! "+ mapmaxSalryofdeptgroup);
 
    }
}
