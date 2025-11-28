public class Main {
    public static void main(String[] args) {
        Student ana = new Student("Ana", "Gómez", 101, 75, 2);
        Student luis = new Student("Luis", "Pérez", 102, 55, 2);
        
        Course javaCourse = new Course("Programacion", " ", 2025);

        ana.printFullName();
        System.out.println("Ana está aprobada: " + ana.isApproved());
        ana.changeYearIfApproved();
        
        javaCourse.enroll(ana);
        javaCourse.enroll(luis);
        
        Student[] nuevos = { 
            new Student("Pedro", "Hrnandez", 104, 88, 1),
            new Student("Sofia", "Pérez", 105, 95, 1) 
        };
        javaCourse.enroll(nuevos); 
        
        System.out.println("Total de estudiantes inscritos: " + javaCourse.countStudents()); 
        
        // bajas
        javaCourse.unEnroll(luis);
        System.out.println("Total después de dar de baja a Luis: " + javaCourse.countStudents());
    }
}
