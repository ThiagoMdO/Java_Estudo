package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'B', 'B', 'V');
        List<Integer> numbers = List.of(2,4,5,63,41,3);
        //unique - set
        // Tree
        // LinkedHash
        // Hash

        Set<Character> treeSet = new TreeSet<>(characters);
        treeSet.add('b');
        treeSet.add('B');
        System.out.println("TreeSet :" + treeSet);

        System.out.println("");

        Set<Character> LinkedHashSet = new LinkedHashSet<>(characters);
        LinkedHashSet.add('A');
        LinkedHashSet.add('a');
        System.out.println("LinkedHashSet :" + LinkedHashSet);

        System.out.println("");

        Set<Character> HashSet = new HashSet<>(characters);
        HashSet.add('V');
        HashSet.add('z');
        HashSet.add('M');
        HashSet.add('v');
        System.out.println("HashSet : " + HashSet);

        Set<Integer> numbers2 = new HashSet<>(numbers);
        System.out.println("HashSet 2: "+numbers2);
        numbers2.add(3);
        numbers2.add(21);
        System.out.println("HashSet 2: "+numbers2);


    }
}
