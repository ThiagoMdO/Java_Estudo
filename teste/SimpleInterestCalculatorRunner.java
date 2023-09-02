package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import academy.devdojo.maratonajava.javacore.CompassUol.dominio.SimpleInterestCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SimpleInterestCalculatorRunner {
    public static void main(String[] args){
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("44.23", "6.23");
        BigDecimal totalValue = calculator.calculateTotalValue(5);//5 years
        System.out.println(totalValue);

    }
    public void doSomething(){
        List list = new ArrayList(3);
    }
}
