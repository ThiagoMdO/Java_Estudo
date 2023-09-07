package academy.devdojo.maratonajava.javacore.CompassUol.concurrency;

import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

    public static void main(String[] args) {
        //Map<Character, LongAdder> occurrences = new Hashtable<>();
        ConcurrentMap<Character, LongAdder> occurrences = new ConcurrentHashMap<>();
        String str = "ADAS FAF AS T32";
        for (char character : str.toCharArray()) {
            //with concurrentMap
            occurrences.computeIfAbsent(character, ch -> new LongAdder()).increment();
            LongAdder longAdder = occurrences.get(character);
            if (longAdder == null) {
                longAdder = new LongAdder();
            }
            longAdder.increment();
            occurrences.put(character, longAdder);
        }
        System.out.println(occurrences);
    }
}
