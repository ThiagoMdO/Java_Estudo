package academy.devdojo.maratonajava.javacore.CompassUol.teste;
import java.util.*;

import static java.util.Locale.filter;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Orange");

        printWithFP(list);
        printBasicWithFiltering(list);

        System.out.println("");

        printWithFP(list);
        printWithFPWithFiltering(list);



      }
    private static void printBasic(List<String> list){
        for (String string: list){
            System.out.println(string);
        }
    }
    private static void printBasicWithFiltering(List<String> list){
        for(String string : list){
            if(string.endsWith("ge")){
                System.out.println(string);
            }
        }
    }


    private static void printWithFP(List<String> list){
        list.stream().forEach(element -> System.out.println("base element "+element));
    }

    private static void printWithFPWithFiltering(List<String> list){
        list.stream()
            .filter(element -> element.endsWith("le")).forEach(element -> System.out.println("element "+ element));
    }

}
