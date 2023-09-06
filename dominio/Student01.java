package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

import java.lang.Comparable.*;

public class Student01 implements Comparable<Student01>{
    private int id;
    private String name;

    public Student01(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Id: " + id + ", Name: " + name;
    }

    @Override
    public int compareTo(Student01 that) {
        return Integer.compare(that.id, this.id);
    }
}
