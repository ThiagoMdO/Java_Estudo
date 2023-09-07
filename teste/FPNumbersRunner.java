package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import java.util.*;

public class FPNumbersRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 6, 4, 2, 7, 9);
        numbers.stream().filter(element -> element % 2 == 0).forEach(element -> System.out.println(element));
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("");
        fpSum(numbers);
        System.out.println(sum);
        System.out.println("");
        int soma = numbers.stream().filter(number -> number % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
        System.out.println(soma);


    }

    private static int fpSum(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (number1, number2) -> {
                    System.out.println(number1 + " + " + number2);
                    return number1 + number2;
                });
    }
}
