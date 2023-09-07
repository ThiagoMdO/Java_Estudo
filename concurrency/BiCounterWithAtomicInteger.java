package academy.devdojo.maratonajava.javacore.CompassUol.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();


    synchronized public void incrementI(){
        i.incrementAndGet();
    }
    public int getI(){
        return i.get();
    }
    synchronized public void incrementJ(){
        j.incrementAndGet();
    }
    public int getJ(){
        return j.get();
    }
}
