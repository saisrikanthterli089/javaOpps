package StreamExamplescodes;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class EmployeeData{
    private int id;
    private String name;
    private String gender;
    private String department;
    public EmployeeData(int id, String name, String gender, String department) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return " [id=" + id + ", name=" + name+"}" ;
    }

    
}

public class MapStreams {
    public static void main(String[] args) {
        Map<Integer,EmployeeData> map = new HashMap<>();

   

    map.put(101, new EmployeeData(101, "Srikanth", "Male", "IT"));
    map.put(102, new EmployeeData(102, "Rahul", "Male", "HR"));
    map.put(103, new EmployeeData(103, "Priya", "Female", "Finance"));
    map.put(104, new EmployeeData(104, "Anjali", "Male", "IT"));
    map.put(105, new EmployeeData(105, "Kiran", "Male", "Sales"));
    map.put(106, new EmployeeData(106, "Sneha", "Female", "HR"));
    map.put(107, new EmployeeData(107, "Ravi", "Male", "Finance"));
    map.put(108, new EmployeeData(108, "Divya", "Female", "IT"));



    // 1. Print all employee names
    List<String> list = map.values().stream().map(e->e.getName()).collect(Collectors.toList());
    System.out.println(list);

    // 2. Get employees from IT department
    Map<String,List<EmployeeData>> mapdata = map.values().stream().collect(Collectors.groupingBy(e->e.getDepartment()));
    System.out.println(mapdata);

    // 3. Get all female employees
    List<String> listdata = map.values().stream().filter(e->e.getGender().equals("Female")).map(e->e.getName()).collect(Collectors.toList());
        System.out.println(listdata);


    // 4. Count employees in each department
    Map<String,Long> employeeCount = map.values().stream().map(e->e.getDepartment()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println(employeeCount);


    // 5. Group employees by department
    Map<String,List<String>> employeesGroup = map.values().stream()
    .collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.mapping(e->e.getName(), Collectors.toList())));
    System.out.println(employeesGroup);


    // 6. Get employee with highest ID

    map.values().stream().map(e->e.getId()).sorted(Comparator.reverseOrder()).limit(1).forEach(e->System.out.println(e));


    // 7. Get only employee names as List
    List<String> EmployeeDataNames = map.values().stream().map(e->e.getName()).collect(Collectors.toList());
    System.out.println(EmployeeDataNames);

    // 8. Find all male employees from IT
    map.values().stream().filter(e->{
        if(e.getDepartment()=="IT" && e.getGender()=="Male"){
            return true;
        }return false;
    }).forEach(System.out::println);


    // 9. Sort employees by name

    Comparator<EmployeeData> comparator = new Comparator<EmployeeData>() {

        public int compare(EmployeeData o1, EmployeeData o2) {
           return o2.getName().compareTo(o1.getName());
        }

  
        
    };

    map.values()
   .stream()
   .sorted(Comparator.comparing(EmployeeData::getName).reversed())
   .forEach(e -> System.out.println(e.getName()));
    // map.values().stream().map(e->e.getName()).sorted(comparator.reversed()).forEach(System.out::println);
}

}
