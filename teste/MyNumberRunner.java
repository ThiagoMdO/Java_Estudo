package academy.devdojo.maratonajava.javacore.CompassUol.teste;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.MyNumber;
public class MyNumberRunner {
    public static void main(String[] args){
        MyNumber number = new MyNumber(7);
        boolean isPrime = number.isPrime();
        System.out.println("Is prime? "+isPrime);


    }

}
