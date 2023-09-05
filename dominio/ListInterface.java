package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Dog");
        System.out.println(words.size());
        System.out.println(words.isEmpty());
        System.out.println(words.get(0));
        System.out.println(words.contains("Dog"));
        System.out.println(words.indexOf("Apple"));
        //words.add("Orange");

        //Immutability List
        // ArrayList, LinkedList, Vector

        //ArrayList
        List<String> wordsArrayList = new ArrayList<String>(words);
        System.out.println(wordsArrayList);
        wordsArrayList.add(String.valueOf(33));
        wordsArrayList.add(2, "Elephant");
        wordsArrayList.add("Elephant");
        System.out.println(wordsArrayList);


        List<String> newList = List.of("Zebra", "Lion");
        wordsArrayList.addAll(newList);
        System.out.println(wordsArrayList);
        wordsArrayList.set(2, "Teste");
        System.out.println(wordsArrayList);
        wordsArrayList.remove(2);
        System.out.println(wordsArrayList);
        wordsArrayList.remove("33");
        System.out.println(wordsArrayList);


        List<String> words2 = List.of("Apple", "Orange");
        for (int i = 0; i < words2.size(); i++) {
            System.out.println(words2.get(i));
        }
        for (String word : words2) {
            System.out.println(word);
        }
        Iterator wordsIterator = words2.iterator();
        while (wordsIterator.hasNext()) {
            System.out.println(wordsIterator.next());
        }

        List<String> wordsA = List.of("Random", "Developer xt", "Text");
        List<String> wordsAl = new ArrayList<String>(wordsA);
        for (String word : wordsA) {
            if(word.endsWith("xt")){
                System.out.println(word);
            }
        }
        for(String word : wordsAl){
            if(word.endsWith("xt")){
                //wordsAl.remove(word);
            }
        }
        System.out.println(wordsAl);
        Iterator<String> iterator = wordsAl.iterator();
        while(iterator.hasNext()){
            if(iterator.next().endsWith("xt")){
                iterator.remove();
            }
        }
        System.out.println(wordsAl);

        List values = List.of("A",'b',1,2.4f);
        System.out.println(values);
        if(values.get(3) instanceof Float){
            System.out.println("Float");
        }
        List<Integer> numbers = List.of(12,13,10,14);
        System.out.println(numbers.indexOf(13));
        List<Integer> numbersAl = new ArrayList<>(numbers);
        System.out.println(numbersAl.indexOf(12));
        //numbersAl.remove("1");
        numbersAl.remove(Integer.valueOf(12));
        System.out.println(numbersAl);

        List<Integer> numbers2 = List.of(46,45,4);
        List<Integer> numberAl2 = new ArrayList<>(numbers2);
        //numberAl2.sort();
        System.out.println(numbers2);
        System.out.println(numberAl2);
        Collections.sort(numberAl2);
        System.out.println(numberAl2);

       

        System.out.println("");

        //LikedList
        List<String> wordsLikedList = new LinkedList<String>(words);
        System.out.println(wordsLikedList);
        wordsLikedList.add("Rabbit");
        System.out.println(wordsLikedList);

        System.out.println("");

        //Vector
        List<String> wordsVectorList = new Vector<String>(words);
        System.out.println(wordsVectorList);
        wordsVectorList.add("Test");
        System.out.println(wordsVectorList);


    }
}
