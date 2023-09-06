package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import java.util.*;

public class MapRunner {
    public static void main(String[] args) {
        String str = "One thing" + " outher thing";
        Map<Character, Integer> occurances = new HashMap<>();

        char[] characters = str.toCharArray();
        System.out.println(characters);
        for (char character : characters) {
            //Get the character
            Integer integer = occurances.get(character);
            if (integer == null) {
                occurances.put(character, 1);
            } else {
                occurances.put(character, integer + 1);
            }
        }
        System.out.println(occurances);
    }
}
