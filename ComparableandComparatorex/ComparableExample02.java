package ComparableandComparatorex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>{
    private int stdId;
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
    public int compareTo(Students s) {
      return this.stdName.compareTo(s.stdName);
    }

    
}

public class ComparableExample02{
    public static void main(String[] args){
         List<Students> students = new ArrayList<>();

        students.add(new Students(105, "Sai", "Male"));
        students.add(new Students(102, "John", "Male"));
        students.add(new Students(108, "Priya", "Female"));
        students.add(new Students(101, "David", "Male"));
        students.add(new Students(104, "Anu", "Female"));
        students.add(new Students(103, "Rahul", "Male"));

        // System.out.println(students);
        Comparator<Students> comparatorwithStdIds = new Comparator<Students>() {

            @Override
            public int compare(Students o1, Students o2) {
                return o1.getStdId()-o2.getStdId();
            }
            
        };
            Comparator<Students> comparatorWithNames = new Comparator<Students>() {

            @Override
            public int compare(Students o1, Students o2) {
                return o1.getStdName().compareTo(o2.getStdName());
            }
            
        };
        Comparator<Students> comparatorWithGender = new Comparator<Students>() {

            @Override
            public int compare(Students o1, Students o2) {
                return o1.getStdGender().compareTo(o2.getStdGender());
            }
            
        };
        String sort="name";
        if(sort=="ids"){
        Collections.sort(students,comparatorwithStdIds);
        }else if(sort=="name"){
            Collections.sort(students,comparatorWithNames);
        }else{
            Collections.sort(students,comparatorWithGender);
        }
        for(Students s : students){
           System.out.println(s.toString());
        }
    }
}