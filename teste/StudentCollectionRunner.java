package academy.devdojo.maratonajava.javacore.CompassUol.teste;
import java.util.*;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.Student01;

class DescendingStudentComparator implements Comparator<Student01>{

    @Override
    public int compare(Student01 student1, Student01 student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}

public class StudentCollectionRunner {

    public static void main(String[] args) {
        List<Student01> students = List.of(new Student01(1,"Roney"),
                new Student01(2,"Marta"),
                new Student01(3,"Andre"));
        List<String> newStudent = List.of("Jose","Andre","Carlos");

        List<Student01> studentsAl = new ArrayList<>(students);
        //List<String> newStudentAl = new ArrayList<String>(newStudent);
        
        System.out.println(studentsAl);
        //System.out.println(newStudentAl);

        Collections.sort(studentsAl);
        //Collections.sort(newStudentAl);
        //System.out.println(newStudentAl);

        System.out.println(studentsAl);

        Collections.sort(studentsAl, new DescendingStudentComparator());
        System.out.println(studentsAl);



    }
}
