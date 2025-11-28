import java.util.ArrayList; 
import java.util.List;   

public class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> enrolledStudents; 

    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;

        this.enrolledStudents = new ArrayList<>(); 
    }
    
    
}