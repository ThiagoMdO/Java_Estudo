package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

import java.util.Scanner;

public class doWhileRepeatedQuestionRunner {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean start = true;
        do{
            System.out.print("Enter a number:");
            int number1 = scanner.nextInt();
            if(number1 < 0){
                System.out.println("Erro");
            }else{
                System.out.println("Cube is :"+number1*number1*number1);
            }

        }while(start);


    }
}
