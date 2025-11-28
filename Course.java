import java.util.ArrayList; 
import java.util.List;   

public class Course {
    String courseName;//atributo 
    String professorName;//atributo 
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
        System.out.println(student.firstName + " Udted a sido inscrito al curso " + courseName );
    }

    public void unEnroll(Student student) {
        boolean removed = enrolledStudents.remove(student);
        
        if (removed) {
            System.out.println(student.firstName + " Usted a sido dado de baja");
        } else {//if
            System.out.println("ERROR: " + student.firstName + "no esta en el curso");
        }//else remove
    }//Enroll

    public int countStudents() {
        return enrolledStudents.size(); 
    }
    
    public void enroll(Student[] students) {
        System.out.println("\nInscribiendo grupo de " + students.length + "estudiantes");
        for (Student n : students) {
            enrolledStudents.add(n); 
    }//enroll
    
        System.out.println("Salon saturado");
    
    }
    
    
   
}// class course
