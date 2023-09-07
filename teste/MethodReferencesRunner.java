package academy.devdojo.maratonajava.javacore.CompassUol.teste;
import java.util.*;
public class MethodReferencesRunner {

    public static void print(Integer number){
        System.out.println(number);
    }
    public static void main(String[] args) {
        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(e -> e.length())
                .forEach(e -> System.out.println(e));

        System.out.println("");
        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(e -> e.length())
                .forEach(MethodReferencesRunner::print);
                //.forEach(System.out::println);

    }
}
