package academy.devdojo.maratonajava.javacore.CompassUol.teste;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.Student;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {13,30,44};
        Student student = new Student("Roni", marks);
        int number  = student.getNumberOfMarks();
        System.out.println(number);
        int sum = student.getTotalSumOfMarks();
        System.out.println(sum);
        int maximumMark = student.getMaximumMark();
        System.out.println(maximumMark);
        int lessNumMark = student.getLessNumMark();
        System.out.println(lessNumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println(average);

        System.out.println(student);

        student.addNewMark(23);
        System.out.println(student);


        student.removeMarkAtIndex(0);
        System.out.println(student);

        //remove last item
        student.removeLastMarkAtIndex();
        System.out.println(student);


    }
}
