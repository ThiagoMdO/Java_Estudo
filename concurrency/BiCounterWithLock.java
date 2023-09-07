package academy.devdojo.maratonajava.javacore.CompassUol.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
    private int i = 0;
    private int j = 0;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    synchronized public void incrementI(){
        //Get lock for I
        lockForI.lock();

        i++;

        //Release lock for I
        lockForI.unlock();
    }
    public int getI(){
        return i;
    }
    synchronized public void incrementJ(){
        //Get lock for J
        j++;
        //Release lock for J
    }
}
