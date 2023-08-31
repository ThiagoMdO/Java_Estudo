package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import academy.devdojo.maratonajava.javacore.CompassUol.dominio.SimpleInterestCalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {
    public static void main(String[] args){
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("44.23", "6.23");
        BigDecimal totalValue = calculator.calculateTotalValue(5);//5 years
        System.out.println(totalValue);

    }
}
