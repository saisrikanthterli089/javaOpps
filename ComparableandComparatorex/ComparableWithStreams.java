package ComparableandComparatorex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Students implements Comparable<Students>{
    private Integer stdId;
    private String stdName;
    private String stdGender;

    Students(int stdId,String stdName,String stdGender){
        this.stdId=stdId;
        this.stdName=stdName;
        this.stdGender=stdGender;
    }

    @Override
    public String toString() {
        return "Students [stdId=" + stdId + ", stdName=" + stdName + ", stdGender=" + stdGender + "]";
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdGender() {
        return stdGender;
    }

    public void setStdGender(String stdGender) {
        this.stdGender = stdGender;
    }

    @Override
    public int compareTo(Students s){
        return this.stdId-s.stdId;
    }

}
public class ComparableWithStreams{
    public static void main(String[] args) {
        
        List<Students> students = new ArrayList<>();
        
        students.add(new Students(105, "Sai", "Male"));
        students.add(new Students(102, "John", "Male"));
        students.add(new Students(108, "Priya", "Female"));
        students.add(new Students(101, "David", "Male"));
        students.add(new Students(104, "Anu", "Female"));
        students.add(new Students(103, "Rahul", "Male"));

        Comparator<Students> comparator =new Comparator<Students>() {

            @Override
            public int compare(Students o1, Students o2) {
                return o1.getStdName().compareTo(o2.getStdName());
            }
            
        };
    
        List<String> sortedName =  students.stream().sorted(comparator).map(s->s.getStdName()).collect(Collectors.toList());
       Map<Integer,String> hashmap =students.stream().sorted(comparator).limit(3).skip(2).collect(Collectors.toMap(s->s.getStdId(), s->s.getStdName()));
        System.out.println(sortedName);
        System.out.println(hashmap);
        // for(Collections c : hashmap){
            
        // }
    }
}