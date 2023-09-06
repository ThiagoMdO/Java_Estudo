package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import java.util.*;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value2.length(), value1.length());
    }
}

public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        queue.addAll(List.of("Apple", "Horse", "Monkey", "Rat"));
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
