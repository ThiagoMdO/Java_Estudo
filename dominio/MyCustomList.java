package academy.devdojo.maratonajava.javacore.CompassUol.dominio;
import javax.swing.plaf.PanelUI;
import java.util.*;
public class MyCustomList<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }
    public void removeElement(T element){
        list.remove(element);
    }
    public T get(int index){
        return list.get(index);
    }

    public String toString(){
        return list.toString();
    }
}
