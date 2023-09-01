package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import java.util.Scanner;

public class SwitchExercisesRunner2 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Digite dia da semana");
        int Valor = num1.nextInt();
        System.out.println(determineNameOfDay(Valor));

        System.out.println(isWeekDay(Valor));
        for(int i = 10; i <=20;i++){
            System.out.println(i);
            i++;
        }
    }

    public static String determineNameOfDay(int dayNumber) {
        String result = "";
        switch (dayNumber) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";

        }
        return  "Invalid Day";
    }

    public static boolean isWeekDay(int dayNumber){
        switch (dayNumber){
            case 1: return true;
            case 2: return true;
            case 3: return true;
            case 4: return true;
            case 5: return true;
        }
        return false;
    }



}
