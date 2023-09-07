package academy.devdojo.maratonajava.javacore.CompassUol.concurrency;
import  academy.devdojo.maratonajava.javacore.CompassUol.concurrency.Counter;
public class ConcurrencyRunner {
    public static void main(String[] args) {
        Counter teste = new Counter();
        System.out.println(teste.getI());
        teste.increment();
        System.out.println(teste.getI());

    }
}
