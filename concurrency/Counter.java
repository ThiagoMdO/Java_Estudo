package academy.devdojo.maratonajava.javacore.CompassUol.concurrency;

public class Counter {
    private int i = 0;
    private int j = 0;

    synchronized public void increment(){
        i++;
    }
    public int getI(){
        return i;
    }
}
