
package grades;
import com.sun.jdi.Value;
import java.lang.reflect.Array;
import java.util.*;

public class Student {
    public static void main(String[] args){

        Student Bobby = new Student("Bobby");
        Bobby.addGrade(95);
        Bobby.addGrade(65);
        Bobby.addGrade(82);
        System.out.println("Bobby = " + Bobby);
        System.out.println("Bobby.grades = " + Bobby.grades);
        System.out.println("Rob.getGradeAverage() = " + Bobby.getGradeAverage());
    }
    private String name;
    private ArrayList<Integer> grades;
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Integer> getGrade() {
        return grades;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    int bucket;
    public int getGradeAverage() {
        for (int i = 0 ; i < grades.size(); i++){
            bucket = bucket + grades.get(i);
        }
        return bucket / grades.size();
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", bucket=" + bucket +
                '}';
    }
}


















