package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public Student(String name, int... marks) {
        this.name = name;
        for (int mark : marks){
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sumMarks = 0;
        for (int mark : marks) {
            sumMarks += mark;
        }
        return sumMarks;
    }

    public int getMaximumMark() {
        return Collections.max(this.marks);
    }

    public int getLessNumMark() {
        return Collections.min(this.marks);
    }

    public BigDecimal getAverageMarks() {
        //sum
        //qtd marks
        int sum = getTotalSumOfMarks();
        int total = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(total), 3, RoundingMode.UP);
    }

    public String toString(){
        return name + marks;
    }

    public void addNewMark(int mark){
        marks.add(mark);
    }
    public void removeMarkAtIndex(int mark){
        marks.remove(mark);
    }
    public void removeLastMarkAtIndex(){
        marks.remove(marks.size()-1);
    }
}
