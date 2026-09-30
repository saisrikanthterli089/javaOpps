package interviewpractice;

import java.text.CollationElementIterator;
import java.util.*;

class EmployeeCooli implements Comparable<EmployeeCooli>{
    private  int id ;
    private String name;
    private int age;
    private char Gender;
    public int getId() {
        return id;
    }
    public EmployeeCooli(int id, String name, int age, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        Gender = gender;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGender() {
        return Gender;
    }
    public void setGender(char gender) {
        Gender = gender;
    }

    @Override
    public int compareTo(EmployeeCooli o) {
        return this.id-o.id;
    }
    @Override
    public String toString() {
        return "EmployeeCooli [id=" + id + ", name=" + name + ", age=" + age + ", Gender=" + Gender + ", getId()="
                + getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]\n";
    }

    
}

public class sorting {
    public static void main(String[] args) {
        
        List<EmployeeCooli> list = new ArrayList<>();

        list.add(new EmployeeCooli(105, "Rahul", 28, 'M'));
        list.add(new EmployeeCooli(102, "Sai", 25, 'M'));
        list.add(new EmployeeCooli(108, "Priya", 27, 'F'));
        list.add(new EmployeeCooli(101, "Kiran", 30, 'M'));
        list.add(new EmployeeCooli(104, "Anjali", 26, 'F'));


        Comparator comparator1 = new Comparator<EmployeeCooli>() {

            @Override
            public int compare(EmployeeCooli o1, EmployeeCooli o2) {
               return o1.getName().compareTo(o2.getName());
            }
            
        };

        Comparator compatorAge = new Comparator<EmployeeCooli>() {
            public int compare(EmployeeCooli e1,EmployeeCooli e2){
                return e2.getAge()-e1.getAge();
            }
        };

        //Collections.sort(list,comparator1);
        Collections.sort(list,compatorAge);
        System.out.println(list);
    }   
}
