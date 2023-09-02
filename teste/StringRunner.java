package academy.devdojo.maratonajava.javacore.CompassUol.teste;

public class StringRunner {


    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String dayWithMostCharacters = "";
        for (String day : daysOfWeek) {
            if (day.length() > dayWithMostCharacters.length()) {
                dayWithMostCharacters = day;
            }
        }
        System.out.println(dayWithMostCharacters);

        int i = 0;
        while (i < daysOfWeek.length){
            System.out.println(daysOfWeek[i]);
            i++;
        }

        System.out.println("");
        for(int j = daysOfWeek.length - 1; j >=0; j--){
            System.out.println(daysOfWeek[j]);
        }

    }
}
