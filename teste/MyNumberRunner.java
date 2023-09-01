package academy.devdojo.maratonajava.javacore.CompassUol.teste;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.MyNumber;
public class MyNumberRunner {
    public static void main(String[] args){
        MyNumber number = new MyNumber(17);
        boolean isPrime = number.isPrime();
        System.out.println("Is prime? "+isPrime);

        int sumUptoN = number.sumUptoN();
        System.out.println("sumUptoN "+ sumUptoN);

        System.out.println(number.sumOfDivisors());

        number.printNumberTriangle();
    }

}
