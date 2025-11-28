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
    
    public void enroll(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.firstName + " ha sido inscrito en el curso de " + courseName + ".");
    }

    public void unEnroll(Student student) {
        boolean removed = enrolledStudents.remove(student);
        
        if (removed) {
            System.out.println(student.firstName + " ha sido dado de baja.");
        } else {
            System.out.println("ERROR: " + student.firstName + " no se encuentra en este curso.");
        }
    }

    public int countStudents() {
        return enrolledStudents.size(); 
    }

    public int bestGrade() {
        int maxGrade = 0; 

        for (Student s : enrolledStudents) {
            if (s.grade > maxGrade) {
                maxGrade = s.grade;
            }
        }
        return maxGrade;
    }
    
    public void enroll(Student[] students) {
        System.out.println("\nInscribiendo grupo de " + students.length + " estudiantes...");
        for (Student s : students) {
            enrolledStudents.add(s); 
        }
        System.out.println("Inscripción masiva completada.");
    }
    
}