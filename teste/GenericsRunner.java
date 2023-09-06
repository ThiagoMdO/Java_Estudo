package academy.devdojo.maratonajava.javacore.CompassUol.teste;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.MyCustomList;
public class GenericsRunner {


    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        String value = list.get(0);
        System.out.println(value);
        System.out.println(list);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(4);
        list2.addElement(8);
        Integer number = list2.get(0);
        System.out.println(number);
        System.out.println(list2);
    }
}
