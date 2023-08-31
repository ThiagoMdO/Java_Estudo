package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import academy.devdojo.maratonajava.javacore.CompassUol.dominio.BiNumber;

import java.math.BigDecimal;

public class BinumberRunner {


    public static void main(String[] args) {
        BiNumber numbers = new BiNumber(2,4);
        System.out.println("add "+numbers.add());
        System.out.println("multiply "+numbers.multiply());
        numbers.doubleValue();//Double both numbers
        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());

        float num = 3.54f;
        double num2 = 3.54;
        BigDecimal number1 = new BigDecimal("44.2324323243243543254");
        BigDecimal number2 = new BigDecimal("45.43253246521");
        BigDecimal number3 = number1.add(number2);
        System.out.println(number3);

        System.out.println(number1.multiply(new BigDecimal(42)));
    }
}
