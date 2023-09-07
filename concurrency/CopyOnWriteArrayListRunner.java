package academy.devdojo.maratonajava.javacore.CompassUol.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        System.out.println(list);
        list.add("Ant");
        list.add("Cow");
        System.out.println(list);
        for(String element : list){
            System.out.println(element);
        }
    }
}
